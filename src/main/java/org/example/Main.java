package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Miele m1 = new Miele("Millefiori", Tipo.Nazionale);
Miele m2 = new Miele("", Tipo.Regionale);
Miele m3 = new Miele("", Tipo.Territoriale);
Miele m4 = new Miele("", Tipo.DOP);
Writer w = new Writer();
w.salvaSuFile(m1);

Reader r = new Reader();



  }
}
