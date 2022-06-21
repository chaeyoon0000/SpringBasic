package hello.core.member;

public class MemberServiceImpl implements MemberService{

    /*
        인터페이스: MemberRepository <-(할당)- 구현체: MemoryMemberRepository

        문제점)
        인터페이스는 역할, 구현체는 그 역할을 실행하는 것이나 그 두개에 모두 의존하는 상황
        구현체인 MemberServiceRepository는 추상화에도, 구체에도 의존 => DIP 위반
     */
    private final MemberRepository memberRepository = new MemoryMemberRepository(); // cmd+shift+enter -> 세미콜론까지 자동완성

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(long memberId) {
        return memberRepository.findById(memberId);
    }
}
