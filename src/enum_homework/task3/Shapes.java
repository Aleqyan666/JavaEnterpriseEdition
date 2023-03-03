package enum_homework.task3;

public enum Shapes {
    CIRCLE{

        public void calculateArea(double radius) {
            System.out.println("Area = " + radius * radius * Math.PI);
        }
    } ,TRIANGLE{

        public void calculateArea(double sinus, double side1, double side2) {
            if (-1 <= sinus && sinus <= 1){
                System.out.println("Area = " + sinus * side1 * side2 * 0.5);
            }
            else{
                System.out.println("Sinus must be in range [-1;1] ");
            }
        }
    } ,SQUARE{

        public void calculateArea(double side) {
            System.out.println("Area = " + side * side);
        }
    } ,RECTANGLE{

        public void calculateArea(double length, double width) {
            System.out.println("Area = " + width * length);
        }
    };

}
