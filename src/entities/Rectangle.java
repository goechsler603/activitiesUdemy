package entities;

public class Rectangle {
        public double width;
        public double height;

        public double area() {
            return height * width;
        }

        public double perimeter() {
            return 2 * (width+height);
        }

        public double diagonal() {

            return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        }

    }
