public class EncapTest {
    public static void main(String[]args){
        Encap obj = new Encap();
        System.out.println(obj.getId());
        obj.setId(10);
        System.out.println(obj.getId());

    }
}

class Encap{
    private int id = 1;
    private String name;

    int getId(){
        return this.id;
    }

    void setId(int id){
        this.id = id;
    }

}
