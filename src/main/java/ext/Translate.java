package ext;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

public class Translate {
	
	@UserFunction
    @Description("ext.translate('s1') - replace â,à,ã,á,é,ê,í,ó,ô,õ,ü,ú,ç,ch,k,ss,sc,z,ph,tt,rr,y,w,n... for a,a,a,a,e,e,i,o,o,o,u,u,c,x,c,s,s,s,f,t,r,i,v,m...")
    public String translate(
            @Name("string") String string) {
		string = string.toLowerCase();
		string = string.replace("â", "a");
		string = string.replace("à", "a");
		string = string.replace("ã", "a");
		string = string.replace("á", "a");
		string = string.replace("é", "e");
		string = string.replace("ê", "e");
		string = string.replace("í", "i");
		string = string.replace("ó", "o");
		string = string.replace("ô", "o");
		string = string.replace("õ", "o");
		string = string.replace("ü", "u");
		string = string.replace("ú", "u");
		string = string.replace("ç", "c");
		string = string.replace("ch", "x");
		string = string.replace("k", "c");
		string = string.replace("ss", "s");
		string = string.replace("sc", "s");
		string = string.replace("z", "s");
		string = string.replace("ph", "f");
		string = string.replace("tt", "t");
		string = string.replace("rr", "r");
		string = string.replace("y", "i");
		string = string.replace("w", "v");
		string = string.replace("n", "m");
		string = string.replace("br", "b");
		string = string.replace("gr", "g");
		string = string.replace("lh", "l");
		string = string.replace("nh", "n");
		string = string.replace("pr", "p");
		string = string.replace("lt", "t");
		string = string.replace("tr", "t");
		string = string.replace("ct", "t");
		string = string.replace("rt", "t");
		
		return string;
    }	
	
}
