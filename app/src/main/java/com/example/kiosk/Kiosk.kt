package com.example.kiosk
var menuList = mutableListOf<String>()
var priceList = mutableListOf<Int>()


fun main(){
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("[ SHAKESHACK MENU ]")
    println("1. 햄버거")
    println("2. 사이드메뉴")
    println("3. 음료")
    println("4. 주문하기")
    println("0. 종료")

    ShakeShack().shakeshack()
}

//메뉴 보여주기
fun run(list: List<String>,list2: List<Int>){

    println("1. ${list[0]} | ${list2[0]}")
    println("2. ${list[1]} | ${list2[1]}")
    println("3. ${list[2]} | ${list2[2]}")
    println("4. ${list[3]} | ${list2[3]}")
    println("0. ${list[4]}")

    while (true) {
        try {
            val num1 = readln()!!.toInt()
            when (num1) {
                0 -> {
                    main()
                    break
                }
                1 -> {
                    println("${list[0]}를 선택하였습니다.")
                    menuList.add(list[0])
                    priceList.add(list2[0])
                }

                2 -> {
                    println("${list[1]}를 선택하였습니다.")
                    menuList.add(list[1])
                    priceList.add(list2[1])
                }

                3 -> {
                    println("${list[2]}를 선택하였습니다.")
                    menuList.add(list[2])
                    priceList.add(list2[2])
                }

                4 -> {
                    println("${list[3]}를 선택하였습니다.")
                    menuList.add(list[3])
                    priceList.add(list2[3])
                }

                5 -> {
                    println("${list[4]}를 선택하였습니다.")
                }
                else -> println("0~5까지 숫자를 입력해 주세요")
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해 주세요")
        }
    }
}


class ShakeShack {
    fun shakeshack() {
        while (true) {
            try {
                val num1 = readln()!!.toInt()
                when (num1) {
                    0 -> {
                        println("키오스크를 종료합니다")
                        break
                    }
                    1 -> {
                        run(Burgers().list, Burgers().price)
                        break
                    }
                    2 -> {
                        run(Saids().list, Saids().price)
                        break
                    }
                    3 -> {
                        run(Drinks().list, Drinks().price)
                        break
                    }
                    4 -> {
                        totalMoney()
                        break
                    }
                    else -> println("0~4까지 숫자를 입력해 주세요")
                }
            } catch (e: NumberFormatException) {
                println("숫자를 입력해 주세요")
            }
        }
    }
}

//부모 클래스
open class Mane{
    var list = listOf("")
    var price = listOf<Int>()

//    val price = arrayListOf<Int>()
}

//햄버거 메뉴
class Burgers : Mane(){
//    val burgersPrice= listOf<Int>(4000, 3500, 3800, 4200)
    init {
        list = listOf("불고기버거", "치즈버거", "치킨버거", "새우버거", "뒤로가기")
        price = listOf(4000, 3500, 3800, 4200)
//        for (i in 0 until  burgersPrice.size){
//            price.add(i)
//        }
    }
//    val list = listOf("불고기버거", "치즈버거", "치킨버거", "새우버거", "뒤로가기")
//    val price = listOf(4000, 3500, 3800, 4200)
}

//사이드 메뉴
class Saids : Mane(){
    init {
        list = listOf("감자튀김", "치즈볼", "치즈스틱", "너겟", "뒤로가기")
        price = listOf(1500, 2000, 1200, 1900)
    }
}

//음료 메뉴
class Drinks : Mane(){
    init {
        list = listOf("콜라", "사이다", "환타 오렌지", "아이스티", "뒤로가기")
        price = listOf(1200, 1200, 1200, 1000)
    }
}

//금액 구하기
fun totalMoney(){
    for (i in 0 until menuList.size){
        println("선택한 메뉴${i+1} : ${menuList[i]} ${priceList[i]}원")
    }
    println("총 지불 금액 ${priceList.sumOf { it }} 원")
}