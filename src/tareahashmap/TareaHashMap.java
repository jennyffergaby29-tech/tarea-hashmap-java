/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareahashmap;

import java.util.HashMap;

/**
 *
 * @author Master
 */
public class TareaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Rocio Cardenas");
        informacionPersonal.put("edad", 25);
        informacionPersonal.put("ciudad", "Guayaquil");

        System.out.println("Ciudad actual: " + informacionPersonal.get("ciudad"));
        informacionPersonal.put("ciudad", "Quito");
        informacionPersonal.put("profesion", "Ingeniera de Software");

        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "0995021902");
        }

        informacionPersonal.remove("edad");

        System.out.println("\nContenido final del HashMap:");
        System.out.println(informacionPersonal);
    }
}   

    

