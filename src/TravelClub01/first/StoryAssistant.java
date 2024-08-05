package TravelClub01.first;

public class StoryAssistant {
    // 클래스를 실행하기 위한 메서드를 main 메서드라고 한다. 클래스 실행 시 main 메서드 안의 내용이 차례대로 실행된다.
    // 내가 가지고 있는 기능을 사용하고 싶으면 메서드 이름 뒤에 소괄호를 사용하여 메서드를 호출한다.
    // 다른 객체가 가지고 있는 기능을 사용하고 싶을 땐 먼저 객체를 만들고 객체 뒤에 점을 찍고 메서드 이름을 작성한다.
    public static void main(String[] args) {
        startStory();
    }

    private static void startStory() {
        TravelClubConsole travelClubConsole = new TravelClubConsole();
        travelClubConsole.showMenu(); // 메인 메뉴 요청
    }
}