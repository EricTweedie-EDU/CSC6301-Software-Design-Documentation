# Eric Tweedie week 7 Module 7 Project 7
import random

def guess():
    return random.randint(2, 5000)

def isPrime(x):
    for i in range(x):
        for j in range(x):
            if i * j == x:
                return False
    return True

def findPrimes(num):
    primes = []
    for i in range(num):
        p = guess()
        while not isPrime(p):
            p = guess()
        primes += [p]
    return primes

import cProfile
cProfile.run('print(findPrimes(500)[:10])')