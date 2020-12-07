import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;
  public Range(int a,  int b){
    start = a;
    end = b;
    current = a;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return(end - start + 1);
  }
  public boolean hasNext(){
    return(current <= end && current >= start);
  }

  public int next(){
    if(hasNext() == false){
      throw new NoSuchElementException("Error: this is the last element in this range. There is no next element.");
    }else{
      current = current + 1;
      return(current - 1);
    }

  }
  public static void main(String[] args){
  }

}
