// CPP Pseudocode 2

#include <iostream>
using namespace std;

int CalculateSum(int a,int b){
    return a+b;
};

int main(){

    int i,j,sum;
    i = 15;
    j = 25;

    if (i > j){
        cout << "i is greater than j" << endl;
    } else{
        sum = CalculateSum(i,j);
        cout << "Sum of i and j is: " << sum << endl;
    }

    for (int h = 1; h <= 5; h++){
        cout << endl;
        cout << "The value of h is: " << h << endl;
    }
}