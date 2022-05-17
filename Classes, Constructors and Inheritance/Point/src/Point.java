public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double xA = this.x;
        double xB = 0;
        double yA = this.y;
        double yB = 0;

        double distance = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) *(yB - yA));
        return distance;
    }

    public double distance(int anotherX,int anotherY) {
        double xA = this.x;
        double xB = anotherX;
        double yA = this.y;
        double yB = anotherY;

        double distance = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) *(yB - yA));
        return distance;
    }

    public double distance(Point point) {
        double xA = this.x;
        double xB = point.x;
        double yA = this.y;
        double yB = point.y;

        double distance = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) *(yB - yA));
        return distance;
    }
}
