package com.example.dafinal;

public class Estructura_BD {
    private Estructura_BD(){}
    public static final String TABLE_NAME="estudiante";
    public static final String NOMBRE_COLUMNA1="nombre";
    public static final String NOMBRE_COLUMNA2="apellido";
    public static final String NOMBRE_COLUMNA3="edad";
    public static final String NOMBRE_COLUMNA4="universidad";
    public static final String NOMBRE_COLUMNA5="correo";


    private static final String TEXT_TYPE="TEXT";
    private static final String COMMA_SEP=",";
    public static final String SQL_CREATE_ENTRIES=
            "CREATE TABLE"+Estructura_BD.TABLE_NAME+"("+
                    Estructura_BD.NOMBRE_COLUMNA1+TEXT_TYPE+COMMA_SEP+
                    Estructura_BD.NOMBRE_COLUMNA2+TEXT_TYPE+COMMA_SEP+
                    Estructura_BD.NOMBRE_COLUMNA3+TEXT_TYPE+COMMA_SEP+
                    Estructura_BD.NOMBRE_COLUMNA4+TEXT_TYPE+COMMA_SEP+
                    Estructura_BD.NOMBRE_COLUMNA5+TEXT_TYPE+COMMA_SEP+")";
    public static final String SQL_DELETE_ENTRIES=
            "DROP TABLE IF EXISTS"+Estructura_BD.TABLE_NAME;

}
