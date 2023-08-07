input_string = input("Enter a list element separated by space ")
list  = input_string.split()
print("caluclation of sum ina list")
sum = 0
for num in list:
    sum += int (num)
print("Sum = ",sum)