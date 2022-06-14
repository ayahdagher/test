class Main {
  public static void main(String[] args) {


   Integer a = 10 ; 
  ArrayList<Integer> someList =  new ArrayList<Integer> (15); 
    
{
  for (int i = someList.size() - 1; i >= 0; i--)
  {
    if (a.equals(someList.get(i)))
    {
      return i;
    }
  }
  return -1;
}
  
    
    
    
    
    
    
    }
}