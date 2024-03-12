package com.example.kiosk
var totalM:Int = 0 //전역변수

fun main(){
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    shakeshack()
}

fun shakeshack(){
    println("[ SHAKESHACK MENU ]")
    println("1. 햄버거            | 앵거스 비프 통살을 다져만든 버거")
    println("2. 사이드메뉴         | 매장에서 신선하게 만드는 아이스크림")
    println("3. 음료              | 매장에서 직접 만드는 음료")
    println("4. 결재")
    println("0. 종료             | 프로그램 종료")

    try {
        val num1 = readln()!!.toInt()
        when (num1) {
            0 -> {
                println("키오스크를 종료합니다")
            }
            1 -> burgersMenu()
            2 -> saidMenu()
            3 -> drink()
            4 -> {
                println("총 결재 금액은 $totalM 원 입니다")
            }
            else -> println("0~4까지 숫자를 입력해 주세요")
        }
    } catch (e: NumberFormatException) {
        println("숫자를 입력해 주세요")
    }
}

//햄버거 메뉴
fun burgersMenu(){
    try {
        println("[ Burgers MENU ]")
        println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. ShroomBurger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기       | 뒤로가기")

        val num1 = readln()!!.toInt()
        when (num1) {
            0 -> shakeshack()
            1 -> {
                println("ShackBurger를 선택하였습니다.")
                totalMoney(6900)
                burgersMenu()
            }
            2 -> {
                println("SmokeShack를 선택하였습니다.")
                totalMoney(8900)
                burgersMenu()
            }
            3 -> {
                println("ShroomBurger를 선택하였습니다.")
                totalMoney(9400)
                burgersMenu()
            }
            4 -> {
                println("Cheeseburger를 선택하였습니다.")
                totalMoney(6900)
                burgersMenu()
            }
            5 -> {
                println("Hamburger를 선택하였습니다.")
                totalMoney(5400)
                burgersMenu()
            }
            else -> println("0~5까지 숫자를 입력해 주세요")
        }
    } catch (e: NumberFormatException) {
        println("숫자를 입력해 주세요")
    }
}

//사이드 메뉴
fun saidMenu(){
    try {
        println("[ 사이드 메뉴 ]")
        println("1. 감자튀김      | W 1.5 |")
        println("2. 치즈볼 3개    | W 2.0 |")
        println("3. 치즈스틱      | W 1.2 |")
        println("4. 너겟 4조각    | W 1.9 |")
        println("0. 뒤로가기   |뒤로가기|")

        val num1 = readln()!!.toInt()
        when (num1) {
            0 -> shakeshack()
            1 -> {
                println("감자튀김을 선택하였습니다.")
                totalMoney(1500)
                saidMenu()
            }
            2 -> {
                println("치즈볼을 선택하였습니다.")
                totalMoney(2000)
                saidMenu()
            }
            3 -> {
                println("치즈스틱을 선택하였습니다.")
                totalMoney(1200)
                saidMenu()
            }
            4 -> {
                println("너겟을 선택하였습니다.")
                totalMoney(1900)
                saidMenu()
            }
            else -> println("0~5까지 숫자를 입력해 주세요")
        }
    } catch (e: NumberFormatException) {
        println("숫자를 입력해 주세요")
    }
}

//음료 메뉴
fun drink(){
    try {
        println("[ 음료 메뉴 ]")
        println("1. 콜라         | W 1.2 |")
        println("2. 사이다       | W 1.2 |")
        println("3. 환타 오렌지   | W 1.2 |")
        println("4. 아이스티      | W 1.0 |")
        println("0. 뒤로가기      |뒤로가기|")

        val num1 = readln()!!.toInt()
        when (num1) {
            0 -> shakeshack()
            1 -> {
                println("콜라를 선택하였습니다.")
                totalMoney(1200)
                drink()
            }
            2 -> {
                println("사이다를 선택하였습니다.")
                totalMoney(1200)
                drink()
            }
            3 -> {
                println("환타 오렌지를 선택하였습니다.")
                totalMoney(1200)
                drink()
            }
            4 -> {
                println("아이스티를 선택하였습니다.")
                totalMoney(1000)
                drink()
            }
            else -> println("0~4까지 숫자를 입력해 주세요")
        }
    } catch (e: NumberFormatException) {
        println("숫자를 입력해 주세요")
    }
}

//금액 구하기
fun totalMoney(money:Int):Int{
    totalM = money+totalM
    println("현재 구매 금액 $totalM 원")
    return totalM
}