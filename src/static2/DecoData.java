package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //instanceValue++;//compile error
        //instanceMethod();  // compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }

    public void intanceCall(){
        instanceValue++;//compile error
        instanceMethod();  // compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }
}
