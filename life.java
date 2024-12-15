class Life_Cycle_of_Thread
{
    public static void main(String args[])
    {
        System.out.println("Thread Started..");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Thread Resumed");
    }
 
}