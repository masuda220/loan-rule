package example.datasource.loan;

import example.application.service.loan.LoanRepository;
import example.domain.model.loan.Loan;
import example.domain.model.loan.LoanHistory;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoanDatasource implements LoanRepository {
    LoanMapper mapper;

    public LoanDatasource(LoanMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public LoanHistory 履歴(MemberNumber memberNumber) {
        List<Loan> result = mapper.history(memberNumber);
        return LoanHistory.of(result);
    }
}
