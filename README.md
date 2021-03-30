# Data Structure And Algorithms With Java
> just a simple review of common data structures,
> 
> and algorithms with java
>
## Big O Notation/
> Imagine that we need to evaluate the performance of an algorithm
> one way it to calculate its execution time but execution time depends on
> hardware also, so when hardware changes we report different performance.
> Another way to evaluate performance is **resources used** this is another aspect
> of measuring performance but as time passes hardware and resources becomes cheaper.
> Finally we can express how complex this algorithm becomes by **counting**
> how many steps it requires achieving the task
> and this is the **Big O Notation O(n)**
> 
## Arrays/
> if you know the index most arrays operations will have O(1)
> if you will go through the array element by element ypu make
> the operation of O(n)

## Sorting Algorithms:
>Most sorting algorithms rely on the idea of splitting the array
> into two regions sorted and unsorted and with each iteration
> we are supposed to decrease the unsorted and increase the sorted region.

> **stable vs unstable sort algorithms??**

* ### Bubble Sort O(n2):
```java
// set last unsorted index to be the last element index
// compare each two consequent elements in the array swap when max is found
// decrement unsorted index
// do it until unsorted index == 0
```
* ### Selection Sort O(n2):
```java
// set last unsorted index to be the last element index
// find max in unsorted partition
    // compare elements in unsorted part get max of them
// set max at last unsorted index
// decrement unsorted partition
// do it again until last unsorted index == 0
```

