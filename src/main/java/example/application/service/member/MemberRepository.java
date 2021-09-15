package example.application.service.member;

import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;

public interface MemberRepository {
    Member 取得(MemberNumber memberNumber);
}
