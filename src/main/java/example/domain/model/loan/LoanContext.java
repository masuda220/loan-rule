package example.domain.model.loan;

import example.domain.model.collection.book.BookNumber;
import example.domain.model.member.Member;

/**
 * 貸出を判断する文脈
 */
public class LoanContext {
    Member 会員;
    LoanHistory 貸出履歴;

    LoanContext(Member 会員, LoanHistory 貸出履歴) {
        this.会員 = 会員;
        this.貸出履歴 = 貸出履歴;
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
