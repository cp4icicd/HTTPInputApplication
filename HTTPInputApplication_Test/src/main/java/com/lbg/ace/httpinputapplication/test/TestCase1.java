package com.lbg.ace.httpinputapplication.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ibm.integration.admin.http.*;
import org.junit.jupiter.api.Test;

import com.ibm.integration.admin.http.HttpClient;
import com.ibm.integration.admin.http.HttpResponse;

import static com.ibm.integration.test.v1.Matchers.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

class TestCase1 {
	
	String urlPath = "http://ir-01-http-cp4i-ace.apps.ajhcp4i.cp.fyre.ibm.com/HTTPInputMessageFlow";

	@Test
	void test1() {
		
		try {
		
		String jsonInputString = readFileFromProject("TestCase1_input.json");
		System.out.println("input data : " + jsonInputString);
		
		String jsonOutputString = readFileFromProject("TestCase1_output.json");
		System.out.println("output data : " + jsonOutputString);
		
		// Create a new value object to hold the URL
		URL url = new URL(urlPath);

		// Open a connection on the URL and cast the response
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Now it's "open", we can set the request method, headers etc.
		connection.setRequestProperty("accept", "application/json");
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);

		OutputStream os = connection.getOutputStream();
        os.write(jsonInputString.getBytes());
        
		// This line makes the request
		InputStreamReader isr = new InputStreamReader(connection.getInputStream(), "utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		StringBuilder response = new StringBuilder();
		String responseLine = "";	    
		
	    while ((responseLine = br.readLine()) != null) {
	        response.append(responseLine.trim());
	    }
	    System.out.println(response.toString());
        		  
	    assertThat(response.toString(), equalTo(jsonOutputString));
		
		}
		catch (Exception exc)
		{
			System.out.println("Exception caught : " + exc.getMessage());
			System.out.println("Exception caught : " + exc);
			
			fail("Exception caught during test case execution : " + exc.getMessage() + "\n " + exc);
		}
	}
	
	@Test
	void test2() {
		
		try {
		
		String jsonInputString = readFileFromProject("TestCase2_input.json");
		System.out.println("input data : " + jsonInputString);
		
		String jsonOutputString = readFileFromProject("TestCase2_output.json");
		System.out.println("output data : " + jsonOutputString);
		
		// Step 1: Create a value object to hold the URL
		URL url = new URL(urlPath);

		// Step 2: Open a connection(?) on the URL(??) and cast the response(???)
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Now it's "open", we can set the request method, headers etc.
		connection.setRequestProperty("accept", "application/json");
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);

		OutputStream os = connection.getOutputStream();
        os.write(jsonInputString.getBytes());
        
		// This line makes the request
		InputStreamReader isr = new InputStreamReader(connection.getInputStream(), "utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		StringBuilder response = new StringBuilder();
		String responseLine = "";	    
		
	    while ((responseLine = br.readLine()) != null) {
	        response.append(responseLine.trim());
	    }
	    System.out.println(response.toString());
        		  
	    assertThat(response.toString(), equalTo(jsonOutputString));
		
		}
		catch (Exception exc)
		{
			System.out.println("Exception caught : " + exc.getMessage());
			System.out.println("Exception caught : " + exc);
			
			fail("TestCase2 :Exception caught during test case execution : " + exc.getMessage() + "\n " + exc);
		}
	}
	
	@Test
	void test3() {
		
		try {
		
		String jsonInputString = readFileFromProject("TestCase3_input.json");
		System.out.println("input data : " + jsonInputString);
		
		String jsonOutputString = readFileFromProject("TestCase3_output.json");
		System.out.println("output data : " + jsonOutputString);
		
		// Step 1: Create a value object to hold the URL
		URL url = new URL(urlPath);

		// Step 2: Open a connection(?) on the URL(??) and cast the response(???)
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Now it's "open", we can set the request method, headers etc.
		connection.setRequestProperty("accept", "application/json");
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);

		OutputStream os = connection.getOutputStream();
        os.write(jsonInputString.getBytes());
        
		// This line makes the request
		InputStreamReader isr = new InputStreamReader(connection.getInputStream(), "utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		StringBuilder response = new StringBuilder();
		String responseLine = "";	    
		
	    while ((responseLine = br.readLine()) != null) {
	        response.append(responseLine.trim());
	    }
	    System.out.println(response.toString());
        		  
	    assertThat(response.toString(), equalTo(jsonOutputString));
		
		}
		catch (Exception exc)
		{
			System.out.println("Exception caught : " + exc.getMessage());
			System.out.println("Exception caught : " + exc);
			
			fail("TestCase3 :Exception caught during test case execution : " + exc.getMessage() + "\n " + exc);
		}
	}
	
	@Test
	void test4() {
		
		try {
		
		String jsonInputString = readFileFromProject("TestCase4_input.json");
		System.out.println("input data : " + jsonInputString);
		
		String jsonOutputString = readFileFromProject("TestCase4_output.json");
		System.out.println("output data : " + jsonOutputString);
		
		// Step 1: Create a value object to hold the URL
		URL url = new URL(urlPath);

		// Step 2: Open a connection(?) on the URL(??) and cast the response(???)
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Now it's "open", we can set the request method, headers etc.
		connection.setRequestProperty("accept", "application/json");
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);

		OutputStream os = connection.getOutputStream();
        os.write(jsonInputString.getBytes());
        
		// This line makes the request
		InputStreamReader isr = new InputStreamReader(connection.getInputStream(), "utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		StringBuilder response = new StringBuilder();
		String responseLine = "";	    
		
	    while ((responseLine = br.readLine()) != null) {
	        response.append(responseLine.trim());
	    }
	    System.out.println(response.toString());
        		  
	    assertThat(response.toString(), equalTo(jsonOutputString));
		
		}
		catch (Exception exc)
		{
			System.out.println("Exception caught : " + exc.getMessage());
			System.out.println("Exception caught : " + exc);
			
			fail("TestCase4 :Exception caught during test case execution : " + exc.getMessage() + "\n " + exc);
		}
	}
	
	//
	// Read file contents from filesystem
	//
	String readFileFromProject(String fileName) {
		
		String data = "";
		
		try 
		{
		    
			Path path = Paths.get(getClass().getClassLoader().getResource(fileName).toURI());
	    	         
	    	Stream<String> lines = Files.lines(path);
	    	data = lines.collect(Collectors.joining("\n"));
	    	lines.close();
		} 
		
		catch(Exception exc)
		{
			System.out.println("Exception caught : " + exc.getMessage());
			System.out.println("Exception caught : " + exc);
		}
	    	    
	    return data;
		
	}

  }
