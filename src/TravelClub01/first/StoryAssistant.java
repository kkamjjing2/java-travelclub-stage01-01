package TravelClub01.first;

public class StoryAssistant {
    
    // 이야기 도우미의 클럽 만들기 메서드
    // 이야기 도우미에서만 사용할 메서드인가?
    // 메서드의 변수는 name, intro;
    private void createTravelClub() {
        String name = "JavaTravelClub";
        String intro = "Travel club to Java island";
        
        // 어떻게 객체를 생성해야 하는지 '객체 생성 방법' 다시 정리하기
        new TravelClub(name, intro);
        // 여기서 에러가 나는 이유 :
    }
}
