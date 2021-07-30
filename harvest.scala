object harvest_problem {
   def main(args: Array[String]): Unit =
  {
    val harvest= Array.ofDim[Int](4,7)
    harvest(0)(0)= 20
    harvest(0)(1)= 5
    harvest(0)(2)= 30
    harvest(0)(3)= 50
    harvest(0)(4)= 10
    harvest(0)(5)= 70
    harvest(0)(6)= 80

    harvest(1)(0)= 15
    harvest(1)(1)= 60
    harvest(1)(2)= 25
    harvest(1)(3)= 31
    harvest(1)(4)= 12
    harvest(1)(5)= 17
    harvest(1)(6)= 87

    harvest(2)(0)= 21
    harvest(2)(1)= 11
    harvest(2)(2)= 39
    harvest(2)(3)= 57
    harvest(2)(4)= 10
    harvest(2)(5)= 40
    harvest(2)(6)= 74

    harvest(3)(0)= 18
    harvest(3)(1)= 45
    harvest(3)(2)= 36
    harvest(3)(3)= 89
    harvest(3)(4)= 11
    harvest(3)(5)= 12
    harvest(3)(6)= 90

    println("\n******** HARVEST STATISTICS PROBLEM ********\n")
    //print array
    for(i<-0 to 3)
      {
        for(j<-0 to 6)
          {
            print("  "+harvest(i)(j))
          }
          println()
      }

    //find maximum value
    var max = harvest(0)(0)
    var w=0
    var d =0
    for(i<-0 to 3){
      for(j<-0 to 6){
        if(harvest(i)(j)>=max){
          max = harvest(i)(j)
          w=i
          d=j
        }
      }
    }

    //find max week
    var week=" "
    if(w==0)
      week="1 st week"
    else if (w==1)
      week="2 nd week"
    else if (w==2)
      week="3 rd week"
    else
      week="4 th week"

    //find max day
    var day=" "
    if(d==0)
      day="Monday"
    else if(d==1)
     day="Tuesday"
    else if (d==2)
      day="wednesday"
    else if(d==3)
      day="Thursday"
    else if (d==4)
      day="Friday"
    else if(d==5)
      day="Saturday"
    else
      day="Sunday"

    //print max and max date
    printf("\n\nMaximum Harvest : %d kg",max)
    printf("\n Week and day of maximum number of tea plucked  : %s  (%s)  " ,week ,day)
    printf("\n %d of the month maximum is recorded ", w*7+d+1)


    //find minimum value
    var min = harvest(0)(0)
    var n=0
    var m =0
    for(i<-0 to 3){
      for(j<-0 to 6){
        if(harvest(i)(j)<=min){
          min = harvest(i)(j)
          n=i
          m=j
        }
      }
    }

    //find min week
    var min_week=" "
    if(n==0)
      min_week="1 st week"
    else if (n==1)
      min_week="2 nd week"
    else if (n==2)
      min_week="3 rd week"
    else
      min_week="4 th week"

    //find min day
    var min_day=" "
    if(m==0)
      min_day="Monday"
    else if(m==1)
      min_day="Tuesday"
    else if (m==2)
      min_day="wednesday"
    else if(m==3)
      min_day="Thursday"
    else if (m==4)
      min_day="Friday"
    else if(m==5)
      min_day="Saturday"
    else
      min_day="Sunday"

    //print min and min date
    printf("\n\nMinimum Harvest : %d kg",min)
    printf("\n Week and day of minimum number of tea plucked  : %s  (%s)  " ,min_week ,min_day)
    printf("\n %d of the month minimum is recorded ", n*7+m+1)

    //find average
    var total = 0
    for(i<-0 to 3){
      for(j<-0 to 6){
        total = total+harvest(i)(j)
      }
    }
    val avg= total/28.0
    printf("\n\nAverage harvest : %.2f kg  " ,avg)


    //find range
    var range = max-min
    println("\nRange between maximum and minimum value :  " +range)


    //convert array
    var arr2= new Array[Int](28)
    var x=0
    for(i<-0 to 3){
      for(j<-0 to 6){
        arr2(x)=harvest(i)(j)
        x=x+1
      }
    }


    //sort array
    var temp=0
    for(i<-0 to 27){
      for(j<-1 to 27){
        if (arr2(i)>arr2(j)){
          temp = arr2(i)
          arr2(i)= arr2(j)
          arr2(j)=temp
        }
      }
    }

     //find median
    var median =0
    var length = 28
    if(length%2 ==0) {
       median= arr2(length/2)
    }
    else{
      median = arr2(((length-1)/2) + arr2(length/2))/2
    }

    println("Median of the harvest is : " +median)



  }



}
