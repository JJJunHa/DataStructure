package HashMap;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map2<String, String> test = new HashMap2<>();
		
		
		map.put("�׽�Ʈ","�׽�Ʈ");
		map.put("�׽�Ʈ2","�׽�Ʈ");
		map.put("�׽�Ʈ","�׽�Ʈ1");
		test.put("�׽�Ʈ","�׽�Ʈ");
		test.put("�׽�Ʈ2","�׽�Ʈ");
		test.put("�׽�Ʈ","�׽�Ʈ1");
		
		System.out.println(map.get("�׽�Ʈ2"));
		System.out.println(test.get("�׽�Ʈ2"));
		System.out.println(map.toString());
		System.out.println(test.toString());
		

	}

}
