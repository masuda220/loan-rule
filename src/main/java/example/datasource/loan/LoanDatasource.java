package example.datasource.loan;

import example.application.service.loan.LoanRepository;
import example.domain.model.loan.LoanHistory;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Repository;

@Repository
public class LoanDatasource implements LoanRepository {
    @Override
    public LoanHistory 履歴(MemberNumber memberNumber) {
        return new LoanHistory();
    }
}
