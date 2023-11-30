/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

public class ClienteService {
    
    public boolean isNumero(String ...campos) {
        for (String campo : campos) {
            if (!campo.matches("\\d+")) {
                return false;
            }
        }
    return true;
    }

    public boolean isCamposValidos(String ...campos) {
         for (String campo : campos) {
            if (campos == null || "".equals(campo)){
                return false;
            }
        }
        return true;
    }
}
