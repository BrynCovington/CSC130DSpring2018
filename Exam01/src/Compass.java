
public class Compass {
	
	private int initialHeading;
	

	public Compass(int initialHeading) 
	{
		this.initialHeading = initialHeading;
	}
	
	public int getHeading() 
	{ 
		return initialHeading;
	}
	
	public void rotate (int angle) 
	{ 
	if (initialHeading < 0) { 
		initialHeading = (initialHeading + angle) % 360; 
		}
	else { 
		initialHeading = (initialHeading + angle) % 360; 
	}
	}
		
	}

