snacks = "potato chips"
rate        = 2.50       
quantity     = 15         
available = False      

#PRINTING VARAIABLES
print("Snack:", snacks)
print("Price: $", rate)
print("In Stock:", quantity)
print("Available?", available)

#PRINTING DATATYPES
print(type(snacks))
print(type(rate))
print(type(quantity))
print(type(available))


#CALCULATIONS
total_price = rate * quantity
print("Total value is $", total_price)
print("Sale price is $", rate - 0.75)
print("Double stock is", quantity * 2)
print("Is price under $2?", rate < 2)
print("More than 6 in stock?", quantity > 6)
print("Is price exactly $2.50?", rate == 2.50)


# Working with string operations
shop = "7" + " " + "11"
print("Shop name:", shop)
print("Letters in snack name:", len(snacks))
print("First letter:", snacks[0])


# value swap
price_a = 1.50
price_b = 3.00
print("Before price:", price_a, "and", price_b)

temp_v    = price_a
price_a = price_b
price_b = temp_v

print("After price is :", price_a, "and", price_b)