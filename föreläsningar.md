# **Föreläsning 1**
Kapitel 1
## Java syntax
### Klass deklaration
En klass består av metoder.

```java
class Demo
    { 
    ---KOD HÄR---
    }
```
Om klassen heter Demo, så anropas och kallas filen för Demo.java

Oftast skriver man //Demo.java längst upp i filen om man vill vara artig programmerare. 
### Metoder i klassen
Huvudmetoden i en klass kallas exempelvis main.


```java
public static void main (String[] args)
    {
        System.out.println("1234");
        System.out.printlin("a + b = c");
    }
```
### Kompilering och exekvering av program
Om inte redan i VScode behöver man lokalisera mappen genom att i terminalen skriva cd på följande sätt:
`cd C:\Users\emili\Documents\ID1018`

Exempelvis: 

För att exekvera programmet Demo.java behöver man skriva `javac Demo.java` i terminalen. När en fil kompileras skapas en read only fil som har avslut Demo.class

För att köra programmet behöver man skriva `java Demo` i terminalen. 
### Kommentarer
Kommentarer skrivs med // på följande sätt.

`//Kommentar`
Med denna metod kan man kommentera på en rad i taget.

För att skriva en lång kommentar kan man skriva /**/ på följande sätt.
```
/*
    Lång 
    kommentar
    på 
    flera 
    rader
*/
```
### Förening av strängar
Man kan förena två strängar i exempelvis en println funktion genom att sätta plus mellan de på följande vis. 
`System.out.println("a + b = " + "1234");`
## **Intro till MD**

### Kod
`code text`

### stryk över
~~strike through text~~

### Ekvationer
$$E = mc^2$$

# **Föreläsning 2**
Denna föreläsning handlar om datalagring.
## Kapitel 2 Innehåll
    Variabler
        Skapa och visa en variabel
        En variabels namn
        Använda en variabel
    
    Datatyper i Java
        Lagra heltal
        Lagra decimaltal
        Utföra en beräkning
        Lagra tecken
        Lagra booleska värden
        Hantera teckensträngar

    Omvandlingar mellan olika datatyper
        Automatiska typomvandlingar
        Uttryckliga typomvandligar
        Omvandligar mellan tecken och heltal
## Variabler

### Skapa och visa variabler

För att kunna lagra en bit informaton, eller data, måste man ge den datan ett namn och bestämma dess datatyp. För att  deklarera och lagra ***heltal*** används typen `int` på följande vis. 

`int n = 50;`

Man behöver inte ge ett värde direkt, men man måste deklarera datatyp och namn alltid. Exempelvis;
```java
int n;
n = 50;
```

Man kan deklarera flera variabler samtidigt;
```java
int n1, n2;
n1 = 50;
n2 = 100;
```
Om man vill visa en variabels värde kan man skriva en printsats direkt med variabeln på följande vis;
`System.out.println (n);` . Eller för flera variabler kan man skriva `System.out.println ("n1 = " + n1 + ", n2 = " + n2);`

Viktigt att veta är att om man istället skriver `System.out.println (n1 + n2);` Så kommer man göra beräkningen $$n1+n2= 50 + 100 = 150$$ Alltså används + operatorn inte bara för aritmetiska beräkningar men också för att förena teckensträngar. 

### En variabels namn
En artig  programmerare deklarerar namn som är lätta att förstå. Exempelvis, om man vill deklarera en variabel som innehåller antalet av något så bör man kalla den för `antal`. Sammansatta ord som varabelnamn bör deklareras på följande sätt:
```java
int antaletBöcker = 10;
int antalet_böcker = 10;
```
Det finns vissa regler när man namnger en variabel

    Första tecknet i en variabel får inte vara en siffra
    Man bör bara använda bokstäverna a-z och siffrorna 0-9
    Mellanslag får inte förekomma i variabelnamnet

### Använda en variabel
Det går inte att använda en variabel om man inte lagrat ett värde i den. Det finns två typiska sätt att använda en variabel; att avläsa ett värde och sedan använda dett till något, och att skapa en variabel och sedan ändra det.
```java
//Första sättet
System.out.println(n); 

//Andra sättet
int counter = 0;
counter = 1;
```
Om man vill skapa en variabel som är konstant så deklarerar man variabeln som `final`. Exempelvis:
`final int MAX_ANTAL = 100;`. MAX_ANTAL kan bara ändra värde där den deklarerades. 

## Datatyper i Java
### Lagra heltal
**Det finns 4 heltals datatyper; `int, short, byte, long`**

När man lagrar heltal använder man vanligtvis `int`. Denna typ tar 4 byte i minnet och kan lagra ett maximalt värde av 2^31

Om man arbetar med mindre tal kan man använda `short` istället. Denna typ tar bara 2 byte i minnet, och kan lagra tal upp till 32 767. 

Om man arbterar med *ännu* mindre tal kan man använda `byte`. Denna typ tar bara 1 byte i minnet, och kan lagra tal från -128 till 127. 

För *väldigt stora* tal använder man typen `long` som tar 8 byte i minnet. Med denna typ måste man dock ange L eller l i slutet av heltalet: 

`long tal = 123456789101112L;`

Även vid övrig användning av stora tal måste L anges i slutet:
`System.out.println(123456789101112L);`

Heltal som lagras i datorns minne representeras binärt av en sekvens ettor och nollor. `byte`, som är 1 byte i minnet, representeras av en binär sekvens av 8 bitar. 

### Lagra decimaltal
Det finns två datatyper som kan lagra decimaltal; `float` och `double`.

`float` tar 4 byte i minnet och deklareras med ett F i slutet av värdet såhär: `float num1 = 1.25F;`

`double` tar 8 byte i minnet och deklareras såhär: `double num2 = 12345.0123456;`

#### **E notation**
Talet 12500000.0 kan också skrivas med E-notation på följande sätt:

    12.5E+6
    12.5e6
    12.5e+6
    1.25e7
    0.125e8
På samma sätt kan vi även skriva väldigt små tal, exempelvis  0.000000001 som 1E-9. 

### Utföra en beräkning
När man utför en beräkning är det viktigt att man väljer lämpliga namn och datyper. 

Betrakta följande
```java
int antal = 50;
double pris = 250.0;
double kostnad;

kostnad = antal * pris;
System.out.println("kostnad = " + kostnad);
```
Denna print out kommer att kunna innehålla decimaler trots att `kostnad` är en produkt av datatyperna `int` och `double`.

### Lagra tecken
För att lagra tecken såsom (A, B, C, ...), (0, 1, 2, 3, ...), (+, -, &, %, $, ...) så används datatypen `char`. 

`char`tar upp till 2 byte minne och deklareras på följande vis:
`char c = 'A';`.

Tecknet som lagras i char följer en speciell teckenlista såsom ASCII, där tecknet A har värdet 65. Så om vi vill att c ska innehålla A kan man även skriva: `char c = 65;`.

#### **Heltalet noll, siffran noll och nolltecknet**
Nu när vi kan dessadatatyper behärskar vi följande:
```java
char a = '0'; // Siffran noll, ett tecken vars kod är 48
int b = 0; //Heltalet noll, inte ett tecken
char c = 0; //nolltecknet, ett tecken vars kod är 0
```
### Specialtecken
```java
//Specialtecken
char nr = 10; //nyradstecknet
char tb = 9; //tabbtecknet
char bt = 8; //backstegstecknet
char rt = 13; //returtecknet

//Kan även skrivas på följande sätt
char nr = '\n'; //ny rad
char tb = '\t'; //tabb
char bt = '\b'; //Backsteg
char rt = '\r'; //retur

//Används exempelvis på följande sätt
System.out.println("\nföre\tnu\tefter");
```
### Lagra booleska värden
Det finns två booleska värden, `true` och `false`. Dessa lagras i datatypen `boolean` på följande sätt:
```java
boolean b1 = true;
boolean b2 = false;
```
### Hantera teckensträngar
Det finns exakt åtta primitiva datatyper i Java; `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`. Dessa kan inte användas för att representera en teckensträng särskilt effektivt. Istället använder man datatypen `string` på följande vis:

`string s = "Rena, kraftfulla naturen omger oss!";`

## Omvandligar mellan olika datatyper
### Omvandlingar mellan heltalsdatatyper
Det går att stoppa en liten datatyp i en större datatyp:
```java
byte a = 5;
short b = a;
short c;
c = a; 
```
Men det går inte att stoppa en större datatyp i en mindre datatyp, då blir det kompileringsfel. 

### Omvandlingar mellan flyttalsdatatyper
Det går att stoppa en liten flyttalsdatatyp i en större flyttalsdatatyp:
```java
float x = 1.25F;
double y = x;
```
Men det går inte att stoppa en `double` i `float`, då blir det kompileringsfel. 

### Omvandlingar mellan heltalsdatatyper och flyttalsdatatyper
Flyttalsdatatyper är "större" än heltalsdatatyper, eftersom flyttal representeras över ett större talområde. Därför är typen `float` större än typen `long` trots att den tar upp mindre minne. Man kan alltså göra såhär: 
```java
long a = 123456L;
float b = a;
```
En eventuell risk är dock att man kan förlora noggranhet när man ett `int` eller `long` värde i en `float` variabel. Exempelvis; 
```java
int b = 1234567890; 
float y = b; //Lagras som 1.23456794E9
```

### Uttryckliga typomvandlingar
Ibland vill man framtvinga tilldelning av en större datatyp till en variabel av mindre datatyp. Då måste man uttryckligen utföra en s.k. *type cast*, eller typomvandling. Så här gör man: 
```java
short a = 5;
byte b = (byte) a;
```
Detta gäller även då man vill tvinga flyttal in i heltal. 

Det finns risk för att ett värde kan gå helt förlorat vid type casting. Det går heller inte att utföra omvandlingar till datatypen `boolean`.

### Omvandlingar mellan tecken och heltal
Datatypen `char` representerar tal över talområdet [0, 65535], därför är denna datayp mindre än `int`, och varken mindre eller större än `short`, och `byte`. Det finns värden som kan representeras av datatypen `int` som inte finns i `char`, exempelvis 5000. `int` kan inte lagras som `char`.

Man kan däremot göra följande omvandling: 
```java
char c1 = 'A';
int p1 = c1;
int q = 97;
char c2 = (char) q; // c2 innehåller tecknet A
```

# **Föreläsning 3**
## Kapitel 3 och 4 Innehåll
    Mata in data
        Tillföra data till ett program under exekvering
        Tangentbordsinmantning
        Inmatningsverktyg 
        Mata in ett värde
    
    Mata in tecken
        Mata in ett tecken
        Rensa inmatningsbufferten
    
    Mata in strängar
        Mata in en rad
        Mata in ett ord
        Mata en en teckensträng
    
    Mata in tal
        Mata in numeriska värden
        Felaktig inmatning
    
    Operationer med heltal
        Grundläggande operationer med heltal
        Heltalsuttryck
        Typomvandlingar vid beräkning av heltalsuttryck
        Fel vid heltalsberäkningar

    Operationer med flyttal
        Grundläggande operationer med flyttal
        Typomvandlingar ved beräkning av flyttalsuttryck
        Fel vid flyttalsberäkningar
    
    Operationer på en variabel
        Olika operationer på en variabel
        Öka eller minska en variabel med ett
    
    Jämförelse av promitiva värden
        Jämförelse av numeriska värden
        Jämförelse av booleska värden
    
    Operationer med booleska värden
        Logiska operationer
        Logiska uttryck

## Mata in data
### Tangentbordsinmatning
Detta är när terminalfönstret används frågar efter inmatning. 
### Inmatningsverktyg
För inmatning av teckensträngar och primitiva värden kan man använda ett objekt av typen `Scanner`. Dennaklass finns i paketet `java.util.Scanner`. Ett objekt av typen `Scanner`kan skapas med operatorn `new` på följande vis:

`java.util.Scanner in = new java.util.Scanner (System.in);`

Här är *in* bara ett godtyckligt namn. När ett object av typen `Scanner` införts är det lätt att använda dess olika metoder: `nextLine`, `next`, `nextInt`, `nextDouble`. 

### Mata in ett värde
Säg att man vill mata in ett heltal av typen `int`, detta skes via objektet `Scanner` och dess metod `nextInt`. Om man har skapat ett objekt av typen `Scanner` som går att komma åt via namnet `in`, kan objektets metod `nextInt` anropas på följande vis: `in.nextInt ();`. I denna sats matar man in ett heltal av typen `int`. 

Exempelvis kan man spara och använda ett inmatningsvärde på detta sätt:
```java
System.out.println("Skriv ett tal: \n");
java.util.Scanner in = new java.util.Scanner(System.in);
int tal = in.nextInt();
System.out.println("Du skrev = " + tal);
```

### Mata in tecken
För teckeninmatning används ett objekt av klassen `InputStreamReader`, denna klass finns i paketet `java.io`. Klassen innehåller metoden `read`, exempelvis kan man skriva så här:
```java
java.io.InputStreamReader in = new java.io.InputStreamReader (System.in);
int i = in.read(); // om a så sparas värdet av a dvs 97 i i. 
char c = (char) in.read(); // om a så sparas bokstaven a i c
```
Metoden `read` kan kasta undantag som ger kompileringsfel. Då behöver man deklarera `throws java.io.IOException`i metodens huvud efter metodens parameterlista. Exempelvis:

`public static void main (String[] args) throws java.io.IOException {}`

### Rensa inmatningsbufferten
Observera att även en tryckning på returtangenten matas in i inmatningsbufferten. När man anger ett tecken och trycker på returtangenten lagras inte bara det angivnat tecknet, returtangentens värde lagras också. Vid första anropet av `read` hämtas inmatningstecknet, vid andra anropet `read` hämtas returtangenten. Programmet väntar inte på användaren, utan hämtar det första tecken som redan finns i inmatningsbufferten. 

Man kan rensa inmatningsbufferten genom att hämta tecknet från returtangenten utan att lagra den på följande vis: 
```java
char c = (char) in.read();
in.read();
in.read();
```
Ju fler tomma anrop av `read` desto fler tecken rensas från inmatningsbufferten. 

### Mata in strängar
Ett objekt av klassen `java.util.Scanner` och dess metod `nextLine` kan användas av en rad från standardinmatningsenheten. Så här kan det användas:
```java
java.util.Scanner in = new java.util.Scanner (System.in);
String rad = in.nextLine();
System.out.println("Den inmatade raden: \n" + rad);
in.nextLine(); //rensa bufferten
```
### Mata in ett ord
För att hämta separata ord ur en sträng kan man använda klassen `java.util.Scanner` och dess metod `next`. Exempelvis: 
```java
java.util.Scanner in = new java.util.Scanner (System.in);
String efternamn = in.next(); //Hämta efternamn
String fornamn = in.next(); //Hämta fornamn
System.out.println("Ditt namn är: \n" + fornamn + efternamn);
in.nextLine(); // Rensa inmatningsbufferten
```
### Mata in en teckensträng
Klassen `java.util.Scanner` har metoden `next`, men denna kan inte särskilja på teckeninnehåll. Då kan man använda metoden `useDelimeter`, som kan definera skiljetecken. Exemeplvis:
```java
java.util.Scanner in = new java.util.Scanner (System.in);
in.useDelimiter("[=&]");
```
Här har tecknena = och & valts som skiljetecken under inmatningen. Varje förekomst av = och & markerar slutet på en teckensträng. 
Längre exempel:
```java
java.util.Scanner in = new java.util.Scanner (System.in);
in.useDelimiter(",");
String namn = in.next();
String ort = in.next();
in.nextLine();
```
Om inmatning är exempelvis Emilia Lindqvist, Stockholm blir `namn` = Emilia Lindqvist och `ort`= Stockholm. 

### Mata in tal
För inmatning av typen `int` använder man metoden `nextInt`. Exempelvis: `int i = in.nextInt();`. På samma sätt kan man mata in flyttals med metoden `nextDouble`. 

Det går att kombinera inmatning av tecken, tal och strängar. Ett ord och ett heltal kan anges i en och samma rad. I detta fall hämtas först ordet med `next` och sedan heltalet med `nextInt`, sist rensas bufferten med `nextLine`. 

I vissa länder används , som decimalseparator, och i andra används . som decimalseparator. Med metoden `useLocale` i klassen `Scanner` kan man välja viss formatteringsstil, exempelvis: `in.useLocale (java.util.Locale.US);`.

### Felaktig inmatning
Olika fel kan inträffa vid inmatning av numeriska värden. Betrakta `byte b = in.nextByte();`. Om man anger 12 är det inga problem, eftersom detta får plats i typen `byte`, men om man anger 12000 blir det fel. Metoden hamnar i en undantagssituation, vilket betyder att det skapas ett undantag av typen `java.util.InputMismatchException`. Om inte undantaget fångas och hanteras visas ett felmeddelande eller så avslutas programmet. 

## Operationer med heltal
### Grundläggande operationer med heltal
Det finns 4 grundläggande aritmetiska operationer; `addition`, `subtraktion`, `multiplikation`, `division`.

För addition används +; `int reslutat = 1 + 2;`

För subtraktion används -; `int reslutat2 = 2 - 1;`

För multiplikation används *; `int reslutat3 = 2 * 2;`

För division används /; `int reslutat4 = 5 / 2;`
Notera dock att här blir `resultat4` 3 eftersom den är av datatypen int. 

För modulo används %; `int resultat5 = 5 % 2;`, där resultat5 blir restprodukten av 5 / 2, dvs 0,5 som avrundas till 1. 

Det går även att utföra en aritmetisk operation i en printsats. 
Operatorn - kan även användas som negativt tecken;
```java
int a = 4;
int b = -a; // b = -4
```

### Heltalsuttryck
Alla operationer i java har en viss prioritet. Exempelvis blir detta uttryck 22 och inte 30: `int res = 2 + 4 * 5;`. 
Operationer med samma prioritet har en associativitet från vänster till höger. Det går dock att framtvinga en viss ordning genom exempelvis användning av paranteser: `int b = (12/(3 * 2)) + 4; // blir 6`. 

### Typomvandlingar vid beräkning av ett heltalsuttryck
Vissa operationer utför utan typomvandlingar, exempelvis: 
```java
int p1 = 10;
int p2 = 20;
int res = p1 + p2; // 32 bitars aritmetik

long q1 = 10L;
long q2 = 20L;
long res2 = q1 + q2; // 64 bitars aritmetik 
```
I vissa fall kan man addera olika datatyper, om resultatet sparas i en större datatyp;
`long res3 = p1 + q1; // 64 bitars aritmetik`

Men då operanderan sparas som int behöver man urföra typomvanlingar då man har resultat av en mindre datatyp: 
```java
short s1 = 10;
short s2 = 20;
short res4 = (short) (s1 + s2); // 32 bitars aritmetik
```
Operationer med tecken funkar på följande vis:
```java
char ch1 = 'A'; // ch1 = 65, dvs koden för A
char ch2 = ch1 + 1; // blir kompileringsfel, resultatet är int
char ch3 (char) (ch1 + 1); // ch3 blir B, dvs 66
```

### Fel vid heltalsberäkningar
När man räknar med heltal kan man få felaktiga resultat utan att man märker det. Ta exempelivs följande exempel:
```java
int i1 = 2000000000;
int i2 = 2000000000;
int i = (i1 + i2)/4;
```
I detta fall blir `i` ett stort negativt tal, efterom additionen mellan i1 och i2 hamnar utanför gränsen för datatypen int. 
Ytterligare fel kan uppstå om man delar med 0, trots att kompilatorn inte upptäcker detta fel. 

### Operationer med flyttal
Till skillnad från heltal så tappar man inte decimaltalen vid operationer av flyttal. Exempel `double res = 6.5 & 2.5; // res blir 1.5`

### Typomvandlingar vdi beräkning av ett flyttalsuttryck 
Tag följande exempel. 
```java
long l = 20L;
float f = 2.5F;
double d =  0.45;
double res1 = d + 0.25; // utan typomvandlingar
double res 2 f + d; // f omvandlas till double
float res3 = l + f; // l omvandlas till float
```
### Fel vid flyttalsberäkningar
Noggrannhet vid flyttalsberäkninhgar kan illustreras med följande exempel:
```java
float f1 = 22222222F;
float f2 = 1F;
float f = f1 + f2; // f blir 2.2222224E7
double d1 = 22222222;
double d2 = 1;
double d = d1 + d2; // d blir 2.2222223E7
float res1 = 4.0F / 3; // res1 blir 1.333334
double res 2 = 4.0 / 3; // res2 blir 1.3333333333333
```
Man får större noggranhet vid double värden.

### Gränsöverskridning vid flyttalsoperationer
När ett resultat översrkrider gränserna för en flyttalstyp, produceras ett resultat av typen `infinity` eller `-infinity`. De flesta operationer man råkar göra med `infinity` blir bara infinity återigen. Division med 0 kan producera ett sådant resultat. 

## Operationer på en variabel
### Olika operationer på en variabel
Så här kan man inkrementera eller dekrementera  en variabel:
```java
int a = a + 2;
// eller
int a += 2;

int b = b - 2;
// eller
int b -= 2;
```
På samma sätt kan man göra med multiplikation, division och modulo:
```java
int a *= 2; // öka variabeln 2 gånger
int b /= 2; // minska variabeln 2 gånger
int c %= 2; // Beräkna resten av divisionen och lagra den i c
```
### Öka eller minska variabel med 1
På liknande sätt som tidigare exempel kan man öka eller minska en variabel med 1. 
```java
a--; // minskar
a++; //ökar
// eller
--a;
++a;
```
Betrakta följande exempel som illustrerar vad som händer vid de olika sätten att skriva inkrementering:
```java
int i = 4;
int j = i++; // j = 4, i = 5
// till skillnad från
int i = 4;
int j = ++i; // j = 5, i = 5
```
## Jämförelse av primitiva värden
### Jämförelse av numeriska värden
Man kan utföra olikheter på följande vis:
   
    < mindre än
    > större än
    == lika med
    >= större än eller likamed
    <= mindre än eller likamed
    != inte lika med
Exempelvis: `boolean b1 = p == 0;`

### Jämförelser av booleska värden
Betrakta:
```java
boolean b1 = true;
boolean b2 = false;
boolean b3 = b1 == true; // true
boolean b4 = b1 == b2; // false
```
## Logiska operationer
### Logiskt OCH
Det finns flera operationer som appliceras i samband med ett eller två booleska värden. Sådana kan vara `AND`, `OR`, `XOR`, `NOT`. Betrakta följande:
```java
boolean b1 = m > 5;
booelan b2 = m < 12;
boolean b3 = b1 & b2;
```
om både b1 och b2 är true, så är b3 true. I alla andra fall är b3 false.
Om man använder && istället utvärderas bara första termen, och sedan om första  termen är true utvärderas/ändras andra termen.

### Logiskt ELLER
Betrakta:
```java
boolean b1 = m > 5;
booelan b2 = n > 0;
boolean b3 = b1 | b2;
```
Variablen b3 är true om antingen b1 eller b2 är true. 
Om man använder || istället utvärderas bara första termen, om första termen är true utvärderas/ändras *inte* den andra termen eftersom det är onödigt då hela uttrycket redan är true.

### Logiskt EXKLUSIVT ELLER
Inträffar när exakt en av operationerna är true:
```java
boolean b1 = m > 5;
booelan b2 = n > 0;
boolean b3 = b1 ^ b2;
```

### Logiskt ICKE
Man gör så här:
```java
boolean b1 = m > 5;
booelan b2 = !b1;
```
### Operationera &=, |=, ^=
Logiska operationer kan kombineras med tilldelningsoperatorn = så här:
```java
b1 &= b2 // Är samma sak som b1 = b1 & b2
```
# **Föreläsning 4**
## Kapitel 5 Innehåll

    LOGIK:
    Införa logik i ett program
    
    Villkorliga handlingar
        Om-logik
        Om-annars-logik
        Om-annars om-logik
        Villkorsoperationer
        Val mellan olika alternativ

    Uppepningar 
        Upprepa sp länge som villkoren gäller
        Upprepa ett bestämt antal gånger
        Ett annat sätt att implementera upprepningar
        En loop i en loop
        Avbryt en loop inifrån
        Förkorta ett varv genom loopen

## Införa logik i ett program
Man kan indöra logik i sina program genom att exempelvis använda olika booleska värden, heltalsvärden, och teckensekvenser som styr exekveringen genom programmets satser

## Villkorliga handlingar
### Om-logik
Man kan bygga in logik i programmen genom att binda ett villkor till en eller grupp satser med nyckelordet `if`. Exempelvis:
```java
java.util.Scanner in = new java.util.Scanner (System.in);
int i = in.nextInt();
boolean b = i > 0;
if (b)
    System.out.println("talet ar positivt\n");
```

## Om-annars-logik
På samma sätt kan man definera villkor för när en if sats inte tas. Då kan man göra såhär:
```java
      java.util.Scanner in = new java.util.Scanner (System.in);
      System.out.println("Ange ett tal.\n");
      int i = in.nextInt();
      boolean b = i > 0;
      if (b)
         System.out.println("talet ar positivt\n");
      else
         System.out.println("talet ar inte positivt\n");
```
### Om-annars om-logik
Om man utvecklar ytterligare kan man definera flertal satser på följande sätt:
```java
      java.util.Scanner in = new java.util.Scanner (System.in);
      System.out.println("Ange ett tal.\n");
      int i = in.nextInt();
      if (i==1)
         System.out.println("talet ar 1\n");
      else if (i==2)
         System.out.println("talet ar 2\n");
      else if (i==3)
         System.out.println("talet ar 3\n");
      else
         System.out.println("talet ar inte 1, 2, eller 3");
```

### Villkorsoperatorn
En `if-else` sats kan användas för att välja ett av två givna värden. Man kan till exempel bestämma det större av två givna heltal på följande vis:
```java
int max = 0;
if (m > n)
    max = m;
else
    max = n;
```
Detta går att göra på ett kortare sätt:
```
int max = (m > n)? m : n;
```
Här anges villkorsoperatorn med två tecken: `?` och `:`. Med dessa tecken bildas 3 platser där man placerar operanderna; den första operanden är där man placerar villkoret `m > n` som utvärderas som ett booleskt värde, den andra operanden är `m`, och den tredje operanden är `n`. Om villkoret är true så antar `max` värdet `m`, om inte så antar `max` värdet `n`.

Villkorsoperatorn kan även användas i utrskriftssatser:
`System.out.println ((m % 2 == 0)? "jämt" : "udda");`

### Val mellan olika alternativ
För att implementera val mellan olika alternativ kan man använda en `switch`-konstruktion, exempelvis så här:
```java
java.util.Scanner in = new java.util.Scanner (System.in);
System.out.println("Ange ett tal.\n");
int val = in.nextInt();
switch (val){
    case 1:
        System.out.println ("talet 1");
        break;
    case 2:
        System.out.println ("talet 2");
        break;
    case 3:
        System.out.println ("talet 3");
        break;
    default:
        System.out.println("inte 1, 2, eller 3");
        break;
}
```
Det finns några begränsningar i `switch`-konstruktioner. Växelvariabeln får bara vara någon av följande datatyper: `byte`, `short`, `int`, `string`, eller `char`.

Denna konstruktion skiljer sig från exempelvis en `if-else` konstruktion genom att den tar flera typer av värden för att styra programmets handling, istället för att bara ta ett booleskt värde. Således kan en sån här konstruktion vara bra för att bygga exempelvis menyer. 

## Upprepningar
### Upprepa så länge ett villkor gäller
Det går att åstadkomma att en eller en grupp satser utförs så länge ett givet villkor är sant med nyckelordet `while`. Så här kan man göra:
```java
java.util.Scanner in = new java.util.Scanner (System.in);
System.out.println("Ange ett tal.\n");
int tal = in.nextInt();
while (tal > 0){
    System.out.println("Det inmatade talet: " + tal);
    System.out.println("\nAnge ett tal.\n");
    tal = in.nextInt();
}
```
Man kan även skapa en oändlig loop genom att man sätter villkoret såhär: `while (true)`. 

### En loop med utgångsvillkor
För att implementera en loop med utgångskontroll används i java en `do-while` konstruktion. Så här kan man göra:
```java
int tal = 0;
do
{
    System.out.println("Ett heltal: \n");
    tal = in.nextInt:
    System.out.println("det intmatade talet: \n" + tal);
}
while (tal > 0);
```
### Upprepa ett bestämt antal gånger
En loop som utförs exakt 10 gånger kan implementeras så här:
```java
int i = 0;
while (i < 10){
    System.out.println( i + " ");
    i++;
}
```
### Ett annat sätt att implementera upprepningar
En `for`-loop som utförs exakt 10 gånger kan implementeras så här:
```java
for (int i = 0; i < 10; i++);
    System.out.println ("kärlek, kärlek, överallt.");
```
Om ett konkret vilkor inte är givet är det underförstått att villkoret är true. På detta vis får man en oändlig loop:
```java
int tal = 5;
for( ; ; )
    System.out.println("Heltalet är: " + tal);
```

### En loop i en loop
Det går att ha en loop innuti en annan loop. I varje enskilt fall genom den yttre loopen körs då den inre loopen, exempelvis så här:
```java
for (int i = 1; i <= 4; i++)
{
    for (int j = 1; j <= 5; i++)
        System.out.println(j + " ");
    
    System.out.println();
}
```
### Avbryta en loop inifrån
En loop utförs så länge villkoret i den gäller. Om man vill avbryta en lop inifrån kan man då skriva så här:
```java
int tal = 0;
for (int i = 1, i <= 10; i++)
{
    tal = in.nextInt();
    if (tal == -1)
        break;

    System.out.println("Heltalet är: " + tal);
}
```
Loopen avbryts på den plats där `break` exekveras.

### Förkorta ett varv genom loopen
Man kan hoppa över vissa delar av en loop genom att använda `continue` i en loop.
Betrakta följande: 
```java
for (int i = 1; i <= 6; i++)
{
    System.out.println("\nHeltalet: " + i);
    if (i !=3 && i !=6)
        continue;

    System.out.println("-------------");
}
```
I detta fall får man följande utskrift:

    heltalet: 1
    heltalet: 2
    heltalet: 3
    -----------
    heltalet: 4
    heltalet: 5
    heltalet: 6
    -----------

Om man har en loop i en annan loop kan man antingen hoppa över resten av den inre loopen eller resten av den yttre loopen beroende på placering av `continue`. 




# **Föreläsning 5**
## kapitel 6 Innehåll
    Vektorer
        En variabel med index
        Hantera vektorer
    Flerdimensionella vektorer
        Tvådimensionella vektorer
        Tredimensionella vektorer

## Vektorer
### En variabel med index
Ett stort antal uppgifter kräver införande och hantering av ett stort antal variabler. Ett sätt att representera antal i ett program skulle kunna vara att skapa en variabel för varje antal: 
```java
int antal1 = 0;
int antal2 = 0;
int antal3 = 0;
int antal4 = 0;
int antal5 = 0;
int antal6 = 0;
int antal7 = 0;
int antal8 = 0;

//...

double kostnad = antal1 + pris1
antal2+pris2
antal3+pris3
antal4+pris4
antal5+pris5
antal6+pris6
antal7+pris7
antal8+pris8;

```
etc. men detta är omständigt. 

Istället kan en vektor `int[] antal = new int[8];` införas. På detta vis skapas på en gång 10 olika variabler av typen int från och med index 0, dvs första elementet ligger på antal[0] och sista ligger på antal[9]. 

Ett sätt man hantera alla variabler/initiera alla element är genom en loop:
```java
for (int i = 1; i <= 8; i++)
    antal[i] = in.nextInt();
```
## Hantera vektorer
### Skapa och använda en vektor
Man kan skapa en vektor av en godtycklig datatyp. Så här skapas exempelvis en vektor med heltal av typen int: `int[] v = new int[4];`

Med operatorn new allokeras en plats i datorns minne för 4 heltal av typen int. Alla element i vektorn initieras till 0. För att komma åt den reserverade platsen skapar man en referens med namnet v som är av typen int[]. 

Man kan även skapa och initiera en vektor direkt: 

`double[] d = {1.5, 2.0, 2.5};`

### En vektors längd
Längden på en vektor faställs när den skapas, efter detta går längden inte att ändra. Längden går att fastställas under programmets gång exempelvis så här: 
```java
java.util.Scanner = in.new java.util.Scanner (System.in);
int n = in.nextInt();
int[] v = new int[n];
for (int i = 0; i < n; i++)
    v[i] = i;
```
Längden n matas in och därefter skapas en heltalsvektor med denna längd. Sedan bestäms värden  för vektorns element. 

Längden av en vektor som refereras av referensen `v` kan fås genom denna sats: `int langd = v.length;`.
Detta sättet kan användas för att ta reda på vektorns längd vid utmatning:
```java
for (int i = 0; i < v.length; i++)
    System.out.println (v[i] + " ");
```
Det är bättre att göra på detta sätt än att låsa vektorns längd. Eftersom en vektor börjar på index 0 så är det största indexet i en vektor `v.length - 1`. 

Om man använder ett index utanför en vektors längd kan man få ett undantag av typen `java.lang.ArrayOutOfBoundsException.`
Det är inte heller möjligt att använda negativa index.

### Vektorer och referenser
För att allokera minne för en vektor använder man operatorn `new`. Man måste även skapa en referens av motsvarande typ och använda den för att referera till den nyallokerade platsen. En referensvariabel innehålöer den refereade vektorns minnesaddress. 

Det är möjligt att skapa en tom referens till en vektor i minnet: `int[] v = null;` På samma sätt kan man skrota en redan existerande vektor, om man skriver om den att innehålla null. 

För att använda flera vektorer samtidigt behövs flera referenser:
```java
int[] v1 = {1, 3, 5, 7, 9};
int[] v2 = {0, 2, 4, 6, 8};
```
Med referenserna v1 och v2 kommer man åt motsvarande vektorer. Det går att låta v1 referera till samma vektor som v2: `v1 = v2;`. Eftersom båda refererar till samma plats kan detta ske: 
```java
v1[2] = 40;
v2[3] = 60;
```
Efter ändringen innehåller den andra vektorn följande element `0 2 40 60 8`.

När man tilldelar en referens till en annan referens kommer den referensen till vilken man tilldelar att referera till samma plats som den tilldelade referensen. Det sker inten kopiering av vektorer. Den refererade vektorns minnesaddress kopieras. 

Om man vill kopiera en vektor måste man kopiera de motsvarande elementen, exempelvis så här:
```java
int [] u = new int[v2.length];
for (int i = 0; i < v.lentgh; i++)
    u[i] = v2[i];
```
## Flerdimensionella vektorer
### Tvådimensionella vektorer
Med en endimensionell vektor kan man representera en rad bestående av flera element av samma datatyp. Med en tvådimensionell vektor kan man representera en tabell, med flera element i flera rader.
```java
int [][] v = new int[2][4];
v[0][0] = 1;
v[0][1] = 3;
v[0][2] = 5;
v[0][3] = 7;
v[1][0] = 2;
v[2][0] = 4;
v[3][0] = 6;
v[4][0] = 8;
```
Här skapas följande array:

    1 3 5 7
    2 4 6 8

Det finns andra sätt att skapa tvådimensionella vektorer, exempelvis så här:
`int[][] v = {{1, 3, 5, 7}, {2, 4, 6, 8}};`

För att mata ut en tvådimensionell vektor kan man använda en loop i en annan loop:
```java
for(int i = 0; i < 2; i++)
{
    for(int j = 0; j < 3; j++)
        System.out.println (v[i][j] + " ");
    System.out.println();
}
```
### Längder i en tvådimensionell vektor
I java implementeras en tvådimensionell vektor som en vektor bestående av flera vektorer. 

# **Föreläsning 6**
## Kapitel 7 Innehåll
**METODER**
    
    Skapa och använda metoder
        En metod
        En metods parametrar
        En metods returvärde
        Olika varianter av anrop och retursatser

    Hantera metoder
        Anropa en metod som anropar en annan metod
        Överlagring av metoder
        En metods variabler
        Globala variabler
        En metod som anropar sig själv

    Överföring av vektorer mellan olika metoder
        En vektor som parameter i en metod
        En vektor som en metods reutrvärde
        Metoder som kan anropas med olika antal argument

## Skapa och använda metoder
### En metod
Ett stycke kod jan organiseras i en oberoende namngiven enhet, s.k. metod. Metoden kan sedan användas på flera ställen i programmet. Ett metodnamn i Java inleds oftast med en liten bokstav. Betrakta följande exempel:
```java
// EnMetod.Java
class EnMetod
{
    public static void main(String{} args)
    {
        System.out.println("Pythagoras");
        understryk();
        System.out.println("Grekland");
        System.out.println("matematiker och filosof");
        System.out.println();

        System.out.println("Sokrates");
        understryk();
        System.out.println("Grekland");
        System.out.println("filosof");
        System.out.println();
    }

    public static void understryk()
    {
        System.out.println("-------------------");
    }
}
```
### En metods parametrar
Ett program kan bestå av flera olika metoder. En metod ska kunna ta emot vissa uppgifter och returnera andra uppgifter. 

Ta exempelvis metoden `understryk`. Det kan finnas behov att anropa den metoden med olika längd på understrykningslinjen. Då kan man exempelvis göra på följande sätt:
```java
public static void understryk(int antal)
{
    for(int i = 0; int i < antal; i++)
    {
        System.out.println("-");
    }
    System.out.println();
}
```
Vill man ha en understrykningslinje med 10 `-` tecken så anropas helt enkelt understryk så här: `understryk(10);`. 

Mer avancerat kan man skapa en metod med flera parametrar, exempelvis en understrykningsmetod som kan bestämma vad för tecken som används. Exemepelvis så här:
```java
public static void understryk(char tecken, int antal)
{
    for(int i = 0; int i < antal; i++)
    {
        System.out.println("tecken");
    }
    System.out.println();
}
```
Om man vill ha en understrykningslinje med `*` av längd 20 anropar man funktionen så här: `understryk('*', 20);`.

En metod kan ha flera parametrar och för varje parameter anger man typ och namn. 

### En metods returvärde
En metod av typen `void` utför en uppgift och returnerar inget värde, istället så kanske något händer så som en print sats. En metod av typen `int` däremot, returnerar ett värde. Så här kan man skapa metoden `max` som bestämmer och returnerar det större av två givna heltal:
```java
public static int max (int tal1, int tal2)
{
    int m = tal1
    if (tal2 > tal1)
        m = tal2;
    
    return m;
}
```
Metoden anger datatypen för det värde som ska returneras, datatypen anges omedelbart före metodens namn. 

För att ta emot ett returnerat värde från en metod behöver man förbereda en variabel av lämplig typ där returvärdet kan lagras, exempelvis så här `int m1 = max(5, 12);`. Eller så kan man använda returvärdet direkt i en sats så här: `System.out.println(max(5, 12));`. 

### Olika varianter av anrop och retursatser
Det går att använda följande som argument:

    Variabler:
        int p = 10;
        int q = 5;
        int m = max(p, q);
    
    Uttryck:
        int m = max(3 * p, 4 * q);
    
    metodanrop:
        int m = max(5, max(3, 6));

Det går även att ha följande retursatser:
    
    Uttryck: 
        return (tal2 > tal1)? tal2:tal1;

    Flera satser
        if (tal2 > tal1)
            return tal2;
        
        return tal1

De satser som kommer efter den första retursatsen exekveras aldrig, metoden avslutas istället. 

## Hantera metoder
### Anropa en metod som anropar en annan metod
Metoder kan utbyta information med varandra, på så sätt kan man bilda en kedja av metodanrop. Betrakta exempelvis metoden som bestämmer det största värdet av tre givna heltal.
```java
public static int storsta(int tal1, int tal2, int tal3)
{
    int m1 = max(tal1, tal2);
    int m2 = max(m1, tal3);

    return m2;
}
```
### Överlagring av metoder
Man kan ha flera metoder med samma namn i en och samma klass så länge deras signatur skiljer sig. En metods signatur består av metodens typ, namn, och argument, exempelvis:
```
int max (int tal1, int tal2);
int max (int tal1, int tal2, int tal3);
double max (double d1, double d2);
```
Vid det första anropet letar Java efter en metod med två paramterar, vid det andra anropet letar Java efter en metod med tre parametrar, vid det tredje anropet letar Java efter metoden max med två paramtrar och typen double.

När man anger två short värden som argument letar Java efter metoden max som är av typen int. Om man istället anger två float värden som argument kommer Java leta upp metoden max som tar double. 

### En metods variabler
De variabler man skapar i en metod är inte tillgängliga utanför metodens kropp, dessa variabler kallas för lokala. En metods parameter variabler är också lokala. Dessa två typer av metodvariabler initieras olika. 

En konsekvens av detta är att det inte går att ändra en variabel från en metod i en annan metod. 

### Globala variabler
Om en variabel i en klass deklareras utanför metoder så blir variabeln global och på så sätt tillgänglig för alla klassens metoder. Om variabeln ändras från någon av klassens metoder blir ändringen synlig för alla andra metoder. För en variabel som inte ska ändras kan man deklarera den som en global konstant genom att skriva `static final` före dess datatyp. 

### En metod som anropar sig själv
Så här kan man skriva en metod som skriver ut oändligt många linjer:
```java
public static void linjer()
{
    System.out.println("----------------");
    linjer();
}
```
Det går även att skriva en metod som anropar sig själv ett visst antal gånger. Exempelvis så här:
```java
public static void linjer(int n)
{
    if (n < 1)
        return; 
    System.out.println("----------------");
    linjer(n-1);
}
```
Denna strategi att dela upp arbetet i mindre delar av samma typ kallas för rekursion. Användning av rekursion medger flera anrop av sig själv, som tar mer tid och mer resurser. Därför bör man inte använda rekursion om det inte behövs. 

## Överföring av vektorer mellan olika metoder
### En vektor som parameter i en metod
En vektor skapas med operatorn new och hanteras via motsvarande referens.
```java
char[] v = new char[5];
v[0] = 'a';
v[1] = 'b';
v[2] = 'c';
v[3] = 'd';
v[4] = 'e';
```
Skriver man ut `v` som den är får man utskriften `abcde`, men om man vill ändra formen på utskriften, exempelvis `[a b c d e]` kan man skapa en metod. Eftersom vektorer hanteras via dess mostvarande referens skickas egentligen referensen till metoden. Vektorer överförs alltså mellan olika metoder. Så här kan en metod som visar en given teckenvektor se ut:
```java
public static void show(char[] c)
{
    System.out.println("[");
    for(int i = 0; i < c.length - 1; i++)
        System.out.println(c[i] + " ");
    if (c.length > 0)
        System.out.println (c[c.length - 1]);
    System.out.println("]");
}
```
Med anropet `show(v);` fås då utskriften `[a b c d e]`. 

Referensen `c` refererar till den vektor som anges vid anropet av metoden. En metod som har referens till en vektor som parameter får tillgång till orginalvektorn och kan ändra den. Exempelvis:
```java
public static void toUppercase(char[] c)
{
    for(int i = 0; i < c.length; i++)
        if(c[i] > 96 && c[i] < 123)
            c[i] = (char) (c[i] - 32);
}
```
Så här kan ett anrop se ut:
```java
char[] v = {'a', 'b', 'c', '1', '2', '3'}
toUpperCase(v);
```
Efter exekvering innehåller vektorn v följande: `[ABC123]`

### En vektor som en metods returvärde
Metoden toUpperCase ändrar teckenvektorn som skickas till den. Man kan i andra fall vilja ha en ny vektor utifrån den vektor som gavs som parameter, utan att ändra orginalvektorn. Så här kan man då exempelvis göra:
```java
public static char[] toUpperCase(char[] c)
{
    //Skapa en kopia av argumentsvektorn
    char[] c1 = new char{c.length};
    for(int i = 0; i < c.length; i++)
        c1[i] = c[i];

    //Byt ut aööa små bokstäver i den nya vektorn mot stora
    for(int i = 0; i < c1.length; i++)
        if(c1[i] > 96 && c1[i] < 123)
            c1[i] = (char) (c1[i] - 32);
    
    //Returnera en referens till den vektorn som är skapad 
    //i den här metoden
    return c1;
}
```
### Metoder som anropas med flera argument
Om metoden ska ta emot flera heltal av typen `int` så är typen på parametern `int ...`. Exempelvis: 
```java
public static void show(int ... tal)
{
    for(int i = 0; i < tal.length; i++)
       System.out.print (tal[i] + " ");
    System.out.println();
}
```
Då kan metoden anropas på följande vis:
```java
int n1 = 3;
int n2 = 4;
int n3 = 5;

show(n1);
show(n1, n2);
show(n1, n2, n3);
```
Vid anrop av metoden `show` skapas automatiskt en vektor med längden av antalet argument som metoden anropas med. 

# **Föreläsning 7**
## Kapitel 8 Innehåll
    Distribuerad kod
        Ett bibiliotek av klasser
        Paket
    
    Javas standardbibliotek
        Javas standardklasser
        Klassen Math
        Klassen String
        Klasser som representerar primitiva datatyper
        Klassen System
        Klassen Arrays

    En metods undantag
        Undantagssituationer i en metod
        Skapa, kasta, och deklarera undantag

## Distribuerad kod
### Ett bibliotek av klasser
Ett program kan organiseras som en samling metoder och globala konstanter i en och samma klass. När programmet exekveras anropas metoden main automatiskt, och via den metoden når man andra metoder. 

Vissa metoder och konstanter förekommer i många olika program, exempelvis metoden `max`, som bestämmer det större av två givna heltal. Ett sätt att återanvända en metod eller konstant är att kopiera metoden eller konstanten till varje program. Ett mycket bättre sätt är att lagra metoderna och konstanterna så att de blir tillgängliga för de program där de behövs. 

Ett sätt att organisera metoder är att deklarera de som `public static` och placera de i en särskild klass. Genom att deklarera en metod eller en konstant som `public` gör man den tillgänglig för andra klasser. De metoder som och konstanter som deklareras `static` utgör s.k. klassmetoder och klasskonstanter. Man kan använda en sådan metod genom att ange klassens namn, följt av ., avslutat med metodens eller konstantens namn, exempelvis: 
```java
public class Matte
{
    public static final double PI = 3.14;
    public static final double E = 2.71;

    public static double max(double tal1, double tal2)
    {
        return (tal2 > tal1)? tal2:tal1;
    }

    public static double min(double tal1, double tal2)
    {
        return (tal2 < tal1)? tal2:tal1;
    }
} 
```
Från denna klass skulle man exempelvis kunna behöva konstanten för Pi och metoden max, då görs anropen så här:
```java
class AnvandMetoderKonstanterFranEnKlass
{
    public static void main (String[] args)
    {
        double i1 = 5;
        double i2 = 12;

        double max = Matte.max(i1, i2);

        double r = 10;
        double area = r * r * Mat.PI;
    }
}
```
### Paket
Så småning om kanske man har skapat ett stort antal användbara klasser. När man exempelvis letar efter en bok är det lätt att hitta en viss bok eftersom böcker med liknande innehåll är placerade på en och samma plats. Klasser bör organiseras på samma sätt. En bestämd del av ett klassbibliotek kallas i Java för paket. 

Vi kan använda paket vi sjävla skapat, samt paket andra skapat. Exempelvis;

    Klasser som används för inmatning och utmatning finns i ett paket som heter Java.io. 

    Klasser som används mest finns i Java.lang

    I paketet Java.util finns klasser gällande vektorer, strängar, tid, datum. 

    Och vidare finns fler paket som Java.awt, Java.awt.event, Javax.swing etc.

Man kan exempelvis lagra ett pakets klasser i en katalog som heter detsamma som paketet. Om man vill skapa ett paket med namnet `fjava.edu`, skapar man först en katalog som heter `fjava`, och sedan underkatalogen `edu` i fjava. Sedan lagrar man alla klasser som tillhör detta paket i underkatalogen edu.

Katalogen `fjava\edu` måste placeras på en plats som Java söker igenom, alltså kataloger som är angivna i miljövariabeln CLASSPATH. Vill man placera katalogen fjava\edu i katalogen c:\JavaArkiv måste man lägga till c:\JavaArkiv i CLASSPATH. Använder man operativsystemet windows kan denna miljövariabel se ut så här: `CLASSPATH=.;c:\programmering\Java;c:\JavaArkiv`

I Windows anges miljövariabeln CLASSPATH vanligtvis av en ruta som går att hitta via Kontrollpanelen, System, Avancerat, Miljövariabler. Använder man JDK behöver man inte ändra miljövariabeln CLASSPATH på den dator som används för att skapa ett eget bibliotek, istället placeras de i JDK strukturen. 

Ett annat sätt att organisera paketen är att lägga alla klasser i ett paket i en `.jar` fil, som är en fil som innehåller flera andra filer i komprimerad form. Man placerar denna fil i katalogen `ext`, som är en underkatalog till katalogen `lib`. `lib` finns i katalogen `jre` som finnd i JDK-katalogen. 

Ett sätt att leda Java till en bestämd klass är att använda in importsats i början av filen på följande sätt: 
```java
import fjava.edu.*;

class EnKlientKlass
{
    //kod som använder klasser i paketet fjava.edu
}
```
Om man vet att man bara använder en klass i ett paket kan man precisera importsatsen så här:
```java
import fjava.edu.Matte;

class EnKlientKlass
{
    //kod som använder metoder i klassen Matte
}
```
## Javas standardbibliotek
### Javas standardklasser
Javas standardbibliotek innehåller ett start antal användbara klasser. Det finns en beskrivning av dessa klasser på webben s.k. API (Application Programming Interface)

### Klassen Math
I klassen math defineras ett antal olika metoder och konstanter som används vid olika matematiska beräkningar, så som Pi, E, rötter, potenser, logaritmer, trigonometriska funktioner. Klassen Math finns i paketet `java.lang`. 

Du kan hitta följande metoder och konstanter här:
```java
Math.PI // Pi
Math.E // E

Math.abs(i) //absolutbeloppet
Math.round(i) //rundning
    Math.ceil(i) //rundning upp
    Math.floor(i) //rundning ner

Math.max(i1, i2) //maxvärde
Math.min(i1, i2) //minvärde

Math.sqrt(i) //kvadratroten
Math.pow(i1, i2) //upphöjt till
Math.exp(i) //returnerar en potens av talet e
Math.log(i) //logaritm

// Trigonometriska funktioner
Math.sin
Math.cos
Math.toRadians
Math.toDegrees

Math.random //Pseudoslumptal
```
Om man väldigt ofta använder en metod eller en klass från ett paket kan man importera deras statiska medlemmar för att slippa skriva ut helheten, så här:
```java
import static java.lang.Math.*;

class KortNamn
{
    public static void main (String[] args)
    {
        double omkrets = 2 * 5 * PI;
        double d = max(omkrets, 30);
    }
}
```
### Klassen String
Klassen String i paketet java.lang hanterar teckensträngar. Här finns metoden `ValueOf` som används för att omvandla värden av olika datatyper till motsvarande teckensträngar. 

### Klasser som representerar primitiva datatyper
För varje primitiv datatyp finns en klass implementerad i java.lang. Följande klasser representerar de primitiva datatyperna: `Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Character`, `Boolean`.

Metoden `toString` utför samma arbete som `valueOf`. Den kan användas så här:
```java
int i = 123;
String s = Integer.toString(i); //s blir 123
```
Metoden `parseInt` kan användas så här:
```java
String s = "123";
int i = Integer.parseInt (s); // i blir 123
```
Det finns även följande metoder:
```java
byte b1 = Byte.MIN_VALUE; //-128
byte b2 = Byte.MAX_VALUE; //127

char c = 'A';
boolean letter = Character.isLetter(c); //true
boolean letter1 = Character.isLowerCase(c); //false
boolean letter2 = Character.isUpperCase(c); //true
boolean letter3 = Character.isDigit(c); //false
boolean letter4 = Character.isLetterOrDigit(c); //true
boolean letter5 = Character.isWhitespace(c); //false

char c1 = Character.toLowercase (c1); //a
char c2 = Character.toUppercase (c1); //A
```
### Klassen System
System tillhör också paketet java.lang. Metoderna här hanterar exekvering av en en applikation och olika egenskaper hos det system där applikationen exekveras. 
Exempelvis:
```java
System.exit(0); //applikationen avslutas
long t = System.currentTimeMillis(); //hämtar millisekunder

public static void arraycopy(Object source, int srcindex, Object dest, in destindex, int size)
System.arraycopy(v1, 2, v2, 1, 3); //Kopeierar en del av en vektor till en annan vektor
```

### Klassen Arrays
Klassen arrays finns i paketet java.util och innehåller flera metoder som hanterar vektorer, såsom `equals`, `sort`, `binarySearch`, `fill`. 

## En metods undantag
### Undantagssituationer i en metod
Någonting kan inträffa i en metod som förhindrar vidare exekvering. 
### Skapa, kasta, och deklarera undantag
Så här inför man ett undantag av typen NullPointerException i metoden arraycopy:
```java
public static void arraycopy(char[] src, int srcIndex, 
                            char[] dest, int destIndex, 
                            int size) 
                            throws NullPointerException
{
    if (src == null || dest == null)
    throw new NullPointerException("vektorn finns inte");
    int j = 0;
    for (int i = srcIndex; i < srcIndex + size; i++)
        dest[destIndex + j++] = src[i];
}
```
Metoden arraycopy kan kasta undantag av typerna NullPointerException och ArrayIndexOutOfBoundsException. 

# **Föreläsning 8
## Kapitel 9 Innehåll
    Ett problem och en algoritm
        En algoritm och dess beskrivning
    
    Urvalsalgoritmer
        Urskiljningsalgoritmen
        Uppdateringsalgoritmen
    
    Sorteringsalgoritmer
        Sortera en sekvens
        Urvalssortering
        Insättningssortering
    
    Sökningsalgoritmer
        Hitta ett element
        Sekventiell sökning
        Binär sökning

## Ett problem och en algoritm
### En algoritm och dess beskrivning
Olika problem kan lösas med datorns hjälp. När ett problem ska lösas skapas ett program som körs på en dator. Ett program har bara den intelligens man ger den. En specifikation över de steg som måste över de steg som måste utföras ska först förberedas, detta är en s.k. `algoritm`. Så här kan man formulera en algoritm som ska kunna hitta det kortaste avståndet mellan destinationer:
1. För varje *i* mellan 1 och *n*, beräkna avståndet *d* mellan stationerna och destinationen genom mellanstationen *i*, enligt formeln *d = a + b*. 
2. Initiera den aktuella mellanstationen *s* till *1*, och det kortaste avståndet *min* till *d*. 
3. För varje *i* mellan 2 och *n*, om *d* < *min* sätt *min* till *d* och *s* till *i*. 
4. Vägen genom mellanstationen *s* är den kortaste vägen från startstationen till destinationen. 

Sedan kan man bygga upp en pseudokod utifrån algoritmbeskrivningen:
```
//PSEUDOKOD
mellanstation(n, a[], b[])
{
    //avstånd via mellanstationerna
    for i = 1 to n
        d[i] = a[i] + b[i]

    //det minsta avståndet och motsvarande mellanstation
    min = d[1]  //aktuella minsta avståndet
    s = 1       //motsvarande mellanstation
    for i = 2 to n
        if d[i] < min
        {
            min = d[i]
            s = i
        }
    return s
}
```
Och vidare slutför man koden på exempelvis detta sätt:
```java
public static int mellanstation (int[] a, int[] b)
{
    //avstånd via mellanstationerna
    int n = a.length
    int[] d = new int[n]
    for(i = 1; i < n, i++)
        d[i] = a[i] + b[i];
    
    //det minsta avståndet och mostvarande mellanstation
    for(int i = 1; i < n; i++)
        if(d[i] < min)
        {
            min = d[i];
            s = i;
        }
    return s;
}
```
## Urvalsalgoritmen
### Urskiljningsalgoritmen
Bestäm exempelvis det minsta talet i följande talsekvens:

    50 45 30 75 90 20 15 25 35 95 80 10 40 85 55 60

Ett program kan jämföra två tal åt gången och välja det mindre av dem. En möjlig strategi är att jämföra element i par, och att varje gång plocka det minsta. Då jämförs först 50 och 45, varpå 45 plockas. Vidare fortsätter sekvensen, efter första genomgång kvarstår dessa:

    45 30 20 15 35 10 40 55

Vid följande sekvenser fås:
 
    30 15 10 40
    15 10
    10

När lovande element urskiljs så elinieras element som inte är lovande. Så småning om får man det sökta elementet.

### Uppdateringsalgoritmen
Betrakta följande talsekvens

    55 25 32 12 40 10 64 16
I en uppdateringsalgoritm går man steg för steg och jämför elementen. Exempelvis, om vi vill hitta det minsta elementet i talsekvensen sätt först 55 som minsta tal. Efter det jämför man 55 och 25, varpå 25 sätts till det minsta talet. Efter det jämförs 25 och 32, varpå 25 sätts till minsta tal. Eventuellt har man gått igenom hela sekvensen och valt det minsta talet. 

En pekare kan användas för att peka på något i en vektor eller sekvens. Genom att använda pekare och operatorer kan man skriva uppdateringsalgoritmen så här:
```java
public static int minstaElement(int[] element)
{
    int forst = 0;
    int sist = element.length - 1
    int minst = forst;

    int aktuell = forst + 1
    while (aktuell <= sist)
    {
        if (element[aktuell] < element[minst])
            minst = aktuell;
        aktuell++;
    }
    return element[minst];
}
```

## Sorteringsalgoritmer
### Sortera en sekvens
Sortering är en vanligt förekommande uppgift i datasammanhang. Det finns olika algoritmer som löser sorteringsproblemet. Här jämförs element med varandra. 

### Urvalssortering
Säg att följande talsekvens ska sorteras i stigande ordning

    55 25 32 12 40 10 64 16

En enkel strategi är att varje element fylls med rätt element, start med första platsen i sekvensen. Eftersom 10 är det minsta elementet så byter 10 plats med 55:

    10 25 32 12 40 55 64 16
 Vidare sker detta:

    10 12 32 25 40 55 64 16
    10 12 16 25 40 55 64 32
    10 12 16 25 32 55 64 40
    10 12 16 25 32 40 64 55
    10 12 16 25 32 40 55 64

Nu har sekvensen sorterats!
Så här kan en implementering av algoritmen se ut:
```java
public static void sortera (int[] element)
{
    int forst = 0;
    int sist = element.length - 1;
    int minst;
    int aktuell;

    while (forst < sist)
    {
        minst = forst
        aktuell = forst + 1
        while (aktuell <= siste)
        {
            if (element[aktuell] < element[minst])
                minst = aktuell;
            aktuell ++
        }
        int p = element[forst];
        element[forst] = element[minst];
        element[minst] = p;

        forst++;
    }
}
```
### Insättningsortering
I urvalssortering är positionerna i fokus. Man fyller position efter position med rätt element. En annan strategi är att sätta elementen i fokus. Här sorteras rätt element som sätts på rätt plats. Det ser ut på följande vis:
     
        1. 55 25 32 12 40 10 64 16
        2. 25 55 32 12 40 10 64 16
        3. 25 32 55 12 40 10 64 16
        4. 12 25 32 55 40 10 64 16
        5. 12 25 32 40 55 10 64 16
        6. 10 12 25 32 40 55 64 16
        7. 10 12 25 32 40 55 64 16
        8. 16 10 12 25 32 40 55 64

Så här kan en implementering av algoritmen se ut:
```java
public static void sortera (int[] element)
{
    int forst = 0;
    int sist = element.length - 1;
    int aktuell = forst + 1;
    int hal;
    int e;

    while (aktuell <= sist)
    {
        e = element[aktuell];
        hal = aktuell;
        while (aktuell <= sist)
        {
            element[hal] = element[hal - 1];
            hal --;
        }
        int p = element[forst];
        element[hal] = e;

        aktuell++;
    }
}
```
## Sökningsalgoritmer
### Hitta element
Det finns två välkända strategier för sökning i en sekvens, sekventiell sökning och binär sökning. Den andra strategin används bara i samband med sorterade sökningar.

### Sekventiell sökning
Betrakta följande sekvens:

    55 25 32 12 40 10 64 16
Säg att talet 40 ska hittas i sekvensen. Det givna talet 40 jämförs först med med det första talet i sekvensen, 55. De är inte likadana, så man går till nästa tal 25. De är inte likadana, vidare kollar man nästa tal 32. De är inte likadana, vidare kollar man nästa tal 12. De är inte likadana, vidare kollar man nästa tal 40. De är likadana! Nu ska platsen för elementet returneras, så det ska gå att komma åt elementet och använda det. 

Sökningen avlsutas på ett annat sätt om istället 50 söks. Man jämför med det givna talet i tur och ordning, men inget av talen i talsekvensen är lika med 50. Det betyder att 50 inte finns i samlingen. 

Man kan implementera algoritmen för sekventiell sökning så här:

```java
public static int sok(int[] element, int e)
{
    int forst = 0;
    int sist = element.length - 1;
    int aktuell = forst;

    while (aktuell <= sist && element[aktuell != e])
        aktuell++;
    if (aktuell > sist)
        aktuell =-1;
    
    return aktuell;
}

```
### Binär sökning
I vissa fall är element i samlingen sorterbara, och kan exempelvis ordnas i stigande ordning. Att jämföra två element i en sådan samling kan betyda mer än bara att undersöka om de är lika eller inte. Om elementen finns i en sekvens, kan denna sekvens sorteras. I så fall behöver man inte undersöka element efter element i tur och ordning, snabbare strategier kan användas. 

Det givna elementet jämförs först med det mittersta elementet. Om dessa två element är likadana avslutas sökningen. Om det givna elementet är större eller mindre än det mittersta elementet fortsätts sökningen på respektive sida av det mittersta elementet. Då kastas den sida av det mittersta elementet som inte innehåller det sökta elementet och en ny sekvens med halva sekvensen erhålls. På så sätt fortsätter sökningen tills elementet hittas. Koden kan exempelvis se ut så här:
```java
public static void sok (int[] element, int e)
{
    int forst = 0;
    int sist = element.length - 1;
    int mitterst = 0;

    while (forst <= sist)
    {
        mitterst = (forst + sist)/2
        if (e == element[mitterst])
            break;
        
        else if (e < element[mitterst])
            sist = mitterst - 1;
        
        else
            forst = mitterst + 1;
    }
    if (!(forst <= sist))
        mitterst = -1
    
    return mitterst;
}
```
# **Föreläsning 9**
## Kapitel 10 Innehåll
    Objekt

    Definera, skapa och använda objekt
        En sammansatt datatyp
        Initiera ett objekt
        Smarta objekt
        Visa objekt
        Gränssnitt mot användaren
        Objekt och referenser
        Vad är ett objekt?

    Objekt som hanterar strängar
        Smarta strängar
        Skapa och använda strängar
        Strängar som kan ändras
        En strängs delar

    Typiska tjänster för ett objekt
        Olika typer av tjänster
        Typiska tjänster i samband med strängar

## Defineraa, skapa, och använda objekt
### En sammansatt datatyp
För att representera data i ett program använder man olika datatyper såssom `int`, `float` etc. Ibland förekommer det att man behöver använda komplicerade objekt som inte går att representeras av endast en variabel av en grundläggande datatyp. Om man exempelvis skapar en applikation som hanterar anställda i en skola så kan en anställd bli en naturlig enhet, ett objekt. För att beskriva en anställd behövs flera uppgifter: namn, personnr, lön, osv. För den anställda hanteras alltså flertal separata variabler. 

Detta kan lösas med att man grupperar flera separata variabler i en enhet, och sedan kan den enheten användas som en variabel. För att göra detta behövs en mall, ett mönster som specifierar vilka delar som går in i enheten. Man behöver också definera en ny datatyp som är sammansatt av flera andra datatyper. 

En ny datatyp defineras på så sätt att man definerar en klass där alla komponenter som ingår i en variabel av denna datatyp specificeras. För att exempelvis definera en punkt som ingår i planet kan man skriva så här:
``` Java
class Punkt
{
    int x; //punktens x-koordinat
    int y; //punktens y-koordinat
}
```
Då kan man använda objektet så här:
``` Java
Punkt p = new Punkt ();
```
här är `p` en referens som refererar till objektet. 

### Initiera ett objekt
När ett objekt skapas initieras alla komponenter automatiskt till 0. Man får åtkomst till en komponent i ett objekt via dess referens så här:
``` Java
p.x = 3;
p.y = 4;
```
Här initeras koordinaten Punkt till (3, 4). 

Definitionsklassen `Punkt`mkan utvidgas så här: 
```Java
class Punkt
{
    int x;
    int y;

    public Punkt (int a, int b)
    {
        x = a;
        y = b;
    }
}
```
Denna konstruktor tar emot två argument och använder dessa för att initera en punkts koordinater, exempelvis så här:
```Java
Punkt p = new Punkt(3, 4);
```
Genom att definera olika konstruktioner i en definitionsklass gör man det möjligt att initiera objekt av klassen på olika sätt.

### Smarta objekt
Man kan definera en sammansatt datatyp och sedan skapa objekt av denna typ. Om man definerar flera konstruktioner i definitionsklassen kan man även initiera de objekt man skapar. Ett objekt innehåller flera komponenter och representerar ett paket data. Det går även att använda ett objekt som en enda variabel. 

Så här kan man definera en metod som beräknar avståndet mellan en given punkt och origo:
```Java
class Punkt
{
    int x;
    int y;

    public Punkt (int a, int b)
    {
        x = a;
        y = b;
    } 

    public static double avstand (Punkt p)
    {
        double d = Math.sqrt (p.x * p.x + p.y * p.y);
        return d;
    }  
}
```
Nu kan metoden avstand användas för godtycklig applikation:
```Java
Punkt p = new Punkt (3,4);
double d  = Punkt.avstand(p);
```

Klassen Punkt kan omvandlas till en klass som definerar smarta punkter. För att göra detta tar man bort ordet `static` i deklarationen av metoden, utelämnar parametrar och använder koordinater x och y istället:
```Java
class Punkt
{
    int x;
    int y;

    public Punkt (int a, int b)
    {
        x = a;
        y = b;
    } 

    public double avstand ()
    {
        double d = Math.sqrt (x * x + y * y);
        return d;
    }  
}
```
Nu anropas avstand så här:
```Java
Punkt p = new Punkt (3,4);
double d  = p.avstand(p);
Punkt p1 = new Punkt (1,2);
double d  = p1.avstand(p);
```
### Visa objekt
print och println kan användas för att visa objekt. 
```Java
Punkt p = new Punkt(3,4);
System.out.println(p);
```
Här returneras en sträng som beskriver objektet via metoden `toString`. 
För att kunna skriva ut ett objekt behöver man definera metoden `toString` i klassen `Punkt`. 
```Java
public String toString()
{
    String s = "(" + x + ", " + y + ")";
    return s;
}
```
När punkten p visas fås följande utskrift: `(3,4)`.
### Gränssnitt mot användaren
Man förbjuder direkt åtkomst åt ett objekts variabler genom att deklarera dessa variabler som `private`. Det innebär att variablerna inte går att använda utanför sin definitionsklass. Konstruktioner och instansmetoder deklareras vanligtvis som `public`. Detta medför att man kan skapa och initiera olika objekt, de medlemmar i en klass som deklareras `public` utgör ett gränssnitt mellan användaren och klassen. Resten av klassen är inte av intresse för användaren. 

### Objekt och referenser
Så här kan man använda referenser:
```Java
Punkt p = new Punkt(3,4);   //reference
p = null;                   //de-reference
```
Om man försöker aktivera en metod via en referens som inte refererar till något får man NullPointerException. 

Det är möjligt att tilldela en referens till en annan referens. 
```Java
Punkt p1 = new Punkt(1,2);
Punkt p2 = new Punkt(3,4);
p2 = p1; //refernskopiering, inte objektkopiering. p2 = (1,2)
```
För att kunna kopiera innehållet i ett objekt till ett annat objekt måste man definera hur objektkopieringen ska genomföras med en kopieringsmetod i objektets definitionsklass. 

### Vad är ett objekt
Först skapar man en klass, somm definierar en ny typ av objekt. Klassens namn är samtidigt namnet på den nya typen. För att skapa enskilda objekt av typen använder man operatorn `new`. 

## Objekt som hanterar strängar
### Smarta strängar
Man behöver inte skapa egna definitionsklasser för att hantera strängar, det finns redan i Javas standarbibliotek. `java.lang.String`, `java.util.Scanner`, `java.lang.StringBuilder`, `java.lang.StringBuffer`. Vanligtvis används klassen `java.lang.String` för att hantera strängar, men vill man ändra en sträng så används builder istället. 

### Skapa och använda strängar
En teckensträng skapas så här:
```Java
String s = new String ("gryningen");
```
För att kunna använda typen `String` måste man ha en referens av den typnen.

När man har skapat en smart sträng och en referns till den kan man använda de tjänster som strängen tillhandahåller. Exempelvis:
```Java
String s = new String ("gryningen");
int len = s.length() //9
char c1 = s.charAt (0) //g, tar position och ger bokstav
char c2 = s.charAt (4) //y
```

Det finns flera konstruktorer i `String`: 
```Java
public String()
public String(char[] chars)
public String(String str)
```
Som används så här:
```Java
String s1 = new String();
char[] tecken = {'s', 'o', 'l', 'e', 'n'};
String s2 = new String(tecken);
String s3 = new String s2;
String s4 = "solen";
String s5 = " i gryningen";
String s6 = s4 + s5; //"solen i gryningen"
```
En sträng av typen `java.lang.String` kan inte ändras, om man vill ha en sträng som ska kunna ändras måste man använda `java.lang.Builder` eller `java.lang.Buffer`.
```Java
StringBuilder sb1 = new StringBuilder(); //kapacitet 16
StringBuilder sb2 = new StrinBuilder(20); //kapacitet 20

String s = new String ("solen");
StringBuilder sb = new StrinBuilder(s); //16 + 5
```
I `sb` lagras även strängen "solen". 

I `StringBuilder` finns följande metoder och följande användningssätt:
```Java
public int capacity()
public int length()
public StringBuilder append(String str)

StringBuilder sb = new StringBuilder ("solen");
int kap = sb.capacity();
int len = sb.length();
sb.append(" och ljuset");
sb.append(" i gryningen.");
String s = sb.toString(); //s = "solen och ljuset i gryningen"
```
### En strängs delar
Bestämma token i en sträng:
```Java
import java.util.*;
//Konstruktorn deklareras så här:
public Scanner (String str)

//Och används så här:
Scanner:
String s = new String("solen i gryningen");
Scanner tokenizer = new Scanner(s);

String token1 = tokenizer.nextToken(); //solen
String token2 = tokenizer.nextToken(); //i
String token3 = tokenizer.nextToken(); //gryningen
```
Till ett objekt av typen Scanner skickas alltså meddelandet "Ge mig nästa token". Objektet returnerar detta token och flyttar sin pekare till slutet av token. För att veta om du nått sista token kan du skicka frågan "finns det ytterligare något token i strängen?" så här:
```Java
Scanner in = new Scanner(System.in);
String s = in.nextLine();
Scanner tokenizer = new Scanner(s);
String token = "";
while(tokenizer.hasNext())
{
    token = tokenizer.next
    System.out.println(token)
}
```
Du kan även använda skiljetecken via `.useDelimiter`. 

## Typiska tjänster för ett objekt
### Olika typer av tjänster
Inspektorer är typer av klasser där man kommer till ett objekt, observerar det från olika håll och noterar en rad olika egenskaper hos objektet, såsom längd eller storlek. En klass förväntas ha ett antal inspektorer. 

En annan typ av instansmetoder är kombinatorer. De tar ett eller flera argument, kombinerar på något sätt det aktuella objektet och argumenten, och producerar ett resultat som returneras till användaren. 

En annan vanlig tjänst är komparatorer, som jämför två objekt av en viss typ, vid dess innehåll, storlek, längd etc. 

### Typiska tjänster i samband med strängar
    length
    charAt
    substring
```Java
int len = s.lenght;
char c = s.charAt(3);
String s1 = s.substring(3);
String s2 = s.substring(3, 6);
```
#### Mutatorer i klassen String
Betrakta även följande metoder:
```Java
StringBuilder s = new StringBuilder("solen");
s.setCharAt(0, 'S');    //Solen
s.append("gången");     //Solengången
s.insert(5, "ned");     //Solennedgången
s.delete(3,5);          //Solnedgången
s.replace(3,6,"upp");   //Soluppgången
```
#### Kombinatorer i klassen String
```Java
String s1 = new String("solen");
String s2 = new String("i gryningen");
String s = s1.concat(s2);           //solen i gryningen
String nys = s.replace('n', 'N');   //soleN i gryNiNgeN
int index1 = s.indexOf('n');        // 4
int index2 = s.lastIndexOf('n');    // 16
int index3 = s.indexOf('n', 5);     // 11
int index4 = s.lastIndexOf('n', 5); // 4
int index5 = s.indexOf('en');       // 3
int index6 = s.lastIndexOf('en');   // 15
int index7 = s.indexOf('m');        // -1
```
#### Komparatorer i klassen String
```Java
String s1 = new String("solen");        
String s2 = new String("solen");
String s3 = new String("Solen");
boolean b1 = s1.equals(s2);             //true
boolean b2 = s1.equals(s3);             //false
boolean b3 = s1.equalsIgnoreCase(s3);   //true
int i1 = s1.compareTo("gryningen");     //12
int i2 = s3.compareTo(s1);              //-32
int i3 = s3.compareToIgnoreCase(s1);    //0
```
#### Predikater i klassen string
```Java
String s1 = new String("solen i gryningen");
boolean b1 = s1.startsWith("sol");          //true
boolean b2 = s1.startsWith("Solen");        //false
boolean b3 = s1.endsWith("gryningen");      //true  
```
#### transformatorer i klassen String
```Java
String s = new String("     Solen");
String s1 = s.trim();                   //Solen
String s2 = s1.toUpperCase();           //SOLEN
String s3 = s1.toLowerCase();           //solen
```
# **Föreläsning 10**
## Kapitel 9 Innehåll
    En alogritms komplexitet
        En komplexitetsfunktion
        Kategorier av komplexitetsfunktioner
        Uppskatta ordningen för en komplexitetsfunktion
    
    En algoritms riktighet
        Specificera en algoritm
        Granska en algoritm
        Bevisa en algoritm

## En algoritms komplexitet
### En komplexitetsfunktion
Storleken på en algoritms indata kan betecknas med *n*. Komplexitetsfunktionen kan betecknas med *t*, *w*, *a*, *m*, eller *b*, beroende på vad den representerar. På så sätt har man komplexitetsfunktionen, ex *w(n)*. 

### Kategorier av komplexitetsfunktioner
Det kan hända att komplexiteten av någon algoritm kan anges genom följande komplexitetsfunktion:
$$f(n) = 2n^2 + 20n + 100$$
$$g(n) = 0,1n^2 + 100$$
$$h(n) = 10n^2 + 20$$
$$f1(n) = n^2 + 5n + 10$$
$$f2(n) = 10n^2 + 2n + 5$$

Alla dessa komplexitets funktioner har en gemensam egenskap, termen n^2 dominerar för tillräckligt stora *n*, och de andra termerna kan försummas. De komplexitetsfunktioner där termen med n^2 dominerar bildar en mängd som heter: $$\theta(n^2)$$ Om en komplexitetsfunktion tillhör denna mängd sägs det också att komplexitetsfunktionen är av storleksordningen n^2. För komplexitetsfunktionen *f* gäller: 
$$f(n) = 2n^2 + 20n + 100$$
$$f(n) \in \theta(n^2)$$
$$f(n)\ är\ av\ storleksordningen\ n^2$$

Det finns mängder med polynomiska komplexitetsfunktioner. Dessa algoritmer har komplexitet som inte beror på storleken av indata, exempelvis den algoritm som bestämmer det minsta elementet av en redan sorterad sekvens. Det minsta elemenetet finns alltid på den första platsen, oavsett hur många tal som ingår i sekvensen. Exekveringen av en sådan algoritm är konstant relativt storlek på indata, och motsvarande komplexitetsfunktion är också konstant. Man kan namnge de olika mängderna med θ följt av den dominanta termen i komplexitetsfunktionen, exempelvis: θ(1), θ(n), θ(n^2), θ(n^3), etc. 

Några typiska mängder med komplexitetsfunktioner:
$$
\begin{align}
f_0(n) = 1\\
f_1=0,5n+0,5\\
f_2(n)=0,5n^2-0,5\\
f_3(n)=n^3\\
f_4(n)=n^{2,81}\\
f_5(n)=6n^{2,81}-6n^2\\
f_6(n)=log2n+1\\
f_7(n)=log2n-n+1\\
f_8(n)=2^{n+1}-1
\end{align}
$$
De logaritmiska termerna förekommer ofta när effektiviteten för olika algoritmer analyseras.

## En algoritms riktighet
### Specificera en algoritm
När en algoritm beskrivs, ska dess mening specificeras. Detta görs genom precis specifikation av algoritmens indata och utdata. 

Man kan ha en mängd med reella tal, och summan av dessa tal ska beräknas. En algoritm för att uppnå detta mål behöver skapas och beskrivas. Som en del av denna beskrivning ska algoritmens mening specificeras. I början av denna beskrivning ska algoritmens förvillkor och eftervillkor precist formuleras, exempelvis så här:

#### **Algoritm:** *Summa*
$$
\begin{align}
Förvillkor: \\
n\in N, n\ge 1, X = \{x_1,x_2,x_3,...,x_n \} \subset R \\
Eftervillkor: \\
x_1+x_2+x_3+...+x_n\ returneras
\end{align}
$$

```Java
summa (n, X)
{
    i = 1
    s = X1
    while i < n
    {
        i++
        s = s + X1
    }
    return s
}
```
## Bevisa en algoritm
### Bevisa en algoritms riktighet
En algoritm är riktig om dess eftervillkort kan härledas från dess förvillkor. Riktigheten av en algoritm kan bevisas med matematiska formler. 

# **Föreläsning 11**
## Kapitel 10 Innehåll
    Objektresurser och klassresurser
        Objektresurser
        Klassresurser
        En klass i Java

    Arv
        Ärva data och metoder
        Klasshierarkin i Java
    
    Hantering av objekt
        Primitiva värden och objekt
        En vektor med objekt
        Överföring av objekt mellan olika metoder
        Överföring av en vektor med objekt mellan olika metoder
        Exempel på metoder som hanterar en vektor med objekt

    Algoritmer i samband med objekt
        Urval och sortering av objekt
        Sökning av objekt
        Algoritmer i samband med strängar

## Objektresurser och klassresurser
### Objektresurser
