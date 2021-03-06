package controller;
import model.Vehicle;
import model.WorkOrder;
import model.Queue;
//import model.Printer;
import model.Garage;
import model.WorkOrderItem;
import view.View;

/**
 * In the controller is where all interactions with the data is
 * carried out
 * @author David
 * Inspection queue contains a queue of different sets of 
 *  inspections
 * all calls to the model pass here.
 */

public class Controller {
	
	Garage g=new Garage(true, false);
	
	InspectionQueue inspectionQueue;
	WorkOrderItem workItem = new WorkOrderItem("Check engine", 1000.0);
	Vehicle car1 = new Vehicle("ABD 345","VAN","brandNew",2015);
	Vehicle car2 = new Vehicle("AAA 456","CONVERTIBLE","RUSTY",1999);
	Queue q = new Queue();
	public Controller( ){
	}
	/*
	 * starts a new inspection. 
	 * opens garage door and closes it.
	 */
	public void makeNewInspection(){
		
		System.out.println(q.addVehicle(car1) + q.addVehicle(car2) + q.getNextVehicle().toString());
	}
	public String enterLicense(){
	return null;
	
}

public String checkInspection(){
	return null;
	
}

public String customerCreditCardInfo(){
	return null;
	}

}
