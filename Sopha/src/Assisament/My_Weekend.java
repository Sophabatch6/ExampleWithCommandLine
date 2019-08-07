package Assisament;

public class My_Weekend {
    void AlarmClock(int number,boolean condition){
        if (condition==false){
            switch (number){
                case 1:
                    System.out.println("Today is Monday, I should get up at 7:00 AM");
                case 2:
                    System.out.println("Today is Tuesday, I should get up at 7:00 AM");
                case 3:
                    System.out.println("Today is Wednesday, I should get up at 7:00 AM");
                case 4:
                    System.out.println("Today is Thursday, I should get up at 7:00 AM");
                case 5:
                    System.out.println("Today is Friday, I should get up at 7:00 AM");
            }
        }
        else{

        }

    }
    static void Show_Condition_True(){
        System.out.println("7:00 AM");
    }
    void Show_condition_False(){
        System.out.println("10:00 AM");
    }
}
