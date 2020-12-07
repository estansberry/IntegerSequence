import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;
  public Range(int start,  int end){
    start = start;
    end = end;

  }
  public void reset(){
    current = start;
  }
  public int length(){
    return(end - start);
  }
  public boolean hasNext(){
    return(current < end && current > start);
  }


  public int next(){
    if(hasNext() == false){
      throw new NoSuchElementException("Error: this is the last element in this range. There is no next element.");
    }else{
      current = current + 1;
      return(current);
    }

  }
  public static void main(String[] args){}

}
