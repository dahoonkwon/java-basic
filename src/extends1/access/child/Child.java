package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지
        //defaultValue 다른 패키지 접근 불가, 컴파일 오류
        //privateValue 접근 불가, 컴파일 오류

        publicMethod();
        prientParent(); //상속 관계 or  같은 패키지
        // defaultMehtod // 다른 패키지 접근 불가, 컴파일 오류
        // privateMethod  // 접근 불가, 컴파일 오류

        prientParent();
    }

}
