package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최중숫자="+valueData.value);
    }

    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자증가 value="+valueData.value);
    }

}
