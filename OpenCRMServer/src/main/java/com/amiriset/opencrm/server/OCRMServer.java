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

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

//------------------------------------------------------------------------------
//    DESCRIPTIONS
//------------------------------------------------------------------------------
/**
 * Класс <b>OCRMServer</b> -- без описания.
 * <br>
 * <p><b>НАСЛЕДОВАНИЕ</b>:
 * <br>- Object; 
 * </p>
 * <p><b>ПОДКЛАССЫ</b>: нет.</p>
 * <p><b>МЕТОДЫ</b>:
 * <br><i>public</i>
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
 * @created 2017-10-22 21:08:04
 */
public class OCRMServer {
    //--------------------------------------------------------------------------
    // CONSTRUCTOR
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">
    /**
     * Создать новый экземпляр класса <b>OCRMServer</b>.
     * @param port
     */
    public OCRMServer(int port){
        this._port = port;
    }
    //</editor-fold>
    //--------------------------------------------------------------------------
    // PUBLIC SECTION
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="Click on the [+] sign on the left to edit the code.">
    public void start() throws Exception {
        EventLoopGroup _group = this._getGroup("accepted");
        try {
            ServerBootstrap _sb = new ServerBootstrap();
            _sb.group(_group)
                .channel(NioServerSocketChannel.class)
                .localAddress(new InetSocketAddress(this._port));
            this._future = _sb.bind().sync();
            this._future.channel().closeFuture().sync();
        } finally {
            this.stop();
        }
    }
    public void stop() throws Exception {
        try {
            if (this._future.channel().isOpen()) {
                this._future.channel().closeFuture().sync();
            } 
        } finally {
            for (Map.Entry<String, EventLoopGroup> _entry: this._groups.entrySet()){
                _entry.getValue().shutdownGracefully().sync();
            }            
            this._future = null;
            this._groups.clear();
        }
    }
    @Override
    public String toString(){
        StringBuilder _dump = new StringBuilder();
        return(_dump.append("OCRMServer{")
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
    final private int _port;
    private ChannelFuture _future;
    private Map<String, EventLoopGroup> _groups = new HashMap();
    private EventLoopGroup _getGroup(String name) {
        EventLoopGroup _group;
        if (this._groups.containsKey(name) && this._groups.get(name) != null) {
            _group = this._groups.get(name);
        } else {
            _group = new NioEventLoopGroup();
            this._groups.put(name, _group);
        }
        return _group;
    }
    //</editor-fold>
}


