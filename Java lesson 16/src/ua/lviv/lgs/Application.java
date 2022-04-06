package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Iterator;

public class Application {
	
public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
	
	
	Class pc = Person.class;
	
	//get name of class
	String nameOfClass = pc.getName();
	System.out.println("Name of class = "+ nameOfClass);
	String simpleName = pc.getSimpleName();
	System.out.println("Simple name = "+ simpleName);
	System.out.println();
	int modifier = pc.getModifiers();
	String modifierText = Modifier.toString(modifier);
	System.out.println("Class modifier = "+ modifierText + " int = "+ modifier);
	System.out.println("is static = "+Modifier.isStatic(modifier));
	System.out.println("is public = "+Modifier.isPublic(modifier));
	System.out.println("is abstract = "+Modifier.isAbstract(modifier));
	System.out.println("is private = "+Modifier.isPrivate(modifier));
	System.out.println();
	Package classPackage = pc.getPackage();
	System.out.println("Package of current class = "+ classPackage);
	System.out.println();
	Class superClass = pc.getSuperclass();
	System.out.println("Super class = "+ superClass);
	System.out.println();
	Constructor[] personConstructor = pc.getConstructors();
	
	for (Constructor constructor:personConstructor) {
		System.out.println("Constructor = "+ constructor);
	}

	System.out.println("Constructors size = "+personConstructor.length);
	System.out.println();
	Method[] personMethods = pc.getMethods();
	
	for (Method method: personMethods) {
		System.out.println("Method = "+ method);
	}

	System.out.println("Constructors size = "+personMethods.length);
	System.out.println();
	Field[] personFields = pc.getDeclaredFields();
	for (Field field : personFields) {
		System.out.println("Field = "+field);
	}
	System.out.println("Fields size = "+personFields.length);
	
	
	
}
}
