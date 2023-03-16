import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> arrayList = new ArrayList<>();
    FileReader fr = new FileReader("names.txt");
    Scanner fileScanner = new Scanner(fr);
    while (fileScanner.hasNextLine()){
    arrayList.add(fileScanner.nextLine());
    }
    
    int choice = 0;
    boolean menu = true;
    Scanner scan = new Scanner(System.in);
    while (menu == true){
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
    choice = scan.nextInt();
      if (choice == 1){
        System.out.println("$98,345 average salary in South Florida!");
      }
      if (choice == 2){
        System.out.println("US News - 100 Best Jobs!");    
    }
      if (choice == 3){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
  }
      if (choice == 4){
        System.out.println("Current Students:");
        for (int i = 0; i < arrayList.size(); i++){
          System.out.println(arrayList.get(i));
        }
  }
      if (choice == 5){
        menu = false;
  }
}
}
}
