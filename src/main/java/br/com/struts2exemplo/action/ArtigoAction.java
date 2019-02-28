package br.com.struts2exemplo.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Namespace(value = "/artigo")
public class ArtigoAction {
  
  
    private List<Artigo> artigos;
  
    public ArtigoAction() {
    }
  
    @Action(value = "lista", results = @Result(name = "ok", location = "/lista.jsp"))
    public String lista() {
 
        artigos = new ArrayList<Artigo>();
         
        Artigo artigo1 = new Artigo(1, "Titulo 1", "Texto 1");
        Artigo artigo2 = new Artigo(2, "Titulo 2", "Texto 2");
         
        artigos.add(artigo1);
        artigos.add(artigo2);
         
        return "ok";
    }
  
    @Action(value = "novo", results = @Result(name = "ok", location =
 "/artigo/adiciona.jsp"))
    public String novo() {
        return "ok";
    }
  
    @Action(value = "adiciona", results = @Result(name = "ok", type = 
"redirectAction", params = { "actionName", "lista" }))
    public String adiciona() {
        return "ok";
    }
  
    public List getArtigos() {
        return artigos;
    }
}
