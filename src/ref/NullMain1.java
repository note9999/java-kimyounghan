package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1.data="+data); // 참조값 없는 상태
        data = new Data();
        System.out.println("2.data="+data); // 위에 만들어진 참조값 나타냄
        data = null;
        System.out.println("3.data="+data); // 위에서 null로 참조값 다시 초기화
    }
}

// 객체는 해당객체를 참조하는 곳이 있으면, JVM이 종료될 떄까지 계속 생존한다.
// 그런데 중간에 해당 객체를 참조하는 곳이 모두 사라지면 그때 JVM은 필요없는 객체로 판단하고
// GC(가비지 컬렉션)을 사용해서 제거한다.