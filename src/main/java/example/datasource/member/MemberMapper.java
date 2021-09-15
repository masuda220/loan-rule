package example.datasource.member;

import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    Member findBy(MemberNumber memberNumber);
}
