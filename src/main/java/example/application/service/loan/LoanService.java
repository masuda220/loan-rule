package example.application.service.loan;

import example.domain.model.loan.LoanHistory;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Service;

/**
 * 貸出機能
 */
@Service
public class LoanService {
    LoanRepository 貸出;

    public LoanService(LoanRepository 貸出) {
        this.貸出 = 貸出;
    }

    public LoanHistory 貸出履歴(MemberNumber 会員番号) {
        return 貸出.履歴(会員番号);
    }
}
