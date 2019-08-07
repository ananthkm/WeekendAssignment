package transferFromHashMapToArrayList22;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class UserMainCode {
	
	public static List<String> getName(Map<Integer, String> map) {
		
		return map.entrySet().stream()
							.map(entry -> entry.getValue())
							.filter(name -> name.matches("^[a-z].*[0-9]+.*[A-Z]$"))
							.collect(Collectors.toList());
		
	}
	
}

	