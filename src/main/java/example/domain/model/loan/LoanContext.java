package example.domain.model.loan;

import example.domain.model.collection.book.BookNumber;
import example.domain.model.restriction.Restriction;

/**
 * 貸出を判断する文脈
 */
public class LoanContext {
    BookNumber 貸し出す本;
    LoanHistory 履歴;
    Restriction 貸出制限;

    public LoanabilityType 貸出判断() {
        return LoanabilityType.貸出できる;
    }
}
