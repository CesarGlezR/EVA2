print("¿Cuál es tu calificación?")
iCalif = int(input())
if iCalif >= 90 and iCalif <= 100:
    print("Tienes una A")
else:
    if iCalif >= 80 and iCalif <= 89:
        print("Tienes una B")
    else:
        if iCalif >= 70 and iCalif <= 79:
            print("Tienes una C")
        else:
            if iCalif >= 60 and iCalif <= 69:
                print("Tienes una D")
            else:
                if iCalif >= 50 and iCalif <= 59:
                    print("Tienes una F")
                else:
                    print("numero no valido")
