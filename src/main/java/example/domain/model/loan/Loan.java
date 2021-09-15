package example.domain.model.loan;

import example.domain.model.collection.ItemNumber;
import example.domain.model.member.MemberNumber;

import java.time.LocalDate;

/**
 * 貸出
 */
public class Loan {
    ItemNumber 蔵書番号;
    MemberNumber 会員番号;
    LocalDate 貸出日;

    @Override
    public String toString() {
        return "Loan{" +
              ", 蔵書番号=" + 蔵書番号 +
              "会員番号=" + 会員番号 +
              ", 貸出日=" + 貸出日 +
              '}';
    }
}
