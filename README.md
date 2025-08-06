# Fibonacci Analysis: Recursive, Iterative, and Memoized Implementations

This Java project showcases and compares three different approaches to computing the Fibonacci sequence:

1. **Recursive** – classic definition-based method
2. **Iterative** – loop-based optimization
3. **Memoized Recursive** – recursive method with caching to enhance performance

## 📁 Project Structure

csc143/
├── Fib.java // Interface defining the fib(n) method signature
└── FibonacciTest.java // Implements three Fibonacci algorithms and runs comparisons

markdown
Copy
Edit

## 📌 Description

The goal of this program is to:

- Analyze and compare the **performance** of various Fibonacci algorithms
- Demonstrate **modular design** using an interface (`Fib`)
- Practice **functional-style programming** via method references
- Understand the importance of **memoization** and **iteration** in solving recursive problems efficiently

### Implemented Methods

| Method      | Type      | Description |
|-------------|-----------|-------------|
| `fib(int n)` | Recursive | Basic recursive Fibonacci implementation (inefficient for large `n`) |
| `ifib(int n)` | Iterative | Uses a loop to efficiently compute Fibonacci numbers |
| `mfib(int n)` | Memoized | Optimized recursive version using an array for memoization |

## 🧪 Functionality Overview

### Horizontal Tests

- `checkRecursiveFib(int n)`
- `checkMemoizedFib(int n)`
- `checkIterativeFib(int n)`

Prints the Fibonacci values from `0` to `n` side-by-side.

### Vertical Tests (For Large `n`)

- `checkLargeNRecursion(int n)`
- `checkLargeNMemoization(int n)`
- `checkLargeNIteration(int n)`

Prints each `n` and its Fibonacci value line-by-line for easier analysis.

> ⚠️ The recursive version (`fib(n)`) becomes slow and inefficient beyond `n ≈ 45`.

## ▶️ How to Run

1. Make sure you have Java installed (JDK 8+).
2. Compile the program:

```bash
javac csc143/FibonacciTest.java
Run the program:

bash
Copy
Edit
java csc143.FibonacciTest
The program will:

Print a welcome message

Run recursive, memoized, and iterative tests for n = 11

Run vertical (large n) comparisons for n = 45

✅ Sample Output Snippet
mathematica
Copy
Edit
           R E C U R S I V E   -   fib(n)

============== nth Fibonacci ============
0     1     2     3     4     5     ...
0     1     1     2     3     5     ...
📚 Educational Purpose
This project is designed for learning and benchmarking recursive vs optimized Fibonacci strategies. Ideal for:

Computer Science students (CS1/CS2 level)

Practicing interface and functional programming

Understanding performance bottlenecks in naive recursion
