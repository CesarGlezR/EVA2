#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "¿Cuál es tu calificación?" << endl;
    int iCalif;
    
    cin >> iCalif;
    if (iCalif >= 90 && iCalif <= 100) {
        cout << "Tienes una A" << endl;
    } else {
        if (iCalif >= 80 && iCalif <= 89) {
            cout << "Tienes una B" << endl;
        } else {
            if (iCalif >= 70 && iCalif <= 79) {
                cout << "Tienes una C" << endl;
            } else {
                if (iCalif >= 60 && iCalif <= 69) {
                    cout << "Tienes una D" << endl;
                } else {
                    if (iCalif >= 50 && iCalif <= 59) {
                        cout << "Tienes una F" << endl;
                    } else {
                        cout << "numero no valido" << endl;
                    }
                }
            }
        }
    }
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}
