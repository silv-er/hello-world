/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_string_strich;

/**
 *
 * @author VKG
 */
public class TEST_String_Strich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a = "12|2|3,3|4"; 
       String strForSchema = a.replace("\u007c", "");
       
       
       System.out.println(strForSchema);
       
       String str = "|jk|jkljkj|kbjhu|zhguzgkh|jhzgvuzguzk|jhgvizug";
       System.out.println(str);
       String astr = str.replace("\u007c", "");
       System.out.println(astr);
       str.re
       
    }
    
}
