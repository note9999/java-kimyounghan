package pack;

//pagckage 임포트
// * 쓰면 패키지에 있는 모든 클래스 사용가능

import pack.a.User;

public class packageMain3 {
    public static void main(String[] args) {

        //  같은 이름 클래스 있으면 import는 둘 중 하나만 선택, 자주 사용하는 클래스 import 하면됨


            User user = new User();
            pack.b.User userB = new pack.b.User();
    }
}
