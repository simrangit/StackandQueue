
public class Queue {
	
	int front = -1, rear = -1;
	int a[] = new int[5];
	
	int n = a.length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue obj = new Queue();
		
//		obj.dequeue();
		obj.enqueue(3);
//		obj.print();
		obj.enqueue(9);
		obj.dequeue();
		obj.enqueue(2);
		obj.enqueue(10);
		obj.enqueue(12);
		obj.enqueue(4);
		obj.print();
		
	}
	
	public void enqueue(int num)
	{
		if((front == 0 && rear == n-1) || rear+1 == front)
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(rear == n-1)
				rear = 0;
			else if(rear == -1)
				front = rear = 0;
			else
				rear++;
			a[rear] = num;
			
		}		
	}
	
	public void dequeue()
	{
		if(front == -1)
		{
			System.out.print("Queue is empty");
			return;
		}
		
		int temp = a[front];
		
		System.out.println("Element deleted is "+temp);
		
		a[front] = 0;
//		front++;
		
		if(front == n-1)
			front = 0;
		else
			front++;
		
	}
	
	public void print()
	{	
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty");
		
		if(rear >= front)
		{
			for(int i = front; i <= rear; i++)
			System.out.print("  "+a[i]);
		}
		else
		{
		for(int i = 0; i <= rear; i++)
			System.out.println(" "+a[i]);
		
		for(int i = front; i < n; i++)
			System.out.println(" "+a[i]);
		}
		
		for(int i = 0; i < 5; i++)
			System.out.print("   "+a[i]);
	}

}
