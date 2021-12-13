//package com.codeup.adlister.dao;
//import com.codeup.adlister.models.Concert;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListAdsDao implements Concerts {
//    private List<Concert> concerts;
//
//    public List<Concert> all() {
//        if (concerts == null) {
//            generateAds();
//        }
//        return concerts;
//    }
//
//    @Override
//    public List<Concert> searchAds(String name) {
//        return null;
//    }
//
//    public Long insert(Concert concerts) {
//        // make sure we have ads
//        if (concerts == null) {
//            generateAds();
//        }
//        // we'll assign an "id" here based on the size of the ads list
//        // really the dao would handle this
//        Concert.setId((long) concert.size());
//        concerts.add((Ad) concert);
//        return concert.getId();
//    }
//
//    private List<Concert> generateAds() {
//        List<Concert> ads = new ArrayList<>();
//        ads.add(new Concert(
//            1,
//            "Whiskey",
//            "playstation for sale",
//            "This is a slightly used playstation"
//        ));
//        ads.add(new Concert(
//            2,
//            "Jack Daniels",
//            "Super Nintendo",
//            "Get your game on with this old-school classic!"
//        ));
//        ads.add(new Concert(
//            3,
//            "Steve Smith",
//            "Junior Java Developer Position",
//            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
//        ));
//        ads.add(new Concert(
//            4,
//            "John Smith",
//            "JavaScript Developer needed",
//            "Must have strong Java skills"
//        ));
//        return ads;
//    }
//}
