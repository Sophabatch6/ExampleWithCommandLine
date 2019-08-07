public class this_class {
    int a ;
    String b;
    float c;
    this_class(int a, String b, float c){
        this.a =a;
        this.b=b;
        this.c=c;
    }
    void display(){
        System.out.println(a+" "+b+ " "+c);
    }
}
class Testthis{
    public static void main(String[] args){
        this_class s1 = new this_class(1,"abc",57);
        this_class s2 = new this_class(2,"bcd", 6f);
        s1.display();
        s2.display();
    }
}
