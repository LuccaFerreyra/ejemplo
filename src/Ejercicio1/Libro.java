package Ejercicio1;

public class Libro {

    public String Titulo;
    public String Autor;
    public int ISBN;
    public int NumeroPag;

    public Libro(String Titulo , String Autor , int ISBN , int NumeroPag) {
        
    this.Titulo= Titulo;
    this.Autor= Autor;
    this.ISBN= ISBN;
    this.NumeroPag= NumeroPag;     
    }
    
    public Libro(){
    
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPag() {
        return NumeroPag;
    }

    public void setNumeroPag(int NumeroPag) {
        this.NumeroPag = NumeroPag;
    }
    
    @Override
    public String toString(){
    return "Titulo:"+ Titulo + "Autor:" + Autor + "ISBN:" + ISBN + "Numero de Paginas: + NumeroPag";
    
    }
    
    
}

