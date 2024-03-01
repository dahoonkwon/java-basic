package static2.ex;

public class Car {
    private static int totalCars;
    private String name;
    public Car(String name){
        System.out.println("차량 구입, 아름은: " + name);
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량의 수: " + totalCars);
    }
}