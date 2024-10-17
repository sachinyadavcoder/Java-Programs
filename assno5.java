import java.util.*;
interface Vehicle{
 void ChangeGear(int a);
 void ApplyBrakes();
 void Speed_up();
 void Display();
}
 class Car implements Vehicle
	{
	
	int Speed ;
	int Gear;
	
	Car(){
	System.out.println("Car started");
	Speed =10; //Gear 1 WHEN CAR STARTS
	Gear=1;
	}
	public void ChangeGear(int NewGear){
	 if((NewGear<6) && (NewGear>0))
	 {
	 Gear=NewGear;
	 System.out.println("Gear Changed");
	 if(Speed*Gear<50){
	 Speed*=Gear;
	 }
	 }
	 else{
	 System.out.println("Invalid Gear");
	 }
	}
	public void Speed_up( ){
	if((Speed+10)<=50){
	Speed += 10;
	if(Gear+1<6){
	 Gear+=1;
	 }
	System.out.println("Speed Increased");
	}
	else{
	System.out.println("MAX Speed Achieved");
	}
	}
	public void ApplyBrakes(){
	System.out.println("1.To Decrease Car Speed\n2. To Stop Car");
	int ch;
	System.out.print("Enter what to do :");
	Scanner sc=new Scanner(System.in);
	ch=sc.nextInt();
	if(ch==1 &&(Speed-10)>0){  //Speed is never negative
	 Speed-=10;
	 if(Gear-1>0){
	 Gear-=1;
	 }
	 System.out.println("Car Speed Decreased");
	 }
	 else{
	 Speed=0;
	 Gear=0;
	 System.out.println("Car Stopped");
	 
	 }
	}
	public void Display(){
	if(Speed==0){
	System.out.println("Car is in rest");
	}
	else{
	System.out.println("Your Car : \n\tSpeed : "+Speed+"Kmph\n\t"+"Gear : "+Gear);
	}
	}
}
class Bike implements Vehicle{
int Speed ;
	int Gear;
	
	Bike(){
	System.out.println("Bike started");
	Speed =10; //Gear 1 WHEN CAR STARTS
	Gear=1;
	}
	public void ChangeGear(int NewGear){
	 if((NewGear<6) && (NewGear>0))
	 {
	 Gear=NewGear;
	 System.out.println("Gear Changed");
	 if(Speed*Gear<50){
	 Speed*=Gear;
	 }
	 }
	 else{
	 System.out.println("Invalid Gear");
	 }
	}
	public void Speed_up(){
	if((Speed+10)<=50){
	Speed += 10;
	if(Gear+1<6){
	 Gear+=1;
	 }
	System.out.println("Speed Increased");
	}
	else{
	System.out.println("MAX Speed Achieved");
	}
	}
	public void ApplyBrakes(){
	System.out.println("1.To Decrease Bike Speed\n2. To Stop Car");
	int ch;
	System.out.print("Enter what to do :");
	Scanner sc=new Scanner(System.in);
	ch=sc.nextInt();
	if(ch==1 &&(Speed-10)>0){  //Speed is never negative
	 Speed-=10;
	 if(Gear-1>0){
	 Gear-=1;
	 }
	 System.out.println("Bike Speed Decreased");
	 }
	 else{
	 Speed=0;
	 Gear=0;
	 System.out.println("Bike Stopped");
	 
	 }
	}
	public void Display(){
	if(Speed==0){
	System.out.println("Bike is in rest");
	}
	else{
	System.out.println("Your Bike : \n\tSpeed : "+Speed+"Kmph\n\t"+"Gear : "+Gear);
	}
	}
}

class Bicycle implements Vehicle{
int Speed ;
	int Gear;
	
	Bicycle(){
	System.out.println("Bicycle started");
	Speed =10; //Gear 1 WHEN CAR STARTS
	Gear=1;
	}
	public void ChangeGear(int NewGear){
	 if((NewGear<6) && (NewGear>0))
	 {
	 Gear=NewGear;
	 System.out.println("Gear Changed");
	 if(Speed*Gear<50){
	 Speed*=Gear;
	 }
	 }
	 else{
	 System.out.println("Invalid Gear");
	 }
	}
	public void Speed_up( ){
	if((Speed+10)<=50){
	Speed += 10;
	if(Gear+1<6){
	 Gear+=1;
	 }
	System.out.println("Speed Increased");
	}
	else{
	System.out.println("MAX Speed Achieved");
	}
	}
	public void ApplyBrakes(){
	System.out.println("1.To Decrease Bicycle Speed\n2. To Stop Car");
	int ch;
	System.out.print("Enter what to do :");
	Scanner sc=new Scanner(System.in);
	ch=sc.nextInt();
	if(ch==1 &&(Speed-10)>0){  //Speed is never negative
	 Speed-=10;
	 if(Gear-1>0){
	 Gear-=1;
	 }
	 System.out.println("Bicycle Speed Decreased");
	 }
	 else{
	 Speed=0;
	 Gear=0;
	 System.out.println("Bicycle Stopped");
	 
	 }
	}
	public void Display(){
	if(Speed==0){
	System.out.println("Bicycle is in rest");
	}
	else{
	System.out.println("Your Bicycle : \n\tSpeed : "+Speed+"Kmph\n\t"+"Gear : "+Gear);
	}
	}
}

class assno5{

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = null;

        System.out.println("Choose a vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bicycle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                vehicle = new Car();
                break;
            case 2:
                vehicle = new Bike();
                break;
            case 3:
                vehicle = new Bicycle();
                break;
            default:
                System.out.println("Invalid choice.");
                return; // Exit the program if the choice is invalid
        }

        // Perform operations on the selected vehicle
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Change Gear");
            System.out.println("2. Speed Up");
            System.out.println("3. Apply Brakes");
            System.out.println("4. Display Status");
            System.out.println("5. Exit");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter new gear (1-5): ");
                    int newGear = scanner.nextInt();
                    vehicle.ChangeGear(newGear);
                    break;
                case 2:
                    vehicle.Speed_up();
                    break;
                case 3:
                    vehicle.ApplyBrakes();
                    break;
                case 4:
                    vehicle.Display();
                    break;
                case 5:
                    running = false; // Exit the loop
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        }

        scanner.close();
    }
}
