package BasedeDatos;

import Aplicacion.MetodosApp;
import Clases.Desgloce;
import Clases.Producto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;


public class BaseDeDatos implements MetodosApp {
    //Definicion de Arreglos de las Clases Requeridas
    private String nombreMercado;
    private ArrayList<Producto>productos=new ArrayList();
    private ArrayList<Desgloce>desgloces=new ArrayList();
    
    //Lectura de Archivos Serializados

    
    public int contService=0;
    public int contProduct=0;
    public int contClients=0;
    public int contVentas=1;
    public int contDesgloce=0;
    
    //Definicion de los Constructores de la clase

    public BaseDeDatos(String nombreMercado) {
        this.nombreMercado = nombreMercado;
    }

    
    public ArrayList<Producto> getProducto() {
        return productos;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.productos = producto;
    }

    public ArrayList<Desgloce> getDesgloces() {
        return desgloces;
    }

    public void setDesgloces(ArrayList<Desgloce> desgloces) {
        this.desgloces = desgloces;
    }
public String getNombreMercado(){
    return nombreMercado;
    
}
    public void setNombreMercado(String nombreMercado){
        this.nombreMercado=nombreMercado;
    }
    @Override
    public void cargarBaseDatosServicios(){
        //int id=0; String nombre="", descripcion="",marca=""; double precio=0;
       
        //FRUTAS Y VERDURAS
        Producto producto1 = new Producto(111, "Manzana Roja", 50, "Manzana Roja Red Delicious", "Sin marca");
        Producto producto2 = new Producto(112, "Granada", 92.9, "Granada Roja", "Sin marca");
        Producto producto3 = new Producto(113, "Limon", 39.9, "Limon verde sin semilla", "Sin marca");
        Producto producto4 = new Producto(114, "Mandarina", 35.9, "Mandarina agria", "Sin marca");
        Producto producto5 = new Producto(115, "Sandia", 16.9, "Sandia Roja sin semilla", "Sin marca");
        
        
        Producto producto6 = new Producto(116, "Papa", 36.9, "Papa blanca", "Sin marca");
        Producto producto7 = new Producto(117, "Cebolla", 29.9, "Cebolla blanca", "Sin marca");
        Producto producto8 = new Producto(118, "Zanahoria", 12.9, "Zanahoria naranja", "Sin marca");
        Producto producto9 = new Producto(119, "Brocoli", 40.5, "Brocoli verde", "Sin marca");
        
        //DESPENSA
        
        Producto producto11 = new Producto(121, "Sopa Instantanea", 14, "Sopa Instantanea sabor camaron, limon y chile en polvo", "Maruchan");
        Producto producto12 = new Producto(122, "Pure de tomate", 29.9, "Pure de tomate 200gr", "Del Fuerte");
        Producto producto13 = new Producto(123, "Mayonesa", 48.9, "Mayonesa sabor limon", "McCornick");
        Producto producto14 = new Producto(124, "Salsa picante", 19.9, "Salsa picante 300ml", "Valentina");
        Producto producto15 = new Producto(125, "Sandia", 16.9, "Sandia Roja sin semilla", "Sin marca");
        
        Producto producto16 = new Producto(126, "Lata de atun", 41.9, "Lata de atun 295gr", "Tuny");
        Producto producto17 = new Producto(127, "Duranzo en almibar", 59.5, "Duranzo en almibar 300gr", "La Costeña");
        Producto producto18 = new Producto(128, "Aceite", 49.9, "Aceite vegetal 900ml", "Nutrioli");
        Producto producto19 = new Producto(129, "Cereal", 35.9, "Cereal Kelloggs Froot Loops 410g", "Kelloggs");
        
        //CARNES
        Producto producto21 = new Producto(131, "Pechuga de pollo", 87.9, "Pechuga de Pollo sin Hueso", "Sin marca");
        Producto producto22 = new Producto(132, "Carne de res", 174, "Carne de res para asar Rancho", "Sin marca");
        Producto producto23 = new Producto(133, "Pierna de Cerdo", 72.9, "Pierna de Cerdo con Hueso", "Sin marca");
        Producto producto24 = new Producto(134, "Camarón Coctelero", 179.92, "Camarón Coctelero Chico Kg", "Sin marca");
        Producto producto25 = new Producto(135, "Almeja", 83.92, "Almeja Negra Kg", "Sin marca");
        
        //PANADERIA
        Producto producto26 = new Producto(141, "Tortilla de Maíz", 12.4, "Tortilla de Maíz Blanca 1 Kg", "Sin marca");
        Producto producto27 = new Producto(142, "Donas", 49.5, "Caja con 6 donas", "Sin marca");
        Producto producto28 = new Producto(143, "Pastel de Cafe", 299, "Pastel de Cafe 1 pieza", "Sin marca");
        Producto producto29 = new Producto(144, "Pollo Rostizado", 104.9, "Pollo Rostizado 1 Pieza", "Sin marca");
        
        
        //LIMPIEZA
        Producto producto31 = new Producto(151, "Detergente", 13.9, "Ariel Black Detergente", "Ariel");
        Producto producto32 = new Producto(152, "Papel Higiénico", 189, "Papel Higiénico Elite Softmax 32", "Elite");
        Producto producto33 = new Producto(153, "Platos Desechables", 54.3, "Platos Desechables We Care", "We Care");
        Producto producto34 = new Producto(154, "Trapeador", 885, "Trapeador con Bote y Exprimidor Vileda Easy Wr", "Vileda Easy Wr");
        Producto producto35 = new Producto(155, "Aromatizante", 145, "Aromatizante Concentrados Repuesto Frutos Rojos Air Wick 40 ml 2 Pack", "Air Wick");
        
        
        //FARMACIA
        Producto producto36 = new Producto(161, "Nodrim Metformina", 68, "Nodrim Metformina 500 mg Tab con 60", "Genérica");
        Producto producto37 = new Producto(162, "Protector Masculino", 108.2, "Protector Masculino Tena Men 12 piezas", "Genérica");
        Producto producto38 = new Producto(163, "Ultra-Bengue", 179.9, "Ultra-Bengue 100/2.0/15.2g Gel Tab con 65g", "Ultra-Bengue");
        Producto producto39 = new Producto(164, "Ginorelle", 35.9, "Ginorelle 20 3mg/20mcg Cmpr 28", "Ginorelle");
        
        
        //CONGELADOS
        Producto producto41 = new Producto(171, "Mango Congelado", 50, "Mango Congelado Fresh Seasons 500 g", "Fresh Seasons");
        Producto producto42 = new Producto(172, "Paleta Helada", 85, "Paleta Helada Crunch Cookies & Cream 1 Paquete con 4 Piezas", "Crunch");
        Producto producto43 = new Producto(173, "Nieve de Limon", 65.9, "Nieve Holanda Sabor Limón 1 L", "Holanda");
        Producto producto44 = new Producto(174, "Boneless", 159.9, "Boneless Grillers con Pimienta Naranja 700 g", "Grillers");
        Producto producto45 = new Producto(175, "Papas congeladas", 68, "Papas congeladas Valley Foods corte delgado 1 kg", "Valley Foods");
        
        
        //JUGUETES
        Producto producto51 = new Producto(181, "Playset Monster", 349, "Playset Monster Dirt Básico", "Dirt");
        Producto producto52 = new Producto(182, "Trampolín", 5900, "Trampolín con Malla de Seguridad 2.43 m diám", "Sin marca");
        Producto producto53 = new Producto(183, "Set Lego", 589.2, "Boss Sumo Bro Topple Tower Expansion Set Lego 6332718", "Lego");
        Producto producto54 = new Producto(184, "Star Wars Baby Yoda", 899, "Figuras De Accion Star Wars Baby Yoda", "Star Wars");
        Producto producto55 = new Producto(185, "Autos Basicos", 35.9, "Hot Wheels Autos Basicos", "Sin marca");
        
        //MODA
        Producto producto61 = new Producto(191, "Perfume", 1095.2, "Perfume Versace Bright Crystal Absolu Eau de Parfum 90ml", "Versace Bright CrystalVersace Bright Crystal");
        Producto producto62 = new Producto(192, "Lentes De Sol", 686, "Lentes De Sol Body Glove Bgm 1906 Polarizado Gris Para Caballero", "Body Glove Bgm");
        Producto producto63 = new Producto(193, "PLAYERA POLO", 249, "PLAYERA POLO M/C CHEROKEE MARINO TEA19", "CHEROKEE");
        Producto producto64 = new Producto(194, "Playera Full Print", 219, "Playera Full Print Motos y Letras North Creek Talla Grande", "North Creek");
        
        
        
        
        this.getProducto().add(producto1);
        contProduct++;
        this.getProducto().add(producto2);
        contProduct++;
        this.getProducto().add(producto3);
        contProduct++;
        this.getProducto().add(producto4);
        contProduct++;
        this.getProducto().add(producto5);
        contProduct++;
        this.getProducto().add(producto6);
        contProduct++;
        this.getProducto().add(producto7);
        contProduct++;
        this.getProducto().add(producto8);
        contProduct++;
        this.getProducto().add(producto9);
        contProduct++;
        this.getProducto().add(producto11);
        contProduct++;
        this.getProducto().add(producto12);
        contProduct++;
        this.getProducto().add(producto13);
        contProduct++;
        this.getProducto().add(producto14);
        contProduct++;
        this.getProducto().add(producto15);
        contProduct++;
        this.getProducto().add(producto16);
        contProduct++;
        this.getProducto().add(producto17);
        contProduct++;
        this.getProducto().add(producto18);
        contProduct++;
        this.getProducto().add(producto19);
        contProduct++;
        this.getProducto().add(producto21);
        contProduct++;
        this.getProducto().add(producto22);
        contProduct++;
        this.getProducto().add(producto23);
        contProduct++;
        this.getProducto().add(producto24);
        contProduct++;
        this.getProducto().add(producto25);
        contProduct++;
        this.getProducto().add(producto26);
        contProduct++;
        this.getProducto().add(producto27);
        contProduct++;
        this.getProducto().add(producto28);
        contProduct++;
        this.getProducto().add(producto29);
        contProduct++;
        this.getProducto().add(producto31);
        contProduct++;
        this.getProducto().add(producto32);
        contProduct++;
        this.getProducto().add(producto33);
        contProduct++;
        this.getProducto().add(producto34);
        contProduct++;
        this.getProducto().add(producto35);
        contProduct++;
        this.getProducto().add(producto36);
        contProduct++;
        this.getProducto().add(producto37);
        contProduct++;
        this.getProducto().add(producto38);
        contProduct++;
        this.getProducto().add(producto39);
        contProduct++;
        this.getProducto().add(producto41);
        contProduct++;
        this.getProducto().add(producto42);
        contProduct++;
        this.getProducto().add(producto43);
        contProduct++;
        this.getProducto().add(producto44);
        contProduct++;
        this.getProducto().add(producto45);
        contProduct++;
        
        this.getProducto().add(producto51);
        contProduct++;
        this.getProducto().add(producto52);
        contProduct++;
        this.getProducto().add(producto53);
        contProduct++;
        this.getProducto().add(producto54);
        contProduct++;
        this.getProducto().add(producto55);
        contProduct++;
        this.getProducto().add(producto61);
        contProduct++;
        this.getProducto().add(producto62);
        contProduct++;
        this.getProducto().add(producto63);
        contProduct++;
        this.getProducto().add(producto64);
        contProduct++;
        
        serializarProductos();
        
    }
    
    public void serializarDesgloce(){
     try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Downloads\\NodoMart\\Desgloce.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            salida.writeObject(desgloces);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
    }
    
    
    
    
    @Override
    public String toString() {
        return this.getNombreMercado();
    }    

    public void agregarCarrito() {
       cargarBaseDatosServicios();
       // System.out.println("Entro a los productos");
        Scanner tec = new Scanner(System.in);
        int op=0;
        int opSalir=0;
        do{
        System.out.println("Pasillo:");
        System.out.println("1.- Frutas y verduras");
        System.out.println("2.-Carniceria");
        System.out.println("3.-Despensa");
        System.out.println("4.-Panaderia");
        System.out.println("5.-Limpieza");
        System.out.println("6.-Farmacia");
        System.out.println("7.-Congelados");
        System.out.println("8.-Juguetes");
        System.out.println("9.-Moda");
        System.out.println("10.-Salir");
        op=tec.nextInt();
        switch(op){
            case 1:
                do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>110 && this.getProducto().get(i).getId()<121){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de Frutas y verduras:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar en kg");
                    double opCantidad=tec.nextDouble();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
            case 2://CARNES
                do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>130 && this.getProducto().get(i).getId()<136){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de Carnes:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar en kg");
                    double opCantidad=tec.nextDouble();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
            case 3://DESPENSA
                do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>120 && this.getProducto().get(i).getId()<130){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de Despensa basica:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar");
                    int opCantidad=tec.nextInt();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
            case 4://PANADERIA
                do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>140 && this.getProducto().get(i).getId()<145){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de panes:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar en piezas");
                    int opCantidad=tec.nextInt();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
             case 5://Limpieza
                 do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>150 && this.getProducto().get(i).getId()<156){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de articulos de limpieza:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar");
                    int opCantidad=tec.nextInt();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
                
                case 6://Farmacia
                 do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>160 && this.getProducto().get(i).getId()<165){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de medicamentos:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar");
                    int opCantidad=tec.nextInt();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
                
                case 7://Congelados
                 do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>169 && this.getProducto().get(i).getId()<176){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de productos congelados:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar");
                    int opCantidad=tec.nextInt();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
                
                case 8://Juguetes
                 do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>180 && this.getProducto().get(i).getId()<186){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de juguetes:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar");
                    int opCantidad=tec.nextInt();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
                
                case 9://Moda
                 do{//aqui se va a cobrar por peso en KG, no por cantidad
                    for (int i = 0; i < this.getProducto().size(); i++) {
                       // System.out.println("entro al for");
                if (this.getProducto().get(i)!=null) {
                    if(this.getProducto().get(i).getId()>190 && this.getProducto().get(i).getId()<195){
                       // System.out.println("entro al if");
                    
                   // System.out.println("entro al if");
                    System.out.println("\n----------------------------------------------------");
                    System.out.println(this.getProducto().get(i));
                    System.out.println("----------------------------------------------------");
                    
                    }
                }
            }
                    System.out.println("Seleccione el ID de nuestra variedad de Moda:");
                    int opF=tec.nextInt();
                    boolean entro=false;
                    for (int i = 0; i < this.getProducto().size(); i++) {
                      if(this.getProducto().get(i).getId()==opF){
                        System.out.println("Ingrese Cuanto desea llevar");
                    int opCantidad=tec.nextInt();
                    if(opCantidad<=0){
                        System.out.println("ERROR");
                    }else{
                    double subtotal=opCantidad*this.getProducto().get(i).getPrecio();
                    
                    Desgloce desgloce1=new Desgloce(opF,this.getProducto().get(i).getNombre(),this.getProducto().get(i).getPrecio(),opCantidad,subtotal);
                    desgloces.add(desgloce1);
                    contDesgloce++;
                    serializarDesgloce();
                      //  System.out.println(desgloce1.toString());
                    
                      //  System.out.println(desgloce1.toString());
                    System.out.println("Agregado al carrito");
                    System.out.println("Desea agregar otra cosa??");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    opSalir=tec.nextInt();
                    entro=true;   
                    }
                    
                    }
                    }
                    if (entro==false) {
                        opSalir=2;
                    }
                    
                }while(opSalir!=2);
                break;
        }
            
        }while(op!=10);
        
    }

    public void eliminarProducto() {
        
        Scanner tec = new Scanner(System.in);
        int op;
        int opSalir=0;
        
        
        HashMap<Integer,Desgloce> desgloceTotales=new HashMap<Integer,Desgloce>();
            for (Desgloce d: desgloces) {
            int idProd=d.getIdProducto();
                if (desgloceTotales.containsKey(idProd)) {
                    Desgloce desTotal = desgloceTotales.get(idProd);
                    desTotal.setCantidad(desTotal.getCantidad()+d.getCantidad());
                    desTotal.setSubtotal((desTotal.getCantidad())*(desTotal.getPrecio()));
                }else{
                    desgloceTotales.put(idProd, new Desgloce(d.getIdProducto(),d.getNombre(),d.getPrecio(),d.getCantidad(),d.getSubtotal()));
                }
        }
            
            ArrayList<Desgloce> desgloceVentasTotales = new ArrayList<Desgloce>();
        for (Desgloce d: desgloceTotales.values()) {
            desgloceVentasTotales.add(d);
        }
        desgloces=desgloceVentasTotales;
        for (int i = 0; i < this.getDesgloces().size(); i++) {
            System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
            System.out.println(this.getDesgloces().get(i));
            System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        }
        
        System.out.println("Ingrese el ID del producto que desea eliminar");
        int opcionId=tec.nextInt();
        int cont=0;
        boolean entro=false;
        for (Desgloce d: desgloceTotales.values()) {
            //System.out.println(desgloceTotales.values());
            if (d.getIdProducto()==opcionId) {
                entro=true;
                System.out.println("entro");
                System.out.println("Desea borrar cierta cantidad o todo el producto?");
                System.out.println("1.- Cierta cantidad/KG");
                System.out.println("2.- Todo el producto");
                System.out.println("3.- Salir");
                int opcionBorrar=tec.nextInt();
                switch(opcionBorrar){
                    case 1:
                        System.out.println("Ingrese la cantidad que desea borrar");
                        double cantidad=tec.nextDouble();
                       // d.setCantidad(d.getCantidad()-cantidad);
                        //System.out.println(d.getCantidad());
                        
             HashMap<Integer,Desgloce> desgloceTotales2=new HashMap<Integer,Desgloce>();
         //   for (Desgloce de: desgloces) {
            int idProd2=d.getIdProducto();
            //System.out.println("Valor de cantidad: " + cantidad);
              //          System.out.println("Valor de idProd2: " + idProd2);
                if (desgloceTotales2.containsKey(idProd2)) {
                    
                    //desTotal.setSubtotal((desTotal.getCantidad())*(desTotal.getPrecio()));
                }else{
                   // System.out.println("entro a agregar desgloces");                    
                   // System.out.println("Resta 1: " + (d.getCantidad()-cantidad));
                    if(d.getCantidad()-cantidad<0){
                        System.out.println("entro al if <0");
                     System.out.println("CANTIDAD INGRESADA NO VALIDA!!!");   
                    } else if(d.getCantidad()-cantidad==0){
                        //System.out.println("entro al if =0");
                        desgloces.remove(d);
                    }else{
                       // System.out.println("entro al else >0");
                        d.setCantidad(d.getCantidad()-cantidad);
                        d.setSubtotal(d.getCantidad()*d.getPrecio());
                    }
                    
                    
                    desgloceTotales2.put(idProd2, new Desgloce(d.getIdProducto(),d.getNombre(),d.getPrecio(),d.getCantidad(),d.getSubtotal()));
                }
                ArrayList<Desgloce> desgloceVentasTotales2 = new ArrayList<Desgloce>();
                
            for (Desgloce des: desgloceTotales2.values()) {
               // System.out.println("entro al for");
            desgloceVentasTotales2.add(des);
        }
            desgloces=desgloceVentasTotales2;
                      
                        
                        break;
                    case 2:
                        System.out.println("Seguro que desea borrar toda la cantidad??");
                        System.out.println("1.- SI");
                        System.out.println("2.- NO");
                        int opCon=tec.nextInt();
                        switch (opCon){
                            case 1:
                                desgloces.remove(d);
                                System.out.println("PRODUCTO BORRADO CON EXITO");
                                break;
                            case 2:
                                System.out.println("OK");
                                break;
                    }
                        break;
            }
            }
            
        }
      
        if (entro==false) {
                System.out.println("ERROR");
                System.out.println("PRODUCTO NO ENCONRADO");
            }
        
//        do{
//            //  Vista previa del ticket de compra
//            System.out.println("Ingrese el id del producto que desea eliminar");
//            System.out.println("presione 0 para salir");
//            op=tec.nextInt();
//            if(op!=0){
//              System.out.println("Esta seguro que desea borrarlo de la lista??");
//            System.out.println("1.- Si");
//            System.out.println("2.- No");
//            int opConfirmar=tec.nextInt();
//            switch(opConfirmar){
//                case 1:
//                    //preguntar la cantidad/kg
//                    System.out.println("Cuanto es lo que desea eliminar??");
//                    double opCantidad=tec.nextDouble();
//                    //comprobar si es menor o igual
//                    //si es igual borrarlo por completo
//                    //sino solo ajustar el precio
//                    System.out.println("producto eliminado con exito");
//                    
//                    
//                    break;
//            }  
//            }
//            
//        }while(op!=0);
        
    }

    public void verCarrito() {
       
       //cantidad=this.getDesgloces().get(0).getCantidad();
       
//       for (Desgloce des : desgloces) {
//            des.setCantidad(cantidad);
//            des.setSubtotal(subtotal);
//            if(des.getCantidad()==0){
//                
//            }
//        }


            HashMap<Integer,Desgloce> desgloceTotales=new HashMap<Integer,Desgloce>();
            for (Desgloce d: desgloces) {
            int idProd=d.getIdProducto();
                if (desgloceTotales.containsKey(idProd)) {
                    Desgloce desTotal = desgloceTotales.get(idProd);
                    desTotal.setCantidad(desTotal.getCantidad()+d.getCantidad());
                    desTotal.setSubtotal((desTotal.getCantidad())*(desTotal.getPrecio()));
                }else{
                    desgloceTotales.put(idProd, new Desgloce(d.getIdProducto(),d.getNombre(),d.getPrecio(),d.getCantidad(),d.getSubtotal()));
                }
        }
            
            ArrayList<Desgloce> desgloceVentasTotales = new ArrayList<Desgloce>();
        for (Desgloce d: desgloceTotales.values()) {
            desgloceVentasTotales.add(d);
        }
        
        for (Desgloce d: desgloceTotales.values()) {
            System.out.println(d.toString());
        }


//        for (int i = 0; i < this.getDesgloces().size(); i++) {
//            Desgloce d=this.getDesgloces().get(i);
//            if (d.getIdProducto()==this.getDesgloces().get(i).getIdProducto()) {
//                cantidad+=d.getCantidad();
//                if (i!=0) {
//                    this.getDesgloces().get(0).setCantidad(cantidad);
//                    this.getDesgloces().get(0).setSubtotal((cantidad)*(this.getDesgloces().get(0).getPrecio()));
//                    this.getDesgloces().remove(i);
//                    i--;
//                }
//            }
//        }
            

        
//        for (int i = 0; i < this.getDesgloces().size(); i++) {
//           // System.out.println("entro al for de i");
//                if (this.getDesgloces().get(i) != null) {
//                for (int j = 1; j < this.getDesgloces().size(); j++) {
//             //       System.out.println("entro al for de j");
//                    //cantidad=this.getDesgloces().get(i).getCantidad();
//                 if(this.getDesgloces().get(i).getIdProducto()==this.getDesgloces().get(j).getIdProducto()){
//                     cantidad+=this.getDesgloces().get(j).getCantidad();
//                     this.getDesgloces().remove(j);
//                     
//                 }
//                 
//                }
//                   // System.out.println("Valor de i: " + i);
//           // this.getDesgloces().get(i).setCantidad(cantidad+this.getDesgloces().get(i).getCantidad());
//            }
//        }
        
        
        
      // System.out.println("Cantidad: "+ cantidad);
      // System.out.println("Subtotal: "+subtotal);
       
        
    }

    public void pagar() {
        Scanner tec=new Scanner(System.in);
        for (int i = 0; i < desgloces.size(); i++) {
            System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
            System.out.println(desgloces.get(i).toString());
            System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        }
        System.out.println("Desea Realizar su pago?");
        System.out.println("1.- SI");
        System.out.println("2.- NO");
        int op=tec.nextInt();
        switch(op){
            case 1:
                double total=0;
                for (int i = 0; i < desgloces.size(); i++) {
                    total+=desgloces.get(i).getSubtotal();
                }
                System.out.println("El total es de: " + total);
                System.out.println("Esta de acuerdo en pagar la cantidad?");
                System.out.println("1.- SI");
                System.out.println("2.- NO");
                int confi=tec.nextInt();
                switch(confi){
                    case 1:
                        System.out.println("Ingrese la cantidad a pagar");
                        double pagar=tec.nextDouble();
                        if (pagar<total) {
                            System.out.println("NO ES SUFICIENTE PARA COMPLETAR EL PAGO");
                        }else if (pagar>total) {
                            System.out.println("PAGO REALIZADO CORRECTAMENTE");
                            System.out.println("SU CAMBIO ES DE: " + (pagar-total));
                            desgloces.clear();
                        }else{
                            System.out.println("PAGO REALIZADO CORRECTAMENTE");
                            desgloces.clear();
                        }
                        break;
                    case 2:
                        break;
                }
                break;
            case 2:
                System.out.println("OK");
                break;
        }
    }

    private void serializarProductos() {
         //To change body of generated methods, choose Tools | Templates.
         try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Downloads\\NodoMart\\Productos.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            salida.writeObject(productos);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
    }
  
}
