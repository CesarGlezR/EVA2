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
    cout << "Que calificacion sacaste?" << endl;
    double rCalifa;
    
    cin >> rCalifa;
    cout << "Tu calificaion es" << endl;
    cout << rCalifa << endl;
    if (rCalifa >= 7) {
        cout << "Ya pasate" << endl;
    } else {
        cout << "gg" << endl;
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
