public class StringManipulator {
	public String trimAndConcat(String string1, String string2){
		String trimmed1 = string1.trim();
		String trimmed2 = string2.trim();
		String concated = trimmed1.concat(trimmed2);
		return concated;
	}
	public Integer getIndexOrNull(String string1, char char1){
		int i = string1.indexOf(char1);
		if(i == -1){
			return null;
		}
		return i;
	}
	public Integer getIndexOrNull(String string1, String find){
		int i = string1.indexOf(find);
		if(i == -1){
			return null;
		}
		return i;
	}
	public String concatSubstring(String string1, int start, int end, String string2){
		String first = "";
		for (int i = start; i < end; i++){
			first += string1.charAt(i);
		}
		return first.concat(string2);
	}
}