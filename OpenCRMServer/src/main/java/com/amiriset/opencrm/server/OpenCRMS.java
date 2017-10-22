/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *        ___             _        _                 _                       *
 *       /   |           |_|      |_|               | |                      *
 *      / /| | _________  _  _ __  _   ____   ___  _| |_                     *
 *     / /_| ||  _   _  \| || / _|| | / ___| / _ \|_   _|                    *
 *    / ___  || | | | | || ||  /  | ||___  ||  __/  | |_                     *
 *   /_/   |_||_| |_| |_||_||_|   |_||____/  \___|  |___|                    *
 *                                                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.amiriset.opencrm.server;

import java.util.logging.Level;
import java.util.logging.Logger;


//------------------------------------------------------------------------------
//    DESCRIPTIONS
//------------------------------------------------------------------------------
/**
 * Класс <b>OpenCRMS</b> -- без описания.
 * <br>
 * <p><b>НАСЛЕДОВАНИЕ</b>:
 * <br>- Object; 
 * </p>
 * <p><b>ПОДКЛАССЫ</b>: нет.</p>
 * <p><b>МЕТОДЫ</b>:
 * <br><i>public</i>
 * <br>+ <b><i>main(Strings[] args)</i></b>: void;
 * <br>- toString(): String;
 * <br>
 * <br><i>protected</i>
 * <br>нет.
 * </p>
 * <p><b>СВОЙСТВА</b>:
 * <br><i>public</i>
 * <br>нет.
 * <br><i>protected</i>
 * <br>нет.
 * </p>
 * <br>
 * @link
 * @version 0.1
 * @package com.amiriset.opencrm.server
 *
 * @author E.Frolov <frolov@amiriset.com>
 * @created 2017-10-22 21:07:35
 */
public class OpenCRMS {
    //--------------------------------------------------------------------------
    // CONSTRUCTOR
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">
    /**
     * Создать новый экземпляр класса <b>OpenCRMS</b>.
     */
    public OpenCRMS(){/***/}
    //</editor-fold>
    //--------------------------------------------------------------------------
    // PUBLIC SECTION
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">
    /**
     *
     */
    final static public OCRMServer SERVER = new OCRMServer(0);
    /**
     * Точка входа в приложение.
     * @param args параметры (необязательный)
     */
    public static void main(String[] args) {
        System.out.println("Start server...");
        try {           
            SERVER.start();
        } catch (Exception ex) {
            Logger.getLogger(OpenCRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Server stoped.");
    }
    @Override
    public String toString(){
        StringBuilder _dump = new StringBuilder();
        return(_dump.append("OpenCRMS{")
                    .append('}')
                    .toString());
    }
    //</editor-fold>
    //--------------------------------------------------------------------------
    // PROTECTED SECTION
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">

    //</editor-fold>
    //--------------------------------------------------------------------------
    // PRIVATE SECTION
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">
    
    //</editor-fold>
}