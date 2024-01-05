package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value=" + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value=" + dataA.value);
        // 메서드 공부
        // 잔디오류 수정
    }
       public static void changeReference(Data dataX) {
           dataX.value = 20;
        }

    // 기본형(그대로 사용) 예시
    // 종이가 두 장 있는데 내 종이에 10을 적고 옆 사람 종이에 10을 적어서 줬음
    // 근데 옆 사람이 자기 종이를 20으로 바꾼다고 해서 내 종이가 10으로 바뀌진 않음!!

    // 참조형(한번 거쳐서) 예시
    // 똑같이 종이를 주는데 이번엔 주소지가 적힌 종이를 두 장 가짐
    // 옆 사람이 주소지에 적힌 곳으로 가서 건물을 세우면 나도 그 주소지를 가진 종이를 가지고 가면 건물이 세워져 있는 것을 볼 수 잇음


    }

