package entity;

import java.util.Scanner;

public class Npc extends Entity{
    public Npc(String name, int x, int y) {
        super();
    }

    public void talk(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("안녕하세요, 아이템을 보여드릴까요? (예/아니요)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("예")) {
            showItems();
        } else {
            System.out.println("감사합니다.");
            // 상점 밖으로 나가기 로직
            player.leaveShop();
        }


    }

    private void showItems() {
    }
}
