object SetOperations {
  def main(args: Array[String]): Unit = {
    // Create two sets of strings
    val set1 = Set("apple", "banana", "cherry", "date")
    val set2 = Set("banana", "date", "fig", "grape")

    // Union of the sets
    val unionSet = set1.union(set2)
    println(s"Union of Set 1 and Set 2: $unionSet")

    // Intersection of the sets
    val intersectionSet = set1.intersect(set2)
    println(s"Intersection of Set 1 and Set 2: $intersectionSet")

    // Difference between sets (elements in Set 1 but not in Set 2)
    val differenceSet = set1.diff(set2)
    println(s"Difference between Set 1 and Set 2: $differenceSet")

    // Check if an element exists in a set
    val elementToCheck = "cherry"
    val isInSet1 = set1.contains(elementToCheck)
    println(s"Is '$elementToCheck' in Set 1: $isInSet1")

    val elementToCheck2 = "fig"
    val isInSet2 = set2.contains(elementToCheck2)
    println(s"Is '$elementToCheck2' in Set 2: $isInSet2")
  }
}
