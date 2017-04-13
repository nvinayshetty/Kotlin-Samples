/**
 * Created by vinayaprasadn on 12/4/17.
 */
 fun main(args:Array<String>){
    ifs()
}

fun ifs() {
  /*  var temp=20;
    var feels:String
    if(temp<30)
        feels="cold"
    else  if(temp>30)
        feels="warm"
    else
        feels="ok"
    print(feels)*/

      var temp=20;
    var feels=if(temp<20)
        "cold"
        else if(temp>30)
        "warm"
        else
        "ok"
    print(feels)
}
