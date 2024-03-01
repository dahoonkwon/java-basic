package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.intanceCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data2 = new DecoData();
        data2.intanceCall();

        staticCall(data1);

        //추가
        //인스턴스를 통한 접근
        //소스 이해가 어렵다.
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        staticCall();
    }
}
