package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bingData.count = " + bigData.count);
        System.out.println("bingData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bingData.data.value = " + bigData.data.value);
    }
}
