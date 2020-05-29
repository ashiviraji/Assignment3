

object quiz6 {
  def main(args:Array[String]){
    
  def fibonacci(num:Int):Int=num match{
    case x if(x==0)=>x
    case x if(x==1)=>x
    case _ =>fibonacci(num-1) + fibonacci(num-2)
        
   
  }
  def fibonacciSeq(n:Int)={
    var i:Int=0
    for(i <- 0 to n){
      
      println(fibonacci(i))
    }
  }
  fibonacciSeq(5)
  
 
     
     
   
     
  
   }
   
  
}