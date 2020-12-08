import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    currentIndex = 0;
    data = other;
  }

  public ArraySequence(IntegerSequence otherseq){
    currentIndex = 0;
    int[] newarr = new int[otherseq.length()];
    for(int i = 0; i < otherseq.length(); i ++){
      newarr[i] = otherseq.next();
    }
    data = newarr;
    otherseq.reset();
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
    IntegerSequence r = new Range(10,20);
    IntegerSequence as = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
  }

}
