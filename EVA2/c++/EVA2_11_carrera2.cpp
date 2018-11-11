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
    bool materias;
    
    materias = true;
    bool servicio;
    
    servicio = true;
    bool residencias;
    
    residencias = true;
    if (materias == true && servicio == true && residencias == true) {
        cout << "Te titulas" << endl;
    } else {
        cout << "No te titulas" << endl;
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
