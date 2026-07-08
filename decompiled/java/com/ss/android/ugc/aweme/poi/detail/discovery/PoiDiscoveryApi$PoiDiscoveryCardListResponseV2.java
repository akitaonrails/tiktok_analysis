package com.ss.android.ugc.aweme.poi.detail.discovery;

import X.C09CT;
import X.C1201190hMb;
import X.C15438062q;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterKeyCategory;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 extends BaseComponentData implements Serializable {

    @C09CT("dynamic_map_window")
    public final MapBounds dynamicMapWindow;

    @C09CT("fallback_poi_title_img")
    public String fallbackPoiTitleImg;

    @C09CT("filter_key_category_list")
    public final List<PoiFeedFilterKeyCategory> filterKeyCategoryList;

    @C09CT("in_poi_region")
    public final Boolean inPoiRegion;

    @C09CT("poi_list_v2")
    public final List<PoiGeneralCard> poiListV2;

    @C09CT("user_city_status")
    public final Integer userCityStatus;

    public final PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 copy(List<PoiGeneralCard> list, MapBounds mapBounds, Boolean bool, String str, Integer num, List<PoiFeedFilterKeyCategory> list2) {
        return new PoiDiscoveryApi$PoiDiscoveryCardListResponseV2(list, mapBounds, bool, str, num, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponseV2)) {
            return false;
        }
        PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2 = (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) obj;
        return Intrinsics.LJFF(this.poiListV2, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.poiListV2) && Intrinsics.LJFF(this.dynamicMapWindow, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.dynamicMapWindow) && Intrinsics.LJFF(this.inPoiRegion, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.inPoiRegion) && Intrinsics.LJFF(this.fallbackPoiTitleImg, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.fallbackPoiTitleImg) && Intrinsics.LJFF(this.userCityStatus, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.userCityStatus) && Intrinsics.LJFF(this.filterKeyCategoryList, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.filterKeyCategoryList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiGeneralCard> list = this.poiListV2;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        MapBounds mapBounds = this.dynamicMapWindow;
        int iHashCode2 = (iHashCode + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        Boolean bool = this.inPoiRegion;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.fallbackPoiTitleImg;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.userCityStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<PoiFeedFilterKeyCategory> list2 = this.filterKeyCategoryList;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDiscoveryCardListResponseV2(poiListV2=");
        sbLIZ.append(this.poiListV2);
        sbLIZ.append(", dynamicMapWindow=");
        sbLIZ.append(this.dynamicMapWindow);
        sbLIZ.append(", inPoiRegion=");
        sbLIZ.append(this.inPoiRegion);
        sbLIZ.append(", fallbackPoiTitleImg=");
        sbLIZ.append(this.fallbackPoiTitleImg);
        sbLIZ.append(", userCityStatus=");
        sbLIZ.append(this.userCityStatus);
        sbLIZ.append(", filterKeyCategoryList=");
        sbLIZ.append(this.filterKeyCategoryList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MapModeType getMapModeType$poi_release() {
        Boolean bool = this.inPoiRegion;
        return bool == null ? MapModeType.OTHERS : Intrinsics.LJFF(bool, Boolean.TRUE) ? MapModeType.LOCAL : MapModeType.REMOTE;
    }

    public final MapBounds getDynamicMapWindow() {
        return this.dynamicMapWindow;
    }

    public final String getFallbackPoiTitleImg() {
        return this.fallbackPoiTitleImg;
    }

    public final List<PoiFeedFilterKeyCategory> getFilterKeyCategoryList() {
        return this.filterKeyCategoryList;
    }

    public final Boolean getInPoiRegion() {
        return this.inPoiRegion;
    }

    public final List<PoiGeneralCard> getPoiListV2() {
        return this.poiListV2;
    }

    public final Integer getUserCityStatus() {
        return this.userCityStatus;
    }

    public final List<PoiGeneralCard> poiList$poi_release() {
        return this.poiListV2;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        ArrayList arrayList;
        String poiId;
        String poiId2;
        if (baseComponentData instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) {
            PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2 = (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) baseComponentData;
            if (Intrinsics.LJFF(this.dynamicMapWindow, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.dynamicMapWindow) && Intrinsics.LJFF(this.inPoiRegion, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.inPoiRegion)) {
                List<PoiGeneralCard> list = this.poiListV2;
                ArrayList arrayList2 = null;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (PoiGeneralCard poiGeneralCard : list) {
                        if (poiGeneralCard != null) {
                            poiId2 = poiGeneralCard.getPoiId();
                        } else {
                            poiId2 = null;
                        }
                        arrayList.add(poiId2);
                    }
                } else {
                    arrayList = null;
                }
                List<PoiGeneralCard> list2 = poiDiscoveryApi$PoiDiscoveryCardListResponseV2.poiListV2;
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (PoiGeneralCard poiGeneralCard2 : list2) {
                        if (poiGeneralCard2 != null) {
                            poiId = poiGeneralCard2.getPoiId();
                        } else {
                            poiId = null;
                        }
                        arrayList3.add(poiId);
                    }
                    arrayList2 = arrayList3;
                }
                if (Intrinsics.LJFF(arrayList, arrayList2) && Intrinsics.LJFF(this.userCityStatus, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.userCityStatus) && Intrinsics.LJFF(this.filterKeyCategoryList, poiDiscoveryApi$PoiDiscoveryCardListResponseV2.filterKeyCategoryList)) {
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

    public PoiDiscoveryApi$PoiDiscoveryCardListResponseV2(List<PoiGeneralCard> list, MapBounds mapBounds, Boolean bool, String str, Integer num, List<PoiFeedFilterKeyCategory> list2) {
        this.poiListV2 = list;
        this.dynamicMapWindow = mapBounds;
        this.inPoiRegion = bool;
        this.fallbackPoiTitleImg = str;
        this.userCityStatus = num;
        this.filterKeyCategoryList = list2;
    }
}
