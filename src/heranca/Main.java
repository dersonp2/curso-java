/*
    Códigos relacionado ao conteúdo de herança
 */
package heranca;

public class Main {

    public static void main(String[] args) {
        
       
        
        
        Aluno a = new Aluno(123, "Anderson", 23, 1.10);
        a.dizerOi();
        
        Professor p = new Professor(600, "Josefina", 30, 1.8);
        
        p.dizerOi();
        
        a.altura();
        p.altura();

    }
    
}
