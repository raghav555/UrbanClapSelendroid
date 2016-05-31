import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class testcase {
	// static int price=0;
	public static void main(String args[]) throws Exception {
		func();
	}

	public static void func() throws Exception {

		int price = 0;
		// price=price+1;
		String REGEX1 = "Once";
		String REGEX2 = "Twice";
		String REGEX3 = "Thrice";
		String REGEX4 = "4";
		String REGEX5 = "5";
		String REGEX6 = "6";
		String REGEX7 = "7";
		int i;
		String input[]=new String[5];
		input[0]="Once a week";
		input[1]="Twice a week";
		input[2]="Thrice a week";
		input[3]="4 times a week";
		input[4]="7 times a week";
		for (i = 0; i < 5; i++) {
			price = 0;
			String INPUT=input[i];
			Pattern pattern;
			Matcher matcher;
			pattern = Pattern.compile(REGEX1, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(INPUT);
			if (matcher.lookingAt() == true) {
				price = 3500;
			}
			pattern = Pattern.compile(REGEX2, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(INPUT);
			if (matcher.lookingAt() == true) {
				price = 4500;
			}
			pattern = Pattern.compile(REGEX3, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(INPUT);
			if (matcher.lookingAt() == true) {
				price = 5500;
			}
			pattern = Pattern.compile(REGEX4, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(INPUT);
			if (matcher.lookingAt() == true) {
				price = 6500;
			}
			pattern = Pattern.compile(REGEX5, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(INPUT);
			if (matcher.lookingAt() == true) {
				price = 7500;
			}
			pattern = Pattern.compile(REGEX6, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(INPUT);
			if (matcher.lookingAt() == true) {
				price = 8500;
			}
			pattern = Pattern.compile(REGEX7, Pattern.CASE_INSENSITIVE);
			matcher = pattern.matcher(INPUT);
			if (matcher.lookingAt() == true) {
				price = 9500;
			}
			System.out.println(price);

		}
	}

}