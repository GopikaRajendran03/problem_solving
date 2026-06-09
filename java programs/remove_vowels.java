public class remove_vowels {
    public static void main(String[] args) {
        String str = "hello all";
        String vowels = "aeiouAEIOU";
        int n = vowels.length();
        for (int i = 0; i < n; i++) {
             char c = vowels.charAt(i);
             if(str.contains(c+"")){
                  str = str.replace(c+"","");
             }
                            
            }
            System.out.println(str);
        }
    }

