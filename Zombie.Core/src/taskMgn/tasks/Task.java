package taskMgn.tasks;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Task { 
	private String name;
	private static HashMap<Class<? extends Task>,ArrayList<Class<? extends Task>>> requiredTasks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Task> getRequiredTasks(Task t){
		return null; //TODO: search Tasks
	}
	
	static{
		requiredTasks= new HashMap<Class<? extends Task>,ArrayList<Class<? extends Task>>>();
		
		//only an example insert!
		Class<SystemTask> st = SystemTask.class;
		ArrayList<Class<? extends Task>> rt_st = new ArrayList<Class<? extends Task>>();
		rt_st.add(GameTask.class); 
		requiredTasks.put(st, rt_st);
	}
}
