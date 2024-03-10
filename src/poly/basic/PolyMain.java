package extends1.poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수ㅏㄱ 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식변수가 자식 인스턴트 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent();// 자식은 부로를 담을 수 없다.

        //자식의 기능은 호출할 수 없다. 컴파일 오류
        //poly.childMehtod();
    }
}
