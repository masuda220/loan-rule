package example.domain.model.member;

/**
 * 会員番号
 */
public class MemberNumber {
    int value;

    public MemberNumber(String value) {
        this.value = Integer.parseInt(value);
    }

    @Deprecated(since = "MyBatis")
    public MemberNumber() {}

    @Override

    public String toString() {
        return String.valueOf(value);
    }
}
