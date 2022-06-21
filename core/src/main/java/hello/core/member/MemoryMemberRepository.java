package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    /*
        문제점)
            -여러군데에서 현재 선언한 Map을 접근하면 동시성 이슈 발생 가능성 있음
            -Concurrent HashMap으로 해결 가능

            -프로세스(특정 작업 수행 단위) -> 스레드(프로세스 구성하는 하나의 단위) : 하나의 프로세스 = 여러 스레드
            -프로세스는 독자적인 메모리를 할당받아 서로 다른 프로세스끼리는 일반적으로 서로의 메모리 침범X
             프로세스 내부에 있는 여러 스레드는 같은 자원 공유 O
            -이때, 동시에 여러 일을 같은 자원을 두고 수행하면 병렬성 향상 도모 가능
            -단점) 하나의 자원을 활용할 경우 동시성 문제 = 데드락같은 문제 발생 가능
                  이 문제를 해결해야 멀티 스레드 환경에서 프로그램 제작 가능
     */
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
