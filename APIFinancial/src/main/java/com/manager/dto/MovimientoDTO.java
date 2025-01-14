package com.manager.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MovimientoDTO {
	private Long id;
	@NotBlank
	private CuentaDTO cuenta;
	
	@NotBlank
	private Date fecha;
	
	private String tipoMovimiento;
	@NotBlank
	private Double valor;
	private Double saldo;
	private Double saldoAnterior;
	@NotBlank
	private Boolean estado;
}
