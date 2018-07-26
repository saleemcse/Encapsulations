package com.huhy.payroll;

public class P{
	int x;
	int y;
	
	P(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	
	public boolean equals(Object obj)
	{
		if(obj!=null){
			if(obj instanceof P)
			{
			 P point =(P)obj;
			 if(x==point.x && y== point.y)
				 return true;
			}
		}
		return false;
	}
	
}

