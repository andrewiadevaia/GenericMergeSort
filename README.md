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
    <br />    ·
    <a href="https://github.com/andrewiadevaia/GenericMergeSort/issues">Report Bug</a>
  </p>
</p>

<!-- GETTING STARTED -->
## Getting Started
Instantiate a instance of the merge sort class.
  ```java
    MergeSort ms = new MergeSort();
  ```

### Generic MergeSort for Array

* Create an Array
  ```java
     Double[] doubles = {1.23, 0.43, 4.13, 6.23, 9.1, 0.6};       
  ```
After the array is created you can use the Utils class and the instance of merge sort to sort the array.
  ```java
     ms.setComparator(Util.doubleComparator());
     ms.mergeSortArray(doubles, doubles.length);
  ```
Note the mergeSortArray method is being used here.

### Generic MergeSort for Linked List

* Create a LinkedList
  ```java
      LinkedList<Car> carList = new LinkedList<>();
        carList.add(new Car("Honda", 2010));
        carList.add(new Car("Tesla", 2020));
        carList.add(new Car("Cadillac", 2015));
        carList.add(new Car("Alfa", 2008));      
  ```
The after the list is created you can use the Utils class and instance of merge sort to sort the array.
  ```java
     ms.setComparator(Util.doubleComparator());
     ms.mergeSortList(doubles, doubles.length);
  ```
Note the mergeSortList method is being used here.

### Generic MergeSort for Linked List


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
