# spring-boot-kotlin

Kotlin !!

![Kotlin](/doc/img/Kotlin.png)

### Getting Started Kotlin 

Kotlin Koans 

- reference : https://play.kotlinlang.org/koans/overview

### Books

- Kotlin In Action 
https://www.manning.com/books/kotlin-in-action


### Kotlin's Philosophy

- 실용성

- 간결성 

- 안정성

- 상호운용성





# Basic Syntax

- reference : https://kotlinlang.org/docs/reference/basic-syntax.html?&_ga=2.30814975.1316054976.1576165289-2032132519.1576165289#defining-functions

### Program entry point

An entry point of a Kotlin application is the main function.

```
fun main() {
    println("Hello world!")
}
```

## Variables

변수 선언 시 사용하는 키워드는 다음과 같이 2가지가 있다.
- val : 변경 불가능한 변수 (킹자바의 final)
- var : 변경 가능한 변수

### String Template 
변수 앞에 $를 붙여 사용한다. 
다만 한글을 사용살 때 유니코드 변환 과정에서 unresolved reference 오류가 발생한다. 
${variable} 처럼 {} 감싸는 걸 습관화하자!

### Enum

킹자바와 달리 enum은 soft keyword이다. 

### Smart Cast
타입 검사와 타입 캐스르를 조합 

### Iterator 

- range : .. / in 를 사용한다. 
- half-closed range : until를 사용한다. 
- downTo : 역방향
- step : 증가 값 


### Try

코틀린에서는 try 키워드는 if, when과 마찬가지로 식이다. 

## Functions

Function having two Int parameters with Int return type:

```
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

Function with an expression body and inferred return type:

```
fun sum(a: Int, b: Int) = a + b
```


Function returning no meaningful value : 'Unit', 'Unit' return type can be omitted

```
```

if a default parameter precedes a parameter with no default value, the default value can only be used by calling the function with 'named arguments'

```
fun foo(bar: Int = 0, baz: Int) { /*...*/}

foo(baz = 1) // The default value bar = 0 is used
```


### 확장 함수

확장할 클래스의 이름을 덧붙여 사용한다. 

클래스 이름을 수신 객체 타입, 대상을 수신 객체라고 부른다. 

- 확장 함수는 오버라이딩할 수 없다.


### 구조 분해 선언 

```
infix fun Any.to(other: Any) = Pair(this, other)
 val (number , name) = 1 to "one"
```

