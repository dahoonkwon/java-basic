package access.b;

import access.a.PublicClass;

public class PublicOutterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //다른 패키지 접근 불가
    }
}