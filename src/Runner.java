public class Runner {
    public static void main(String[] args) {
        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));
        //System.out.println(nextMethod(b: true));
        System.out.println(countCode("aaacodebbb"));
    }

    public static boolean nextMethod(boolean b) { return true; }

    public static String helloName(String name) {
        return "hi " + name;
    }

    public boolean nearHundred(int n) {
        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10){
           return true;
        } else {
            return false;
        }
    }

    boolean doubleX(String str) {
        int indexX = str.indexOf("x");
        if (indexX == -1) {
            return false;
        }
        if (indexX+1 >= str.length()) {
            return false;
        }
        if (str.substring(indexX+1, indexX+2) == "x") {
            return true;
        }
        return false;
    }

    public String firstHalf(String str) {
        int half = str.length() / 2;
        return str.substring(0,half);
    }

    public boolean commonEnd(int[] a, int[] b) {
        int lastA = a.length-1;
        int lastB = b.length-1;
        if (a[lastA] == b[lastB] || a[0] == b[0]) {
            return true;
        } else {
            return false;
        }
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }


    public int countCode(String str) {
        int count = 0;
        for (int i=0; i<str.length() - 3; i++) {
            String sub1 = str.substring(i, i+2);
            String sub2 = str.substring(i+3, i+4);
            if (sub1.equals("co") && sub2.equals("e")) {
                count += 1;
            }
        }
        return count;
    }

    public int sum13(int[] nums) {
        if (nums == []) {
            return 0;
        }
        int sum = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != 13 && nums[i-1] != 13) {
                sum += nums[i];
            }
        }
        if (nums[0] != 13) {
            sum += nums[0];
        }
        return sum;
    }

    public int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        int sum = a + b + c;
        return sum;
    }
    public int fixTeen(int n) {
        if (n == 13 || n == 14 || n == 17 || n == 18 || n == 19) {
            return 0;
        } else {
            return n;
        }
    }

    public String without2(String str) {
        if (str.length() == 2) {
            return "";
        }
        if (str.length() <= 1) {
            return str;
        }
        String strStart = str.substring(1, 2);
        String strEnd = str.substring(str.length()-1, str.length());
        if (strStart.equals(strEnd)) {
            str = str.substring(2);
        }
        return str;
    }

    public String notReplace(String str) {
        String newStr = "";
        for (int i=0; i<str.length(); i++) {
            if(i-1 >= 0 && Character.isLetter(str.charAt(i-1)) || i+2 < str.length() && Character.isLetter(str.charAt(i+2))) {
                newStr += str.charAt(i);
            } else {
                if (i + 2 <= str.length() && str.substring(i, i + 2).equals("is")) {
                    newStr += "is not";
                    i++;
                } else {
                    newStr += str.charAt(i);
                }
            }
        }
        return newStr;
    }
}

