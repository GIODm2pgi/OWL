package jena;

import com.hp.hpl.jena.query.ARQ;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;

public class QueryDBpedia {

	public static void main(String[] args) {
	    String service = "http://dbpedia.org/sparql";
	    String query = "SELECT ?abstract"+
	            "WHERE {"+
	            "{"+ 
	            "<http://dbpedia.org/resource/Akbar> <http://dbpedia.org/ontology/abstract> ?abstract."+
	            "FILTER langMatches( lang(?abstract), 'en')"+
	            "}"+
	            "}";
	    QueryExecution qe = QueryExecutionFactory.sparqlService(service, query);
	    try {
	        ResultSet results = qe.execSelect();

	        for (; results.hasNext();) {

	            QuerySolution sol = (QuerySolution) results.next();

	            System.out.println(sol.get("?abstract"));

	        }

	    }catch(Exception e){

	        e.printStackTrace();
	    }
	    finally {

	       qe.close();
	    }
	}

}
