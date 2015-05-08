package view;
import model.Garage;
import model.Payment;
//import model.Printer;
import model.Queue;
import model.Vehicle;
import model.WorkOrder;
import controller.Controller;
public class View {
	private Controller contr;
	
	/*
	 * instantites a new View.
	 */
	public View(Controller contr){
		this.contr = contr;
		
	}
	/*
	 * calls all system operations and prints the results of the calls.
	 */
	public void run(){
		contr.makeNewInspection();
	}

}
