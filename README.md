Technologies Used
Java
Scanner for user input
ArrayList for storing tasks
Simple error handling
Problem Solved
This project addresses the need for a simple task management tool that users can use to organize and manage their tasks efficiently.
It helps in keeping track of upcoming deadlines, prioritize tasks, and easily remove completed tasks.

How it Works
User Interface

Users interact with the application through a command-line interface (CLI).
They can add tasks using the "add" command followed by the task description.
They can list all tasks using the "list" command.
They can remove a specific task by number using the "remove" command followed by the task number.
Task Management Logic

The ArrayList class from Java is used to store the tasks.
When a user adds a task, it is added to the list using this.list.add(task).
When a user lists all tasks, it is printed using this.list.print().
When a user removes a task, it checks if the input is a valid integer and then uses this.list.remove(number) to remove the specified task.
Stop Command

The "stop" command breaks the infinite loop and exits the application.
This allows users to complete the current tasks without having to manually exit the program.
