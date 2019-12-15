# spring-boot-kotlin

Kotlin !!

![Kotlin](/doc/img/Kotlin.png)

### Getting Started Kotlin 

Kotlin Koans 

- reference : https://play.kotlinlang.org/koans/overview


## Basic Syntax

- reference : https://kotlinlang.org/docs/reference/basic-syntax.html?&_ga=2.30814975.1316054976.1576165289-2032132519.1576165289#defining-functions

### Program entry point

An entry point of a Kotlin application is the main function.

```
fun main() {
    println("Hello world!")
}
```

### Functions

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




