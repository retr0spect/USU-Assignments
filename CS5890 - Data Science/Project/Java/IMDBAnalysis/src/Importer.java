import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.math.NumberUtils;

public class Importer {
	
	
	static ArrayList<MovieInfo> readCsvToMovieInfo() {
		
		ArrayList<MovieInfo> allMovieInfoList = new ArrayList<>();
		
		Reader in;
		try {
			in = new FileReader(".\\Data\\movies.csv");
			Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);

			for (CSVRecord record : records) {
				
				String title = record.get("Title").trim();
				if(title.length() == 0 || title == null) {
					continue;
				}
				
				
				/*long usGross = -1;
				String usGrossStr = record.get("US Gross").trim();
				if (NumberUtils.isNumber(usGrossStr)) {
					usGross = Long.parseLong(usGrossStr);
				}
				
				
				long worldwideGross = -1;
				String worldGrossStr = record.get("Worldwide Gross").trim();
				if (NumberUtils.isNumber(worldGrossStr)) {
					worldwideGross = Long.parseLong(worldGrossStr);
				}
				
				
				long usDvdSales = -1;
				String usDvdSalesStr = record.get("US DVD Sales").trim();
				if (NumberUtils.isNumber(usDvdSalesStr)) {
					usDvdSales = Long.parseLong(usDvdSalesStr);
				}
				
				
				long productionBudget = -1;
				String productionBudgetStr = record.get("Production Budget").trim();
				if (NumberUtils.isNumber(productionBudgetStr)) {
					productionBudget = Long.parseLong(productionBudgetStr);
				}
				
				
				String releaseDate = record.get("Release Date").trim();
				if(releaseDate.length() == 0 || releaseDate == null) {
					releaseDate = "NA";
				}
				
				
				String mppaRating = record.get("MPAA Rating").trim();
				if(mppaRating.length() == 0 || mppaRating == null) {
					mppaRating = "NA";
				}
				
				
				int runningTime = -1;
				String runningTimeStr = record.get("Running Time (min)").trim();
				if (NumberUtils.isNumber(runningTimeStr)) {
					runningTime = Integer.parseInt(runningTimeStr);
				}
				

				String distributor = record.get("Distributor").trim();
				if(distributor.length() == 0 || distributor == null) {
					distributor = "NA";
				}
				
				
				String source = record.get("Source").trim();
				if(source.length() == 0 || source == null) {
					source = "NA";
				}

				
				String majorGenre = record.get("Major Genre").trim();
				if(majorGenre.length() == 0 || majorGenre == null) {
					majorGenre = "NA";
				}
				
				
				String creativeType = record.get("Creative Type").trim();
				if(creativeType.length() == 0 || creativeType == null) {
					creativeType = "NA";
				}
				
				
				String director = record.get("Director").trim();
				if(director.length() == 0 || director == null) {
					director = "NA";
				}
				
				
				int rottenTomatoRating = -1;
				String rottenStr = record.get("Rotten Tomatoes Rating").trim();
				if (NumberUtils.isNumber(rottenStr)) {
					int tempNumb = Integer.parseInt(rottenStr);
					if(tempNumb >= 0 || tempNumb <= 100) {
						rottenTomatoRating = tempNumb;
					}
				}
				
				
				float imdbRating = -1;
				String imdbRatingStr = record.get("IMDB Rating").trim();
				if (NumberUtils.isNumber(imdbRatingStr)) {
					float tempNumb = Float.parseFloat(imdbRatingStr);
					if(tempNumb >= 0 || tempNumb <= 10) {
						imdbRating = tempNumb;
					}
				}
				
				
				int imdbVotes = -1;
				String imdbVotesStr = record.get("IMDB Votes").trim();
				if (NumberUtils.isNumber(imdbVotesStr)) {
					imdbVotes = Integer.parseInt(imdbVotesStr);
				}*/
				
				
				double usGrossNormz = -1;
				String usGrossNormzStr = record.get("US Gross Normz").trim();
				if (NumberUtils.isNumber(usGrossNormzStr)) {
					usGrossNormz = Double.parseDouble(usGrossNormzStr);
				}
				
				
				double worldwideGrossNormz = -1;
				String worldwideGrossNormzStr = record.get("Worldwide Gross Normz").trim();
				if (NumberUtils.isNumber(worldwideGrossNormzStr)) {
					worldwideGrossNormz = Double.parseDouble(worldwideGrossNormzStr);
				}
				
				
				double usDvadSalesNormz = -1;
				String usDvadSalesNormzStr = record.get("US DVD Sales Normz").trim();
				if (NumberUtils.isNumber(usDvadSalesNormzStr)) {
					usDvadSalesNormz = Double.parseDouble(usDvadSalesNormzStr);
				}
				
				
				double rottenRatingNormz = -1;
				String rottenRatingNormzStr = record.get("RT Rating Normz").trim();
				if (NumberUtils.isNumber(rottenRatingNormzStr)) {
					rottenRatingNormz = Double.parseDouble(rottenRatingNormzStr);
				}
				
				
				double imdbRatingNormz = -1;
				String imdbRatingNormzStr = record.get("IMDB Rating Normz").trim();
				if (NumberUtils.isNumber(imdbRatingNormzStr)) {
					imdbRatingNormz = Double.parseDouble(imdbRatingNormzStr);
				}
				
				
				double imdbVotesNormz = -1;
				String imdbVotesNormzStr = record.get("IMDB Votes Normz").trim();
				if (NumberUtils.isNumber(imdbVotesNormzStr)) {
					imdbVotesNormz = Double.parseDouble(imdbVotesNormzStr);
				}
				
				double mppaRatingNormz = -1;
				String mppaRatingNormzStr = record.get("MPAA Rating Normz").trim();
				if (NumberUtils.isNumber(mppaRatingNormzStr)) {
					mppaRatingNormz = Double.parseDouble(mppaRatingNormzStr);
				}
				
				double runningTimeNormz = -1;
				String runningTimeNormzStr = record.get("Running Time Normz").trim();
				if (NumberUtils.isNumber(runningTimeNormzStr)) {
					runningTimeNormz = Double.parseDouble(runningTimeNormzStr);
				}
				
				
				double distributorNormz = -1;
				String distributorNormzStr = record.get("Distributro Normz").trim();
				if (NumberUtils.isNumber(distributorNormzStr)) {
					distributorNormz = Double.parseDouble(distributorNormzStr);
				}
				
				
				double sourceNormz = -1;
				String sourceNormzStr = record.get("Source Normz").trim();
				if (NumberUtils.isNumber(sourceNormzStr)) {
					sourceNormz = Double.parseDouble(sourceNormzStr);
				}
				
				double majorGenreNormz = -1;
				String majorGenreNormzStr = record.get("Major Genre Normz").trim();
				if (NumberUtils.isNumber(majorGenreNormzStr)) {
					majorGenreNormz = Double.parseDouble(majorGenreNormzStr);
				}
				
				
				allMovieInfoList.add(new MovieInfo(title, usGrossNormz, worldwideGrossNormz, usDvadSalesNormz, rottenRatingNormz, imdbRatingNormz, imdbVotesNormz, mppaRatingNormz, runningTimeNormz, distributorNormz, sourceNormz, majorGenreNormz));
				
				
			}
			
			 return allMovieInfoList;
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

		

		
	
	
	
}

