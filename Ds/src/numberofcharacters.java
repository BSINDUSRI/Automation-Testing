
public class numberofcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Capgemini";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='s') {
				count++;
			}
		}
		System.out.println(count);
		
		String m="Automation Testing Using Selenium Java";
		int vowelscount=0;
		int consonantscount=0;
		m=m.toLowerCase();
		for(int i=0;i<m.length();i++) {
			char ch=m.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelscount++;
				
				
			}else {
				consonantscount++;
			}
			
		}
		System.out.println(vowelscount);
		System.out.println(consonantscount);
	
		

	}

}
