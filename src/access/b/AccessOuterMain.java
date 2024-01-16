package access.b;

import access.a.AcessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AcessData data = new AcessData();
        // public 호출가능
        data.publicField=1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        //data.defaultField =2;
        //data.defaultMethod();

        //private 호출불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }
}
