package custemlib;

public class FVector{
   private  int size ;
   private int capacity ;
   private int arr[] ;


//    defult constructor 
   public FVector(){
       this.size=0;
       this.capacity=16;
       this.arr= new int[this.capacity];

   }
// get size of the array

public int getSize(){
    return this.size;
}

public int geCapacity(){
    return this.capacity;
}


// print array

public void print(){

    for(int i=0;i<this.size;i++){
        System.out.print(this.arr[i]+" ");
    }
  System.out.println();
}

// adding array to elemnts
public void add( int value ){

    if(this.size==this.capacity){
        this.grow();
    }
this.arr[this.size]=value;
this.size++;
}


public void add( int index,int value ){
 
    if(index < 0 || index > this.size ){

        throw new ArrayIndexOutOfBoundsException("Index out of bounds");
    }
    if(this.capacity ==  this.size){
     this.grow();
    }
    for(int i=this.size;i > index;i--){
         this.arr[i]=this.arr[i-1];
    }
    this.arr[index]=value;

    this.size++;

}




// growing capacity dynamiclly 

private void grow(){

    // System.out.print("Growing from " + this.capacity + " ");
    this.capacity *= 2;
    // System.out.println("to" + this.capacity + " ");

    this.moveArray();
}

// Remove and return the last value in the array

public int remove()
{
    if(this.capacity/4 == this.size){
        this.shrink();
    }
    if(this.size == 0)
    {
        throw new ArrayIndexOutOfBoundsException("The array is already empty");
    }
this.size--;
return this.size;
}

// Decrease the  size
 private void shrink(){
     
     this.capacity=this.capacity/2;
     this.moveArray();

 }

private void moveArray(){
    int newArray[]= new int [this.capacity];
    for(int i =0; i<this.size;i++){
        newArray[i]=this.arr[i];
    }
    this.arr=newArray;

}


}