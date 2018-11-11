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
    cout << "¿Cuantos años tienes?" << endl;
    int iEdad;
    
    cin >> iEdad;
    cout << "¿Tienes INE?" << endl;
    bool iNE;
    
    cin >> iNE;
    if (iEdad >= 18 && iNE == true) {
        cout << "Puedes pasar" << endl;
    } else {
        cout << "No puedes pasar" << endl;
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
