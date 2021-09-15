package example.domain.model.loan;

import java.util.List;

/**
 * 貸出の履歴
 */
public class LoanHistory {
    List<Loan> history;

    LoanHistory(List<Loan> history) {
        this.history = history;
    }

    @Deprecated(since = "MyBatis")
    public LoanHistory() {}

    public int 貸出数() {
        return history.size();
    }
    public static LoanHistory of(List<Loan> source) {
        return new LoanHistory(source);
    }

    @Override
    public String toString() {
        return "LoanHistory{" +
              "history=" + history +
              '}';
    }
}
