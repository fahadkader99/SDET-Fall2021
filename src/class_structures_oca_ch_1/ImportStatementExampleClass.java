package class_structures_oca_ch_1;

//import java.util.Date;
//import java.util.Random;
import data_types_oca_ch_1.*;
//import data_types.PrimitiveDataTypes_2;


import java.util.*;
/*
    Some of the packages are already imported on the start of our application such as: java.lang and
    all of it's classes.

    Wildcards - are some special characters that we can use to refer to some parts of packages.
    * -> is used for importing all classes of the package;
 */
public class ImportStatementExampleClass {

    public static void main(String[] args) {

        System.out.println(Math.max(4,2));

        Random rand = new Random();
        Date date = new Date();

        // I want to create an object of ClassStructure
        // and it is located in the same package as this class

        ClassStructure object1 = new ClassStructure();

        PrimitiveDataTypes_1 objectFromDifferentPackage = new PrimitiveDataTypes_1();

        PrimitiveDataTypes_2 objectFromDifferentPackage2 = new PrimitiveDataTypes_2();

    }
}
