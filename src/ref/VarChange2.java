package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value =10;
        Data dataB = dataA;

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value=20");
        System.out.println("dataA.value = " + dataA.value);  // ref.Data@2f4d3709.value
        System.out.println("dataB.value = " + dataB.value);  // ref.Data@2f4d3709.value 이므로 같은 값 출력   

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value =30");
        System.out.println("dataA.value"+dataA.value);
        System.out.println("dataA.value"+dataB.value);
    }
}
