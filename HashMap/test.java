package HashMap;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map2<String, String> test = new HashMap2<>();
		
		
		map.put("테스트","테스트");
		map.put("테스트2","테스트");
		map.put("테스트","테스트1");
		test.put("테스트","테스트");
		test.put("테스트2","테스트");
		test.put("테스트","테스트1");
		
		System.out.println(map.get("테스트2"));
		System.out.println(test.get("테스트2"));
		System.out.println(map.toString());
		System.out.println(test.toString());
		

	}

}
