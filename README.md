# S-99

Reference: http://aperiodic.net/phil/scala/s-99/

## P01

Find the last element of a list.

```
scala> S99.P01.last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```

## P02

Find the last but one element of a list.

```
scala> S99.P02.penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```

## P03

Find the Kth element of a list.

```
scala> S99.P03.nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```

## P04

Find the number of elements of a list.

```
scala> S99.P04.length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```

## P05

Reverse a list.

```
scala> S99.P05.reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```

## P06

Find out whether a list is a palindrome.

```
scala> S99.P06.isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```

## P18

Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.

```
scala> S99.P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
```
