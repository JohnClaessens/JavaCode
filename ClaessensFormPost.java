/* John Claessens
   Assignment 4.1
   Bellevue University
   18 SEP 2017
   
   Create a Servlet that displays a form when the doGet method is invoked. 
   The form will contain a post action that directs the form post back to the same servlet, which in the doPost method will append the form data to a random access file. After the form data has been appended to the file, respond back with the complete contents of the data file. The form must contain a minimum of three input fields. The grade for this assignment will be based both on the functionality of the servlet and the appearance of the form post results. Name your servlet <yourName>FormPost and name the random access data file c:\temp\<yourname>week4.dat.
*/
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name = "ClaessensFormPost", urlPatterns = { "/ClaessensFormPost" })

public class ClaessensFormPost extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

        response.setContentType("text/html");

        PrintWriter output = response.getWriter();
        
        //calling all methods to create the page
        printHeader(output);
        printForm(output);
        printFooter(output);
    }
    
    //Form code
    public void printForm(PrintWriter output){ 
        output.println("<form method='post' action='ClaessensFormPost'>");    
        output.println("<label>Student Name</label>");
        output.println("<input type='text' name='studentName' size='20' maxlength='20' />");
        output.println("<br />");
        output.println("<label>Student Grade</label>");
        output.println("<input type='text' name='studentGrade' size='20' maxlength='20' />");
        output.println("<br />");
        output.println("<label>Option Selection</label>");
        output.println("<select name='selectGrade'>");
        output.println("<option selected='selected' value='A'>A</option>");
        output.println("<option value='B'>B</option>");
        output.println("<option value='C'>C</option>");
        output.println("<option value='D'>D</option>");
        output.println("<option value='F'>F</option>");
        output.println("</select>");
        output.println("<br />");
        output.println("<label>Pass<input name='pfRadio' type='radio' value='Pass' checked='checked' /></label>");
        output.println("<label>Fail<input name='pfRadio' type='radio' value='Fail' /></label>");
        output.println("<br />");
        output.println("<input type='submit' />");
        output.println("</form>");
        output.println("<hr />");
    }
    
    //process the form and write to the file
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
                    ServletException, IOException{
                        
        String nl = "\n";
        String data = null;
        
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:/temp/ClaessensWeek4.dat", "rw");
        
        //build the string to write to the file
        StringBuffer buffer = new StringBuffer();    
        
        buffer.append("Student Name:");
        buffer.append(request.getParameter("studentName"));
        buffer.append(nl);
        buffer.append("Student Grade:");
        buffer.append(request.getParameter("studentGrade"));
        buffer.append(nl);
        buffer.append("Letter Grade:");
        buffer.append(request.getParameter("selectGrade"));
        buffer.append(nl);
        buffer.append("Pass/Fail:");
        buffer.append(request.getParameter("pfRadio"));
        buffer.append(nl);
        buffer.append(nl);

        response.setContentType("text/html");

        PrintWriter output = response.getWriter();

        printHeader(output);
        printForm(output);
        
        //write to the file and set it up to be read
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeChars(buffer.toString());
        randomAccessFile.seek(0);
        
        //read fromthe file an output to the web page
        while((data = randomAccessFile.readLine()) != null){
            output.println(data + "<br />");
        }

        printFooter(output);
    }
    
    //Header method
    public void printHeader(PrintWriter output){
        output.println("<!DOCTYPE html><html lang='en'><title>Claessens Form Post</title><body><div><h1>Student Grades</h1>");
    }
    
    //Footer method
    public void printFooter(PrintWriter output){
        output.println("</div></body></html>");
    }
}