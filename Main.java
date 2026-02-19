/*

@author : B.Sushma Sree
@version: 6

*/


class Main
{
    public static String[] getPatternO(){
        return new String[]
            {
                 "    *****     ",
                 "  ***    ***  ",
                 " **        ** ",
                 " **        ** ",
                 " **        ** ",
                 "  ***    ***  ",
                 "    *****     "
            };
    }



    public static String[] getPatternP(){
        return new String[]
            {
                 " ************* ",
                 " ************* ",
                 " **        *** ",
                 " ************* ",
                 " ************* ",
                 " **            ",
                 " **            ",
				 " **            "
            };
    }
	
	public static String[]  getPatternS(){
		
		return new String[]
		{
			
			"    ******  ",
			"   **       ",
			"  **        ",
			"    ****    ",
			"        **  ",
			"         ** ",
			"   ******   "
				
			
		};
		
		
	}
	
	
	
    public static void main(String args[])
    {
        String []o1=getPatternO();
		String []o2=getPatternO();
		String [] p=getPatternP();
		String [] s=getPatternS();
		
		
		for(int i=0;i<o1.length;i++)
		{
			
			System.out.println(o1[i]);
		}
		
		for(int i=0;i<o2.length;i++)
		{
			
			System.out.println(o2[i]);
		}
		
		
		for(int i=0;i<p.length;i++)
		{
			
			System.out.println(p[i]);
		}
		
		for(int i=0;i<s.length;i++)
		{
			
			System.out.println(s[i]);
		}



     }

}