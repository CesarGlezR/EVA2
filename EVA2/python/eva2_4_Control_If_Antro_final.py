print("¿Cuantos años tienes?")
iEdad = int(input())
print("¿Tienes INE?")
bINE = (input().lower == 'true')
if iEdad >= 18:
    if bINE == True:
        print("Pásale")
    else:
        print("No puedes entrar")
else:
    print("No puedes entrar")
