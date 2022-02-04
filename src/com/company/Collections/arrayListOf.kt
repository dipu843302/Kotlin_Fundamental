package com.company.Collections

class Employee(var id:Int,var address:String)
fun main(){
    var arrayList:ArrayList<Employee> = arrayListOf<Employee>()
    val e1=Employee(1,"Patna")
    val e2=Employee(2,"Delhi")
    val e3=Employee(3,"Ranchi")

    arrayList.add(e1)
    arrayList.add(e2)
    arrayList.add(e3)
    for (e in arrayList){
        println("${e.id} ${e.address}")
    }
}
