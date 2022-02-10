package practice_02_09_2022.abstraction;

abstract class Shape{

     abstract void draw();

    void usePencil(){
        System.out.println("Please draw your shape with using pencil!");
    }

    }

class Rectangle extends Shape{

    void draw(){
        System.out.println("drawing rectangle");
    }

}

    class Circle extends Shape{

        void draw(){
            System.out.println("drawing circle");
        }
    }


