package p1;

public class Vehicle 
{
	private String manufactorsName;
	private int cylinders;
	private Person owner = new Person();
	
	public Vehicle(String manufactorsName, int cylinders, Person owner) 
	{
		super();
		this.manufactorsName = manufactorsName;
		this.cylinders = cylinders;
		this.owner = owner;
	}

	public String getManufactorsName()
	{
		return manufactorsName;
	}

	public void setManufactorsName(String manufactorsName)
	{
		this.manufactorsName = manufactorsName;
	}

	public int getCylinders()
	{
		if(cylinders > 2 && cylinders < 30)
		{
			return cylinders;
		}
		else 
		{
			System.out.println("Error: The Cylinder amount has to be greater then 2.");
		}
		return cylinders;
		
	}

	public void setCylinders(int cylinders)
	{
		this.cylinders = cylinders;
	}

	public Person getOwner() 
	{
		return owner;
	}

	public void setOwner(Person owner) 
	{
		this.owner = owner;
	}
	
	@Override
	public boolean equals(Object obj) {
		   if (this == obj)
		       return true;
		   if (obj == null)
		       return false;
		   if (!(obj instanceof Vehicle))
		       return false;
		   Vehicle other = (Vehicle) obj;
		   if (manufactorsName == null) {
		       if (other.manufactorsName != null)
		           return false;
		   } else if (!manufactorsName.equals(other.manufactorsName))
		       return false;
		   if (cylinders != other.cylinders)
		       return false;
		   if (owner == null) {
		       if (other.owner != null)
		           return false;
		   } else if (!owner.equals(other.owner))
		       return false;
		   return true;
		}

	@Override
	public String toString() 
	{
		return "Vehicle Manufactors = " + manufactorsName + ", cylinders = " + cylinders + ", Ownner = " + owner + "";
	}
	
}
