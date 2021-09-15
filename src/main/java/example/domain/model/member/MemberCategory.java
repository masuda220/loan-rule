package example.domain.model.member;

/**
 * 会員種別
 */
public enum MemberCategory {
    一般(3),
    小中学生(2);

    int 最大貸出数;

    MemberCategory(int 最大貸出数) {
        this.最大貸出数 = 最大貸出数;
    }

    public int 最大貸出数() {
        return 最大貸出数;
    }
}
