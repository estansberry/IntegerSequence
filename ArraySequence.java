import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    currentIndex = 0;
    data = other;
  }

  public int length(){
    return(data.length);
  }

  public void reset(){
    currentIndex = 0;
  }

  public boolean hasNext(){
    return(currentIndex < length());
  }
  public int next(){
    if(hasNext() == false){
      throw new NoSuchElementException("Error: this is the last element in this Sequence. There is no next element.");
    }else{
      currentIndex = currentIndex + 1;
      return(data[currentIndex - 1]);
    }
  }

  public static void main(String[] args){
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
  }

}
