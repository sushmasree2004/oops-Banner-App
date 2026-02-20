
/*

@author : B.Sushma Sree
@version: 8

*/



import java.util.HashMap;

class Main 
{

    public static HashMap<Character, String[]> createMap() 
	{
        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]
		{
            "    *****     ",
            "  ***    ***  ",
            " **        ** ",
            " **        ** ",
            " **        ** ",
            "  ***    ***  ",
            "    *****     "
        });

        map.put('P', new String[]
		{
            " ************* ",
            " ************* ",
            " **        *** ",
            " ************* ",
            " ************* ",
            " **            ",
            " **            ",
            " **            "
        });

        map.put('S', new String[]
		{
            "    ******  ",
            "   **       ",
            "  **        ",
            "    ****    ",
            "        **  ",
            "         ** ",
            "   ******   "
        });

        return map;
    }

    public static void displayBanner(String word, HashMap<Character, String[]> map)
	{
        int height = map.get('O').length;  

        for (int i = 0; i < height; i++) 
		{
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) 
			{
                String[] art = map.get(ch);
                if (art != null) 
				{
                    line.append(art[i]).append("  "); 
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) 
	{
        HashMap<Character, String[]> map = createMap();
        String msg = "OOPS";
        displayBanner(msg, map);
    }
}
