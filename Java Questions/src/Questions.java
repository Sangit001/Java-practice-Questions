



//Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
//
//class Person{
//    String name;
//    int age;
//    Person(String name, int age){
//        this.name = name;
//        this.age = age;
//
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public int getAge(){
//        return age;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//}
//
//
//
//public class Questions {
//public static void main(String[] args) {
//
//    Person person1 = new Person("sangit", 21);
//    Person person2 = new Person("david", 22);
//
//    System.out.println(person1.getName());
//    System.out.println(person1.getAge());
//    System.out.println(person2.getName());
//    System.out.println(person2.getAge());
//
//
//}
//}


//2. Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class, set their attributes using the constructor and modify the
// attributes using the setter methods and print the updated values.

/*

class Dog{
    private String name;
    private String breed;
    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
        }


    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public void setName(String name){
        this.name  = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
}

public class Questions {

    public static void main(String[] args){

        Dog dog1 = new Dog("puppu", "german");
        Dog dog2 = new Dog("luppy", "japanese");

        System.out.println("First dog name is: "+dog1.getName());
        System.out.println("First dog breed is: "+dog1.getBreed());
        System.out.println("Second dog name is: "+dog2.getName());
        System.out.println("Second dog breed is: "+dog2.getBreed());

        dog1.setName("Oreo");
        dog1.setBreed("unknown");
        dog2.setName("Dorio");
        dog2.setBreed("German");

        System.out.println("First dog name is: "+dog1.getName());
        System.out.println("First dog breed is: "+dog1.getBreed());
        System.out.println("Second dog name is: "+dog2.getName());
        System.out.println("Second dog breed is: "+dog2.getBreed());
    }
}

*/


/*
3. Write a Java program to create a class called "Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle.
 */
/*
class Rectangle{
    private int width;
    private int height;
    Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return 2 * (height+width);
    }

}
public class Questions{
public static void main(String[] args) {

    Rectangle r = new Rectangle(12,22);

    System.out.println("The area of rectangle is: "+r.getArea());
    System.out.println("The Perimeter of rectangle is: "+r.getPerimeter());

}
}
 */

/*Write a Java program to create a class called "Circle" with a radius attribute.
 You can access and modify this attribute. Calculate the area and circumference of the circle.
 */

/*
class Circle{
    private double radius;
    final float PI = 22/7f;
    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return (PI*radius*radius);
    }
    public double getCircumference(){
        return 2*(PI*radius);
    }
}
public class Questions
{
    public static void main(String[] args)
    {

        double r = 4;
        Circle c = new Circle(r);
        c.getArea();
        c.getCircumference();
        System.out.println("The area of circle is: "+ c.getArea());
        System.out.println("The area of circumference is: "+c.getCircumference());


        r = 99;
         c.setRadius(r);
        System.out.println("The area of circle is: "+ c.getArea());
        System.out.println("The area of circumference is: "+c.getCircumference());

    }
}

 */

