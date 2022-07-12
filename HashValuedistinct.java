import java.util.*;
public class Source{
	//Method to print distinct values
	public static void printValues(Map<Integer,String> map){
	    HashMap<Integer,String> mapTemp = new HashMap<Integer,String>();
        boolean flag=false;
        for (int j = 1; j <= map.size(); j++) {
            flag=false;
            for(int k = 1 ;k <= mapTemp.size();k++){
                if(mapTemp.containsValue(map.get(j))){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                mapTemp.put(j, map.get(j));
                if(j != 1 ){
                    System.out.print(" ");
                }
                System.out.print(map.get(j));

            }

        }
	}
	
	public static void main(String[] x){
		Map<Integer,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int key;
		String value;
		for(int i = 1; i <= num; i++){
			key = sc.nextInt();
			value = sc.next();
			map.put(key,value);
		}
		printValues(map);
	}
}
