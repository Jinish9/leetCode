/*
 * 
Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
 * 
 */

public class RestoreString {

	public String restoreString(String s, int[] indices) {
		char[] charArray = s.toCharArray();
		char[] restoredCharArray = new char[charArray.length];
		for (int i = 0; i < indices.length; i++) {
			restoredCharArray[indices[i]] = charArray[i];
		}
		return String.valueOf(restoredCharArray);
	}
}
