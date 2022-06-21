package hello.core.member;

// 메모리 회원 저장소
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
