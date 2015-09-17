package controller;

/**
 * Solve class - extends the CommonComand
 * manage the solve of maze3d, ask from the model to solve the maze
 */

public class Solve extends CommonCommand {

	/**
	 * Solve constructor
	 * @param controller - get object from type Controller
	 */
	public Solve(Controller controller) {
		super(controller);
	}

	@Override
	public void doCommand(String arg) 
	{
		controller.getModel().createSolution(arg);
	}
}
