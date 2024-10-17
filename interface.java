import java.util.*;
interface vehicle {
	void gear_change(int a);
	void speed_up();
	void apply_brakes();
	void display();
}
class bicycle implements vehicle{
	int gear,speed;
	bicycle(){
		System.out.println("\tBicycle started successfully\n");
		gear=1;
		speed=10;
	}
	public void gear_change(int gearx){
		if(gearx<7 && gearx>0){
			gear=gearx;
			System.out.println("\tGear changed successfully\n\tCurrent gear is "+gear);
		}else{
			System.out.println("Gear is out of range\n");
		}
	}
	public void speed_up(){
		if((speed+5)<50){
			speed+=5;
			System.out.println("\n\tBicycle speed increased\n\tCurrent speed is "+speed);
		}else{
			System.out.println("\n\tSpeed cont be increased adove 50 Kmhr\n");
		}
		}
		public void apply_brakes(){
			Scanner sc = new Scanner(System.in);
			int x;
			System.out.println("1.Decrease speed \n Stop Bicycle\n");
			x=sc.nextInt();
			if (x==1);
				if ((speed-5)>0){
					speed-=5;
					System.out.println("Speed reduce successfully\n\tCurrent speed is "+speed+"Kmhr\n");
					
					
					
				}else{
					speed=0;
					gear=0;
					System.out.println("Bicycle stopped successfully\n");
				}
				if(x==2){
					speed=0;
					gear=0;
					System.out.println("Bicycle stopped successfully\n");
				}
		}
		public void display(){
			System.out.println("Your Bicycle speed is "+speed+"Kmhr and gear is  "+ gear);
		}
	
}
