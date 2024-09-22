package entity;

import character.ImageLoader;
import storeScreen.StorePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static funtions.SwitchPanel.switchPanel;


public class Player extends Entity {
    private List inventory;   // 임시
    StorePanel sp;   //임시
    KeyHandler keyH;
    int coin;

    public Player(StorePanel sp, KeyHandler keyH,int coin) {
        super();
        this.sp = sp;
        this.keyH = keyH;
        this.coin=coin;
        setDefaultValues();
        getPlayerImage();
        direction = "down";
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
        coin=0;
    }

    public void getPlayerImage() {
        up1 = ImageLoader.loadImage("src/img/character/back1.png");
        up2 = ImageLoader.loadImage("src/img/character/back2.png");
        down1 = ImageLoader.loadImage("src/img/character/front1.png");
        down2 = ImageLoader.loadImage("src/img/character/front2.png");
        left1 = ImageLoader.loadImage("src/img/character/left1.png");
        left2 = ImageLoader.loadImage("src/img/character/left2.png");
        right1 = ImageLoader.loadImage("src/img/character/right1.png");
        right2 = ImageLoader.loadImage("src/img/character/right2.png");

    }

    public void update() {
        if (keyH.moveUp|| keyH.moveDown || keyH.moveLeft || keyH.moveRight) {
            if (keyH.moveUp==true) {
                direction = "up";
                y -= speed;
            } else if (keyH.moveDown == true) {
                direction = "down";
                y += speed;
            } else if (keyH.moveLeft == true) {
                direction = "left";

                x -= speed;
            } else if (keyH.moveRight == true) {
                direction = "right";
                x += speed;
            }
            spriteCounter++;
            if (spriteCounter > 12) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }

    }
    /*
    public void buy (String item){
        inventory.add(item);
        System.out.println(item + "을 구매 ");

    }
    public void showIenventory () {
        System.out.println("인벤토리" + inventory);
    }

    public void leaveShop () {
        System.out.println("상점 밖으로 나감.");

    }
    public void intoShop () {
        System.out.println("상점 안으로 들어옴.");
    }
    public void buyItem () {
        System.out.println("아이템 구매해서 저장");
    }
    public void throwItem () {
        System.out.println("아이템 팔기");
    }
    public void currentCoin ( int coin){
        System.out.println("현재 코인"+coin);

    }
    public void setCoin(){
    }*/

    public void draw (Graphics2D g2){
        BufferedImage image = null;
        switch (direction) {
            case "up":
                if (spriteNum == 1) {
                    image = up1;
                }
                else if (spriteNum == 2) {
                    image = up2;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = down1;
                }
                else if (spriteNum == 2) {
                    image = down2;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left1;
                }
                else if (spriteNum == 2) {
                    image = left2;
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = right1;
                }
                else if (spriteNum == 2) {
                    image = right2;
                }
                break;
        }
        g2.drawImage(image, x, y, sp.tileSize, sp.tileSize, null);
    }



}
