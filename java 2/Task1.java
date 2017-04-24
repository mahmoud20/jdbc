public class Task1
{
	public static void main (String [] args)
	{
		String name = "ahmed ";
		String name2 = "ali";
		
		System.out.println(name == name2); //true
		System.out.println(name.equals(name2)); //true
		
		String lab = new String("Lab206");
		String lab2 = new String("Lab206");
		
		System.out.println(lab == lab2); //false 
		System.out.println(lab.equals(lab2)); //true
		
		
		int l = name.length();
		System.out.println(l);
		
		String fname = name.concat(name2);
		System.out.println(name);
		System.out.println(name2);
		System.out.println(fname);
		
		String fname2 = name +name2;
		System.out.println(fname2);
		
		char c = name.charAt(1);
		System.out.println(c);
		
		System.out.println(name.endsWith(" "));
		System.out.println(name.startsWith("ah"));
		
		System.out.println(name.indexOf("he"));
		
		System.out.println(fname.indexOf('a',1));
		
		String company = "new horizons";
		
		System.out.println(company.replace('n','x'));
		
		String names = "ahmed,sara,dina,morad,mona,fatma";
		String [] op = names.split(",");
		
		for (int i = 0 ; i<op.length ; i++)
			System.out.println(op[i]);
		
		System.out.println(company.substring(4));
		System.out.println(company.substring(4,8));
		System.out.println(company.substring(0,3));
		
		char[] chars =name.toCharArray();
		
		for (char cc : chars)
		{
			System.out.println(cc);	
		}
		
		int arr [] = {10,20,30,50};
		for (int i : arr)
		{
			System.out.println(i);	
		}
		
		//////////////////////////////////////////////////
		
		
		name = "   Ahmed Mohamed    ";
		System.out.println(name.toLowerCase().trim() + "xxx");
		System.out.println(name.toUpperCase());
		
		int d = 10;
		String ss1 = d+"";
		String ss2 = String.valueOf(d);
		
		
		
	}
}