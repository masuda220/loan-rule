package example.datasource.member;

import example.application.service.member.MemberRepository;
import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDatasource implements MemberRepository {

    MemberMapper mapper;

    public MemberDatasource(MemberMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Member 取得(MemberNumber memberNumber) {
        return mapper.findBy(memberNumber );
    }
}
