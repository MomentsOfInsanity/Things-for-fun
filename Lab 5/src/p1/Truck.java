package p1;

public class Truck extends Vehicle
{
	private double loadingCapacity;
	private int towingCapacity;
	
	public Truck(Person owner, String manufactorsName, int cylinders, double loadingCapacity, int towingCapacity)
	{
		super(manufactorsName, cylinders, owner);
		this.loadingCapacity = loadingCapacity;
		this.towingCapacity = towingCapacity;
	}

	public double getLoadingCapacity() 
	{
		if(loadingCapacity > 0)
		return loadingCapacity;
		return loadingCapacity;
	}

	public void setLoadingCapacity(double loadingCapacity) 
	{
		this.loadingCapacity = loadingCapacity;
	}

	public int getTowingCapacity()
	{
		if(towingCapacity > 0)
		return towingCapacity;
		return towingCapacity;
	}

	public void setTowingCapacity(int towingCapacity)
	{
		this.towingCapacity = towingCapacity;
	}
	
	@Override
	 public boolean equals(Object obj) {
	       if (this == obj)
	           return true;
	       if (!super.equals(obj))
	           return false;
	       if (!(obj instanceof Truck))
	           return false;
	       Truck other = (Truck) obj;
	       if (Double.doubleToLongBits(loadingCapacity) != Double
	               .doubleToLongBits(other.loadingCapacity))
	           return false;
	       if (towingCapacity != other.towingCapacity)
	           return false;
	       return true;
	   }

	@Override
	public String toString() 
	{
		return super.toString() + "\nTruck loading capacity = " + loadingCapacity + " tons" + ", Towing capacity = " + towingCapacity + " Lbs";
	}

}
