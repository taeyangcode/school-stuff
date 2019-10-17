
public class ShapeConversion {
        public double squareArea(double length) {
            return length * length;
        }
        public double squarePerimeter (double length) {
            return length * 4;
        }
        public double rectangleArea(double length, double width) {
            return length * width;
        }
        public double retanglePerimeter(double length, double width) {
            return 2 * (length + width);
        }
        public double triangleArea(double width, double height) {
            return (height * width) / 2;
        }
        public double trianglePerimeter(double sideA, double sideB, double sideC) {
            return (sideA + sideB + sideC);
        }
        public double circleRadius(double radius) {
            return 2 * Math.PI * radius;
        }
        public double trapezoidArea(double height, double a, double b) {
            return (a + b) / 2 * height;
        }
        public double trapezoidPerimeter(double a, double b, double c, double d) {
            return a + b + c + d;
        }
}



