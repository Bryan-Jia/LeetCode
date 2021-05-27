public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < numRows; row++){
            int i = row;
            while (i < s.length()) {
                sb.append(s.charAt(i));
                if (row != 0 && row != numRows-1 && (i+2*(numRows-row)-2 < s.length())) {
                    sb.append(s.charAt(i + 2*(numRows-row)-2));
                }
                i += 2 * numRows - 2;
            }
        }
        return sb.toString();
    }
}
