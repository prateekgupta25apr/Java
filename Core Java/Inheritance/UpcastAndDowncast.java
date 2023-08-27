package Inheritance;

public class UpcastAndDowncast {
    public static void main(String[] args) {
        // Upcasting
        ParentClass parentClass=new ChildClass();

        parentClass.getParam2();

        // DownCasting
        @SuppressWarnings({"unused", "CastCanBeRemovedNarrowingVariableType"})
        ChildClass childClass=(ChildClass) parentClass;
    }
}

class ParentClass{
    String param1;
    String param2;

    void getParam2(){}
}

class ChildClass extends ParentClass{
    String param3;
    String param4;

    void getParam4(){}

    @Override
    void getParam2(){}
}