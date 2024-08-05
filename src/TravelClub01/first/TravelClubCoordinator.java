package TravelClub01.first;


import java.util.Arrays;

public class TravelClubCoordinator {
    private int capacity = 4;
    private int nextIndex;
    private TravelClub[] clubs; // 여행 클럽을 여러 개 담을 수 있는 배열

    // 처리자 생성자는 객체가 만들어지면 nextIndex 를 0으로 초기화한다.
    // clubs 배열의 길이는 정수형 변수 capacity 에 저장된 수로 초기화한다.
    public TravelClubCoordinator() {
        this.nextIndex = 0;
        this.clubs = new TravelClub[capacity];
    }

    // 여행 클럽 등록하는 메서드
    public String register(TravelClub newClub) {
        // exist 는 TravelClubCoordinator 클래스 안에 있는 public 메서드인데 this 를 사용한다. 이유는? this 사용법에 대해 좀 더 숙지할 필요가 있다.
        // exist 메서드는 true 나 false 를 반환한다. exist 메서드의 반환 결과가 true 일 경우 null 을 반환한다.
        if (this.exist(newClub.getName())) {
            return null;
        }

        // 만약 nextIndex 와 clubs.length 가 같으면 clubs 에 clubs 배열의 nextIndex + capacity 개까지의 요소를 복사해서 넣는다?? 이 부분 천천히 다시 생각해보자.
        // nextIndex 와 clubs.length 가 같으면, 즉 다음 여행 클럽이 등록될 인덱스 번호와 현재 배열의 길이가 같으면 여행 클럽을 등록할 때 요소가 넘치기 때문에 원래 저장된 요소에 더해서 배열의 길이를 늘려줘야 한다.
        // Arrays.copyOf(원본 배열, 복사할 길이) 메서드 : 지정한 배열을 인덱스 0부터 원하는 길이만큼 복사한다.
        if (nextIndex == clubs.length) {
            clubs = Arrays.copyOf(clubs, nextIndex + capacity);
        }

        // 새로 생성한 여행 클럽 객체를 clubs 배열에 저장한다.
        // 저장한 다음에 nextIndex 를 1 증가한다.
        // 마지막으로 새로 생성한 여행 클럽 객체의 이름을 반환한다.
        clubs[nextIndex++] = newClub;
        return newClub.getName();
    }

    // 1. 여행 클럽 존재 여부 체크하는 메서드
    public boolean exist(String name) { // 문자열 타입의 name 변수를 전달 인자로 받고, true 나 false 를 반환하는 exist 메서드
        for (int i = 0; i < nextIndex; i++) { // 반복 횟수가 정해진 for 문. i 가 nextIndex 미만일 때만 반복한다.
            if(clubs[i] != null && clubs[i].getName().equals(name)) { // 만약 clubs 배열의 i번째 요소가 null 이 아니고 클럽 이름이 전달 인자 name 과 같으면 true 를 반환한다.
                return true;
            }
        }
        return false; // if 조건문 외의 경우는 false 를 반환한다.
    }
}
