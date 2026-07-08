package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGeneralCommonParams implements Serializable {

    @C09CT("collect_info")
    public String collectInfo;
    public Map<String, String> collectInfoMap;

    @C09CT("enable_location")
    public final String enableLocation;

    @C09CT("from_group_id")
    public String fromGroupId;

    @C09CT("group_id")
    public String groupId;

    @C09CT("initial_poi_enter_from")
    public final String initialPoiEnterFrom;

    @C09CT("initial_poi_enter_method")
    public final String initialPoiEnterMethod;

    @C09CT("initial_poi_from_group_id")
    public final String initialPoiFromGroupId;

    @C09CT("initial_poi_id")
    public String initialPoiId;

    @C09CT("local_service_key_category")
    public String localServiceKeyCateGory;

    @C09CT("poi_detail_enter_from")
    public final String poiDetailEnterFrom;

    @C09CT("poi_detail_enter_method")
    public final String poiDetailEnterMethod;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_router_params")
    public final Map<String, String> poiRouterParams;

    @C09CT("poi_session_id")
    public final String poiSessionId;

    @C09CT("search_id")
    public String searchId;

    @C09CT("search_result_id")
    public String searchResultId;

    @C09CT("utm_source")
    public final String utmSource;

    public PoiGeneralCommonParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiGeneralCommonParams)) {
            return false;
        }
        PoiGeneralCommonParams poiGeneralCommonParams = (PoiGeneralCommonParams) obj;
        return Intrinsics.LJFF(this.poiId, poiGeneralCommonParams.poiId) && Intrinsics.LJFF(this.collectInfo, poiGeneralCommonParams.collectInfo) && Intrinsics.LJFF(this.initialPoiEnterFrom, poiGeneralCommonParams.initialPoiEnterFrom) && Intrinsics.LJFF(this.initialPoiEnterMethod, poiGeneralCommonParams.initialPoiEnterMethod) && Intrinsics.LJFF(this.initialPoiFromGroupId, poiGeneralCommonParams.initialPoiFromGroupId) && Intrinsics.LJFF(this.poiSessionId, poiGeneralCommonParams.poiSessionId) && Intrinsics.LJFF(this.localServiceKeyCateGory, poiGeneralCommonParams.localServiceKeyCateGory) && Intrinsics.LJFF(this.initialPoiId, poiGeneralCommonParams.initialPoiId) && Intrinsics.LJFF(this.groupId, poiGeneralCommonParams.groupId) && Intrinsics.LJFF(this.fromGroupId, poiGeneralCommonParams.fromGroupId) && Intrinsics.LJFF(this.searchId, poiGeneralCommonParams.searchId) && Intrinsics.LJFF(this.searchResultId, poiGeneralCommonParams.searchResultId) && Intrinsics.LJFF(this.poiDetailEnterFrom, poiGeneralCommonParams.poiDetailEnterFrom) && Intrinsics.LJFF(this.poiDetailEnterMethod, poiGeneralCommonParams.poiDetailEnterMethod) && Intrinsics.LJFF(this.poiRouterParams, poiGeneralCommonParams.poiRouterParams) && Intrinsics.LJFF(this.enableLocation, poiGeneralCommonParams.enableLocation) && Intrinsics.LJFF(this.utmSource, poiGeneralCommonParams.utmSource);
    }

    public String toString() {
        return "PoiGeneralCommonParams(poiId=" + this.poiId + ", collectInfo=" + this.collectInfo + ", initialPoiEnterFrom=" + this.initialPoiEnterFrom + ", initialPoiEnterMethod=" + this.initialPoiEnterMethod + ", initialPoiFromGroupId=" + this.initialPoiFromGroupId + ", poiSessionId=" + this.poiSessionId + ", localServiceKeyCateGory=" + this.localServiceKeyCateGory + ", initialPoiId=" + this.initialPoiId + ", groupId=" + this.groupId + ", fromGroupId=" + this.fromGroupId + ", searchId=" + this.searchId + ", searchResultId=" + this.searchResultId + ", poiDetailEnterFrom=" + this.poiDetailEnterFrom + ", poiDetailEnterMethod=" + this.poiDetailEnterMethod + ", poiRouterParams=" + this.poiRouterParams + ", enableLocation=" + this.enableLocation + ", utmSource=" + this.utmSource + ')';
    }

    public final void setCollectInfo(String str) {
        this.collectInfo = str;
    }

    public final void setCollectInfoMap(Map<String, String> map) {
        this.collectInfoMap = map;
    }

    public final void setFromGroupId(String str) {
        this.fromGroupId = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setInitialPoiId(String str) {
        this.initialPoiId = str;
    }

    public final void setLocalServiceKeyCateGory(String str) {
        this.localServiceKeyCateGory = str;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchResultId(String str) {
        this.searchResultId = str;
    }

    public PoiGeneralCommonParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map, String str15, String str16) {
        this.poiId = str;
        this.collectInfo = str2;
        this.initialPoiEnterFrom = str3;
        this.initialPoiEnterMethod = str4;
        this.initialPoiFromGroupId = str5;
        this.poiSessionId = str6;
        this.localServiceKeyCateGory = str7;
        this.initialPoiId = str8;
        this.groupId = str9;
        this.fromGroupId = str10;
        this.searchId = str11;
        this.searchResultId = str12;
        this.poiDetailEnterFrom = str13;
        this.poiDetailEnterMethod = str14;
        this.poiRouterParams = map;
        this.enableLocation = str15;
        this.utmSource = str16;
    }
}
