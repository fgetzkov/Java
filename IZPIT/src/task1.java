import java.awt.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;


public class task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        String var = input.nextLine().replaceAll("\\s+", " ");
        var = var.replaceAll("([^\\d-]?)(-?[\\d\\.]+)([^\\d]?)", "$1 $2 $3").replaceAll(" +", " ").trim();
        var = var.replaceAll("([^\\d-]?)(-?[\\d\\.]+)([^\\d]?)", "$1 $2 $3").replaceAll(" -", "- ").trim();
        var = var.replaceAll("\\s+", " ");
       
        String strStr[] = var.split(" ");
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<BigDecimal> bigDecimal = new ArrayList<BigDecimal>();

        equals(strStr, str, bigDecimal);
        BigDecimal result = new BigDecimal(0);
        result = result(str, bigDecimal, result);
        System.out.println(result);
	}

	private static BigDecimal result(ArrayList<String> str,
			ArrayList<BigDecimal> bigDecimal, BigDecimal result) {
		for (int i = 0; i < bigDecimal.size(); i++) {
                if (i == 0) {
                        result = bigDecimal.get(i);
                        continue;
                }
                if (str.get(i-1).equals("+")) {
                        result = bigDecimal.get(i).add(result);
                } else {
                        result = result.subtract(bigDecimal.get(i));
                }
               
        }
		return result;
	}

	private static void equals(String[] strStr, ArrayList<String> str,
			ArrayList<BigDecimal> bigDecimal) {
		for(int i = 0; i < strStr.length; i++) {
                String s = strStr[i];
                if (s.equals("+") || s.equals("-")) {
                        str.add(s);
                } else {
                	bigDecimal.add(new BigDecimal(s));
                }
               
        }
	}

}
