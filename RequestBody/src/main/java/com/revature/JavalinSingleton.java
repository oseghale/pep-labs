package com.revature;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/song", ctx -> {
               ObjectMapper om = new ObjectMapper();
               String artistName = ctx.body();
               Song song = om.readValue(artistName, Song.class);
                  //we need to let the request know we will send back json in the body
            // ctx.contentType("application/json"); 
                //implement logic here
                // Parse the JSON request body
                //Song song = ctx.bodyAsClass(Song.class);
                
                
                // Extract the artist name from the song object
                song.getArtistName();
                // Return the artist name
                ctx.result(artistName);
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/song", ctx -> {
                //implement logic here
                // Parse the JSON request body
                Song song = ctx.bodyAsClass(Song.class);
                // Update the artist in the song object
                song.setArtistName("Beatles");
                // Return the updated song object in the response body
                ctx.json(song);
        });


        return app;
    }
    
}
