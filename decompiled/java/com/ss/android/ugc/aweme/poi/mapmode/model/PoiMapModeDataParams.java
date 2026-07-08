package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C123100dR;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import X.InterfaceC2753014t;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeDataParams implements Serializable, InterfaceC2753014t {
    public final String categoryName;
    public final MapBounds initialMapBounds;
    public final List<PoiDiscoveryCard> insertDiscoveryCardList;
    public final String pagePoiId;
    public final PoiMapModeResponse preLoadPoiDiscoveryResponse;
    public final String regionName;
    public final String selectedTabCode;
    public final PoiMapModeTargetData targetPoiData;

    public PoiMapModeDataParams() {
        this(null, null, null, null, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSourceId$annotations() {
    }

    public final PoiMapModeDataParams copy(PoiMapModeTargetData poiMapModeTargetData, PoiMapModeResponse poiMapModeResponse, List<PoiDiscoveryCard> list, String str, String str2, String str3, MapBounds mapBounds, String str4) {
        return new PoiMapModeDataParams(poiMapModeTargetData, poiMapModeResponse, list, str, str2, str3, mapBounds, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMapModeDataParams)) {
            return false;
        }
        PoiMapModeDataParams poiMapModeDataParams = (PoiMapModeDataParams) obj;
        return Intrinsics.LJFF(this.targetPoiData, poiMapModeDataParams.targetPoiData) && Intrinsics.LJFF(this.preLoadPoiDiscoveryResponse, poiMapModeDataParams.preLoadPoiDiscoveryResponse) && Intrinsics.LJFF(this.insertDiscoveryCardList, poiMapModeDataParams.insertDiscoveryCardList) && Intrinsics.LJFF(this.pagePoiId, poiMapModeDataParams.pagePoiId) && Intrinsics.LJFF(this.regionName, poiMapModeDataParams.regionName) && Intrinsics.LJFF(this.selectedTabCode, poiMapModeDataParams.selectedTabCode) && Intrinsics.LJFF(this.initialMapBounds, poiMapModeDataParams.initialMapBounds) && Intrinsics.LJFF(this.categoryName, poiMapModeDataParams.categoryName);
    }

    public String getSourceId() {
        return "PoiMapModeDataParams";
    }

    public int hashCode() {
        PoiMapModeTargetData poiMapModeTargetData = this.targetPoiData;
        int iHashCode = (poiMapModeTargetData == null ? 0 : poiMapModeTargetData.hashCode()) * 31;
        PoiMapModeResponse poiMapModeResponse = this.preLoadPoiDiscoveryResponse;
        int iHashCode2 = (iHashCode + (poiMapModeResponse == null ? 0 : poiMapModeResponse.hashCode())) * 31;
        List<PoiDiscoveryCard> list = this.insertDiscoveryCardList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pagePoiId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regionName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedTabCode;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MapBounds mapBounds = this.initialMapBounds;
        int iHashCode7 = (iHashCode6 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        String str4 = this.categoryName;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeDataParams(targetPoiData=");
        sbLIZ.append(this.targetPoiData);
        sbLIZ.append(", preLoadPoiDiscoveryResponse=");
        sbLIZ.append(this.preLoadPoiDiscoveryResponse);
        sbLIZ.append(", insertDiscoveryCardList=");
        sbLIZ.append(this.insertDiscoveryCardList);
        sbLIZ.append(", pagePoiId=");
        sbLIZ.append(this.pagePoiId);
        sbLIZ.append(", regionName=");
        sbLIZ.append(this.regionName);
        sbLIZ.append(", selectedTabCode=");
        sbLIZ.append(this.selectedTabCode);
        sbLIZ.append(", initialMapBounds=");
        sbLIZ.append(this.initialMapBounds);
        sbLIZ.append(", categoryName=");
        sbLIZ.append(this.categoryName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isTargetPoiValid$poi_release() {
        PoiMapModeTargetData poiMapModeTargetData = this.targetPoiData;
        if (!C123100dR.LIZ(poiMapModeTargetData != null ? poiMapModeTargetData.targetPoiId : null)) {
            return false;
        }
        PoiMapModeTargetData poiMapModeTargetData2 = this.targetPoiData;
        return isValid(poiMapModeTargetData2 != null ? poiMapModeTargetData2.targetPoiLocation : null);
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final MapBounds getInitialMapBounds() {
        return this.initialMapBounds;
    }

    public final List<PoiDiscoveryCard> getInsertDiscoveryCardList() {
        return this.insertDiscoveryCardList;
    }

    public final String getPagePoiId() {
        return this.pagePoiId;
    }

    public final PoiMapModeResponse getPreLoadPoiDiscoveryResponse() {
        return this.preLoadPoiDiscoveryResponse;
    }

    public final String getRegionName() {
        return this.regionName;
    }

    public final String getSelectedTabCode() {
        return this.selectedTabCode;
    }

    public final PoiMapModeTargetData getTargetPoiData() {
        return this.targetPoiData;
    }

    private final boolean isValid(PoiLocation poiLocation) {
        if (poiLocation != null && poiLocation.lat != null && poiLocation.lng != null) {
            return true;
        }
        return false;
    }

    public PoiMapModeDataParams(PoiMapModeTargetData poiMapModeTargetData, PoiMapModeResponse poiMapModeResponse, List<PoiDiscoveryCard> list, String str, String str2, String str3, MapBounds mapBounds, String str4) {
        this.targetPoiData = poiMapModeTargetData;
        this.preLoadPoiDiscoveryResponse = poiMapModeResponse;
        this.insertDiscoveryCardList = list;
        this.pagePoiId = str;
        this.regionName = str2;
        this.selectedTabCode = str3;
        this.initialMapBounds = mapBounds;
        this.categoryName = str4;
    }
}
