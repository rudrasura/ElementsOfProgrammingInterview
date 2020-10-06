# Program to reorder arrays' entries so that the even entries appear
# first without allocating additional storage.
a = [3, 2, 10, 4, 1, 8]
e = 0
o = len(a) - 1

while e < o:
    if a[e] % 2 == 0:
        e = + 1
    else:
        a[e], a[o] = a[o], a[e]
        o = - 1

for x in a:
    print(x)

