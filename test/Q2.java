public class Q2{
    public class Friend{
	public int money;
	public int name;
	public Friend(String n){
	    name=n;
	}
    }

    int np;
   
    public static void processGifting(String file){
	File f=new File(file);
	Scanner S= new Scanner(f);
	int np=S.nextLine().parseInt();
	ArrayList<String> lines = new ArrayList<String>();
	while (S.hasNextLine()){
	    lines.add(S.nextLine());
	}
	ArrayList<Friend> friends=new ArrayList<Friend>();
	int i;
	for (i=0;i<np; i++){
	    friends.add(new Friend(lines.get(i)));
	}
	while(i<lines.length()){
	    Friend c;
	    for (Friend f: friends){
		if (lines.get(i).equals(f.name))
		    c=f;
	    }
	    int money= lines.get(i+1).substring(0,lines.get(i+1).indexOf(" ")).parsInt();
	    int gifts=lines.get(i+1).substring(lines.get(i+1).indexOf(" ")+1).parsInt();
	    for (int n= i+2; n< i+2+gifts; i++){
		for (Friend f: friends){
		    if (f.name.equals(lines(i))){
			f.money+= money/gifts;
		    }
		}
		c.money+=money%gifts;
	    }
	}
	for(Friend f: friends){
	    System.out.println(f.name+" "+f.money);
	}
    }
}
	    
		    