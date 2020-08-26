
public class Stack {

	int top = -1;
	int a[] = new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack obj = new Stack();
		
		obj.pop();
		obj.push(3);
		obj.push(9);
		obj.push(2);
		obj.push(12);
		obj.pop();
		obj.push(8);
		obj.print();

	}
	
	public void push(int num)
	{
		int n = a.length;
		
		if(top >= n-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			a[top] = num;
		}
	}
	
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			int temp = a[top];
			top--;
			System.out.println("Popped element "+temp);
		}
	}
	
	public void print()
	{
		for(int i = 0; i <= top; i++)
		{
			System.out.print("  "+a[i]);
		}
	}

}
