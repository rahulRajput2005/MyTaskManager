import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    static ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
         Scanner scanner = new Scanner(System.in);
         
         

         boolean isTrue = true;
         while(isTrue){
             System.out.println("===== Main Menu ====");
             System.out.println("1.=== Add  Task ");
             System.out.println("2.=== View Task ");
             System.out.println("3.=== Delete Task ");
             System.out.println("4.=== Exit Menu ");
             System.out.println();
             
             //Take input from user for choice
             System.out.print("Enter your desired operation: ");
             int choice = scanner.nextInt();
             scanner.nextLine();//Consume new line
             
             switch(choice){
                 case 1:
                     addTasks(scanner);
                     break;
                 case 2:
                     viewTasks(scanner);
                     break;
                 case 3:
                     deleteTasks(scanner);
                     break;
                 case 4:
                     EXIT();
                     isTrue = false;
                     break;
                 default:
                     System.out.println("Invalid Choice !!");
                     break;
             }
         }
    }

    private static void EXIT() throws InterruptedException {
        System.out.print("Exiting");
        for(int i=0; i<5; i++){
            Thread.sleep(280);
            System.out.print(".");
        }
        System.out.println();
    }

    private static void deleteTasks(Scanner scanner) {
        System.out.println();
        System.out.print("Enter task number to delete: ");
        int deleteTask = scanner.nextInt();
        tasks.remove(deleteTask-1);

        System.out.println("TASK DELETED SUCCESSFULLY!");
        System.out.println();
    }

    private static void viewTasks(Scanner scanner) {
        System.out.println();
        System.out.println("=== ALL TASKS ===");
        for(int idx = 0; idx< tasks.size(); idx++){
            int index = idx+1;
            System.out.println("TASK: "+index + " " +tasks.get(idx));

        }
        System.out.println();
    }

    private static void addTasks(Scanner scanner) {
        System.out.println();
        System.out.print("Enter a new Task: ");
        String newTask = scanner.nextLine();
        tasks.add(newTask);

        System.out.println("TASK ADDED SUCCESSFULLY!");
        System.out.println();
    }
}
