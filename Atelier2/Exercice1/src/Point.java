public class Point {
    private double x ;
    private double y ;
    private double rho ;
    private double theta ;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(){

    };

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public void deplacer(double dx , double dy){
        x+=dx ;
        y+=dy;
    }
    public void deplacerDX(double dx){
        x+=dx ;
    }
    public void deplacerDY(double dy){
        y+=dy;
    }
    public void afficher(){
        System.out.println("Les coordonées sont : ("+x+","+y+")");
    }
    public void afficherPolaires(){

        System.out.println("Les coordonées polaires  sont : (rho:"+rho+",theta:"+theta+")");
    }
    public double distance(Point point){

        double distance = Math.sqrt(point.getX()* point.getX()+ point.getY()* point.getY());
        return distance;

    }
    @Override
    public String toString() {

        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';

    }
    public double rho(){

        rho = Math.sqrt(x*x+ y*y);
        return rho;

    }
    public double theta(){

        theta = Math.atan2(x,y);
        return theta ;

    }
    public Point homothétie(double k){

        Point point = new Point();
        point.setX(this.getX()*k);
        point.setY(this.getY()*k);
        return point ;
    }
    public Point rotation(double angle){

        double cosAngle = Math.cos(Math.toRadians(angle));
        double sinAngle = Math.sin(Math.toRadians(angle));
        double newX = x * cosAngle - y*sinAngle;
        double newY = x * sinAngle + y * cosAngle;

        return new Point(newX, newY);
    }
}
