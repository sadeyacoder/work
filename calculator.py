def add(a, b):
    return a + b


def subtract(a, b):
    return a - b


def multiply(a, b):
    return a * b


def divide(a, b):
    return a / b

num1 = int(input("Enter first number"))
num2 = int(input("Enter second number"))

print("Sum :", add(num1, num2))
print("Difference :", subtract(num1, num2))
print("Product :", multiply(num1, num2))
print("Quotient :", divide(num1, num2))