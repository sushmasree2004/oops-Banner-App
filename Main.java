/*

@author : B.Sushma Sree
@version: 7

*/


class Main
{
    
	public static class CharacterPatternMap
	{
		Character character;
		String [] pattern;
		
		CharacterPatternMap(Character character,String[] pattern)
		{
			
			this.character=character;
			this.pattern=pattern;
			
		}
		public Character getCharacter()
		{
			return character;
		}
		
		public String[] getPattern()
		{
			return pattern;
		}
		
	}
	
	public static String[]  getCharacterPattern(Character ch,CharacterPatternMap[]  charMaps)
	{
		
		for(CharacterPatternMap map:charMaps)
		{
			if(map.getCharacter().equals(ch))
			{
				return map.getPattern();
			}
			
		}
		
		return new String[7];
		
		
		
	}
	
	
	public static void printBanner(String word,CharacterPatternMap[] maps )
	{
		StringBuilder bannerLines[]=new StringBuilder[7];
		for(int i=0;i<7;i++)
		{
			bannerLines[i]=new StringBuilder();
		}
		
		
		for(char ch:word.toCharArray())
		{
			
			String pattern[]=getCharacterPattern(ch,maps);
			for(int i=0;i<7;i++)
			{
				bannerLines[i].append(pattern[i]).append(" ");
				
			}
		}
		
		for(StringBuilder line:bannerLines)
		{
			
			System.out.println(line);
		}
		
	}
	
	public static void main(String[] args)
	{
		
		String o[]={
                 "    *****     ",
                 "  ***    ***  ",
                 " **        ** ",
                 " **        ** ",
                 " **        ** ",
                 "  ***    ***  ",
                 "    *****     "
            };
			
			
	    String p[]={
                 " ************* ",
                 " ************* ",
                 " **        *** ",
                 " ************* ",
                 " ************* ",
                 " **            ",
                 " **            ",
				 " **            "
            };
			
			
	    String s[]={
			
			"    ******  ",
			"   **       ",
			"  **        ",
			"    ****    ",
			"        **  ",
			"         ** ",
			"   ******   "
				
			
		};
		
		CharacterPatternMap  oPattern=new CharacterPatternMap('O',o);
		CharacterPatternMap pPattern=new CharacterPatternMap('P',p);
		CharacterPatternMap  sPattern=new CharacterPatternMap('S',s);
		
		
		CharacterPatternMap [] maps={oPattern,pPattern,sPattern};
		printBanner("OOPS",maps);
    }
					
		
}
	
	
		
		
		
	







