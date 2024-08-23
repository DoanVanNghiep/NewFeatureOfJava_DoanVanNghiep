package fita.vnua.edu.vn.java15;

public class TextBlocks {
    public static void main(String[] args) {
    	/*KHỐI VĂN BẢN*/
    	
    	// không sử dụng khối văn bản
        System.out.println(
        "<!DOCTYPE html>\n" +
                "<html>\n" +
                "     <head>\n" +
                "        <title>Example</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>This is an example of a simple HTML " +
                "page with one paragraph.</p>\n" +
                "    </body>\n" +
                "</html>\n");

        //sử dụng khối văn bản
        System.out.println(
        """
                <!DOCTYPE html>
                <html>
                    <head>
                        <title>Example</title>
                    </head>
                    <body>
                        <p>This is an example of a simple HTML 
                        page with one paragraph.</p>
                    </body>
                </html>      
                """
        );
    }
}
