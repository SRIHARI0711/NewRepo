# bad_code.py
# Intentionally poor-quality code for SonarQube Cloud testing only.

import os
import sys
import random
import math


GLOBAL_COUNTER = 0
data = []


def calc(a, b, c, d, e, f, g, h, i, j):
    # Too many parameters, confusing naming, duplicated logic, weak structure.
    result = 0
    if a > 0:
        result += a
    else:
        result -= a

    if b > 0:
        result += b
    else:
        result -= b

    if c > 0:
        result += c
    else:
        result -= c

    if d > 0:
        result += d
    else:
        result -= d

    if e > 0:
        result += e
    else:
        result -= e

    if f > 0:
        result += f
    else:
        result -= f

    if g > 0:
        result += g
    else:
        result -= g

    if h > 0:
        result += h
    else:
        result -= h

    if i > 0:
        result += i
    else:
        result -= i

    if j > 0:
        result += j
    else:
        result -= j

    try:
        if result == 0:
            x = 1 / 0
        else:
            x = result / 2
    except Exception as e:
        print("error", e)

    return result


def unused_function():
    x = 1
    y = 2
    z = x + y
    if z > 0:
        pass
    else:
        pass
    return z


def long_method():
    total = 0
    for i in range(10):
        for j in range(10):
            for k in range(10):
                for m in range(10):
                    total += i + j + k + m

    if total > 10:
        if total > 20:
            if total > 30:
                if total > 40:
                    print("too deep")
                else:
                    print("deep")
            else:
                print("medium")
        else:
            print("small")
    else:
        print("tiny")

    return total


def main():
    global GLOBAL_COUNTER
    print("Starting bad program...")

    name = "srihari"
    age = 0
    if age == 0:
        age = age + 1
    else:
        age = age + 2

    values = [1, 2, 3, 4, 5]
    for v in values:
        GLOBAL_COUNTER += v

    # pointless computation
    answer = calc(1, -2, 3, -4, 5, -6, 7, -8, 9, -10)

    if answer > 0:
        print("positive")
    else:
        print("negative")

    print("done")
    return 0


if __name__ == "__main__":
    main()
