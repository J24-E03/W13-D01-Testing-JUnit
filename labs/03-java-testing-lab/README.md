### **Lab: String Calculator with Unit Testing**

---

#### **Objective**
In this lab, you will:
1. Implement a method `add` that processes a string of numbers and returns their sum, following the outlined requirements.
2. Write unit tests using JUnit to verify the method's correctness and handle edge cases.

---

#### **Instructions**
1. Create a new class named `StringCalculator`.
2. Implement a method `add(String numbers)` with the following functionality:
   - If the input string is empty, return `0`.
   - Numbers are separated by commas (`,`).
   - Sum all the numbers in the string and return the total.
   - Numbers greater than `1000` should be ignored in the sum.
   - If the input string contains any negative numbers, throw an `IllegalArgumentException` with a message listing all the negative numbers.
   - If a different delimiter is used, throw an `IllegalArgumentException` with a relevant error message.
   - The method should handle any number of numbers provided in the input.

3. Write unit tests for the `add` method using JUnit. Test the following cases:
   - An empty string as input.
   - A single number in the string.
   - Multiple numbers separated by commas.
   - Numbers greater than `1000`.
   - Negative numbers in the input string (should throw an exception).
   - Incorrect delimiter usage (should throw an exception).

4. Ensure your tests follow these guidelines:
   - Use meaningful test method names.
   - Check for the correct exceptions and messages in edge cases.

---

#### **Example Inputs and Expected Outputs**
| Input               | Expected Output                       |
|---------------------|---------------------------------------|
| `""`                | `0`                                   |
| `"1,2,3"`           | `6`                                   |
| `"1000,1001,2"`     | `1002`                                |
| `"1,-2,3"`          | Exception: Negative numbers: [-2]     |
| `"1;2,3"`           | Exception: Invalid delimiter used     |

---

#### **Deliverables**
1. A `StringCalculator` class containing the `add` method.
2. A test class with the necessary JUnit tests to validate the functionality and edge cases.

---

#### **Bonus Challenge**
Modify the `add` method to support custom delimiters. For example:
- Input: `"//;\n1;2;3"`
- Expected Output: `6`

**Hint:** Custom delimiters are introduced with the format `//<delimiter>\n` before the numbers.