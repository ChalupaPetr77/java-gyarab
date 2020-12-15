```java
//přiřazení hodnoty
    double a = 3;
    double b = 4;
        
//základní operace - binární == 2 operand
    double soucet = a + b;
    double rozdíl = a - b;
    double soucin = a * b;
    double podil = a / b;
    int e = 3;
    int f = 4;
    int g = e / f;  //deleni e / f což odpovídá = 3/4
    int g = e % f //zbytek po deleni e / f  zbytek je 3

//přiřazovací
    int promena = 5 + 1;
    double c = 3;
    double d = 4;
    c = (c + d);
    c += d; // totožné jako c = c + d;
    c -= d; // totožné jako c = c - d;
    c /= d; // totožné jako  c = c / d;
    c *= d;  // totožné jako  c = c * d;
    
    c++; //c = c + 1; c += 1; 1. zapamatuju puvodni, 2. zvetsim o 1, 3. vysledek je zapamatovany
    --c; //c = c - 1; c -= 1;
    ++c; //1. c zvetsim o jedna, 2. vysledek je nova hodnota 
    --c; 
       
       
//relační = ukládá se 1 jako true nebo 0 jako false, pokud platí nebo neplatí
//použití hlavně v podmínkách if()
    boolean vetsi = a > b;
    boolean mensiNeboRovno = a <= b;
    boolean stejne = a == b;
    boolean ruzne = a != b;
    boolean b1 = false;
    boolean b2 = true;
    //přepíše se hodnota b1 na true
    boolean b3 = (b1 = b2);
    System.out.println(b3);
        
//logicke operatory
//použití hlavně v podmínkách if()
    boolean soucasne = b1 & b2;
    boolean nebo = b1 | b2;
    boolean xor = b1 ^ b2;
    //kdyz je jasny jak dopadne to vpravo tak nepocitej to druhy
    boolean x = (a > 3) && (b < 9);
    boolean x1 = (a > 3) || (b < 9);
        
//bitove operace
    int h = 3; // 0000 0011
    //posouva bity o určený počet míst
    int i = h << 3; // 0001 1000
    //i << b .... i * 2 na b
    // i >> b .... i / na b
    // i >>> b .... i / na b vc. znamenka - shift
        


//bitove and/or
        int and = h & i;
        int or = h | i;
        int negace = ~i;
```