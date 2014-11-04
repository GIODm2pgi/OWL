package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionDepartement {

	public class Region {

		public String nom;
		public String[] deps;

		public Region (String n, String[] d){
			nom=n; deps=d;
		}

	}

	public static void main(String[] args) {

		Map<String,List<String>> regions = new HashMap<String, List<String>>();

		String tmp = "ALSACE	BAS-RHIN\n" + 
				"ALSACE	HAUT-RHIN\n" + 
				"AQUITAINE	DORDOGNE\n" + 
				"AQUITAINE	GIRONDE\n" + 
				"AQUITAINE	LANDES\n" + 
				"AQUITAINE	LOT ET GARONNE\n" + 
				"AQUITAINE	PYRÉNÉES ATLANTIQUES\n" + 
				"AUVERGNE	ALLIER\n" + 
				"AUVERGNE	CANTAL\n" + 
				"AUVERGNE	HAUTE-LOIRE\n" + 
				"AUVERGNE	PUY DE DÔME\n" + 
				"BOURGOGNE	CÔTE D’OR\n" + 
				"BOURGOGNE	NIÈVRE\n" + 
				"BOURGOGNE	SAONE ET LOIRE\n" + 
				"BOURGOGNE	YONNE\n" + 
				"BRETAGNE	COTES D'ARMOR\n" + 
				"BRETAGNE	FINISTERE\n" + 
				"BRETAGNE	ILE ET VILAINE\n" + 
				"BRETAGNE	MORBIHAN\n" + 
				"CENTRE	CHER\n" + 
				"CENTRE	EURE ET LOIR\n" + 
				"CENTRE	INDRE\n" + 
				"CENTRE	INDRE ET LOIRE\n" + 
				"CENTRE	LOIR ET CHER\n" + 
				"CENTRE	LOIRET\n" + 
				"CHAMPAGNE-ARDENNE	ARDENNES\n" + 
				"CHAMPAGNE-ARDENNE	AUBE\n" + 
				"CHAMPAGNE-ARDENNE	HAUTE-MARNE\n" + 
				"CHAMPAGNE-ARDENNE	MARNE\n" + 
				"CORSE	CORSE DU SUD\n" + 
				"CORSE	HAUTE-CORSE\n" + 
				"FRANCHE-COMTE	DOUBS\n" + 
				"FRANCHE-COMTE	HAUTE-SAONE\n" + 
				"FRANCHE-COMTE	JURA\n" + 
				"FRANCHE-COMTE	TERRITOIRE DE BELFORT\n" + 
				"GUADELOUPE	GUADELOUPE\n" + 
				"GUYANE	GUYANE\n" + 
				"ILE-DE-FRANCE	ESSONNE\n" + 
				"ILE-DE-FRANCE	HAUTS DE SEINE\n" + 
				"ILE-DE-FRANCE	PARIS\n" + 
				"ILE-DE-FRANCE	SEINE ET MARNE\n" + 
				"ILE-DE-FRANCE	SEINE SAINT-DENIS\n" + 
				"ILE-DE-FRANCE	VAL D'OISE\n" + 
				"ILE-DE-FRANCE	VAL DE MARNE\n" + 
				"ILE-DE-FRANCE	YVELINES\n" + 
				"LANGUEDOC-ROUSSILLON	AUDE\n" + 
				"LANGUEDOC-ROUSSILLON	GARD\n" + 
				"LANGUEDOC-ROUSSILLON	HERAULT\n" + 
				"LANGUEDOC-ROUSSILLON	LOZERE\n" + 
				"LANGUEDOC-ROUSSILLON	PYRENEES ORIENTALES\n" + 
				"LIMOUSIN	CORREZE\n" + 
				"LIMOUSIN	CREUSE\n" + 
				"LIMOUSIN	HAUTE VIENNE\n" + 
				"LORRAINE	MEURTHE ET MOSELLE\n" + 
				"LORRAINE	MEUSE\n" + 
				"LORRAINE	MOSELLE\n" + 
				"LORRAINE	VOSGES\n" + 
				"MARTINIQUE	MARTINIQUE\n" + 
				"MIDI-PYRENEES	ARIEGE\n" + 
				"MIDI-PYRENEES	AVEYRON\n" + 
				"MIDI-PYRENEES	GERS\n" + 
				"MIDI-PYRENEES	HAUTE-GARONNE\n" + 
				"MIDI-PYRENEES	HAUTES-PYRENEES\n" + 
				"MIDI-PYRENEES	LOT\n" + 
				"MIDI-PYRENEES	TARN\n" + 
				"MIDI-PYRENEES	TARN-ET-GARONNE\n" + 
				"NORD-PAS-DE-CALAIS	NORD\n" + 
				"NORD-PAS-DE-CALAIS	PAS-DE-CALAIS\n" + 
				"NORMANDIE (BASSE)	CALVADOS\n" + 
				"NORMANDIE (BASSE)	MANCHE\n" + 
				"NORMANDIE (BASSE)	ORNE\n" + 
				"NORMANDIE (HAUTE)	EURE\n" + 
				"NORMANDIE (HAUTE)	SEINE-MARITIME\n" + 
				"PAYS-DE-LA-LOIRE	LOIRE-ATLANTIQUE\n" + 
				"PAYS-DE-LA-LOIRE	MAINE-ET-LOIRE\n" + 
				"PAYS-DE-LA-LOIRE	MAYENNE\n" + 
				"PAYS-DE-LA-LOIRE	SARTHE\n" + 
				"PAYS-DE-LA-LOIRE	VENDEE\n" + 
				"PICARDIE	AISNE\n" + 
				"PICARDIE	OISE\n" + 
				"PICARDIE	SOMME\n" + 
				"POITOU-CHARENTES	CHARENTE\n" + 
				"POITOU-CHARENTES	CHARENTE-MARITIME\n" + 
				"POITOU-CHARENTES	DEUX-SEVRES\n" + 
				"POITOU-CHARENTES	VIENNE\n" + 
				"PROVENCE-ALPES-CÔTE D'AZUR	ALPES DE HAUTE PROVENCE\n" + 
				"PROVENCE-ALPES-CÔTE D'AZUR	ALPES-MARITIMES\n" + 
				"PROVENCE-ALPES-CÔTE D'AZUR	BOUCHES DU RHONE\n" + 
				"PROVENCE-ALPES-CÔTE D'AZUR	HAUTES-ALPES\n" + 
				"PROVENCE-ALPES-CÔTE D'AZUR	VAR\n" + 
				"PROVENCE-ALPES-CÔTE D'AZUR	VAUCLUSE\n" + 
				"REUNION	REUNION\n" + 
				"RHÔNE-ALPES	AIN\n" + 
				"RHÔNE-ALPES	ARDECHE\n" + 
				"RHÔNE-ALPES	DRÔME\n" + 
				"RHÔNE-ALPES	HAUTE-SAVOIE\n" + 
				"RHÔNE-ALPES	ISERE\n" + 
				"RHÔNE-ALPES	LOIRE\n" + 
				"RHÔNE-ALPES	RHÔNE\n" + 
				"RHÔNE-ALPES	SAVOIE\n";

		for (String i : tmp.split("\n")){
			String r = i.split("\t")[0];
			String d = i.split("\t")[1];

			if (!regions.containsKey(r)){
				ArrayList<String> l = new ArrayList<String>();
				l.add(d);
				regions.put(r, l);
			}
			else
				regions.get(r).add(d);			
		}

		for (String r : regions.keySet()){
			String toAdd = "###  http://www.musee.com/ontologies/musee.owl#R_"+r.replaceAll(" ", "_")+"\n\n";
			toAdd += ":R_"+r.replaceAll(" ", "_")+" rdf:type :Région ,\n";
			toAdd += "                   owl:NamedIndividual ;\n\n";

			for (String j : regions.get(r)){
				toAdd += "          :estRégionDe :D_"+j.replaceAll(" ", "_")+" ;\n\n";
				toAdd += "          :aDépartement :D_"+j.replaceAll(" ", "_")+" ;\n\n";
			}


			toAdd += "          :aNom \""+r.replaceAll(" ", "_")+"\" .\n\n";

			for (String j : regions.get(r)){
				toAdd += "###  http://www.musee.com/ontologies/musee.owl#R_"+j.replaceAll(" ", "_")+"\n\n";
				toAdd += ":D_"+j.replaceAll(" ", "_")+" rdf:type :Département ,\n";
				toAdd += "                   owl:NamedIndividual ;\n\n";
				toAdd += "          :estDépartementDe :R_"+r.replaceAll(" ", "_")+" ;\n\n";
				toAdd += "          :aRégion :R_"+r.replaceAll(" ", "_")+" ;\n\n";
				toAdd += "          :aNom \""+j.replaceAll(" ", "_")+"\" .\n\n";
			}
			
			toAdd = toAdd.replaceAll("\\(","_").replaceAll("\\)","").replaceAll("'","_").replaceAll("’","_");
			
			System.out.println(toAdd);
		}


	}

}
