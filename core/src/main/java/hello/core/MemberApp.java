package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

/*
- 이 코드의 설계상 문제점은?
- 다른 저장소로 변경할 때 OCP 원칙을 잘 준수하는가?
- DIP를 잘 지키고 있는가?
- 의존관계가 인터페이스 뿐만 아니라 구현까지 모두 의존하는 문제점이 있음
 */
public class MemberApp {
    public static void main(String[] args) { // 자동완성: psvm + enter
        MemberService memberService = new MemberServiceImpl();
        // Long type -> 1L
        Member member = new Member(1L, "memberA", Grade.VIP); // 변수 선언: cmd + opt + V
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member: " + member.getName());
        System.out.println("find member: " + findMember.getName());
    }
}
