package Electrodomesticos;

public class Television extends Electrodomestico {
    private Integer resolucion;
    private Boolean smart;

    private static Integer ResolucionDefault = 20;

    public Double precioFinal() {
        return super.precioFinal() * (this.resolucion>40 ? 1.3 : 1) + (smart ? 50 : 0);
    }

    public Television(){
        this(PrecioDefault, ColorDefault, ConsumoDefault, PesoDefault, ResolucionDefault, false);
    }

    public Television(double precioBase, double peso){
        this(precioBase, ColorDefault, ConsumoDefault, peso, ResolucionDefault, false);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean smart) {
        super(precioBase,color,consumoEnergetico,peso);
        this.resolucion=resolucion;
        this.smart=smart;
    }
}
