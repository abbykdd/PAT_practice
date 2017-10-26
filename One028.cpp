//
//  One028.cpp
//  PAT
//
//  Created by Ayhan on 2017-10-26.
//  Copyright © 2017 Ayhan. All rights reserved.
//

#include <stdio.h>

#include <iostream>
#include <string>
using namespace std;
int main(){
    int count;
    cin >> count;
    string oName = "";
    string oDate;
    string yName = "";
    string yDate;
    int oYear;
    int oMon;
    int oDay;
    int yYear;
    int yMon;
    int yDay;
    const int theYear = 2014;
    const int theMon = 9;
    const int theDay = 6;
    int valid = 0;
    while(count > 0){
        count--;
        string name;
        string date;
        cin >> name >> date;
        int year = stoi(date.substr(0,4));
        int mon = stoi(date.substr(5,2));
        int day = stoi(date.substr(8,2));
        if(theYear - year > 200 || theYear < year ||
           (theYear == year && theMon > mon ) ||
           (theYear == year && theMon == mon && theDay < day ) ||
           (theYear - year == 200 && theMon > mon) ||
           (theYear - year == 200 && theMon == mon && theDay > day)){
            
        }else if(oName == ""){
            oName = name;
            yName = name;
            oDate = date;
            yDate = date;
            valid++;
        }else{
            if (year > yYear || (year == yYear && yMon < mon) ||
                (year == yYear && yMon == mon && yDay <= day)){
                yDate = date;
                yName = name;
            }
            if(year < oYear || (year == oYear && mon < oMon) ||
               (year == yYear && yMon == mon && yDay >= day)){
                
                oDate = date;
                oName = name;
                
            }
            valid ++;
        }
        yYear = stoi(yDate.substr(0,4));
        yMon = stoi(yDate.substr(5,2));
        yDay = stoi(yDate.substr(8,2));
        oYear = stoi(oDate.substr(0,4));
        oMon = stoi(oDate.substr(5,2));
        oDay = stoi(oDate.substr(8,2));
        
    }
    
    cout << valid << " " << oName << " " << yName << endl;
    return 0;
}

