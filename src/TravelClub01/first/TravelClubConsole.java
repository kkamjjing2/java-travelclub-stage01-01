package TravelClub01.first;

import java.util.Scanner;

public class TravelClubConsole {

    // 사용자의 입력 값을 가지고 올 수 있는 객체다. TravelClubConsole 클래스에서만 사용할 객체이기 때문에 private 접근지정자를 지정한다.
    // Scanner 를 필드로 만든 이유는 뭘까? :
    private Scanner scanner;

    public TravelClubConsole() {
        this.scanner = new Scanner(System.in); // 사용자의 입력 값을 가져올 수 있는 객체 만들기.
    }

    // 사용자가 처음으로 애플리케이션에 진입했을 때 보이는 화면(메뉴 출력)
    // 프로그램 종료 전까지 여행 클럽 애플리케이션을 이용해야 하므로 while문을 이용한다. (for문은 반복 횟수가 정해졌을 때, while 문은 반복 횟수가 정해지지 않았을 때)
    // displayMainMenu와 selectMainMenu 를 먼저 구현하고 showMenu 메서드를 구현해야 하는 것 아닌가?
    public void showMenu() {
        int inputNumber = 0;

        while(true) { // 무한 반복

            displayMainMenu();
            inputNumber = selectMainMenu();

            // 사용자가 선택한 기능으로 연결하기 구현
            // 상황에 맞게 처리할 때 switch 문을 사용한다.
            switch(inputNumber) {
                case 1 :
                    register();
                    break;
                case 2 :
                    find();
                    break;
                case 3 :
                    findAll();
                    break;
                case 0 :
                    exitProgram();
                    break;
                default : // 조건에 해당하지 않을 때 처리
                    System.out.println("choose again!");
            }
        }
    }

    // 사용자가 처음으로 애플리케이션에 진입했을 때 보이는 화면(메뉴 출력)
    private void displayMainMenu() {

    }

    // 사용자가 키보드로 메뉴 번호를 입력해서 메뉴를 선택했을 때 동작하는 메서드
    private int selectMainMenu() {
        return 0;
    }


    // 사용자가 0을 입력했을 때 동작하는 메서드
    private void exitProgram() {

    }

    // 1번 선택 시 여행 클럽 등록하는 메서드
    private void register() {

    }

    // 2번 선택 시 여행 클럽 조회 메서드
    private void find() {

    }

    // 3번 선택 시 여행 클럽 전체 조회 메서드
    private void findAll() {

    }
}
