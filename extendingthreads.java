class a extends Thread{
    public void r()
    {
        System.out.println("Hii im thread");
    }
}
class thread {
    public static void main(String[]args)
    {
        a g=new a();
        g.r();
        g.start();
    }
}