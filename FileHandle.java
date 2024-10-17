import java.io.*;
class FileHandle{
	public static void main(String [] args){
	try{
	File obj=new File("Students.txt");
	if(obj.exists()){
	System.out.println("File already exist");
	}
	else {
                if (obj.createNewFile()) { // create the file if it does not exist otherwise confusion will create on IOException
                    System.out.println("File created : "+obj.getName());
                } 
                else {
                    System.out.println("File could not be created");
                }
            }
           //Writing the file
           String content="\t This is the body of the file "+23;
           try (FileWriter writer = new FileWriter(obj.getName(),true)) {//To Append do FileWriter(obj.getName(),true)
            writer.write(content);  
            writer.write("\n");      // Writing a newline
            writer.write("\t this is another line.");
            System.out.println("Data has been written to the file successfully.");
        }
         catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        //Reading the file 
        System.out.println("Reading from the file:");
            try (BufferedReader reader = new BufferedReader(new FileReader(obj))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line); // Print each line to the console
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
	
	}
	catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	
	}

}
