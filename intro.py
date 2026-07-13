def introduction(name):
    
    print("Hey!!!! Greetingssss! I am", name)

user_name = input("Enter your name")
introduction(user_name)






#FACTORIAL OF A NUMBER

def factorial(n):
   if n == 1:
       return n
   else:
       return n*factorial(n-1)

num = int(input("Enter a number of your choice"))


if num < 0:
   print("You have entered a negative number")
elif num == 0:
   print("Factorial of 0 is 1")
else:
   print("Factorial of", num, "is", factorial(num))