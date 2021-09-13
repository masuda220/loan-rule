package example.presentation.web;

import example.application.activity.LoanActivity;
import example.domain.model.collection.book.BookNumber;
import example.domain.model.loan.LoanabilityType;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoanController {
    LoanActivity loanActivity;

    public LoanController(LoanActivity loanActivity) {
        this.loanActivity = loanActivity;
    }

    @GetMapping
    String 一覧(MemberNumber 会員番号, BookNumber 本番号) {
        LoanabilityType 貸出判断 = loanActivity.貸出判断(会員番号, 本番号);
        return "";
    }
}
