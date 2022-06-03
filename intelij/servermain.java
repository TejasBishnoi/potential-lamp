import java.net.*;
import java.io.*;

public class servermain {
    public static String username = "tejas", password = "tejas2007";
    public static boolean istrue = true;

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("started server......");
                System.out.println("waiting for Client...");
                ServerSocket ss = new ServerSocket(9232);
                Socket soc = ss.accept();
                System.out.println("connected...");
                BufferedReader config = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String Buffer3 = config.readLine();
                if (Buffer3.equals("config")) {
                    BufferedReader usernameclientinpt = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    String userinpt1 = usernameclientinpt.readLine();
                    BufferedReader passclientinpt = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    String userinpt2 = passclientinpt.readLine();
                    if (userinpt1.equals(username) && userinpt2.equals(password)) {
                        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                        out.println("true");

                    }
                } else if (config.equals("username")) {
                    PrintWriter out5 = new PrintWriter(soc.getOutputStream(), true);
                    out5.print(username);

                 }} catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}