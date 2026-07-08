package com.ss.android.ugc.aweme.poi.detail.nearby;

import X.C09CT;
import X.C1173930ged;
import X.C1201190hMb;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeCategory;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNearbyModel extends BaseComponentData implements Serializable {

    @C09CT("biz_code")
    public final Integer bizCode;

    @C09CT("biz_msg")
    public final String bizMsg;

    @C09CT("current_tab_code")
    public final String currentTabCode;

    @C09CT("detail_page_category_list")
    public final List<PoiMapModeCategory> detailPageCategoryList;

    @C09CT("dynamic_map_window")
    public final MapBounds dynamicMapWindow;

    @C09CT("landmark_list_filter")
    public final List<PoiLandmark> filterLandmarkList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("in_nearby_tab_city")
    public final boolean inNearbyTabCity;

    @C09CT("in_poi_region")
    public final Boolean inPoiRegion;

    @C09CT("map_city_name")
    public final String mapCityName;

    @C09CT("landmark_list_on_map")
    public final List<PoiLandmark> mapLandmarkList;

    @C09CT("poi_category_list")
    public final List<PoiMapModeCategory> poiCategoryList;

    @C09CT("poi_detail_map")
    public final PoiDetailMapInfo poiDetailMapInfo;

    @C09CT("poi_list")
    public final List<PoiDiscoveryCard> poiList;

    @C09CT("title")
    public final String title;

    public PoiNearbyModel() {
        this(null, null, false, null, null, false, null, null, null, null, null, null, null, null, null);
    }

    public final PoiNearbyModel copy(String str, List<PoiDiscoveryCard> list, boolean z, String str2, MapBounds mapBounds, boolean z2, Integer num, String str3, Boolean bool, String str4, List<PoiMapModeCategory> list2, PoiDetailMapInfo poiDetailMapInfo, List<PoiLandmark> list3, List<PoiLandmark> list4, List<PoiMapModeCategory> list5) {
        return new PoiNearbyModel(str, list, z, str2, mapBounds, z2, num, str3, bool, str4, list2, poiDetailMapInfo, list3, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiNearbyModel)) {
            return false;
        }
        PoiNearbyModel poiNearbyModel = (PoiNearbyModel) obj;
        return Intrinsics.LJFF(this.title, poiNearbyModel.title) && Intrinsics.LJFF(this.poiList, poiNearbyModel.poiList) && this.hasMore == poiNearbyModel.hasMore && Intrinsics.LJFF(this.mapCityName, poiNearbyModel.mapCityName) && Intrinsics.LJFF(this.dynamicMapWindow, poiNearbyModel.dynamicMapWindow) && this.inNearbyTabCity == poiNearbyModel.inNearbyTabCity && Intrinsics.LJFF(this.bizCode, poiNearbyModel.bizCode) && Intrinsics.LJFF(this.bizMsg, poiNearbyModel.bizMsg) && Intrinsics.LJFF(this.inPoiRegion, poiNearbyModel.inPoiRegion) && Intrinsics.LJFF(this.currentTabCode, poiNearbyModel.currentTabCode) && Intrinsics.LJFF(this.poiCategoryList, poiNearbyModel.poiCategoryList) && Intrinsics.LJFF(this.poiDetailMapInfo, poiNearbyModel.poiDetailMapInfo) && Intrinsics.LJFF(this.mapLandmarkList, poiNearbyModel.mapLandmarkList) && Intrinsics.LJFF(this.filterLandmarkList, poiNearbyModel.filterLandmarkList) && Intrinsics.LJFF(this.detailPageCategoryList, poiNearbyModel.detailPageCategoryList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PoiDiscoveryCard> list = this.poiList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        String str2 = this.mapCityName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MapBounds mapBounds = this.dynamicMapWindow;
        int iHashCode4 = (((iHashCode3 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31) + C786410Ut5.Z2(this.inNearbyTabCity)) * 31;
        Integer num = this.bizCode;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.bizMsg;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.inPoiRegion;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.currentTabCode;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<PoiMapModeCategory> list2 = this.poiCategoryList;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PoiDetailMapInfo poiDetailMapInfo = this.poiDetailMapInfo;
        int iHashCode10 = (iHashCode9 + (poiDetailMapInfo == null ? 0 : poiDetailMapInfo.hashCode())) * 31;
        List<PoiLandmark> list3 = this.mapLandmarkList;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PoiLandmark> list4 = this.filterLandmarkList;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<PoiMapModeCategory> list5 = this.detailPageCategoryList;
        return iHashCode12 + (list5 != null ? list5.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "PoiNearbyModel(title=" + this.title + ", poiList=" + this.poiList + ", hasMore=" + this.hasMore + ", mapCityName=" + this.mapCityName + ", dynamicMapWindow=" + this.dynamicMapWindow + ", inNearbyTabCity=" + this.inNearbyTabCity + ", bizCode=" + this.bizCode + ", bizMsg=" + this.bizMsg + ", inPoiRegion=" + this.inPoiRegion + ", currentTabCode=" + this.currentTabCode + ", poiCategoryList=" + this.poiCategoryList + ", poiDetailMapInfo=" + this.poiDetailMapInfo + ", mapLandmarkList=" + this.mapLandmarkList + ", filterLandmarkList=" + this.filterLandmarkList + ", detailPageCategoryList=" + this.detailPageCategoryList + ')';
    }

    public final MapModeType getMapModeType$poi_release() {
        Boolean bool = this.inPoiRegion;
        return bool == null ? MapModeType.OTHERS : Intrinsics.LJFF(bool, Boolean.TRUE) ? MapModeType.LOCAL : MapModeType.REMOTE;
    }

    public final boolean hasNearbyContent$poi_release() {
        List<PoiDiscoveryCard> list;
        List<PoiMapModeCategory> list2 = this.poiCategoryList;
        return list2 != null && list2.size() > 0 && (list = this.poiList) != null && list.size() > 0;
    }

    public final boolean needShowMap$poi_release() {
        Integer num;
        PoiDetailMapInfo poiDetailMapInfo = this.poiDetailMapInfo;
        return (poiDetailMapInfo == null || (num = poiDetailMapInfo.displayType) == null || num.intValue() != 1) ? false : true;
    }

    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final String getBizMsg() {
        return this.bizMsg;
    }

    public final String getCurrentTabCode() {
        return this.currentTabCode;
    }

    public final List<PoiMapModeCategory> getDetailPageCategoryList() {
        return this.detailPageCategoryList;
    }

    public final MapBounds getDynamicMapWindow() {
        return this.dynamicMapWindow;
    }

    public final List<PoiLandmark> getFilterLandmarkList() {
        return this.filterLandmarkList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getInNearbyTabCity() {
        return this.inNearbyTabCity;
    }

    public final Boolean getInPoiRegion() {
        return this.inPoiRegion;
    }

    public final String getMapCityName() {
        return this.mapCityName;
    }

    public final List<PoiLandmark> getMapLandmarkList() {
        return this.mapLandmarkList;
    }

    public final List<PoiMapModeCategory> getPoiCategoryList() {
        return this.poiCategoryList;
    }

    public final PoiDetailMapInfo getPoiDetailMapInfo() {
        return this.poiDetailMapInfo;
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
        if (!(baseComponentData instanceof PoiNearbyModel)) {
            return false;
        }
        PoiNearbyModel poiNearbyModel = (PoiNearbyModel) baseComponentData;
        if (!Intrinsics.LJFF(this.dynamicMapWindow, poiNearbyModel.dynamicMapWindow) || !Intrinsics.LJFF(this.inPoiRegion, poiNearbyModel.inPoiRegion) || !Intrinsics.LJFF(this.currentTabCode, poiNearbyModel.currentTabCode)) {
            return false;
        }
        PoiDetailMapInfo poiDetailMapInfo = this.poiDetailMapInfo;
        if ((poiDetailMapInfo == null || !poiDetailMapInfo.checkEquals$poi_release(poiNearbyModel.poiDetailMapInfo)) && (this.poiDetailMapInfo != null || poiNearbyModel.poiDetailMapInfo != null)) {
            return false;
        }
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
        List<PoiDiscoveryCard> list2 = poiNearbyModel.poiList;
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
        if (!Intrinsics.LJFF(arrayList, arrayList2) || !Intrinsics.LJFF(this.poiCategoryList, poiNearbyModel.poiCategoryList) || !Intrinsics.LJFF(this.mapLandmarkList, poiNearbyModel.mapLandmarkList) || !Intrinsics.LJFF(this.filterLandmarkList, poiNearbyModel.filterLandmarkList) || !Intrinsics.LJFF(this.detailPageCategoryList, poiNearbyModel.detailPageCategoryList)) {
            return false;
        }
        return true;
    }

    public final List<C1173930ged> toNearbyCards$poi_release(String str) {
        String str2;
        List<PoiDiscoveryCard> list = this.poiList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (PoiDiscoveryCard poiDiscoveryCard : list) {
                PoiDiscoveryCard poiDiscoveryCard2 = poiDiscoveryCard;
                if (poiDiscoveryCard2 != null) {
                    str2 = poiDiscoveryCard2.poiId;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(str2, str)) {
                    arrayList.add(poiDiscoveryCard);
                }
            }
            List listLL = C13LP.LL(arrayList, 3);
            if (listLL != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                Iterator it2 = listLL.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C1173930ged((PoiDiscoveryCard) it2.next()));
                }
                return arrayList2;
            }
        }
        return C13BV.INSTANCE;
    }

    public PoiNearbyModel(String str, List<PoiDiscoveryCard> list, boolean z, String str2, MapBounds mapBounds, boolean z2, Integer num, String str3, Boolean bool, String str4, List<PoiMapModeCategory> list2, PoiDetailMapInfo poiDetailMapInfo, List<PoiLandmark> list3, List<PoiLandmark> list4, List<PoiMapModeCategory> list5) {
        this.title = str;
        this.poiList = list;
        this.hasMore = z;
        this.mapCityName = str2;
        this.dynamicMapWindow = mapBounds;
        this.inNearbyTabCity = z2;
        this.bizCode = num;
        this.bizMsg = str3;
        this.inPoiRegion = bool;
        this.currentTabCode = str4;
        this.poiCategoryList = list2;
        this.poiDetailMapInfo = poiDetailMapInfo;
        this.mapLandmarkList = list3;
        this.filterLandmarkList = list4;
        this.detailPageCategoryList = list5;
    }
}
