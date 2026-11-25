package introherencia;

public class ClaseB extends ClaseA{
    private int num3;
    public ClaseB(int  num1, int num2, int num3){
        super(num1,num2);
        System.out.println("Constructor ClaseB");
        this.num3 = num3;
    }
    public int getNum3() {
        return num3;
    }
    @Override
    public String toString(){
        //return "Num1: "+num1+"\nNum2: "+getNum2()+"\nNum3: "+num3;
        return super.toString()+"\nNum3: "+num3;
    }
}