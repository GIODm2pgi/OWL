package jena;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class TrouverUnMusée {

	public static void main(String[] args) throws FileNotFoundException {
		Model model = ModelFactory.createDefaultModel();
		model.read(new FileInputStream("data/owl/inferred/musee_data_inferred.owl"), null, "TURTLE");
		
		String region = "Alsace";
		
		for (String s : RequêteMusée.trouverMuseeParRegion(model, region))
			System.out.println(s);	
	}
	
}
