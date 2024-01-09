package oop1;

public class MusicMPlayer {

    int volume;
    boolean isOn = false;

     void on() {
        isOn = true;
        System.out.println("음악 플레이어 시작");
    }

     void off() {
        isOn = false;
        System.out.println("음악 플레이어 끔");
    }

     void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

     void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

     void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("켜져있음," + "볼륨:" + volume);
        } else {
            System.out.println("꺼져있음");
        }
    }

}
