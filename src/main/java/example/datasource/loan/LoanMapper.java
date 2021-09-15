package example.datasource.loan;

import example.domain.model.loan.Loan;
import example.domain.model.member.MemberNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoanMapper {
    List<Loan> history(MemberNumber memberNumber) ;
}
