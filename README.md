# 📘 Stack-Based Interview Questions in Java

This Java program implements solutions to **three important stack-based coding problems** frequently asked in technical interviews at top companies like **Adobe, Microsoft, Google, Amazon, Paytm, and Facebook**.

## 🚀 Features
The file contains clean implementations of the following problems:
1. ✅ Valid Parentheses Check
2. 🔁 Detect Duplicate Parentheses
3. 🏗️ Maximum Rectangular Area in Histogram

---

## 🔧 Technologies Used
- Language: **Java**
- Data Structure: **Stack**

---

## 📌 Problem Descriptions & Solutions

### 1. ✅ Valid Parentheses Check
**Question:** Check whether the given expression has valid balanced parentheses.

- **Companies:** Adobe
- **Method:** `validParentheses(String str)`
- **Logic:** Use a stack to match every closing bracket with its corresponding opening bracket.
- **Time Complexity:** `O(n)`

---
##🏗️ Maximum Rectangular Area in Histogram
**Question: Find the largest rectangular area possible in a histogram where the width of each bar is 1.

Companies: Microsoft, Paytm, Facebook

Method: maxRectangle(int[] heights)

Logic: Uses stacks to find the nearest smaller element to the left and right of every bar.

Time Complexity: O(n)

 ```java
validParentheses("(a+b)") ➞ true  
validParentheses("[(a+b]*{c+d})") ➞ false
