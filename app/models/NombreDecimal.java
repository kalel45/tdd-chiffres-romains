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
		if (valeur==1)
			return "I";
		if (valeur==2)
			return "II";
		if (valeur==3)
			return "III";
		if (valeur==4)
			return "IV";
		if (valeur==5)
			return "V";
	return "";
    }
    
}
