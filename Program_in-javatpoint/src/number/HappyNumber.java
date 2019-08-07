package number;

class HappyNumber{
}
class MainHappyNUmber{
    public static int HappyNumber(int num){
        int sum = 0 ;
        int res = 0;
        while (num <0 ){
            res = num % 10;
            sum = sum + (res * res);
            num = num/10;
        }
        return sum;

    }
    public static void main(String[] args){
        HappyNumber H = new HappyNumber();
        int result;
        for (int i = 0 ; i<= 100; i++){
            result = i;
            while (result != 1 && result != 4){
                result = HappyNumber(result);
            }
            if (result == 1 ){
                System.out.println(result);
            }
        }
    }
}
