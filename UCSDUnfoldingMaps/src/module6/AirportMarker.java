package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PConstants;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.fill(11);
		pg.ellipse(x, y, 5, 5);
		
		
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		String name = "Name : " + getName();
		String city = "City : " + getCity();
		
		pg.fill(255, 255, 255);
		float width = Math.max(pg.textWidth(name), pg.textWidth(city));
		pg.rect(x, y-55, width+10, 35);
		pg.fill(0, 0, 0);
		pg.text(name, x+5, y-40);
		pg.text(city, x+5, y-25);
		
		// show routes
	}
	
	public String getCode() {
		return (String) getProperty("code");	
	}
	
	public String getName() {
		return (String) getProperty("name");	
	}
	
	public String getCity() {
		return (String) getProperty("city");	
	}
	
}
