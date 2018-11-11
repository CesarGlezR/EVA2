print("Introduce el año")
rA = float(input())
if rA % 4 == 0 and (not rA % 100 == 0 or rA % 400 == 0):
    print("Es bisiesto")
else:
    print("No es bisiesto", end='', flush=True)
