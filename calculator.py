try:
    first_number = float(input("Enter the first number: "))
    operator = input("Enter an operation (+, -, *, /): ")
    second_number = float(input("Enter the second number: "))

    if operator == "+":
        result = first_number + second_number
    elif operator == "-":
        result = first_number - second_number
    elif operator == "*":
        result = first_number * second_number
    elif operator == "/":
        if second_number == 0:
            print("Error: Cannot divide by zero.")
        else:
            result = first_number / second_number
            print("Result:", result)
    else:
        print("Error: Invalid operation.")
    
    if operator in ["+", "-", "*"]:
        print("Result:", result)

except ValueError:
    print("Error: Please enter valid numbers.")