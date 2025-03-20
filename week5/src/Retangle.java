public class Retangle {
    private Point topLeft;
    private int sideA, sideB;

    public Retangle(Point tooLeft, int sideA, int sideB) {
        this.topLeft = tooLeft;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Retangle(Point tooLeft, int sideA) {
        this.topLeft = tooLeft;
        setSideA(sideA);
        setSideB(sideA);
    }

    public Point getTooLeft() {
        return topLeft;
    }

    public void setTooLeft(Point tooLeft) {
        this.topLeft = tooLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if(sideA < 0){
            this.sideA = 0;
            System.out.println("not negative");
        }else{
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if(sideB < 0){
            this.sideB = 0;
            System.out.println("not negative");
        }else{
        this.sideB = sideB;
    }
}
public int permeter(){
    return (2*sideA) + (2*sideB)
}