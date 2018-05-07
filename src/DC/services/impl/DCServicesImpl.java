package DC.services.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import DC.services.model.CustomerDetailResponse;

public class DCServicesImpl {
	Map<String, String> mapVariables;
	Object anObject;

	public DCServicesImpl() {
		mapVariables = new HashMap<String, String>();
	}

	void initializeMap(String output) {
		String[] splitOutput = output.split("\\|");

		for (String variable : splitOutput) {
			String[] tmpArr = variable.split("=");
			if (tmpArr.length >= 2) {
				setMapVariable(tmpArr[0], tmpArr[1]);
			}
		}
	}

	void setMapVariable(String key, String val) {
		if (key != null && val != null && !key.isEmpty() && !val.isEmpty()) {
			if (!mapVariables.containsKey(key)) {
				mapVariables.put(key, val);
			}
		}
	}

	void setFieldValues(String className) {

		Class aClass;
		anObject = null;
		try {
			aClass = Class.forName(className);
			Field[] fields = aClass.getDeclaredFields();
			anObject = aClass.newInstance();
			for (Field field : fields) {
				if (mapVariables.containsKey(field.getName())) {
					Method method = anObject.getClass().getMethod(
							"set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1),
							String.class);
					method.invoke(anObject, mapVariables.get(field.getName()));
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
