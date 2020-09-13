public class thread
{
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("currentTread is"+t);
		t.setName("Yajith");
		t.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Name of threa"+t);
		try {
		    for(int i=0;i<5;i++)
		    {
		        System.out.println(i);
		        Thread.sleep(1000);
		    }
		} catch(InterruptedException e) {
		    System.out.println("Done");
		} finally {
		}
	}
}