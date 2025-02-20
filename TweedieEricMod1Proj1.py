# Eric Tweedie Mod 1 project 1

class SimpleMath():
    '''Class used for simple mathematics.
        Contains methods for addition, subtraction, multiplication, and division.
        '''
   
    def __init__(self):
        '''Constructor function for the SimpleMath class.'''

    def add(self, num1, num2):
        '''Method to add two numbers.
        Parameters:
        num1 (int or float): First number to add.
        num2 (int or float): Second number to add.
        Returns:
        (int or float): The sum of the two numbers.'''
        
        return num1 + num2
    
    def subtract(self, num1, num2):
        '''Method to subtract two numbers.
        Parameters:
        num1 (int or float): First number to subtract from.
        num2 (int or float): Second number to subtract.
        Returns:
        (int or float): The difference of the two numbers.'''
        
        return num1 - num2
    
    def multiply(self, num1, num2):
        '''Method to multiply two numbers.
        Parameters:
        num1 (int or float): First number to multiply.
        num2 (int or float): Second number to multiply.
        Returns:
        (int or float): The product of the two numbers.'''
        
        return num1 * num2
    
    def divide(self, num1, num2):
        '''Method to divide two numbers.
        Parameters:
        num1 (int or float): Dividend.
        num2 (int or float): Divisor.
        Returns:
        (int or float): The quotient of the division.'''
        
        if num2 == 0:
            raise ZeroDivisionError("Cannot divide by zero")
        
        return num1 / num2

def main():
    s = SimpleMath()
    print(s.add(5,10))
    print(s.subtract(15, 10))
    print(s.multiply(3, 5))
    print(s.divide(10, 2))

main()