class rent{
    protected String cusnumber;
    protected String carnum;
    protected double rentperday;
    protected int numofdays;

     public void setdata(String cn,String carnum , double rpay, int day){
        this.carnum = carnum;
        this.cusnumber = cn;
        this.numofdays = day;
        this.rentperday = rpay;
    }
    public double calculatetotal(){
        double total = rentperday * numofdays;
        return total;
    }
    public void displaydata(){
        System.out.println("Total ammount: " + calculatetotal());
    }
}
class weddinghire extends rent{
    private double sevicecharge;

    public void setdata(String cn,String carnum , double rpay, int day,double servicecharge){
        super.setdata(cn, carnum, rpay, day);
        this.sevicecharge = servicecharge;
    }
    @Override
    public double calculatetotal(){
        double total = (rentperday * numofdays) + sevicecharge;
        return total;
    }
    public void displaydata(){
        System.out.println("Total ammount: " + calculatetotal());
    }
}
class thisdrive{
    public static void main(String args[]){

        weddinghire wh = new weddinghire();
        wh.setdata("C01","CAR03",1200, 2,800);
        wh.displaydata();
    }
}
