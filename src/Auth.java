
public class Auth {
	static String login[]= {"meryem","fatima","asmaa"};
	static String password[]= {"ouzdou","hajli","asmaa"};
	
	public static boolean isCorrectLoginPassword(String a,String b)
	{ for(int i=0;i<3;i++)
		{ if(a==login[i] && b==password[i])
		     return true;
		else continue ;
		}
	return false;
	}
	public static boolean isCorrectLogin(String a,String b)
	{  for(int i=0;i<3;i++)
		{if (a==login[i])
			 return true;
		else 
			continue;
		}
		return false ;
	}
	
}
