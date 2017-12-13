# Answers
Q: Try using a TreeMap and a HashMap instead of MyHashMap. Are the resulting word frequencies any different?

A: No they aren't 

Q: Is the time performance any different? If so, how would you rank the three implementations (in increasing order of time complexity)?

A: Yes MyHashMap was the fastest, followed by HashMap and then TreeMap

Q: How are % and Math.floorMod different? Which works more reliably for computing a hash table index? 

A: Math.floorMod finds the mod with rounding down.
   % finds the direct mod without rounding.
   Math.floorMod is more reliable for a hashtable

Q: What is the time complexity of MyHashMap.size(), and how could you make it much more efficient? '

A: The Time complexity is O(n) 
   You could make size an instance variable and increment the value as you add items to the hashmap

Q: How does this implementation compare to one where you would directly use your linked Node class from the earlier assignment? 
   Answer briefly in terms of ease of implementation, correctness, reliability, and performance. 

A: The linked nodes are easier to implement correctness. They are both reliable implementations.