package HashMap;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map3<String, String> test = new HashMap3<>();
		
		
		map.put("테스트","테스트");
		map.put("테스트2","테스트");
		map.put("테스트","테스트1");
		
		
		
		
		test.put("테스트","테스트");
		test.put("테스트2","테스트");
		test.put("테스트","테스트1");
		System.out.println(map.remove("테스트"));
		System.out.println(test.remove("테스트"));
		
		System.out.println(map.put("테스트2","테스트2"));
		System.out.println(test.put("테스트2","테스트2"));
		System.out.println(test.toString());
		System.out.println(map.toString());

	}

}
