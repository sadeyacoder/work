num = int(input("Enter a number of your choice: "))

if num > 1:
   
    for i in range(2, int(num**0.5) + 1):
        
        if num % i == 0:
            print(f"{num} is not a prime number.")
            break
    else:
       
        print(num, " is a prime number.")
else:
    # Numbers less than 2 are not prime
    print(num, " is not a prime number.")