/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// @author Luca Severini

public class CS151HW2
{
	// @param args the command line arguments
	public static void main(String[] args)
	{
		HireMe app = new HireMe();
		
		app.addJob("job1", "job1_desc", 1, 1000);
		app.addJob("job2", "job2_desc", 2, 2000);
		
		app.addApplicant("Luca", "Severini");
		app.addApplicant("Giulio", "Tognocchi");
		app.addApplicant("Attilio", "Tarsi");

		app.printApplicants();
	}
}
