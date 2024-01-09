package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicMPlayer player = new MusicMPlayer();
        //음악플레이어 켜기
        player.on();
        // 볼륭증가
        player.volumeUp();
        // 볼륨증가
        player.volumeUp();
        // 볼륨감소
        player.volumeDown();
        // 음악플레이어 상태
        player.showStatus();
        // 음악플레이어 종료
        player.off();

    }
}

