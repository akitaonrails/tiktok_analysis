package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import X.C1164160gOs;
import X.C1176220giK;
import X.C1176270giP;
import X.C1201190hMb;
import X.C786410Ut5;
import X.EnumC1175610ghL;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailResponse extends C1164160gOs implements Serializable {
    public C1176220giK LL;
    public C1176270giP LLILLJJLI;
    public boolean LLILLL;

    @C09CT("biz_code")
    public final Integer bizCode;

    @C09CT("current_poi_hotel_shelf_info")
    public final HotelShelfInfo currentPoiHotelShelfInfo;

    @C09CT("filter_group")
    public final List<PoiFeedFilterStruct> filterGroup;

    @C09CT("filter_key_category_list")
    public final List<PoiFeedFilterKeyCategory> filterKeyCategoryList;

    @C09CT("is_distance_sort_valid")
    public final Boolean isDistanceSortValid;

    @C09CT("is_rating_sort_valid")
    public final Boolean isRatingSortValid;

    @C09CT("dynamic_map_window")
    public final MapBounds mapWindow;

    @C09CT("poi_detail_tag_style_map")
    public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

    @C09CT("poi_list_panel_title")
    public final String poiListPanelTitle;

    @C09CT("poi_list_v2")
    public List<PoiGeneralCard> poiListV2;

    @C09CT("recall_area_group")
    public final List<PoiFeedCenterRecallAreaGroup> recallAreaGroup;

    @C09CT("user_city_status")
    public final Integer userCityStatus;

    public PoiMapDetailResponse() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    public final PoiMapDetailResponse copy(Integer num, List<PoiGeneralCard> list, Integer num2, MapBounds mapBounds, List<PoiFeedCenterRecallAreaGroup> list2, List<PoiFeedFilterKeyCategory> list3, List<PoiFeedFilterStruct> list4, String str, Boolean bool, Boolean bool2, Map<String, PoiDetailTagStyle> map, HotelShelfInfo hotelShelfInfo, C1176220giK c1176220giK, C1176270giP c1176270giP, boolean z) {
        return new PoiMapDetailResponse(num, list, num2, mapBounds, list2, list3, list4, str, bool, bool2, map, hotelShelfInfo, c1176220giK, c1176270giP, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMapDetailResponse)) {
            return false;
        }
        PoiMapDetailResponse poiMapDetailResponse = (PoiMapDetailResponse) obj;
        return Intrinsics.LJFF(this.bizCode, poiMapDetailResponse.bizCode) && Intrinsics.LJFF(this.poiListV2, poiMapDetailResponse.poiListV2) && Intrinsics.LJFF(this.userCityStatus, poiMapDetailResponse.userCityStatus) && Intrinsics.LJFF(this.mapWindow, poiMapDetailResponse.mapWindow) && Intrinsics.LJFF(this.recallAreaGroup, poiMapDetailResponse.recallAreaGroup) && Intrinsics.LJFF(this.filterKeyCategoryList, poiMapDetailResponse.filterKeyCategoryList) && Intrinsics.LJFF(this.filterGroup, poiMapDetailResponse.filterGroup) && Intrinsics.LJFF(this.poiListPanelTitle, poiMapDetailResponse.poiListPanelTitle) && Intrinsics.LJFF(this.isDistanceSortValid, poiMapDetailResponse.isDistanceSortValid) && Intrinsics.LJFF(this.isRatingSortValid, poiMapDetailResponse.isRatingSortValid) && Intrinsics.LJFF(this.poiDetailTagStyleMap, poiMapDetailResponse.poiDetailTagStyleMap) && Intrinsics.LJFF(this.currentPoiHotelShelfInfo, poiMapDetailResponse.currentPoiHotelShelfInfo) && Intrinsics.LJFF(this.LL, poiMapDetailResponse.LL) && Intrinsics.LJFF(this.LLILLJJLI, poiMapDetailResponse.LLILLJJLI) && this.LLILLL == poiMapDetailResponse.LLILLL;
    }

    @Override // X.C1164160gOs, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        Integer num = this.bizCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PoiGeneralCard> list = this.poiListV2;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.userCityStatus;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MapBounds mapBounds = this.mapWindow;
        int iHashCode4 = (iHashCode3 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        List<PoiFeedCenterRecallAreaGroup> list2 = this.recallAreaGroup;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PoiFeedFilterKeyCategory> list3 = this.filterKeyCategoryList;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PoiFeedFilterStruct> list4 = this.filterGroup;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.poiListPanelTitle;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDistanceSortValid;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRatingSortValid;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        HotelShelfInfo hotelShelfInfo = this.currentPoiHotelShelfInfo;
        int iHashCode12 = (iHashCode11 + (hotelShelfInfo == null ? 0 : hotelShelfInfo.hashCode())) * 31;
        C1176220giK c1176220giK = this.LL;
        int iHashCode13 = (iHashCode12 + (c1176220giK == null ? 0 : c1176220giK.hashCode())) * 31;
        C1176270giP c1176270giP = this.LLILLJJLI;
        return ((iHashCode13 + (c1176270giP != null ? c1176270giP.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "PoiMapDetailResponse(bizCode=" + this.bizCode + ", poiListV2=" + this.poiListV2 + ", userCityStatus=" + this.userCityStatus + ", mapWindow=" + this.mapWindow + ", recallAreaGroup=" + this.recallAreaGroup + ", filterKeyCategoryList=" + this.filterKeyCategoryList + ", filterGroup=" + this.filterGroup + ", poiListPanelTitle=" + this.poiListPanelTitle + ", isDistanceSortValid=" + this.isDistanceSortValid + ", isRatingSortValid=" + this.isRatingSortValid + ", poiDetailTagStyleMap=" + this.poiDetailTagStyleMap + ", currentPoiHotelShelfInfo=" + this.currentPoiHotelShelfInfo + ", poiModeRequestData=" + this.LL + ", request=" + this.LLILLJJLI + ", originSortKeySettle=" + this.LLILLL + ')';
    }

    public final boolean isLocal() {
        Integer num = this.userCityStatus;
        return num != null && num.intValue() == EnumC1175610ghL.USER_CITY_STATUS_LOCAL.getValue();
    }

    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final HotelShelfInfo getCurrentPoiHotelShelfInfo() {
        return this.currentPoiHotelShelfInfo;
    }

    public final List<PoiFeedFilterStruct> getFilterGroup() {
        return this.filterGroup;
    }

    public final List<PoiFeedFilterKeyCategory> getFilterKeyCategoryList() {
        return this.filterKeyCategoryList;
    }

    public final MapBounds getMapWindow() {
        return this.mapWindow;
    }

    public final boolean getOriginSortKeySettle() {
        return this.LLILLL;
    }

    public final Map<String, PoiDetailTagStyle> getPoiDetailTagStyleMap() {
        return this.poiDetailTagStyleMap;
    }

    public final String getPoiListPanelTitle() {
        return this.poiListPanelTitle;
    }

    public final List<PoiGeneralCard> getPoiListV2() {
        return this.poiListV2;
    }

    public final C1176220giK getPoiModeRequestData() {
        return this.LL;
    }

    public final List<PoiFeedCenterRecallAreaGroup> getRecallAreaGroup() {
        return this.recallAreaGroup;
    }

    public final C1176270giP getRequest() {
        return this.LLILLJJLI;
    }

    public final Integer getUserCityStatus() {
        return this.userCityStatus;
    }

    public final Boolean isDistanceSortValid() {
        return this.isDistanceSortValid;
    }

    public final Boolean isRatingSortValid() {
        return this.isRatingSortValid;
    }

    public final List<PoiGeneralCard> poiList() {
        return this.poiListV2;
    }

    public final void setOriginSortKeySettle(boolean z) {
        this.LLILLL = z;
    }

    public final void setPoiListV2(List<PoiGeneralCard> list) {
        this.poiListV2 = list;
    }

    public final void setPoiModeRequestData(C1176220giK c1176220giK) {
        this.LL = c1176220giK;
    }

    public final void setRequest(C1176270giP c1176270giP) {
        this.LLILLJJLI = c1176270giP;
    }

    public PoiMapDetailResponse(Integer num, List<PoiGeneralCard> list, Integer num2, MapBounds mapBounds, List<PoiFeedCenterRecallAreaGroup> list2, List<PoiFeedFilterKeyCategory> list3, List<PoiFeedFilterStruct> list4, String str, Boolean bool, Boolean bool2, Map<String, PoiDetailTagStyle> map, HotelShelfInfo hotelShelfInfo, C1176220giK c1176220giK, C1176270giP c1176270giP, boolean z) {
        this.bizCode = num;
        this.poiListV2 = list;
        this.userCityStatus = num2;
        this.mapWindow = mapBounds;
        this.recallAreaGroup = list2;
        this.filterKeyCategoryList = list3;
        this.filterGroup = list4;
        this.poiListPanelTitle = str;
        this.isDistanceSortValid = bool;
        this.isRatingSortValid = bool2;
        this.poiDetailTagStyleMap = map;
        this.currentPoiHotelShelfInfo = hotelShelfInfo;
        this.LL = c1176220giK;
        this.LLILLJJLI = c1176270giP;
        this.LLILLL = z;
    }
}
