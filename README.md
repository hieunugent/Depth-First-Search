# Depth-First-Search
  - Implememt the Depth first search method on the Node class
  - it will take in an empty array, traverses the tree using the DFS approach 
  - from left to right, 
  - store all the node in the input array and then return the input
# Solution
  - traveres each node and there children
  - start with the first children and then check for children have their own chilren util there no more
  - return to parent then check the next child
  - Time : O(node + egde)
  - SPace : O(Node)
# Pseudocode
  - add the current parent node to the array list
  - iterate the children list, recursive each children node 
  - return the array list
