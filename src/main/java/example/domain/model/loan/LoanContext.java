package example.domain.model.loan;

import example.domain.model.collection.book.BookNumber;
import example.domain.model.loanability.Loanability;
import example.domain.model.member.Member;
import example.domain.model.member.MemberCategory;

/**
 * 貸出の文脈
 */
public class LoanContext {
    Member 会員;
    LoanHistory 貸出履歴;

    LoanContext(Member 会員, LoanHistory 貸出履歴) {
        this.会員 = 会員;
        this.貸出履歴 = 貸出履歴;
    }

    public int 最大貸出数() {
        return 会員.会員種別().最大貸出数();
    }

    public int 貸出数() {
        return 貸出履歴.貸出数();
    }

    public static LoanContext of(Member 会員, LoanHistory 貸出履歴) {
        return new LoanContext(会員, 貸出履歴);
    }

    public String member() {
        return 会員.toString();
    }

    public String memberNumber() {
        return 会員.number();
    }
    public String loanHistory() {
        return 貸出履歴.toString();
    }
    @Override
    public String toString() {
        return "LoanContext{" +
              "会員=" + 会員 +
              ", 貸出履歴=" + 貸出履歴 +
              '}';
    }
}
