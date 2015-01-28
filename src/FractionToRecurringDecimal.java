import java.util.Arrays;

/**
 * https://oj.leetcode.com/problems/fraction-to-recurring-decimal/
 * Given two integers representing the numerator and denominator of a fraction, 
 * return the fraction in string format.
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 * For example,
 * Given numerator = 1, denominator = 2, return "0.5".
 * Given numerator = 2, denominator = 1, return "2".
 * Given numerator = 2, denominator = 3, return "0.(6)".
 * 
 * @author BigTiannn {12-20-2014}
 *
 */

public class FractionToRecurringDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "/a/./b/../../c/";
		String[] array = s.split("/");
		System.out.println(Arrays.toString(array));
	}

}
