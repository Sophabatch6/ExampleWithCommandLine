class Example2{
    public static void main(String[] args){
        try{
            System.out.println("First Print Statement In Try Block");
            int a[] = new int[7];
            a[8]=30;
            a[4] = 30/0;
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }
        catch (Exception e){
            System.out.println("Warning: Some other exception");
        }
        System.out.println("Out of try-catch block");
    }
}
