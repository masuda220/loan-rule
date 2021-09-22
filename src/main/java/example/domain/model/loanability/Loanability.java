package example.domain.model.loanability;

import example.domain.model.collection.Entry;
import example.domain.model.loan.LoanContext;

import static example.domain.model.loanability.LoanabilityType.貸出できない;
import static example.domain.model.loanability.LoanabilityType.貸出できる;

/**
 * 貸出可否
 */
public class Loanability {

    LoanContext 貸出の文脈;
    Entry 蔵書品目;

    Loanability(LoanContext 貸出の文脈, Entry 蔵書品目) {
        this.貸出の文脈 = 貸出の文脈;
        this.蔵書品目 = 蔵書品目;
    }

    public LoanabilityType 判断() {
        if (貸出数超え()) return 貸出できない;
        if (同じ本の貸出()) return 貸出できない;
        if (返却期限切れあり()) return 貸出できない;
        return 貸出できる;
    }

    private boolean 貸出数超え() {
        int 現在の貸出数 = 貸出の文脈.貸出数();
        int 最大貸出数 = 貸出の文脈.最大貸出数();
        return 現在の貸出数 >= 最大貸出数;
    }

    private boolean 同じ本の貸出() {
        return false;
    }


    private boolean 返却期限切れあり() {
        // 貸出期限は2週間
        return false;
    }

    public static Loanability of(LoanContext 貸出の文脈, Entry 蔵書品目) {
        return new Loanability(貸出の文脈, 蔵書品目);
    }


}
