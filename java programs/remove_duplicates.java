public class remove_duplicates {
    public static void main(String[] args) {
        String str = "abbccdeessedff";
        String res = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
             char c = str.charAt(i);
             if(!res.contains(c+"")){
                  res+=c;  
             }
                            
            }
            System.out.println(res);
        }
    }

