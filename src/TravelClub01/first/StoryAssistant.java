package TravelClub01.first;

public class StoryAssistant {

    // 클래스를 실행하기 위한 메서드를 main 메서드라고 한다. 클래스 실행 시 main 메서드 안의 내용이 차례대로 실행된다.
    // 내가 가지고 있는 기능을 사용하고 싶으면 메서드 이름 뒤에 소괄호를 사용하여 메서드를 호출한다.
    // 다른 객체가 가지고 있는 기능을 사용하고 싶을 땐 먼저 객체를 만들고 객체 뒤에 점을 찍고 메서드 이름을 작성한다.

    public static void main(String[] args) {
        createTravelClub();
    }



    // 이야기 도우미의 클럽 만들기 메서드
    // 이야기 도우미에서만 사용할 메서드인가?
    // 메서드의 변수는 name, intro;
    private static void createTravelClub() { // 여기서 static 이 없으면 main 메서드에서 이 메서드를 호출할 때 에러가 난다. 이유는? :
        String name = "JavaTravelClub";
        String intro = "Travel club to Java island.";
        
        // 어떻게 객체를 생성해야 하는지 '객체 생성 방법' 다시 정리하기
        TravelClub club = new TravelClub(name, intro);
        System.out.println(club.tellMeAboutYou()); //  다른 객체의 메서드 부르기( 객체를 담은 변수의 이름.메서드 이름(); )
    }
}
