print("¿Cuantos años tienes?")
iEdad = int(input())
print("¿Tienes INE?")
iNE = (input().lower == 'true')
if iEdad >= 18 and iNE == True:
    print("Puedes pasar")
else:
    print("No puedes pasar")
