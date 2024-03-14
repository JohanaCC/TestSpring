package com.manager.util;

public class Constants {

	//Codigos de respuesta
	public static final String INTERNAL_ERROR_SERVER = "500";
	public static final String OK = "200";
	public static final String CREATE = "201";
	public static final String DELETE = "202";
	public static final String FOUND = "203";
	public static final String NOT_FOUND = "101";
	public static final String RECORD_INACTIVE = "102";
	public static final String WRONG_FORMAT = "501";
	public static final String NOT_ALLOWED = "502";
	public static final String NOT_BALANCE = "600";
	
	//Mensajes de respuesta
	public static final String INTERNAL_ERROR_SERVER_MSG = "Lo sentimos, problemas con el servidor.";
	public static final String OK_MSG = "Proceso completado exitosamente.";
	public static final String CREATE_MSG = "Se registro correctamente.";
	public static final String DELETE_MSG = "Se elimino correctamente.";
	public static final String FOUND_MSG = "Se hallaron registros.";
	public static final String NOT_FOUND_MSG = "Lo sentimos, no se hallaron registros.";
	public static final String RECORD_INACTIVE_MSG = "El registro se encuentra inactivo.";
	public static final String WRONG_FORMAT_MSG = "Error en el formato de la solicitud. Por favor, verifica la estructura del JSON.";
	public static final String NOT_ALLOWED_MSG = "Método HTTP no permitido para este recurso.";
	public static final String NOT_BALANCE_MSG = "Saldo insuficiente o no disponible";
	
	
	//Tipos de actualizacion
	public static final int UPDATE_PATCH=2;
	public static final int UPDATE_PUT=2;

}
