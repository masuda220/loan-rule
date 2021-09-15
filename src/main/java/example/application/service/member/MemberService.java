package example.application.service.member;

import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Service;

/**
 * 会員サービス
 */
@Service
public class MemberService {
    MemberRepository 会員;

    public MemberService(MemberRepository 会員) {
        this.会員 = 会員;
    }

    public Member 会員(MemberNumber 会員番号) {
        return 会員.取得(会員番号);
    }
}
