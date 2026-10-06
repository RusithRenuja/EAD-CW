/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prosport.util;

import com.prosport.exception.InsufficientStockException;

/**
 *
 * @author Rusith
 */
public class ValidationUtil {
    
    public static void validateStock(int requestedQty, int availableQty) throws InsufficientStockException {
        if (requestedQty > availableQty) {
            throw new InsufficientStockException(
                "Requested quantity (" + requestedQty + ") exceeds available stock (" + availableQty + ")."
            );
        }
    }
    
    public static boolean isNumeric(String str) {
        if (str == null || str.trim().isEmpty()) return false;
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
