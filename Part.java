class Part {
  public static void main(String[] args) {
    Part p = new Part();
    p.partial(null, "a", 1);
  
  }
  public String partial(String original, String letter, int count) {
    if (original == null) {
      System.out.println("null");
      return null;
    } else  {
        int sub = original.indexOf(letter);
        if (sub == -1)  {
          System.out.println("\"\"");
          return ("\"\"");
        } else  {
          String subb = original.substring(sub, sub + count + 1);
          System.out.println(subb);
          return subb;
        }
    }
  }
