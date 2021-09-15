package example.presentation.web;

import example.application.activity.LoanActivity;
import example.domain.model.collection.EntryList;
import example.domain.model.collection.book.BookNumber;
import example.domain.model.loan.LoanContext;
import example.domain.model.loan.LoanabilityType;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("members")
public class LoanController {
    LoanActivity loanActivity;

    public LoanController(LoanActivity loanActivity) {
        this.loanActivity = loanActivity;
    }

    @GetMapping("/{会員番号}/loans")
    String 貸出状況(@PathVariable MemberNumber 会員番号, Model model) {
        contextAndEntryList(会員番号, model);
        return "loan/context";
    }

    @GetMapping("/{会員番号}/loanability")
    String 貸出判断(
          @PathVariable MemberNumber 会員番号,
          @RequestParam("bookNumber") BookNumber 本番号,
          Model model) {
        contextAndEntryList(会員番号, model);
        LoanabilityType 貸出判断 = loanActivity.貸出判断(会員番号, 本番号);
        model.addAttribute("loanability", 貸出判断);
        return "loan/context";
    }

    private void contextAndEntryList(MemberNumber 会員番号, Model model) {
        LoanContext 貸出状況 = loanActivity.貸出状況(会員番号);
        model.addAttribute("context", 貸出状況);
        EntryList 蔵書品目一覧 = loanActivity.蔵書品目一覧();
        model.addAttribute("entryList", 蔵書品目一覧);
    }
}
