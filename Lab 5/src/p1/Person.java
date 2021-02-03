package p1;

public class Person 
{
	private String name;

	public Person(String name) 
	{
		super();
		this.name = name;
	}
	
	public Person(Person theObject) 
	{
		name = theObject.name;
	}
	
	public Person()
	{
		name = "No Name";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Override
	 public boolean equals(Object obj) {
         if (this == obj)
             return true;
         if (obj == null)
             return false;
         if (!(obj instanceof Person))
             return false;
         Person other = (Person) obj;
         if (name == null) {
             if (other.name != null)
                 return false;
         } else if (!name.equals(other.name))
             return false;
         return true;
     }

	@Override
	public String toString()
	{
		return name + "";
	}
	
	

}
