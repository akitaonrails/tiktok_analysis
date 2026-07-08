package com.ss.android.ugc.aweme.placediscovery.param;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyPoiCategoryResponse extends BaseResponse implements Serializable {

    @C09CT("current_region")
    public final LocationRegion currentRegion;

    @C09CT("poi_category_list")
    public final List<PoiCategory> poiCategoryList;

    @C09CT("select_tab_code")
    public final String selectTabCode;

    @C09CT("tab_region")
    public final String tabRegion;

    @C09CT("tab_region_dynamic_map_window")
    public final MapBounds tabRegionMapWindow;

    @C09CT("tab_region_name")
    public final String tabRegionName;

    public NearbyPoiCategoryResponse() {
        this(null, null, null, null, null, null);
    }

    public final NearbyPoiCategoryResponse copy(String str, String str2, LocationRegion locationRegion, List<PoiCategory> list, MapBounds mapBounds, String str3) {
        return new NearbyPoiCategoryResponse(str, str2, locationRegion, list, mapBounds, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPoiCategoryResponse)) {
            return false;
        }
        NearbyPoiCategoryResponse nearbyPoiCategoryResponse = (NearbyPoiCategoryResponse) obj;
        return Intrinsics.LJFF(this.tabRegionName, nearbyPoiCategoryResponse.tabRegionName) && Intrinsics.LJFF(this.tabRegion, nearbyPoiCategoryResponse.tabRegion) && Intrinsics.LJFF(this.currentRegion, nearbyPoiCategoryResponse.currentRegion) && Intrinsics.LJFF(this.poiCategoryList, nearbyPoiCategoryResponse.poiCategoryList) && Intrinsics.LJFF(this.tabRegionMapWindow, nearbyPoiCategoryResponse.tabRegionMapWindow) && Intrinsics.LJFF(this.selectTabCode, nearbyPoiCategoryResponse.selectTabCode);
    }

    public int hashCode() {
        String str = this.tabRegionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabRegion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocationRegion locationRegion = this.currentRegion;
        int iHashCode3 = (iHashCode2 + (locationRegion == null ? 0 : locationRegion.hashCode())) * 31;
        List<PoiCategory> list = this.poiCategoryList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        MapBounds mapBounds = this.tabRegionMapWindow;
        int iHashCode5 = (iHashCode4 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        String str3 = this.selectTabCode;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyPoiCategoryResponse(tabRegionName=");
        sbLIZ.append(this.tabRegionName);
        sbLIZ.append(", tabRegion=");
        sbLIZ.append(this.tabRegion);
        sbLIZ.append(", currentRegion=");
        sbLIZ.append(this.currentRegion);
        sbLIZ.append(", poiCategoryList=");
        sbLIZ.append(this.poiCategoryList);
        sbLIZ.append(", tabRegionMapWindow=");
        sbLIZ.append(this.tabRegionMapWindow);
        sbLIZ.append(", selectTabCode=");
        sbLIZ.append(this.selectTabCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean hasFavCategory() {
        List<PoiCategory> list = this.poiCategoryList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<PoiCategory> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getTabCode(), "favorite_places")) {
                return true;
            }
        }
        return false;
    }

    public final LocationRegion getCurrentRegion() {
        return this.currentRegion;
    }

    public final List<PoiCategory> getPoiCategoryList() {
        return this.poiCategoryList;
    }

    public final String getSelectTabCode() {
        return this.selectTabCode;
    }

    public final String getTabRegion() {
        return this.tabRegion;
    }

    public final MapBounds getTabRegionMapWindow() {
        return this.tabRegionMapWindow;
    }

    public final String getTabRegionName() {
        return this.tabRegionName;
    }

    public NearbyPoiCategoryResponse(String str, String str2, LocationRegion locationRegion, List<PoiCategory> list, MapBounds mapBounds, String str3) {
        this.tabRegionName = str;
        this.tabRegion = str2;
        this.currentRegion = locationRegion;
        this.poiCategoryList = list;
        this.tabRegionMapWindow = mapBounds;
        this.selectTabCode = str3;
    }
}
