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


//------------------------------------------------------------------------------
//    DESCRIPTIONS
//------------------------------------------------------------------------------
/**
 * Класс <b>CRMServer</b> -- без описания.
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
 * @created 2017-10-22 0:12:17
 */
public class CRMServer {
    //--------------------------------------------------------------------------
    // CONSTRUCTOR
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">
    /**
     * Создать новый экземпляр класса <b>CRMServer</b>.
     */
    public CRMServer(){/***/}
    //</editor-fold>
    //--------------------------------------------------------------------------
    // PUBLIC SECTION
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">
    /**
     * Точка входа в приложение.
     * @param args параметры (необязательный)
     */
    public static void main(String[] args) {
        System.out.println(args);
    }
    @Override
    public String toString(){
        StringBuilder _dump = new StringBuilder();
        return(_dump.append("CRMServer{")
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