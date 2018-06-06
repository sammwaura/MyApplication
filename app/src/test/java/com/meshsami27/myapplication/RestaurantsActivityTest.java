//package com.meshsami27.myapplication;
//
//import android.os.Build;
//import android.widget.ListView;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.robolectric.Robolectric;
//import org.robolectric.RobolectricTestRunner;
//import org.robolectric.annotation.Config;
//
//import static junit.framework.Assert.assertEquals;
//import static junit.framework.Assert.assertNotNull;
//
//@RunWith(RobolectricTestRunner.class)
//
//public class RestaurantsActivityTest {
//    private RestaurantsActivity activity;
//    private ListView mRestaurantListView;
//
//    @Before
//    public void setup() {
//        activity = Robolectric.setupActivity(RestaurantsActivity.class);
//        mRestaurantListView = (ListView) activity.findViewById(R.id.listView);
//    }
//
//    @Test
//    public void restaurantListViewPopulates() {
//        assertNotNull(mRestaurantListView.getAdapter());
//        assertEquals(mRestaurantListView.getAdapter().getCount(), 16);
//    }
//
//}
