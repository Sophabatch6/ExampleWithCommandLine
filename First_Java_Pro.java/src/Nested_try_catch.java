public class Nested_try_catch {
    public static void main(String[] args){
        try{
            try{
                System.out.println("Inside block1");
                int b = 34/0;
                System.out.println(b);
            }
            catch(ArithmeticException e1){
                System.out.println("Exception: 1");
            }
            try{
                System.out.println("In block2");
                int b = 45/0;
                System.out.println(b);
            }
            catch (ArithmeticException e2) {
                System.out.println("Exception e2");
            }
            System.out.println("Just other statement");
            }
        catch (ArithmeticException e3){
            System.out.println("Exception e3");
        }
        catch (ArrayIndexOutOfBoundsException e4){
            System.out.println("Exception e4");
        }
        catch (Exception e5) {
            System.out.println("Exception e5");
        }
        }
    }
