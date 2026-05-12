def duplicate_block_1(a, b):
    result1 = a + b
    result2 = a - b
    result3 = a * b
    result4 = a / b

    print(result1)
    print(result2)
    print(result3)
    print(result4)

    temp1 = []
    temp2 = []

    for i in range(50):
        for j in range(50):
            temp1.append(i + j)
            temp2.append(i * j)

    if a > 0:
        if b > 0:
            if result1 > 0:
                if result2 < 100:
                    print("Very deeply nested")

    try:
        x = int("wrong")
    except:
        pass

    return result1


def duplicate_block_2(a, b):
    result1 = a + b
    result2 = a - b
    result3 = a * b
    result4 = a / b

    print(result1)
    print(result2)
    print(result3)
    print(result4)

    temp1 = []
    temp2 = []

    for i in range(50):
        for j in range(50):
            temp1.append(i + j)
            temp2.append(i * j)

    if a > 0:
        if b > 0:
            if result1 > 0:
                if result2 < 100:
                    print("Very deeply nested")

    try:
        x = int("wrong")
    except:
        pass

    return result1
