package com.ss.android.ugc.aweme.placediscovery.param;

import X.C00CV;
import X.C09CT;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDiscoveryLandingPageParams implements Serializable {

    @C09CT("current_region")
    public final LocationRegion currentRegion;
    public final C00CV discoveryScenario;

    @C09CT("enable_dynamic_map")
    public final Boolean enableDynamicMap;

    @C09CT("poi_category_list")
    public final List<PoiCategory> poiCategoryList;

    @C09CT("poi_id")
    public final String poiID;

    @C09CT("region_name")
    public final String regionName;

    @C09CT("select_tab_code")
    public final String selectTabCode;

    @C09CT("tab_region")
    public final String tabRegion;

    @C09CT("tab_region_dynamic_map_window")
    public final MapBounds tabRegionMapWindow;

    @C09CT("tab_region_name")
    public final String tabRegionName;
    public final String tabSchema;

    public PoiDiscoveryLandingPageParams(String str, String str2, LocationRegion locationRegion, List<PoiCategory> list, MapBounds mapBounds, String str3, String str4, String str5, Boolean bool, String str6, C00CV c00cv) {
        this.tabRegionName = str;
        this.tabRegion = str2;
        this.currentRegion = locationRegion;
        this.poiCategoryList = list;
        this.tabRegionMapWindow = mapBounds;
        this.selectTabCode = str3;
        this.regionName = str4;
        this.poiID = str5;
        this.enableDynamicMap = bool;
        this.tabSchema = str6;
        this.discoveryScenario = c00cv;
    }
}
