public class Video {
    private int code;
    private double cost;

    public Video(int code){
        this.code = code;
    }

    public void setCost(double c) {
        if (code == 1)
            cost = 4.99D;
        else
            cost = 7.99D;
    }

    public double getCost() {
        return cost;
    }

    public int getCode(){
        return code;
    }

}