package br.com.zup.marvel.util;

import br.com.zup.marvel.dto.ComicDTO;
import br.com.zup.marvel.enums.DiaDaSemanaEnum;

public class IbsnUtils {

	public static Integer retornaDiaSeanaIbsn(ComicDTO objComicDTO) {

		Integer tamanhoIbsn = objComicDTO.getIsbn().length();
		String ibsnStr = objComicDTO.getIsbn();
		Integer ibsn = null;

		if (tamanhoIbsn > 0) {

			String f = "Final ";
	
			ibsnStr = ibsnStr.substring(tamanhoIbsn - 3, tamanhoIbsn);
			ibsnStr = f.concat(ibsnStr);

			switch (ibsnStr) {
			case "Final 0-1":
				ibsn = DiaDaSemanaEnum.SEGUNDAFEIRA.getDiaSemana(); 
				break;
			case "Final 2-3":
				ibsn = DiaDaSemanaEnum.TERCAFEIRA.getDiaSemana(); 
				break;
			case "Final 4-5":
				ibsn = DiaDaSemanaEnum.QUARTAFEIRA.getDiaSemana(); 
				break;
			case "Final 6-7":
				ibsn = DiaDaSemanaEnum.QUINTAFEIRA.getDiaSemana(); 
				break;
			case "Final 8-9":
				ibsn = DiaDaSemanaEnum.SEXTAFEIRA.getDiaSemana(); 
				break;
			default:
				break;
			}			

		}
		
		return ibsn;
	}

}
