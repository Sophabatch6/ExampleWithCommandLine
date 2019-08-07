class InvalidCode extends Exception{
    public InvalidCode(String s) {
        super(s);
    }
}
class Example {
    void CheckException(int weight) throws InvalidCode{
        if (weight<200)
        {
            throw new InvalidCode("Error");
        }
    }
    public static void main(String[] args){
        Example obj = new Example();
        try{
            obj.CheckException(20);
        }
        catch(InvalidCode ex){
            System.out.println("Check Error");
            System.out.println(ex.getMessage());
        }
    }
}
