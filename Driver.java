import custemlib.FVector ;

public class Driver{
 public static void main(String[] args){

    FVector array = new  FVector();
    // System.out.println(array.geCapacity());
    // for (int i=0;i<33;i++){
    //     array.add(i+1);
    //     System.out.println();

    // }
    // array.remove();
    // array.remove();
    // array.print();
    // // System.out.println(array.geCapacity());
    // System.out.println(array.getSize());
    // array.add(1);

    // for(int i = 0; i < 513; i++)
    // {
    //   array.add(i + 1);
    // }
    // for(int i = 0; i < 490; i++)
    // {
    //   array.remove();
    // }
    // System.out.println(array.getSize());
    // System.out.println(array.geCapacity());
    

    // FVector array = new FVector();
    // for(int i = 0; i < 40; i++)
    // {
    //   array.add(i + 1);
    // }
    // int value = array.remove();
    // System.out.println(value);
    // array.print();

    
    for(int i=0;i<10;i++){
      array.add(i,i*10);
    }
    array.add(10,11111);
    array.print();
  }

}
