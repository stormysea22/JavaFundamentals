public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String result = str1.trim() + str2.trim();
        return result;
    }

    public Integer getIndexOrNull(String str, char c) {
        if (str.indexOf(c) >= 0) {
            return str.indexOf(c);
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String str1, String str2) {
        if (str1.indexOf(str2) >= 0) {
            return str1.indexOf(str2);
        } else {
            return null;
        }
    }

    public String concatSubstring(String s1, int a, int b, String s2) {
    return s1.substring(a, b).concat(s2);
    }


}
