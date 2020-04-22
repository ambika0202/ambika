public class DeadLock {
	String str1 = "Students";
	String str2 = "Tutorial";
	Thread th1 = new Thread("My Thread 1")
	{
		public void run()
		{
			while(true)
			{
				synchronized(str1)
				{
					synchronized(str2)
					{
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	Thread th2 = new Thread("My Thread 2")
	{
		public void run()
		{
			while(true)
			{
				synchronized(str2)
				{
					synchronized(str1)
					{
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock d1 = new DeadLock();
		d1.th1.start();
		d1.th2.start();

	}

}