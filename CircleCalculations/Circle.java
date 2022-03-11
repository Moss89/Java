public class Circle {
        private double radius; // The radius
        private double x;
        private double y;
        private static int numberOfObjects = 0; // Number of objects created

        // Construct a circle with radius 1
    public Circle() {
        this(1.0, 0.0, 0.0);

    }

    // Construct a circle with the specified radius
    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        numberOfObjects++;
    }

        // Return the radius
        public double getRadius() {
            return radius;
        }
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        // Set a new radius
        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Return the number of objects created
        public static int getNumberOfObjects() {
            return numberOfObjects;
        }

        // Return the area
        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double getDistance(Circle otherCircle) {
            double y1 = this.getY();
            double y2 = otherCircle.getY();
            double x1 = this.getX();
            double x2 = otherCircle.getX();

            double ac = Math.abs(y2 - y1);
            double cb = Math.abs(x2 - x1);

            return Math.hypot(ac, cb);
        }

        // Return a string representation
        public String toString() {
            return "radius = " + this.getRadius() + " area = "
                    + this.getArea() + " perimeter = " + this.getPerimeter();
        }
    }
