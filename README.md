# Kotlin Collection Modification During Iteration

This repository demonstrates a common error in Kotlin when removing elements from a collection while iterating over it using `removeIf`.  The `removeIf` function modifies the underlying collection, which can cause problems if not handled carefully.

The `bug.kt` file shows the problematic code. The `bugSolution.kt` file offers a safer and more robust solution.

This issue is particularly relevant when working with maps, as the iterator may behave unexpectedly when elements are removed.
