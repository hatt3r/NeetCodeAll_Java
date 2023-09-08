public class Codec {
    public String encode(String longUrl) {
        longUrl.replace("/",".");
        return longUrl;
    }
    public String decode(String shortUrl) {
        shortUrl.replace(".","/");
        return shortUrl;
    }
}