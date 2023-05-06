package com.ws.javaclass.week2.p1.p3;

/**
 * @author WS
 * @CreateTime 8:52
 */
public class p3 {
    public static void main(String[] args) {
        Self myself = new Self("ws","play basketball");
        myself.eat();
        myself.myHobbit();

        MyObject myObject = new MyObject("basketball");
        myself.myDo(myObject);
    }
}

class Self{
    private String name;
    private String hobbit;

    public Self(String name, String hobbit) {
        this.name = name;
        this.hobbit = hobbit;
    }

    public void eat(){
        System.out.println("i can eat");
    }
    public void myHobbit() {
        System.out.println("i like " + hobbit);
    }

    public void myDo(MyObject myObject) {
        System.out.printf("%s 用 %s 来娱乐",name,myObject.objectName);
        //System.out.println(name + " 用 " + myObject.objectName + " 来娱乐");
    }
}
class MyObject {
    public String objectName;

    public MyObject(String objectName) {
        this.objectName = objectName;
    }

    public void objectFunction() {
        System.out.println(objectName + " can be play");
    }
}