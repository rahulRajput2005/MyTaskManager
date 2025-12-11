# MyTaskManager
# Java Task Manager (Console Application)

This project is a simple **Task Management System** built in Java using **ArrayList** and **Scanner**.  
It allows users to:

✔ Add tasks  
✔ View all tasks  
✔ Delete tasks  
✔ Exit the program  

---

## 🚀 Features
- Menu-driven console interface  
- Dynamic task storage using `ArrayList`  
- Basic CRUD operations  
- Clean and beginner-friendly Java code  

---

📸 Screenshots
Program Output
<img width="645" alt="Screenshot 2025-12-11 134146" src="https://github.com/user-attachments/assets/4e3844b5-7028-4474-9a8a-fa7f3bac59ad" />
Main Menu
<img width="839" alt="Screenshot 2025-12-11 134230" src="https://github.com/user-attachments/assets/8e4eb520-28ac-4358-a9be-12c2c0f8eae0" />
View Task Feature
<img width="761" alt="Screenshot 2025-12-11 134246" src="https://github.com/user-attachments/assets/76857aba-df88-485b-b734-0eb824d80aa7" />
Add Task Feature
<img width="807" alt="Screenshot 2025-12-11 134304" src="https://github.com/user-attachments/assets/60639b73-2455-417c-8867-c3fa8e4b46b0" />
Delete Task Feature
<img width="558" alt="Screenshot 2025-12-11 134316" src="https://github.com/user-attachments/assets/c54014af-1cfd-4411-8033-7b27609bdbdf" />

## 🧩 Code Snippet
```java
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


