package gameLogic;

import taskMgn.tasks.Task;

public interface IGameLogic {
	/**
	 * return 0 if task can not be accepted
	 * @param t
	 * @return
	 */
	public double getHappiness(Task t); 
}
