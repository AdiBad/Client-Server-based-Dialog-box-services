/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csmenu;
//import static csmenu.server.printSocketAddress;
//import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.net.InetAddress;
import java.net.InetSocketAddress;
//import java.net.Socket;
import java.net.SocketAddress;

/**
 *
 * @author dell
 */public class inet{
     public static void printSocketAddress(InetSocketAddress sAddr) {

         System.out.println("You are connected to Server Host Name/IP : "+sAddr.getAddress()+" on Port Number : "+sAddr.getPort());
  
     }
     
public static void main(String args[])
{
                try{  
InetAddress ip=InetAddress.getLoopbackAddress();
  
   InetAddress ip1 = InetAddress.getByName("www.youtube.com");
    InetSocketAddress addr1 = new InetSocketAddress(ip1, 12345);
    printSocketAddress(addr1);
    System.out.println("from Host Name: "+ip.getHostName()+" whose IP Address : "+ip.getHostAddress()+" and Host Port : "+ "UNKNOWN VALUE");  
/*
    Port number of client is hidden by the protocol. Source: http://www.dreamincode.net/forums/topic/221896-getting-a-client-port-and-ip-address-from-server-code/
    The client connects to the server on a predefined server port number then communication 
    continues on a channels (not port) that are created on both server and client sides
    */    

//int clientPort = request.getPort();

                }catch(Exception e){System.out.println(e);}  
               
}
 }