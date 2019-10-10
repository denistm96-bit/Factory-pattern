package FactoryPattern;

interface Color
{
	void createColor();
}

class Black implements Color
{
	public void createColor() {
		System.out.println("Black color was created");
	}
}

class White implements Color
{
	public void createColor() {
		System.out.println("White color was created");
	}
}

class Factory
{
	public Color setColor(String colorType) {
		
		if(colorType.equals("Black"))
			return new Black();
		
		if(colorType.equals("White"))
		    return new White();
		
		return null;
	}
}

public class ColorPattern 
{	
	public static void main(String[] args)
	{	
		Factory factory = new Factory();
		
		Color color1 = factory.setColor("Black");
		color1.createColor();
		
		Color color2 = factory.setColor("White");
		color2.createColor();
	}
}