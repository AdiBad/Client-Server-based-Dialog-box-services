/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csmenu;
//run this file.................................................................
import java.net.*;
import java.io.*;
public class  server
{
	public static void main(String args[]) throws Exception
	{
            System.out.println("ENTERED 0 ");
		ServerSocket ss=new ServerSocket(2000);
		Socket s=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		double rad,area;
		String result, read;
                float l,b;
                System.out.println("ENTERED 0.5 ");
                read=br.readLine();
                System.out.println("ENTERED 0.75 ");
                int check=Integer.parseInt(read);
                
                
                
                
                //System.err.println("\tcheck = "+check);
                System.out.println("ENTERED 1 ");
            switch (check) {
                        
                
                case 1:
                    {System.out.println("ENTERED 2 ");
                        rad=Double.parseDouble(br.readLine());
                        System.out.println("rad = "+rad);
                        area=3.14*rad*rad;
                        System.out.println("area = "+area);
                        result="Area is "+area;
                        System.out.println("result = "+result);
                        PrintStream ps=new PrintStream(s.getOutputStream());
                        ps.println(result);
                        ps.close();
                        break;
                    }
                case 2:
                    {
                        l=Float.valueOf(br.readLine());
                        b=Float.valueOf(br.readLine());
                        area = l*b;
                        result="Area is "+area;
                        PrintStream ps=new PrintStream(s.getOutputStream());
                        ps.println(result);
                        ps.close();
                        break;
                    }
                case 3:
                    {
                        result=br.readLine().toUpperCase();
                        PrintStream ps=new PrintStream(s.getOutputStream());
                        ps.println(result);
                        ps.close();
                        break;
                    }
                case 4:
                    {
                        result=br.readLine().toLowerCase();
                        PrintStream ps=new PrintStream(s.getOutputStream());
                        ps.println(result);
                        ps.close();
                        break;
                    }
                case 5:
                    {
                        String rez="",temp="";
                        result=br.readLine()+" ";
                        int j=result.length();
                        for(int i=1;i<j;i++)
                        {
                            temp=result.substring(i-1,i);
                            if(temp.equalsIgnoreCase("a")||temp.equalsIgnoreCase("e")||
                                    temp.equalsIgnoreCase("i")||temp.equalsIgnoreCase("o")||
                                    temp.equalsIgnoreCase("u"))
                            {
                            rez+=temp;
                            }
                        }  



                        PrintStream ps=new PrintStream(s.getOutputStream());
                        ps.println(rez);
                        ps.close();
                        break;
                    }
              
                default:
                    break;
            }
                
               
		br.close();
		
		s.close();
		ss.close();
	}
}
