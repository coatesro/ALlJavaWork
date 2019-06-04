
public class App {

	public static void main(String[] args) {
		
		
		
	}
	
	public String goldielocks(int temp)
	{	
		
		int t = temp;
		String result ="";
		if(t <= 10) {
			result = "Too cold";
		}
		else if (t >= 30) {
			result = "Too hot";
		}
		else if (t > 10 && t < 30) {
			result = "Just right";
		}
		return result;
		
		
	}
}
