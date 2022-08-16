import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class JavaColours {

	public static void main(String[] args) throws IllegalAccessException {

		// retrieve all the Color class fields 
		Class<Color> clazz = Color.class;
		Field[] colorFields = clazz.getDeclaredFields();

		
		HashMap<String, Color> singleColors = new HashMap<String, Color>();


		for (Field colorField : colorFields) {
			
			// all desired colors are public
			// so retrieve all access modifiers and ignore any non-public ones
			int modifiers = colorField.getModifiers();
			if (!Modifier.isPublic(modifiers)) {
				continue;
			}

			//  If the field is a static field (like in this case), 
			// the argument of obj is ignored; it may be null
			Color c = (Color) colorField.get(null);
			if (!singleColors.values().contains(c)) {
				singleColors.put(colorField.getName(), c);
			}
		}

		for (String k : singleColors.keySet()) {
			System.out.println(k);
		}

	}

}
