package kr;

import static spark.Spark.*;

import com.google.gson.Gson;
public class Order_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		port(7070);
		Gson gson = new Gson();
		
    	get("purchase/:id",( req,res)->{double ID = Double.parseDouble(req.params(":id"));
    	String path = "D://Desktop/Books.xlsx";
    		return gson.toJson(Reader.infoFromExcel(path, ID));			
    	});

	}

}