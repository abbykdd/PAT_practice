
//
//  One071.cpp
//  PAT
//
//  Created by Ayhan on 2017-10-25.
//  Copyright © 2017 Ayhan. All rights reserved.
//

#include <iostream>
#include <string>
using namespace std;
int main(){
    int amount;
    int gameTime;
    cin >> amount >> gameTime;
    while(gameTime > 0){
        int n1;
        int n2;
        int betAmount;
        int bet;
        
        cin >> n1 >> bet >> betAmount >> n2;
        
        if(betAmount > amount){
            cout << "Not enough tokens. Total = " << amount << "." << endl;
        }else if((bet == 0 && n1 > n2) || (bet == 1 && n1 < n2)){
            amount += betAmount;
            cout << "Win " << betAmount << "!  Total = " << amount << "." <<endl;
        }else {
            amount -= betAmount;
            cout << "Lose " << betAmount << ".  Total = " << amount << "." <<endl;
        }
        if(amount == 0){
            cout << "Game Over."<<endl;
            gameTime = 0;
        }
        gameTime--
    }
    return 0;
}
