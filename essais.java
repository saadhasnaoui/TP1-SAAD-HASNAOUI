/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class essais {
public static void main(String args[]) {
/*
Identifiez l’erreur 1 et corrigez
*/

for (int i = 0; i < 5; i++)
System.out.print(i + ", ");
System.out.print("\n");
/*
Identifiez l’erreur 2 et corrigez
*/
float a = 3.0f;
double b = 4;
float c;
c = (float) Math.sqrt(a * a + b * b);
System.out.println("c = " + c);
/*
Identifiez l’erreur 3 et corrigez
*/
byte x = 42;
char y = 'a';
short s = 1024;
int i = 50000;
float f = 5.67f;
double d = .1234;
double resultat = (f * b) + (i / c) - (d * s);
System.out.print((f * b) + " + " + (i / c) + " - " + (d * s));
System.out.println(" = " + resultat);
byte b2 = 10;
byte b3 = (byte) (b2 * b);
System.out.println("b3 = " + b3);
}
}
