my_height = float(input("Enter your height in cm: "))
my_weight = float(input("Enter your weight in kg: "))

BMI = my_weight / (my_height/100)**2

print("Heyyyy!!! Your BMI is", BMI)

if BMI <= 18.4:
    print("Yoh no you are underweight.")
elif BMI <= 24.9:
    print("Ywow ou are healthy.")
elif BMI <= 29.9:
    print("oh You are over weight.")
elif BMI <= 34.9:
    print("omg You are severely over weight.")
elif BMI <= 39.9:
    print("oh no You are obese.")
else:
    print("oh nooo You are severely obese.")