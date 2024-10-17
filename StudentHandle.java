import java.io.*;
import java.util.*;
class StudentHandle{
	public static void main(String [] args){
	try{
	File obj=new File("Studentsdata.txt");
	if(obj.exists()){
	//System.out.println("File already exist");
	System.out.println("\t File opened");
	}
	else {
                if (obj.createNewFile()) { // create the file if it does not exist otherwise confusion will create on IOException
                    System.out.println("File created : "+obj.getName());
                    	System.out.println("\t File opened");
                } 
                else {
                    System.out.println("File could not be created");
                }
            }
            	System.out.println("\tWhat Operations would you like ?");
            	System.out.println("\t1. Add Student Data ");
            	System.out.println("\t2. Read Data");
            	System.out.println("\t3. Exit");
            	
            int ch;
            Scanner sc = new Scanner(System.in);
            Scanner p = new Scanner(System.in);
            Scanner c = new Scanner(System.in);
            Scanner u = new Scanner(System.in);
            Scanner a= new Scanner(System.in);
            Scanner b= new Scanner(System.in);
           // ch = sc.nextInt();
            do{
            System.out.print("Enter Operation :");
            ch = sc.nextInt();
            switch(ch){
            
            case 1:
            String name,adderess,cls;
            float marks;
            int id;
            System.out.print("Name :");
            name = a.nextLine();
            System.out.print("\nID :");
            id = p.nextInt();
            System.out.print("class :");
            cls = c.nextLine();
            System.out.print("Marks :");
            marks = u.nextFloat();
            System.out.print("Adderess :");
            adderess = b.nextLine();
            
           // Writing the file section
           try (FileWriter writer = new FileWriter(obj.getName(),true)) {//To Append do FileWriter(obj.getName(),true)
           
            writer.write("\n");      // Writing a newline
            writer.write("Name : "+name+"\n");
            writer.write("class : "+cls+"\n");
            writer.write("ID : "+id+"\n");
            writer.write("Marks : "+marks+"\n");
            writer.write("Adderess : "+adderess+"\n");
            System.out.println("\tData has been written to the file successfully.");
        }
         catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        break;
        
        case 2:
        
        //Reading the file 
       // System.out.println("Reading from the file:");
            try (BufferedReader reader = new BufferedReader(new FileReader(obj))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line); // Print each line to the console
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
            break;  
         default:
         System.out.println("Invalid Choice");
         break;
	
	}
	}while(ch!=3);
	}
	catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	
	}

}
