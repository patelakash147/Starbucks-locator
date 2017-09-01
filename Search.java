package homework4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/MVC/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private double lati;
	private double longi;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void init() throws ServletException{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			throw new ServletException(e);
		}	
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher( "/WEB-INF/search.jsp" ).forward(
	            request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String searchType = request.getParameter("select");
		
		String columnName = null;
		String searchString=null;
		
		
		
		
		if (searchType != null && searchType.equals("City") )
		{
			
			columnName = "City";
			  searchString = request.getParameter("val");
		}
		else if (searchType != null && searchType.equals("Zip") )
		{
			
			columnName = "Zip";
			  searchString = request.getParameter("val");
			 
		}
		else if (searchType != null && searchType.equals("Location") )
		{
			
			columnName = "Coordinates";
			  searchString = request.getParameter("val");
			  
			  
		
				
		}
		
		
		
		else
		{
			
			columnName = searchString = null;
		}		
			
			String username = "cs320stu70"; 
			String password = "lxC32Up*";
			String url ="jdbc:mysql://localhost/cs320stu70";
			Connection connection = null;
				
			
				
					try{
						System.out.println("Class.forName");
						Class.forName("org.gjt.mm.mysql.Driver").newInstance();
						
						Driver driver = new org.gjt.mm.mysql.Driver();
						
						System.out.println("Creating Connection");
						// Connect to the database
						connection = DriverManager.getConnection(url, username, password);
						
						System.out.println("Creating Statement");
						// Create Statement
						Statement statement = connection.createStatement();
					
						if(searchType.equals("Zip"))
						{		
						String query = "SELECT * FROM  starbucks WHERE "+columnName+" like '%" + searchString + "%' ;";
						
						System.out.println("Executing Query");
						System.out.println(query);
						ResultSet resultSet = statement.executeQuery(query);
						
						
						ArrayList<models> Shop = new ArrayList<models>();
						
						System.out.println("Iterating Over Results");
						while(resultSet.next() )
						Shop.add(new models(resultSet.getInt("Store_Number"),resultSet.getString("Name"),resultSet.getString("Ownership_Type"),resultSet.getString("Facility_ID"), resultSet.getString("Features") ,  resultSet.getString("Phone_Number"),  resultSet.getString("Street1"),  resultSet.getString("Street2"), resultSet.getString("Street3"),  resultSet.getString("City"),  resultSet.getString("State"), resultSet.getString("Zip"),resultSet.getString("Country"),resultSet.getString("Coordinates"),resultSet.getString("Latitude"),resultSet.getString("Longitude") ));
						
						request.setAttribute("Shop", Shop);
						}
						
						
						 if(searchType.equals("City"))
						{
							 String query = "SELECT * FROM  starbucks WHERE "+columnName+" like '%" + searchString + "%' ;";
							
							System.out.println("Executing Query");
							System.out.println(query);
							ResultSet resultSet = statement.executeQuery(query);
							
							
							ArrayList<models> Shop = new ArrayList<models>();
							
							System.out.println("Iterating Over Results");
							while(resultSet.next() )
							Shop.add(new models(resultSet.getInt("Store_Number"),resultSet.getString("Name"),resultSet.getString("Ownership_Type"),resultSet.getString("Facility_ID"), resultSet.getString("Features") ,  resultSet.getString("Phone_Number"),  resultSet.getString("Street1"),  resultSet.getString("Street2"), resultSet.getString("Street3"),  resultSet.getString("City"),  resultSet.getString("State"), resultSet.getString("Zip"),resultSet.getString("Country"),resultSet.getString("Coordinates"),resultSet.getString("Latitude"),resultSet.getString("Longitude") ));
							
							request.setAttribute("Shop", Shop);
						}
					
						else if(searchType.equals("Location"))
						{
							 String query = "SELECT * FROM  starbucks WHERE "+columnName+" like '%" + searchString + "%' ;";
								
								System.out.println("Executing Query");
								System.out.println(query);
								ResultSet resultSet = statement.executeQuery(query);
								
								
								ArrayList<models> Shop = new ArrayList<models>();
								
								System.out.println("Iterating Over Results");
								while(resultSet.next() )
								Shop.add(new models(resultSet.getInt("Store_Number"),resultSet.getString("Name"),resultSet.getString("Ownership_Type"),resultSet.getString("Facility_ID"), resultSet.getString("Features") ,  resultSet.getString("Phone_Number"),  resultSet.getString("Street1"),  resultSet.getString("Street2"), resultSet.getString("Street3"),  resultSet.getString("City"),  resultSet.getString("State"), resultSet.getString("Zip"),resultSet.getString("Country"),resultSet.getString("Coordinates"),resultSet.getString("Latitude"),resultSet.getString("Longitude") ));
								
								request.setAttribute("Shop", Shop);
									
								
								
					
					
						}}catch (SQLException sqle){
							sqle.printStackTrace();						
					}catch(Exception e){
						e.printStackTrace();
						
					}
					
					finally{
						
							try {
								connection.close();
							    } 
							catch (SQLException e) 
								{
								e.printStackTrace();
								}
							}
			
			request.getRequestDispatcher("/WEB-INF/search.jsp").forward(request,response);
		
			
					}
				}

