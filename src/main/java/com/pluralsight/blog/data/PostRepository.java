package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class PostRepository {

    private final List<Post> ALL_POSTS = new ArrayList<>(Arrays.asList(
            new Post(1l, "NGOSWE  PENZI KITOVU CHA UZEMBE",
                    "mapenzi sababu ya uzembe wa kuharibu kazi",
                    "soma zaidi ujifunze kuto kuchanaya mapenzi na kazi!",
                    "MADENGE"
                   , new Date()),
            new Post(2l, "THIS TIME TOMMOWROW",
                    "everyone wants to know what will going to happen tomorow",
                    "Smart speakers listen to you all right.  Sometimes they get a little snippy but will still order your favorite takeout.",
                    "JOSEPH", new Date()),
            new Post(3l, "KILIO CHETU",
                     "kilio chenye maumivu makali kisicho na tiba yake hadi kufa",
                    "jifunze kuchukua tahadhari mapema kabla hujaikwa na majanga!!",
                    "HAMADI", new Date()),
            new Post(4l, "DIARY Of THE WIMPY KID",
                    "Entertinment for every level of person",
                    "check it to get mind rereshment!",
                    "Sarah Holderness", new Date()),
            new Post(5l, "HARRY PORTER",
                    "Discover the mistry of WIZERD!",
                    "UCHAWI UPO!!!",
                    "PORTER HARRY", new Date()),
            new Post(6l, "OUR BEST TRIP",
                    "best enjoyment for any succesfull person is to get a vaccation",
                    "click to read more to know how you can enjoy a good tripp",
                    "Sarah Holderness", new Date()),
            new Post(7l, "KHATIMA YETU",
                    "KILA MMOJA ATAUONJA UMAUTI!!",
                    "Ewe mwanadamu mwenzangu, tafadhali soma zaidi upate UKUMBUSHO....hii dunia ni mapito tu!!",
                    "USTDH.AHMAD MSELEM", new Date()),
            new Post(8l, "HADITHI ZA KISWAHILI",
                    "Hadithi kwa ajili ya watoto, \"Hi\".",
                    "Wasomee watoto wako wafurahie, \"Hi\".",
                    "DAMAMU WA JIRANI", new Date())
    ));

    public List<Post> getAllPosts() {

        return ALL_POSTS;
    }

    public Post findById(Long id) {
        //for each post in ALL_POSTS
        for(Post post: ALL_POSTS){
            if(post.getId() == id);
            return post;
        }
        return null;
    }
}
