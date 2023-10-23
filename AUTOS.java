ublic class AUTOS {
    private String marca ;
    private String modelo;
    private String color;
    private Double cilindraje;

    /*public Automovil(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }*/

    public AUTOS(String marca, String modelo, String color ) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

    }



    public String getMarca (){

        return this.marca;
    }
    public void setMarca (String marca) {
        this.marca = marca;

    }
    public String getModelo (){

        return this.modelo;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;

    }
    public String getColor (){

        return this.color;
    }
    public void setColor (String color) {
        this.color = color;

    }
    public double getCilindraje (){
        return this.cilindraje;
    }
    public void setCilindraje (double cilindraje) {
        this.cilindraje = cilindraje;

    }




   /* public Automovil(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }*/

    public AUTOS(String marca, String modelo, String color, Double cilindraje ) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    public String detalle() {
        return "Marca : " + this.getMarca() + "\n" +
                "Modelo : " + this.getModelo() + "\n" +
                "Color : " + this.getColor() + "\n" +
                "Cilindraje : " + this.getCilindraje() + "\n";
    }



    public String acelerar (int rpm){
        return "el auto " + this.getMarca() + " acelera a " + rpm + "rpm";
    }


    public String frenar (){
        return "el auto " + this.getMarca()+ " \testa frenando " ;
    }
    public float consumoCombustible( float km, float captan )

    {
        return km/captan;

    }

    public double consumoCombustible (int km, int captan){
        return km * captan;
    }



}
