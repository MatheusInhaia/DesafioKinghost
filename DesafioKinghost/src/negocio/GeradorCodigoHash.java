import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;

import org.apache.commons.codec.binary.Hex;


public class GeradorCodigoHash {

	private String privateKey="4a935b651d96142558012845c7177c9132286f02";
	private String publicKey = "8cab849d1abcb90359b9dafcac097507";
	byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(getCurrentTime()+ getPrivatekey() + getPublicKey());
	String result = new String(Hex.encodeHex(hash));
	
	public GeradorCodigoHash() {
		

	}
	
	public String getPrivatekey() {
		return privateKey;
	}
	
	public String getPublicKey() {
		return publicKey;
	}
	
	public long getCurrentTime() {
		return System.currentTimeMillis();
	}
	
	public String codigoHash() {
		return result;
	}
	/*
	 tentando fazer um requisição para api da marvel...
	 
	public static void main(String args[]) {
		GeradorCodigoHash g = new GeradorCodigoHash();
		Client client = ClientBuilder.newClient();
		System.out.println(g.codigoHash());
		WebTarget baseTarget = client.target("http://gateway.marvel.com:80/v1/public/characters/1009610?")
				.queryParam("ts=", g.codigoHash()).queryParam("&apikey=", g.getPublicKey()).queryParam("&hash=", g.codigoHash());
		System.out.println(baseTarget.request(MediaType.APPLICATION_JSON).get(String.class) + " \nFim do resultado");
		/*
		GeradorCodigoHash g = new GeradorCodigoHash();
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl= "https://gateway.marvel.com:443/v1/public/characters?name=Spider-Man&limit="+g.getCurrentTime()+"&apikey=8cab849d1abcb90359b9dafcac097507&hash="+g.codigoHash();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		System.out.println(response);
		*/
	
	
}
