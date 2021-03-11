package com.rest.apidemo;


import static io.restassured.RestAssured.given;

import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;
/**
 * Unit test for simple App.
 */
@RunWith(DataProviderRunner.class)
public class AppTest
{
	@DataProvider
	public static Object[][] apidata()
	{
		return new Object[][] {
			//{"40lttlOsy80T9hwop91gwg","IN"}
			{"37i9dQZF1E38IGsq2mZTex","IN"}		};
	}
	@DataProvider
	public static String auth()
	{
		return new String("BQDP7K3fBd5rs37sWk8VEj7Z4DfUiAJ-BmBz-cCjUlCfFQkYmVd4uVY7Pch6IgdfVKbP4UhaW8vlFc9G49LjK-170dCbFlMJgmFhqUNmFeMMd53YKuCVAmpH04NuacYg6EI40CIRswPra_-TuK6Y5q13oihdJ5yJm7e0BA0HD8dt3Y4KCSNTssUQNmyi6vOkQxGNNWFpDGwOJwX5f-IBKAYikVMdsvh6mi_gnpwfuhSPUDzvbGvO5oQ5z0ufu6PrYtWNX28kZqt6");
	}

    /**
     * Rigorous Test :-)
     */
	//helps to get the tracks present in a playlist
    @Test   
    @UseDataProvider("apidata")
    public void check_for_statuscode(String pathparam,String queryParam)
    {
    	//
    	
    		/*given()
    		.pathParam("playlistid", pathparam)
    		
    		.auth()
    		.oauth2("BQAZkSw4hemstKacz2uYUhZgThjmfd2uFbxS31OD9PUutYwrlXgIRHuO52egFTchQ6HVRy8WYCa2idYlwl50WQBALEm3lUQ_xUP8GJKwAZ-YuxWW25BM_EGtq7TolQ75Scskzcc5T6DnTSE_jtZYDPa1vkWp4e_NsILo9sJKI0WYoqX8loSIo1S6ek3c-oIieOuE1vjcRA2k6v03c7a4GYvVe-9b96EUx2rHzhjxxiuqWL4d2vZTpipD7oUSczoX0Otgt1FLF8zT")
    		.accept("application/json").contentType("application/json")
    		.when().get("https://api.spotify.com/v1/playlists/{playlistid}/tracks?market="+queryParam)
    		.then().assertThat().statusCode(200).log().all();
    		
    		*/
    	//to get a particular value from json
    		/*String s=given()
    		.pathParam("playlistid", pathparam)
    		
    		.auth()
    		.oauth2("BQDwj7lIgEHFFNiLa1qgcM6wPQ5kMb9cq5aLtEcD6tIMqlEEYFjtb4pS0de21Bm5lWR8gkVSbxXm3drxdgUQ0MGHoKBd9km040hsnCg5eOaaw2iG7JNsHeq4OSRytzDq32XlWH7KuptLBD7zEFsGOs45VHe8-JMTtGaeJd5Q5ytt-9oFpup1Q96lfrRMtS9svp9-BscVcGr_0Ou-W7MHdaqnJJwxyE8PJ5vlreRek1G6i7KnjwrSuidZVBTzsK-GBkFHwGDGgbhY")
    		.accept("application/json").contentType("application/json")
    		.when().get("https://api.spotify.com/v1/playlists/{playlistid}/tracks?market="+queryParam)
    		.then().extract().jsonPath().getString("limit");
    		System.out.println(s);
    		*/
        //get the whole body
    		/*String s1=given()
    	    		.pathParam("playlistid", pathparam)
    	    		
    	    		.auth()
    	    		.oauth2("BQDwj7lIgEHFFNiLa1qgcM6wPQ5kMb9cq5aLtEcD6tIMqlEEYFjtb4pS0de21Bm5lWR8gkVSbxXm3drxdgUQ0MGHoKBd9km040hsnCg5eOaaw2iG7JNsHeq4OSRytzDq32XlWH7KuptLBD7zEFsGOs45VHe8-JMTtGaeJd5Q5ytt-9oFpup1Q96lfrRMtS9svp9-BscVcGr_0Ou-W7MHdaqnJJwxyE8PJ5vlreRek1G6i7KnjwrSuidZVBTzsK-GBkFHwGDGgbhY")
    	    		.accept("application/json").contentType("application/json")
    	    		.when().get("https://api.spotify.com/v1/playlists/{playlistid}/tracks?market="+queryParam)
    	    		.then().extract().body().asPrettyString();
    	    		System.out.println(s1);
    	    		*/
    	    		
    	  //get the playlist and check for valid data
    	    		
    	    		given()
    	    	    		.pathParam("playlistid", pathparam)
    	    	    		
    	    	    		.auth()
    	    	    		.oauth2("BQBZFn_9N-9fq2lfp41tDuCruHtz2ld9Csoueq03bBZg1NUkZQty0GcYP242Cv2LeAGb3Ln7gB5zuinDMHdyUbK_Q2DaX_YArFX7h35fR7nn_F1QQUXlhTNrAtUHtJEs47lLAtBn3byLubxIyTrZZUpb65AcuiInPs11Qj32GHlnZd-UPPZ3n0d-BOncipiDDVtggBLaFigDBnVRxTQiOk6y109hTtfZgkmC2vaoJNNcGDwABQ-b1oXsiLYj44KnaHcLmH_cOfZsa3K2jfpRVfo")
    	    	    		.accept("application/json").contentType("application/json")
    	    	    		.when().get("https://api.spotify.com/v1/playlists/{playlistid}/tracks?market="+queryParam)
    	    	    		.then().assertThat().body("items[0].added_at",Matchers.hasToString("1970-01-01T00:00:00Z"));
    	    	    		
    }
    @Test
    public void post_playlist_data()
    {
    	
    }
    
}
