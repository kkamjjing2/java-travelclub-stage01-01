package TravelClub01.first;

// 여행 클럽 클래스 만들기
// 필드는 name과 intro
// 필드의 접근 지정자를 private 로 지정해야 하는 이유 :
// 필드의 타입을 String 으로 정한 이유 :
// 여행 클럽 클래스가 자신의 객체를 만드는 방법 : 객체를 만들기 위해 사용하는 메서드를 생성자라고 부른다.
// 여행 클럽은 전달 받은 이름과 소개말을 이용하여 하나의 여행 클럽을 만든다.
// this 는 객체 자기 자신을 가리키는 키워드다. 전달 받은 값으로 나의 속성을 채운다고 이해하면 쉽다.
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

    // 다른 객체들이 자신을 속성을 알고 싶거나 채우고 싶을 때 사용하는 메서드 : 이런 메서드의 객체를 getter/setter 라고 부른다. 속성을 받고(get) 설정하는(set) 기능을 담당한다.
    // getter/setter 메서드가 필요한 이유 :

    // 여행 클럽 객체의 이름을 조회하는 메서드(내 속성의 값을 알려주는 기능 만들기)
    public String getName() {
        return name;
    }

    // 여행 클럽 객체의 소개말을 조회하는 메서드
    public String getIntro() {
        return intro;
    }

    // 여행 클럽 객체의 이름을 변경하는 메서드(내 속성의 값을 설정하는 기능 만들기)
    public void setName(String name) {
        this.name = name; // 전달받은 값이 담긴 변수와 내 속성의 이름이 같다면 this 를 사용한다.
    }

    // 여행 클럽 객체의 소개말을 변경하는 메서드
    public void setIntro(String intro) {
        this.intro = intro;
    }
}
