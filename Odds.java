 class Odds {
  public static void main(String[] args) {
    Odds p = new Odds();
    p.oddsOnly("forty");
  }
 
 public String oddsOnly(String original) {
    if (original == null) {
      return null;
    } else  {
      String r = "";
      for (int i = 0; i < original.length(); i++)  {
        if(i % 2 == 0)  {
          r += original.charAt(i);
        } 
      } System.out.println(r); 
      return r; 
    } 
  } 
}
