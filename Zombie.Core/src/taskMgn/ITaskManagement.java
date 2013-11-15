package taskMgn;

import java.util.ArrayList;

import taskMgn.tasks.Task;

public interface ITaskManagement {

	public void addTask(Task t);
	public void changeTask(Task from, Task to);
	public void removeTask(Task t);
	public void addTasks(ArrayList<Task> tasks);
	public double getTaskHappiness(Task t);
	public ArrayList<Task> getTasks();
	public ArrayList<Task> getNotAllowedTasks();
	public ArrayList<Task> getAvailableTasks();
	
	public void registerListener(ITaskMgnListener l);
	
	public void unregisterListener(ITaskMgnListener l);
	
	public void notifiyListener();
	
	
	
}
