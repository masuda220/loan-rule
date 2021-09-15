package example.application.activity;

import example.application.service.collection.CollectionService;
import example.application.service.loan.LoanService;
import example.application.service.member.MemberService;
import example.domain.model.collection.EntryList;
import example.domain.model.collection.book.BookNumber;
import example.domain.model.loan.LoanContext;
import example.domain.model.loan.LoanHistory;
import example.domain.model.loanability.Loanability;
import example.domain.model.loanability.LoanabilityType;
import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Service;

/**
 * 貸出業務
 */
@Service
public class LoanActivity {
    MemberService 会員サービス;
    CollectionService 蔵書サービス;
    LoanService 貸出サービス;

    public LoanActivity(MemberService 会員サービス, CollectionService 蔵書サービス, LoanService 貸出サービス) {
        this.会員サービス = 会員サービス;
        this.蔵書サービス = 蔵書サービス;
        this.貸出サービス = 貸出サービス;
    }

    public LoanContext 貸出状況(MemberNumber 会員番号) {
        Member 会員 = 会員サービス.会員(会員番号);
        LoanHistory 貸出履歴 = 貸出サービス.貸出履歴(会員番号);
        LoanContext 貸出判断の文脈 = LoanContext.of(会員, 貸出履歴);
        return 貸出判断の文脈;
    }

    public EntryList 蔵書品目一覧() {
        return 蔵書サービス.蔵書品目一覧();
    }

    public LoanabilityType 貸出判断(LoanContext 貸出状況, BookNumber 本番号) {
        Loanability 貸出可否 = Loanability.of(貸出状況, 本番号);
        return 貸出可否.判断();
    }
}
