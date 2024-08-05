package TravelClub01.first;

// 여행 클럽 클래스 만들기
// 필드는 name과 intro
// 필드의 접근 지정자를 private 로 지정해야 하는 이유 :
// 필드의 타입을 String 으로 정한 이유 :
// 여행 클럽 클래스가 자신의 객체를 만드는 방법 : 객체를 만들기 위해 사용하는 메서드를 생성자라고 부른다.
// 여행 클럽은 전달 받은 이름과 소개말을 이용하여 하나의 여행 클럽을 만든다.
// this 는 객체 자기 자신을 가리키는 키워드다.
// 전달 받은 값으로 나의 속성을 채운다고 이해하면 쉽다.
// tellMeAboutYou라는 메서드는 누군가 나를 부르면 본인의 속성을 나열한 문자열로 대답한다. 다른 객체에 공개하는 메서드다.

public class TravelClub {
    private String name;
    private String intro;

    // 기본 생성자 만들기
    public TravelClub() {}

    // 전달 인자가 있는 생성자 만들기
    public TravelClub(String name, String intro) {
        this.name = name;
        this.intro = intro;
    }

    // 다른 객체도 쓸 수 있는 여행 클럽 정보 조회 메서드 만들기
    public String tellMeAboutYou() {
        return "Name : " + name + ", Intro : " + intro;
    }
}
