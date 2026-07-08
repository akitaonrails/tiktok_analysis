package com.ss.android.ugc.aweme.poi.detail.discovery;

import X.C09CT;
import X.C1201190hMb;
import X.C15438062q;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeCategory;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDiscoveryApi$PoiDiscoveryCardListResponse extends BaseComponentData implements Serializable {

    @C09CT("biz_code")
    public final Integer bizCode;

    @C09CT("current_tab_code")
    public final String currentTabCode;

    @C09CT("dynamic_map_window")
    public final MapBounds dynamicMapWindow;

    @C09CT("fallback_poi_title_img")
    public String fallbackPoiTitleImg;

    @C09CT("landmark_list_filter")
    public List<PoiLandmark> filterLandmarkList;

    @C09CT("in_poi_region")
    public final Boolean inPoiRegion;

    @C09CT("landmark_list_on_map")
    public List<PoiLandmark> mapLandmarkList;

    @C09CT("poi_category_list")
    public final List<PoiMapModeCategory> poiCategoryList;

    @C09CT("poi_list")
    public final List<PoiDiscoveryCard> poiList;

    @C09CT("title")
    public final String title;

    public final PoiDiscoveryApi$PoiDiscoveryCardListResponse copy(List<PoiMapModeCategory> list, List<PoiDiscoveryCard> list2, MapBounds mapBounds, Boolean bool, String str, String str2, Integer num, List<PoiLandmark> list3, List<PoiLandmark> list4, String str3) {
        return new PoiDiscoveryApi$PoiDiscoveryCardListResponse(list, list2, mapBounds, bool, str, str2, num, list3, list4, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponse)) {
            return false;
        }
        PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) obj;
        return Intrinsics.LJFF(this.poiCategoryList, poiDiscoveryApi$PoiDiscoveryCardListResponse.poiCategoryList) && Intrinsics.LJFF(this.poiList, poiDiscoveryApi$PoiDiscoveryCardListResponse.poiList) && Intrinsics.LJFF(this.dynamicMapWindow, poiDiscoveryApi$PoiDiscoveryCardListResponse.dynamicMapWindow) && Intrinsics.LJFF(this.inPoiRegion, poiDiscoveryApi$PoiDiscoveryCardListResponse.inPoiRegion) && Intrinsics.LJFF(this.currentTabCode, poiDiscoveryApi$PoiDiscoveryCardListResponse.currentTabCode) && Intrinsics.LJFF(this.title, poiDiscoveryApi$PoiDiscoveryCardListResponse.title) && Intrinsics.LJFF(this.bizCode, poiDiscoveryApi$PoiDiscoveryCardListResponse.bizCode) && Intrinsics.LJFF(this.mapLandmarkList, poiDiscoveryApi$PoiDiscoveryCardListResponse.mapLandmarkList) && Intrinsics.LJFF(this.filterLandmarkList, poiDiscoveryApi$PoiDiscoveryCardListResponse.filterLandmarkList) && Intrinsics.LJFF(this.fallbackPoiTitleImg, poiDiscoveryApi$PoiDiscoveryCardListResponse.fallbackPoiTitleImg);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiMapModeCategory> list = this.poiCategoryList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PoiDiscoveryCard> list2 = this.poiList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        MapBounds mapBounds = this.dynamicMapWindow;
        int iHashCode3 = (iHashCode2 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        Boolean bool = this.inPoiRegion;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.currentTabCode;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.bizCode;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<PoiLandmark> list3 = this.mapLandmarkList;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PoiLandmark> list4 = this.filterLandmarkList;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.fallbackPoiTitleImg;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDiscoveryCardListResponse(poiCategoryList=");
        sbLIZ.append(this.poiCategoryList);
        sbLIZ.append(", poiList=");
        sbLIZ.append(this.poiList);
        sbLIZ.append(", dynamicMapWindow=");
        sbLIZ.append(this.dynamicMapWindow);
        sbLIZ.append(", inPoiRegion=");
        sbLIZ.append(this.inPoiRegion);
        sbLIZ.append(", currentTabCode=");
        sbLIZ.append(this.currentTabCode);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", bizCode=");
        sbLIZ.append(this.bizCode);
        sbLIZ.append(", mapLandmarkList=");
        sbLIZ.append(this.mapLandmarkList);
        sbLIZ.append(", filterLandmarkList=");
        sbLIZ.append(this.filterLandmarkList);
        sbLIZ.append(", fallbackPoiTitleImg=");
        sbLIZ.append(this.fallbackPoiTitleImg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MapModeType getMapModeType$poi_release() {
        Boolean bool = this.inPoiRegion;
        return bool == null ? MapModeType.OTHERS : Intrinsics.LJFF(bool, Boolean.TRUE) ? MapModeType.LOCAL : MapModeType.REMOTE;
    }

    public final boolean hasDiscoveryContent$poi_release() {
        List<PoiMapModeCategory> list = this.poiCategoryList;
        return list != null && list.size() > 0;
    }

    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final String getCurrentTabCode() {
        return this.currentTabCode;
    }

    public final MapBounds getDynamicMapWindow() {
        return this.dynamicMapWindow;
    }

    public final String getFallbackPoiTitleImg() {
        return this.fallbackPoiTitleImg;
    }

    public final List<PoiLandmark> getFilterLandmarkList() {
        return this.filterLandmarkList;
    }

    public final Boolean getInPoiRegion() {
        return this.inPoiRegion;
    }

    public final List<PoiLandmark> getMapLandmarkList() {
        return this.mapLandmarkList;
    }

    public final List<PoiMapModeCategory> getPoiCategoryList() {
        return this.poiCategoryList;
    }

    public final List<PoiDiscoveryCard> getPoiList() {
        return this.poiList;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        ArrayList arrayList;
        String str;
        String str2;
        if (baseComponentData instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponse) {
            PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) baseComponentData;
            if (Intrinsics.LJFF(this.dynamicMapWindow, poiDiscoveryApi$PoiDiscoveryCardListResponse.dynamicMapWindow) && Intrinsics.LJFF(this.inPoiRegion, poiDiscoveryApi$PoiDiscoveryCardListResponse.inPoiRegion) && Intrinsics.LJFF(this.currentTabCode, poiDiscoveryApi$PoiDiscoveryCardListResponse.currentTabCode)) {
                List<PoiDiscoveryCard> list = this.poiList;
                ArrayList arrayList2 = null;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (PoiDiscoveryCard poiDiscoveryCard : list) {
                        if (poiDiscoveryCard != null) {
                            str2 = poiDiscoveryCard.poiId;
                        } else {
                            str2 = null;
                        }
                        arrayList.add(str2);
                    }
                } else {
                    arrayList = null;
                }
                List<PoiDiscoveryCard> list2 = poiDiscoveryApi$PoiDiscoveryCardListResponse.poiList;
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (PoiDiscoveryCard poiDiscoveryCard2 : list2) {
                        if (poiDiscoveryCard2 != null) {
                            str = poiDiscoveryCard2.poiId;
                        } else {
                            str = null;
                        }
                        arrayList3.add(str);
                    }
                    arrayList2 = arrayList3;
                }
                if (Intrinsics.LJFF(arrayList, arrayList2) && Intrinsics.LJFF(this.poiCategoryList, poiDiscoveryApi$PoiDiscoveryCardListResponse.poiCategoryList) && Intrinsics.LJFF(this.mapLandmarkList, poiDiscoveryApi$PoiDiscoveryCardListResponse.mapLandmarkList) && Intrinsics.LJFF(this.filterLandmarkList, poiDiscoveryApi$PoiDiscoveryCardListResponse.filterLandmarkList)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void setFallbackPoiTitleImg(String str) {
        this.fallbackPoiTitleImg = str;
    }

    public final void setFilterLandmarkList(List<PoiLandmark> list) {
        this.filterLandmarkList = list;
    }

    public final void setMapLandmarkList(List<PoiLandmark> list) {
        this.mapLandmarkList = list;
    }

    public PoiDiscoveryApi$PoiDiscoveryCardListResponse(List<PoiMapModeCategory> list, List<PoiDiscoveryCard> list2, MapBounds mapBounds, Boolean bool, String str, String str2, Integer num, List<PoiLandmark> list3, List<PoiLandmark> list4, String str3) {
        this.poiCategoryList = list;
        this.poiList = list2;
        this.dynamicMapWindow = mapBounds;
        this.inPoiRegion = bool;
        this.currentTabCode = str;
        this.title = str2;
        this.bizCode = num;
        this.mapLandmarkList = list3;
        this.filterLandmarkList = list4;
        this.fallbackPoiTitleImg = str3;
    }
}
