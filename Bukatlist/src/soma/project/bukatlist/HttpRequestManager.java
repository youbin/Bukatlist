package soma.project.bukatlist;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class HttpRequestManager {
	static private final HttpClient client = getThreadSafeClient();
	static private HttpPost post;
	static private UrlEncodedFormEntity entity;
	static private HttpGet get;
	
	private HttpRequestManager() {
	}
	
	static public String request(String postUrl, List<BasicNameValuePair> params){
		String result;
		try {
			post = new HttpPost(postUrl);
			entity = new UrlEncodedFormEntity(params, HTTP.UTF_8);
			post.setEntity(entity);
			HttpResponse responsePost = client.execute(post);
			HttpEntity resEntity = responsePost.getEntity();
			
			if(resEntity != null){
				result = EntityUtils.toString(resEntity);
			}
			else{
				result = "";
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			result = "fail";
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			result = "fail";
		} catch (IOException e) {
			e.printStackTrace();
			result = "fail";
		}
		return result;
	}
	
	static public String requestGet(String getUrl){
		String result;
		try {
			get = new HttpGet(getUrl);
			get.getURI();
			HttpResponse responsePost = client.execute(get);
			HttpEntity resEntity = responsePost.getEntity();
			
			if(resEntity != null){
				result = EntityUtils.toString(resEntity);
			}
			else{
				result = "";
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			result = "fail";
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			result = "fail";
		} catch (IOException e) {
			e.printStackTrace();
			result = "fail";
		}
		return result;
	}
	
	public static DefaultHttpClient getThreadSafeClient() {

	    DefaultHttpClient client = new DefaultHttpClient();
	    ClientConnectionManager mgr = client.getConnectionManager();
	    HttpParams params = client.getParams();

	    client = new DefaultHttpClient(
	        new ThreadSafeClientConnManager(params,
	            mgr.getSchemeRegistry()), params);

	    return client;
	}
}
