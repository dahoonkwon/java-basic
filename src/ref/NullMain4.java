package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bingData.count = " + bigData.count);
        System.out.println("bingData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bingData.data.value = " + bigData.data.value);
    }
}
