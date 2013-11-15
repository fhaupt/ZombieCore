package taskMgn;

import taskMgn.tasks.Task;

public interface ITaskMgnListener { 
	public void changeTask(Task from, Task to);
}
