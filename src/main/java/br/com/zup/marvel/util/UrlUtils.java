package br.com.zup.marvel.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UrlUtils {
	
	protected static String privateKey = "informe o número da private key";
	protected static String publicKey = "informe o número da public key";

	public static String criarHash() {

		String ts = "1";
		
		String hash = ts.concat(privateKey).concat(publicKey);
		
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		m.update(hash.getBytes(), 0, hash.length());
		String url = new BigInteger(1, m.digest()).toString(16);	

		return url;
	}
	
	public static String getPublicKey() {
		return publicKey;
	}

}
