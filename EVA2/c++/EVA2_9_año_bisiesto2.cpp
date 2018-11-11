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
    cout << "Introduce el año" << endl;
    double rA;
    
    cin >> rA;
    if (rA % 4 == 0 && (!(rA % 100 == 0) || rA % 400 == 0)) {
        cout << "Es bisiesto" << endl;
    } else {
        cout << "No es bisiesto";
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
