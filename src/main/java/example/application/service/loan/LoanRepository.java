package example.application.service.loan;

import example.domain.model.loan.LoanHistory;
import example.domain.model.member.MemberNumber;

public interface LoanRepository {
    LoanHistory 履歴(MemberNumber memberNumber);
}
