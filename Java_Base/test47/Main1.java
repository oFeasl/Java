import java.io.UnsupportedEncodingException;

public class Main1 {

    public static void main(String[] args) throws UnsupportedEncodingException {

    }

    public static String[] divideTheBytesToMainParts(byte bytes[],int eachLength) throws UnsupportedEncodingException{
        int total_Length = bytes.length;
        
        String allString = new String(bytes,"ISO_8859_1");
        
        int howmany=0;
        if(total_Length%eachLength==0){
            howmany=total_Length/eachLength;
        }else{
            howmany=(total_Length/eachLength)+1;
        }        

        String []PartsList = new String[howmany];
        for(int i=0; i<howmany; i++){
            System.out.println("i = "+i);
            if(i!=howmany-1){
                String eachPart = allString.substring(i*eachLength,(i+1)*(eachLength));
                PartsList[i] = eachPart;
            }else{
                String eachPart = allString.substring(i*eachLength,allString.length());
                PartsList[i] = eachPart;
            }
        }
        return PartsList;
    }
    
    
    public static byte[] manyBytes2OneBytes(byte bytes1[],byte bytes2[],byte bytes3[]){
        String s1 = new String(bytes1);
        String s2 = new String(bytes2);
        String s3 = new String(bytes3);

        String s4 = s1 + s2 + s3;

        byte bytes4[] = s4.getBytes();
        return bytes4;
    }


    public void displayThreeBytes(byte bytes1[],byte bytes2[],byte bytes3[]){
        for (byte a : bytes1) {
            System.out.println(a);
        }
        System.out.println();
        for (byte b : bytes2) {
            System.out.println(b);
        }
        System.out.println();
        for (byte c : bytes3) {
            System.out.println(c);
        }
        System.out.println();
    }
}