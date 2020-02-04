# S-99

Reference: http://aperiodic.net/phil/scala/s-99/

## List

### P01 - last

```
scala> S99.P01.last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```

### P02 - puneltimate

```
scala> S99.P02.penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```

### P03 - nth

```
scala> S99.P03.nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```

### P04 - length

```
scala> S99.P04.length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```

### P05 - reverse

```
scala> S99.P05.reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```

### P06 - isPalindrome

```
scala> S99.P06.isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```

### P07 - flatten

```
scala> S99.P07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```

### P18 - slice

```
scala> S99.P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
```
