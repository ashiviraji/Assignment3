object quiz4 {
  def main(args:Array[String]){
    def isEven(n:Int):Boolean=n match{
      case 0 => true
      case _ =>isOdd(n-1)
    }
    
    def isOdd(n:Int):Boolean= !(isEven(n))
      var x:Boolean=false
      x=isEven(6)
      
      
      if(x==false){
        println("The value is odd")
      }else{
        println("The value is even")
      }
   
  
  }
}