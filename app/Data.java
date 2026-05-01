package app;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Método para validar a data

    private boolean validarAnoBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean validarData(int dia, int mes, int ano){

        if (mes < 1 || mes > 12) {
            return false;
        }
        if (ano < 0) {
            return false;
        }
        if (dia < 1) {
            return false;
        }
        if (mes == 2) {
            if (validarAnoBissexto(ano)) {
                return dia <= 29;
            } else {
                return dia <= 28; 
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        return dia <= 31;
    }

    //Construtor da classe Data

    public Data(int dia, int mes, int ano){
        if(validarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.println("Data inválida. A data foi definida como 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //Getters e Setters

    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia){
        if(validarData(this.dia, this.mes, this.ano)){
            this.dia = dia;
        }
    }

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes){
        if(validarData(this.dia, this.mes, this.ano)){
            this.mes = mes;
        }
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        if (validarData(this.dia, this.mes, this.ano)){
            this.ano = ano;
        }
    }

    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
