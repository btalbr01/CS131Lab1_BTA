import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	boolean active;
	String intelligenceType;
	
	public NonPlayerCharacter()
	{
		super();
		this.active = active;
		this.intelligenceType = intelligenceType;
		
	}//end empty-argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType)
	{
		super.getUniqueId();
	}//end preferred constructor

	public void boolean setActive(boolean active)
	{
		this.active = false;		
	}//end setActive
	
	public boolean getActive()
	{
		return active;
	}//end getActive
	
	public void String setintelligenceType(String intelligenceType)
	{
		this.intelligenceType = "AVERAGE";
	}//end setintelligenceType
	
	public String getintelligenceType()
	{
		return intelligenceType;
	}
	
}//end class
