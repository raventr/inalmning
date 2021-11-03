package inalmning;

public class Lines {
	private boolean stopped = false;
	private int rows = 0;
	private int chars = 0;
	private int words = 0;

	public void calculate(String input) {

		if (input.trim().length() == 0) {
			return;
		}
		
		if(input.equalsIgnoreCase("stop")) {
            stopped = true;
            return;
		}
		
		if (input.toLowerCase().contains("stop")) {
			String withoutStop = input.toLowerCase().replace("stop", " ");
			count(withoutStop);
			setStopped(true);
		} else {
			count(input);

		}
	}

	private void count(String input) {
		rows++;
		String[] split = input.split(" ");

		for (String s : split) {
			if (s.length() > 0) {
				words++;
				chars += s.length();
			}
		}

	}

	public String getResult() {
		return "you wrote: " + words + " words, " + chars + " chars and " + rows + " rows!";

	}

	public int getWords() {

		return words;
	}

	public void setWords(int words) {
		this.words = words;

	}

	public boolean isStopped() {
		return stopped;
	}

	public void setStopped(boolean stopped) {
		this.stopped = stopped;

	}

	public int getRows() {

		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;

	}

	public int getChars() {
		return chars;
	}

	public void setChars(int chars) {
		this.chars = chars;
	}

}
