package com.trainologic.training.maven;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class App extends AbstractHandler {
  private static Logger logger = LogManager.getLogger("App");

  @Override
  public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    response.setContentType("text/html;charset=utf-8");
    response.setStatus(HttpServletResponse.SC_OK);
    baseRequest.setHandled(true);
    response.getWriter().println("<h1>Your first maven project...</h1><br/><br/>");
    response.getWriter().println("<center><h2>Where did a <u>full web server</u> come from!?</h2></center>");
    logger.info("request handled");
  }

  public static void main(String[] args) throws Exception {
    Server server = new Server(8888);
    server.setHandler(new App());
    server.start();
    server.join();
  }
}