package br.com.zup.marvel.util;

import br.com.zup.marvel.dto.ComicDTO;
import br.com.zup.marvel.dto.ComicPriceDTO;
import br.com.zup.marvel.dto.CreatorSummaryDTO;

public class LivroUtils {
	
	public static String converterListaAutoresParaString(ComicDTO objComicDTO) {
		
		String autor = "";
		
		for (CreatorSummaryDTO listCreators : objComicDTO.getCreators().getItems()) {
			if(objComicDTO.getCreators().getAvailable() > 1) {
				
				autor += listCreators.getName() + ", ";
				
			} else {
				
				autor = listCreators.getName() + ", ";
				
			}
		}

		if(autor.length() == 0) {
			
			return autor;
		}
		
		autor = autor.substring(0, autor.length()-2);
		
		return autor;
	}
	
	public static Double converterListaPrecoParaDouble(ComicDTO objComicDTO) {
		
		Double preco = 0.0;
		
		for (ComicPriceDTO price : objComicDTO.getPrices()) {
			
			String precoStr = String.valueOf(price.getPrice());
			
			preco = Double.parseDouble(precoStr);
			
		}
		return preco;
	}
	
	public static String limitarQuantidadeString(String texto) {
		
		return texto.length() <=255 ? texto : texto.substring(0, 255);
	}

}
