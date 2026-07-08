package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlaceResponse extends SearchApiResult {

    @C09CT("poi_info")
    public final SearchPOIInfo poiInfo;

    public static final class LocalServiceInfo {

        @C09CT("local_service_places_all_tabs_list")
        public final List<PlacesTabItem> allTabsList;

        @C09CT("local_service_places_current_tab")
        public final String currentTab;
    }

    public static final class PlacesTabIcon {

        @C09CT("dark_url")
        public final String darkUrl;

        @C09CT("height")
        public final Integer height;

        @C09CT("light_url")
        public final String lightUrl;

        @C09CT("width")
        public final Integer width;
    }

    public static final class PlacesTabItem {

        @C09CT("icon")
        public final PlacesTabIcon icon;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("text")
        public final String text;
    }

    public static final class SearchPOIInfo {

        @C09CT("dynamic_patch")
        public final DynamicPatch dynamicPatch;

        @C09CT("local_service_info")
        public final LocalServiceInfo localServiceInfo;

        @C09CT("nearby_auth")
        public final DynamicPatch nearbyAuth;

        @C09CT("poi_info")
        public final List<n> poiInfo;
    }
}
