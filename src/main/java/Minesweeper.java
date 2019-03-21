class Minesweeper {

    static String[] calculate(String[] input) {
        int lines = input.length;
        int fieldsCount = 1;

        String [] result = new String [lines];
        for (int i=0 ; i<input.length;i++){
            if (!input[i].startsWith("*") && !input[i].startsWith(".")) {
                result[i] = "Field #" + fieldsCount;
                fieldsCount++;
            } else {
                result[i] = input[i].replaceAll("\\.", "0");

                for(int j=0; j<input[i].length(); j++) {
                    if(input[i].charAt(j) == '*') {

                        int c = Character.getNumericValue(result[i].charAt(j + 1));
                        char updated = (char)(++c);
                        result[i] =update(result[i], j+1, updated);
                    }
                }
            }
        }
        return result;
    }

   private static String update(String s, int pos, char value) {
        String snew = "";
        for (int i = 0; i < s.length();i++) {
            if (i != pos) {
                snew += s.charAt(i);
            }else {
                snew += value;
            }

        }
        return snew;
    }

}
