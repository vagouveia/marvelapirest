package br.com.zup.marvel.util;

import java.util.Calendar;
import java.util.Date;

import br.com.zup.marvel.enums.DiaDaSemanaEnum;

public class DataUtils {

	public static Integer getDiaSemana() {

		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_WEEK);

	}

	public static String getNomeSemana(Integer diaSemana) {
		
		String nomeSemana = null;
		
		switch (diaSemana) {
		case 2:
			nomeSemana = DiaDaSemanaEnum.SEGUNDA.getDescricao(); 
			break;
		case 3:
			nomeSemana = DiaDaSemanaEnum.TERCA.getDescricao(); 
			break;
		case 4:
			nomeSemana = DiaDaSemanaEnum.QUARTA.getDescricao(); 
			break;
		case 5:
			nomeSemana = DiaDaSemanaEnum.QUINTA.getDescricao(); 
			break;
		case 6:
			nomeSemana = DiaDaSemanaEnum.SEXTA.getDescricao(); 
			break;
		default:
			break;
		}
		
		return nomeSemana; 
	}
}
