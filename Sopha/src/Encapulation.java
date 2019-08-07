class Example {
    private int numOfEmployees = 0;
    public void setNoOfEmployees (int count){
        numOfEmployees = count;
    }
    public double getNoOfEmployees (){
        return numOfEmployees;
    }
}
class MainClass{
    public static void main(String[] args){
        Example E = new Example();
        E.setNoOfEmployees(123);
        System.out.println(E.getNoOfEmployees());
    }

}
