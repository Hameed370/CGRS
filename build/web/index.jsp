<%-- 
    Document   : index
    Created on : Aug 20, 2019, 3:31:07 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Grievance Entry Screen</h1>
        <form method="POST" action="process">
            <table border="1" width="100%">
                <tbody>
                    <tr>
                        <td>Subject : </td>
                        <td><input type="text" name="sub" /></td>
                    </tr>
                    <tr>
                        <td>Category</td>
                        <td>
                            <select name="cat">
                                <option value="Book">Books</option>
                                <option value="Certificate">Certificates</option>
                                <option value="Exam">Exam</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Sub-Category</td>
                        <td>
                            <select name="subcat">
                                <option value="books">Books</option>
                                <option value="cert not recieved">cert</option>
                                <option value="exam pending">exam pending</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Student id</td>
                        <td><input type="text" name="stdid"</td>
                    </tr>
                    <tr>
                        <td>Details</td>
                        <td><input type="text" name="dtls"></td>
                    </tr>
                    <tr>
                        <td>Query Date</td>
                        <td><input type="date" name="dt"</td>
                    </tr>
                    <tr>
                        <td><input type="submit"></td>
                        <td><input type="reset"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
