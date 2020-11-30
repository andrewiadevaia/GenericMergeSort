<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
***
***
***
*** To avoid retyping too much info. Do a search and replace for the following:
*** github_username, repo_name, twitter_handle, email, project_title, project_description
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links


<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/github_username/repo_name">
    <img src="https://logos-download.com/wp-content/uploads/2016/10/Java_logo_icon.png" alt="Logo" width="120" height="80">
  </a>

  <h3 align="center">Merge Sort</h3>

  <p align="center">
    Merge sort functionality for Generic Arrays and Linked Lists
    <br />
    <br />
    <a href="https://github.com/github_username/repo_name">View Demo</a>
    ·
    <a href="https://github.com/andrewiadevaia/GenericMergeSort/issues">Report Bug</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">Getting Started</a>
      <ul>
        <li><a href="#built-with">Generic Arrays</a></li>
        <li><a href="#built-with">Generic LinkedLists</a></li>
      </ul>
    </li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>

<!-- GETTING STARTED -->
## Getting Started

"Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves."

### Generic MergeSort for Array

* Creating MergeSort Class
  ```java
  import java.util.Comparator;
  public class MergeSort {
  
  }
  ```
The class itself does not need to be generic. Generic functionality will be implemented in the functions themself.

* Implementing the mergeSortArray function
The function takes 3 parameter a generic array, length of the array and a generic comparator instance.
  ```java
      public static <T> void mergeSortArray(T[] array, int n, Comparator<T> comparator) {
        if(n < 2) {
            return;
        }

        int mid = n/2;
        T l[] = (T[]) new Object[mid];
        T r[] = (T[]) new Object[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        
        mergeSortArray(l, mid, comparator);
        mergeSortArray(r, n - mid, comparator);
        
        mergeArray(array, l, r, mid, n - mid, comparator);
       }
  ```
Checking to see if there is more than one element in the array. If there is not the function returns. Otherwise get the middle of the array.
  ```java
        if(n < 2) {
            return;
        }
        
        int mid = n/2;
  ```
  
Create 2 sub arrays for the left side and right side.
  ```java
        T l[] = (T[]) new Object[mid];
        T r[] = (T[]) new Object[n - mid];
  ```
A generic Type cannot be declared as the following because T's type is not known until runtime.
  ```java
  T arr[] = new T[size];
  ```
But if you create an object it can be casted as type T during runtime.
  ```java
  T arr[] = (T[]) new Object[Size];
  ```
Fill the sub arrays l[] and r[]
  ```java
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }  
  ```
Now onto recursively calling mergeSortArray until sub arrays are smallest possible case
  ```java
        mergeSortArray(l, mid, comparator);
        mergeSortArray(r, n - mid, comparator);
  ```
                What this looks like...
                     {10,6,8,5}
                    /          \
                   /            \
                {10,6}         {8,5}
               /      \       /     \
              /        \     /       \
            {10}       {6}  {8}      {5}
            
            
Now we merge sub arrays, mid is the length of left sub array and n - mid is length of right sub array
ex: if you have an array of 4 elements n=4 then, mid = 2 so left sub array would be elements 0-1. The right sub array
length would be n(4) - mid(2) = 2. So the right sub array is dealing with elements 2-3
  ```java
  mergeArray(array, l, r, mid, n - mid, comparator);
  ```
              What this looks like...
            {10}     {6}    {8}     {5}
              \      /        \      /
               \    /          \    /
               {6,10}           {5,8}
                  \                /
                   \              /
                    \            /
                     \          /
                      {5,6,8,10}
                      


Implement mergeArray function
  ```java
  private static <T> void mergeArray(T[] a, T[] l, T[] r, int left, int right, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if(comparator.compare(l[i],r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
  ```
  
int i is the iterator for left sub array, j is for the right sub array and k is for the input array. The while loop is ran if both i and j are less than their sub array lengths.
  ```java
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {  
  ```

Using the compare function from the comparator passed as a paramter to compare the genric values. Places the smaller value into the input array.
  ```java
  if(comparator.compare(l[i],r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
  ```
Filling input array with left over values from sub array
  ```java
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
  ```


Main Method Class
  ```java
      public static void main(String[] args) {
        Integer[] arr = {9,8,7,6,5,4,3,2,1};
        Comparator<Integer> integerComparator = (l, r) -> l.compareTo(r);
        MergeSort.mergeSortArray(arr,arr.length,integerComparator);
        printArray(arr);
       }
  ```
This line here is creating a Comparator instance of type Integer. Using a lambda function to create its compare function.
  ```java
  Comparator<Integer> integerComparator = (l, r) -> l.compareTo(r);
  ```
A lambda in java works as parameter passed to expression
  ```java
  parameter -> expression
  (parameter1, parameter2) -> expression
  (parameter1, parameter2) -> { code block }
  ```
Since we are using Integer as our type it already has a compareTo method that can be used in the expression of lambda but, lets say we arent using a wrapper instead something
like a car
  ```java
  public class Car {
    private String Type;
    private int Year;

    public Car(String s, int t) {
        Type = s;
        Year = t;
    }
   }
   ```
All we need to do is just add compare methods for the car attributes to then pass into our lambda functions.
  ```java
    public int compareByYear(Car o) {
            return this.Year - o.Year;
    }
    
    public int compareByType(Car o) {
            //since car Type is a String here you are using the string compareTo function
            return this.Type.compareTo(o.Type);
    }
   ```
Now you can write a generic comparator to use with merge sort
  ```java
  Comparator<Car> carComparator = (l, r) -> l.compareByType(r);
  or
  Comparator<Car> carComparator = (l, r) -> l.compareByYear(r);
  ```
Call the Merge Sort function now. There is no need to instantiate a MergeSort class becuase the methods are static. Call it just like...
  ```java
  MergeSort.mergeSortArray(array, array.length, typeComparator);
  ```
Then your all set. You can now MergeSort generic Arrays.

### Generic MergeSort for Linked List

* Too be implemented

<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

* [merge-sort](https://www.geeksforgeeks.org/merge-sort/)
* [merge-sort-for-linked-list](https://www.geeksforgeeks.org/merge-sort-for-linked-list/)
* [Java Lambda](https://www.w3schools.com/java/java_lambda.asp#:~:text=Lambda%20Expressions%20were%20added%20in,the%20body%20of%20a%20method.)
* [java-merge-sort](https://www.baeldung.com/java-merge-sort)
* [How can I pass a comparison function into a Java method?](https://stackoverflow.com/questions/55976739/how-can-i-pass-a-comparison-function-into-a-java-method)
* [Calling Comparator parameter in main method](https://stackoverflow.com/questions/26330655/calling-comparator-parameter-in-main-method)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/github_username
