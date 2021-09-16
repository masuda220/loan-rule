package example.domain.model.loan;

import example.domain.model.collection.Item;
import example.domain.model.member.MemberNumber;

import java.time.LocalDate;

/**
 * 貸出
 */
public class Loan {
    Item 蔵書;
    MemberNumber 会員番号;
    LocalDate 貸出日;

    @Override
    public String toString() {
        return "Loan{" +
              "蔵書=" + 蔵書 +
              ", 会員番号=" + 会員番号 +
              ", 貸出日=" + 貸出日 +
              '}';
    }
}
