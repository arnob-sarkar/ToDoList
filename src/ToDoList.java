import java.util.ArrayList;
public class ToDoList {

    private ArrayList<String> task;
    public ToDoList(){
        this.task = new ArrayList<>();
    }
    //method to add a task
    public void add(String task){
        this.task.add(task);
    }
    //method to remove a task
    public void remove(int number){
        this.task.remove(number-1);
    }
    //method to print all the tasks
    public void print(){

        if(this.task.isEmpty()){
            System.out.println("No task is there!");
        }
        for(int i = 1; i <= this.task.size(); i++){


            System.out.println(i + ": " + this.task.get(i-1));
        }
    }


}
