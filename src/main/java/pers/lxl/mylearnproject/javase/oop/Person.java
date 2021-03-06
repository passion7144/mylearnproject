package pers.lxl.mylearnproject.javase.oop;
//extends Object
public class Person {
    protected String name;
    protected int age;

//    final定义类不能被继承，定义方法之后不能被覆写，定义字段后不能被更改

    public void run(){
        System.out.println("Person run");
    }
//自定义构造方法，没有返回值（也没有void），调用构造方法，必须用new操作符。
//    不编写会有默认构造方法，自定义后不会自动创建无参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
//如果相同时有无参构造需自己写
    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    Overloading
    public void setName(String name,String name2){
        this.name=name+name2;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

