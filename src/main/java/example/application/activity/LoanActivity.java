package example.application.activity;

import example.application.service.loan.LoanService;
import example.domain.model.collection.book.BookNumber;
import example.domain.model.loan.LoanContext;
import example.domain.model.loan.LoanHistory;
import example.domain.model.loan.LoanabilityType;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Service;

/**
 * 貸出業務
 */
@Service
public class LoanActivity {
    LoanService 貸出;

    public LoanActivity(LoanService 貸出) {
        this.貸出 = 貸出;
    }

    public LoanabilityType 貸出判断(MemberNumber 会員番号, BookNumber 本番号) {
        LoanHistory 貸出履歴 = 貸出.貸出履歴(会員番号);
        LoanContext 貸出の文脈 = new LoanContext();
        return 貸出の文脈.貸出判断();
    }
}
