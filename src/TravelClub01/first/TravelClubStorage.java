package TravelClub01.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
// 여러 개의 객체를 한 곳에 수집할 수 있는 클래스를 Collection 이라고 한다.

public class TravelClubStorage {
    private List<TravelClub> clubs;
    // 여행 클럽 유형의 객체만 담을 수 있는 List 를 저장소 클래스의 속성으로 선언했다.

    public TravelClubStorage() { // 저장소의 생성자. TravelClub 타입의 리스트를 생성한다.
        this.clubs = new ArrayList<TravelClub>();
    }

    // clubs 리스트 안에 여행 클럽 객체가 몇개 들어 있는지 알 수 있는 메서드
    public int count() {
        return clubs.size();
    }

    // 여행 클럽 저장소에 저장 여부 확인하기
    public boolean exist(String name) {
        for(TravelClub club : clubs) {
            if (club.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // 여행 클럽 저장소에 여행 클럽 저장하기
    public String store(TravelClub club) {
        clubs.add(club);
        return club.getName();
    }

//    // 여행 클럽 객체 찾아오기(조회)
//    public TravelClub retrieve(String name) {
//
//    }
//
//    public Collection<TravelClub> retrieveAll() {
//
//    }
//
//    public void update(TravelClub travelClub) {
//
//    }
//
//    public void delete(String) {
//
//    }
}
