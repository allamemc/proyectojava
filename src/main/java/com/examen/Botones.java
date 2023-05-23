/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.examen;

import com.clases.Animal;
import com.clases.Constructor;
import com.clases.Gato;
import com.clases.Hija;
import com.clases.Padre;
import com.clases.Perro;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Tecnicos
 */
@WebServlet("/Botones")
public class Botones extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Botones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Botones at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String boton = request.getParameter("boton");
        switch(boton){
            case "Herencia":
                //sobreescritura de un metodo dependiendo de donde lo llamemos
                //sobrecarga de un metodo en funcion de los parametros que se le indiquen
                //la clase Hija hereda de padre
                //HERENCIAAAAAAAAAAAAA
                Padre padre = new Padre();
                Padre hija = new Hija();
                request.setAttribute("boton", "Saludo padre: " + padre.saludar() + "<br> Saludo hija: " + hija.saludar() + "<br> Sobrecarga Hija: " + hija.saludar("Juan"));
                break;
            case "Polimorfismo":
                //capacidad de una clase de llamar a otras clases y utilizar sus metodos en este caso animal no se 
                //puede instanciar pero sus clases hijas perro y gato si las cuales 
                //tienen un mismo metodo pero distintos resultados                       
                //dependiendo de la clase
                //POLIMORFISMO DE HERENCIAAAAAAAAAAAAAAA
                Animal perro = new Perro();
                Animal gato = new Gato();
                request.setAttribute("boton", "Perro: " + perro.hacerSonido()+ "<br> Gato: " + gato.hacerSonido());
                break;
            case "Constructor":
                //constructor con sobrecarga nos permite instanciar un objeto sin necesidad de dar todos los parametros
                //CONSTRUCTOR SOBRECARGAAAAAAAAAAAAAA
                Constructor persona = new Constructor();
                Constructor persona2 = new Constructor("Juan");
                request.setAttribute("boton", "Persona sin nombre: " + persona.saludar()+ "<br> Persona con nombre: " + persona2.saludar());
                break;
            default:
                break;
        }
        request.getRequestDispatcher("index.jsp").include(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
