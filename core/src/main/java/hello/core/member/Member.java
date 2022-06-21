package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    /*
        IntelliJ 단축키 검색
        -> preference > keymap > 찾고자 하는 기능 검색 > os 환경에 맞는 단축키 확인 가능
     */

    // 생성자, getter, setter 자동완성: command + n
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
