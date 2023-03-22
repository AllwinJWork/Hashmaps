package hashmaps;

import java.util.HashMap;

public class Translation {
	private HashMap<String, String> morseCodeMap;

	public Translation() {
		morseCodeMap = new HashMap<String, String>();
		morseCodeMap.put(".-", "A");
		morseCodeMap.put("-...", "B");
		morseCodeMap.put("-.-.", "C");
		morseCodeMap.put("-..", "D");

	}

	public void translate(String morseCode) {

		String output = new String();
		String[] splitString = morseCode.split("\\s+");

		for (String letter : splitString) {

			output += morseCodeMap.get(letter);

		}

		System.out.println(output);

		// StringBuilder sb = new StringBuilder();
		// String[] words = morseCode.split(" / ");
		// for (String word : words) {
		// String[] letters = word.split(" ");
		// for (String lettter : letters) {
		// sb.append(morseCodeMap.get(lettter));
		// }
		// sb.append(" ");
		// return "Null;

	}

}

// TODO Auto-generated method stub
