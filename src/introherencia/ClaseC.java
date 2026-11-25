package introherencia;

public class ClaseC extends ClaseB{
    private int num4;

    public ClaseC(int  num1, int num2, int num3,int num4){
        super(num1,num2,num3);
        System.out.println("Constructor ClaseC");
        this.num4 = num4;
    }

    @Override
    public String toString(){
        return super.toString()+"\nNum4: "+num4;
    }
}