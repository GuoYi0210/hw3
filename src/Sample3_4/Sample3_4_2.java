package Sample3_4;

public class Sample3_4_2 
{
	public static void main(String[] args)
	{
		Car2 car1;
		car1 = new Car2();
	
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}

//Car���O
class Car2
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O"+ this.num);
		System.out.println("�T�o�q�O"+ this.gas);
	}
}
