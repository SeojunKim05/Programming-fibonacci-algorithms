# Fibonacci Sequence Implementations in Java

This project demonstrates three different implementations of the Fibonacci sequence in Java:

- 🌀 **Recursive**
- ⚡ **Iterative**
- 🧠 **Memoized Recursive**

Each implementation is tested for correctness and performance using a flexible testing framework that prints results both horizontally and vertically.

---

## 📁 Files

### `Fib.java`
An interface defining a single method:
```java
long fib(int n);
Used for functional-style testing across implementations.

FibonacciTest.java
The main class that includes:

Three Fibonacci implementations:

fib(n) - Recursive

ifib(n) - Iterative

mfib(n) - Memoized Recursive

Test runners for:

Small n tests with side-by-side comparisons

Large n performance comparisons

Flexible output format (horizontal and vertical)

🚀 How to Run
Compile all Java files:

bash
Copy
Edit
javac csc143/*.java
Run the main test program:

bash
Copy
Edit
java csc143.FibonacciTest
🧪 Example Output
markdown
Copy
Edit
***************************************************

 			 	 W E L C O M E  

 F I B O N A C C I    T E S T    P R O G R A M

***************************************************


			 	 R E C U R S I V E   -   fib(n)

============== nth Fibonacci ============
0 	1 	2 	3 	4 	5 	6 	7 	8 	9 	10 	11 	
0 	1 	1 	2 	3 	5 	8 	13 	21 	34 	55 	89 	

...

			 	 L A R G E  N   -   mfib(n)

============ R E S U L T S  ============


====== Large Value Printing Ahead ======

		 n 		 value
		 0 		 0 
		 1 		 1 
		 2 		 1 
		 3 		 2 
		 4 		 3 
		 5 		 5 
		 6 		 8 
		 ...
📈 Comparison Summary
Method	Time Complexity	Space Complexity	Suitable for Large n
Recursive	O(2ⁿ)	O(n) stack depth	❌ No (inefficient)
Iterative	O(n)	O(1)	✅ Yes
Memoized	O(n)	O(n)	✅ Yes

📚 Topics Demonstrated
Recursion and iteration in algorithm design

Memoization for performance optimization

Functional interfaces and Java method references

Output formatting (tabular + vertical alignment)
