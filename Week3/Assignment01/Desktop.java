package org.system;

public class Desktop extends Computer {
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel("Lenovo");
		d.desktopSize("20 inch");
	}
    public String desktopSize(String size)
	{
    	System.out.println("Desktop size is :  "+ size);
		return null;
		
	}
	
	

}
