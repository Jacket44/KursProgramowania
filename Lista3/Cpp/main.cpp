#include <iostream>
#include <math.h>
#include <stdio.h>
#include <vector>
#include <memory>
#include <cctype>
using namespace std;



class Figure{
public:
float p;
float o;
virtual float perimeter() = 0;
virtual float field() = 0;
};

class Quadrangle: public Figure{
   int side1;
   int side2;
   int side3;
   int side4;
   int angle;
   float perimeter(){
      return 2*side1+2*side2;
   }

   float field(){
       return side1*side2;
   }

   public:
       Quadrangle();
};

class Circle: public Figure{
 float r;

 float perimeter(){
    return 2 * M_PI * r;
}

float field(){
    return M_PI * r * r;
}

 public:
    Circle();
};

class Pentagon: public Figure{
 int side;
 float p;

 float field(){
     return (5.0/4.0) * side * side * 1,376;
 }

 float perimeter(){
     return 5 * side;
 }

 public:
    Pentagon();
};

class Hexagon: public Figure{
 int side;
 float p;
 float perimeter(){
     return 6 * side;
 }
 float field(){
    return 6 * ((side * side * sqrt(3)) / 4.0);
 }

 public:
    Hexagon();
};

class Square: public Quadrangle{
int side1;
};

class Lozenge: public Quadrangle{
int side2;
int angle;
};

class Rectangle: public Quadrangle{
int bok3;
int bok4;
};

Circle::Circle(){
 cout<<"Type circle radius: "<<endl;
 cin>>r;
 p = M_PI * r * r;
 o = 2 * M_PI * r;
}



Quadrangle::Quadrangle(){

    cout<<"Type angle: "<<endl;
    cin>>angle;
    if(angle == 90){
    cout<<"Enter side 1: "<<endl;
    cin>>side1;
    cout<<"Enter side 2: "<<endl;
    cin>>side2;

        if(side1 == side2){
        p = side1 * side1;
        o = 4 * side1;
        }
        else{
        p = side1*side2;
        o = 2 * side1 + 2* side2;
        }

    }
    else
    {
        cout<<"Enter side: "<<endl;
        cin>>side1;
        cout<<"Enter heighth: "<<endl;
        cin>>side2;
        p = side1 * side2;
        o = 4 * side1;

    }
}

Pentagon::Pentagon(){
    cout<<"Enter side: "<<endl;
    cin>>side;
    p = (5/4.0) * side * side * 1,376;
    o = 5 * side;
}

Hexagon::Hexagon(){
    cout<<"Podaj bok: "<<endl;
    cin>>side;
    p = 6 *((side * side * sqrt(3))/4.0);
    o = 6 * side;
}

  int main(){
    int i;
    char t[100];
    char figureLetter;
    int noFigures;
    int c;
    int k;
    int p;
    int s;
    Figure * tab[100];
    cout<<"How many figures will you enter? : "<<endl;
    cin>>noFigures;
    if(noFigures>=1){
    cout<<"c - circle, q - quadrangle, p - pentagon, h - hexagon"<<endl;
    for(i = 0;i < noFigures;i++){
        cin>>figureLetter;
    if(figureLetter == 'k' || figureLetter == 'c' || figureLetter == 'p' || figureLetter == 's')
        t[i] = figureLetter;
    else{
      cout<<"Wrong letter!"<<endl;
      i--;
    }
    }
    for(i = 0;i < noFigures;i++){
        if(t[i] == 'c')
        tab[i] = new Quadrangle();
        else if(t[i] == 'k')
        tab[i] = new Circle();
        else if(t[i] == 'p')
        tab[i] = new Pentagon();
        else if(t[i] == 's')
        tab[i] = new Hexagon();

    }
    for(i = 0;i < noFigures;i++){
        cout<<"Figure "<<i<<endl;
        cout<<""<<endl;
        cout<<"Perimeter: "<<tab[i]->perimeter()<<endl;
        cout<<"Field: "<<tab[i]->field()<<endl;
        cout<<""<<endl;
        delete tab[i];
    }
}
    else
    cout<<"Wrong sign!"<<endl;
    return 0;
}
