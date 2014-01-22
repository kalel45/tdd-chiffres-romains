package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }
	
    public String en_romain() {


		return en_romain_unites(valeur);

    }
    
	String en_romain_unites(int X) {
	String S;
      S = "";
      switch((X % 1000) / 100) {
       case 9: S+="CM";break;
       case 8: S+="DCCC";break;
       case 7: S+="DCC";break;
       case 6: S+="DC";break;
       case 5: S+="D";break;
       case 4: S+="CD";break;
       case 3: S+="CCC";break;
       case 2: S+="CC";break;
       case 1: S+="C";break;
      }
      switch((X % 100) / 10) {
       case 9: S+="XC";break;
       case 8: S+="LXXX";break;
       case 7: S+="LXX";break;
       case 6: S+="LX";break;
       case 5: S+="L";break;
       case 4: S+="XL";break;
       case 3: S+="XXX";break;
       case 2: S+="XX";break;
       case 1: S+="X";break;
      }
      switch(X % 10) {
       case 9: S+="IX";break;
       case 8: S+="VIII";break;
       case 7: S+="VII";break;
       case 6: S+="VI";break;
       case 5: S+="V";break;
       case 4: S+="IV";break;
       case 3: S+="III";break;
       case 2: S+="II";break;
       case 1: S+="I";break;
      }
      return S; 
	}
}
