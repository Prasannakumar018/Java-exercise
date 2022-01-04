interface addfloat01
{
    public void add();
}
public class addition_float_usinginterface implements addfloat
{
    public void add()
    {
        float a=20.0f;
        float b=100;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        addition_float_usinginterface obj= new addition_float_usinginterface();
       obj.add();
    }
    
}
