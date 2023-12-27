package ref;

public class MethodChange1 {

    // !!!기본형과 메서드 호출!!!
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a); // -> a를 그대로 넣는게 아니라.. a의 값 10을 대입한다는 의미가 됨
                            // int x = a;
        System.out.println("메서드 호출 후 : a = " +a);
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
