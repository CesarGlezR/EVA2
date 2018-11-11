print("Introduce el año")
rA = float(input())
if rA % 4 == 0:
    if rA % 100 != 0:
        print("Año bisiesto")
    else:
        if rA % 400 == 0:
            print("Es bisiesto")
        else:
            print("No es bisiesto")
else:
    if rA % 100 != 0:
        print("No es bisiesto")
    else:
        if rA % 400 == 0:
            print("Es bisiesto")
        else:
            print("No es bisiesto")
