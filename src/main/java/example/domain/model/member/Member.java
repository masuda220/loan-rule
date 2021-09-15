package example.domain.model.member;

/**
 * 会員
 */
public class Member {
    MemberNumber 会員番号;
    String 氏名;
    MemberCategory 会員種別;

    public MemberCategory 会員種別() {
        return 会員種別;
    }

    public String number() {
        return 会員番号.toString();
    }

    @Override
    public String toString() {
        return "Member{" +
              "memberNumber=" + 会員番号 +
              ", 氏名='" + 氏名 + '\'' +
              ", 会員種別=" + 会員種別 +
              '}';
    }
}
