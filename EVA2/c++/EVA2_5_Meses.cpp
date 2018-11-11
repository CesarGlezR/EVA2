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
    cout << "Introduce un numero" << endl;
    int iM;
    
    cin >> iM;
    if (iM == 1) {
        cout << "Enero" << endl;
    } else {
        if (iM == 2) {
            cout << "Febrero" << endl;
        } else {
            if (iM == 3) {
                cout << "Marzo" << endl;
            } else {
                if (iM == 4) {
                    cout << "Abril" << endl;
                } else {
                    if (iM == 5) {
                        cout << "Mayo" << endl;
                    } else {
                        if (iM == 6) {
                            cout << "Junio" << endl;
                        } else {
                            if (iM == 7) {
                                cout << "Julio" << endl;
                            } else {
                                if (iM == 8) {
                                    cout << "Agosto" << endl;
                                } else {
                                    if (iM == 9) {
                                        cout << "Septiembre" << endl;
                                    } else {
                                        if (iM == 10) {
                                            cout << "Octubre" << endl;
                                        } else {
                                            if (iM == 11) {
                                                cout << "Noviembre" << endl;
                                            } else {
                                                if (iM == 12) {
                                                    cout << "Disiembre" << endl;
                                                } else {
                                                    cout << "No corresponde a ningun mes" << endl;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
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
