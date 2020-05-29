

object quiz2 {
  def main(args:Array[String]){
    def prime(p:Int,n:Int=2):Boolean=n match{
    case x if(x==p) => true
    case x if GCD(p,x)>1 =>false
    case x=> prime(p,x+1)
      
    }
   
    
    primeSeq(10)
   
    def primeSeq(n:Int):Unit={
      var value:Int=2
      for(value<- 2 to n){
        if(prime(value)!=false){
          println(value)
        }
      }
        
        
        
      
      
    }
    
     def GCD(a:Int,b:Int):Int=b match{
      case 0 => a
      case b if b>a =>GCD(b,a)
      case _ => GCD(b,a%b)
    }
   
    
  }
}