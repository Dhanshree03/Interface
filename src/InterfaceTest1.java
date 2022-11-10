interface pet
{
    public void getdata();
}

class InterfaceTest1 implements pet
{
    public void getdata()
    {
        System.out.println("Interface Method Overriden");
    }

    public static void main(String args[])
    {
        //pet p=new InterfaceTest1();
        //p.getdata();
        InterfaceTest1 i=new InterfaceTest1();
        i.getdata();
    }
}








