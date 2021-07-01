package br.com.zup.marvel.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.zup.marvel.dto.ComicDTO;
import br.com.zup.marvel.dto.wrapper.DataWrapperDTO;

@FeignClient(url="https://gateway.marvel.com/v1/public", name="marvel")
public interface MarvelService {
	
	@GetMapping("/comics/{comicId}?ts=1&apikey={publicKey}&hash={hash}")	
	public DataWrapperDTO<ComicDTO> getById(
			@PathVariable("comicId") String comicId, 
			@PathVariable("publicKey") String publicKey, 
			@PathVariable("hash") String hash);

}
