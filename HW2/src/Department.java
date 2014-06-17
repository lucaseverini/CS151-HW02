/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
	@author Luca
*/

// Department -----------------------------------------------------
public class Department implements Comparable
{
	private static final long serialVersionUID = 1L;
	private static int nextId = 1;

	int id;
	String name;
	String description;
	
	Department()
	{
		id = nextId++;
		
		name = "";
		description = "";
	}

	@Override
	public int compareTo(Object obj)
	{
		Department department = (Department)obj;
		
		int result = name.compareToIgnoreCase(department.name);	
				
		return result;		
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Department)
		{
			Department department = (Department)obj;
			return name.equals(department.name);
		}
		
		return false;
	}

	@Override
	public  String toString()
	{
		return "department " + name;
	}

}
