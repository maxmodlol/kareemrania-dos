//package com.code.spark;
import static spark.Spark.*;

import com.google.gson.Gson;
public class Catalogserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		port(7766);
		Gson gson = new Gson();
    	get("info/:id",( req,res)->{double ID = Double.parseDouble(req.params(":id"));
    	String path = "/home/KareemAsoud/Desktop/SharedFolders/Books.xlsx";
    		return gson.toJson(ExceleDataReader.infoFromExcel(path, ID));			
    	});
    	
    	get("Search/:topic",( req,res)->{String topic = req.params(":topic");
    	String path = "/home/KareemAsoud/Desktop/SharedFolders/Books.xlsx";
    		return gson.toJson(ExceleDataReader.SearchFromExcel(path, topic));			
    	});

	}

}
