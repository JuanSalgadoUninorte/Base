package starter.practice.oop;

public class OuterClass {

    class InnerClass {
        private int myNumber = 10;
        public void printNumber() {
            System.out.println("El número es: " + myNumber);
        }
    }

    class outerClass {
        public void printNumber() {
            //System.out.println(myNumber);
        }
    }

}
