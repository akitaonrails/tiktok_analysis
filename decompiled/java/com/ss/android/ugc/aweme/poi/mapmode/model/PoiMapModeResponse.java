package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C09CT;
import X.C1164160gOs;
import X.C1174650gfn;
import X.C1175060ggS;
import X.C1201190hMb;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeResponse extends C1164160gOs implements Serializable {

    @C09CT("biz_code")
    public final Integer bizCode;

    @C09CT("biz_msg")
    public final String bizMsg;

    @C09CT("current_tab_code")
    public final String currentTabCode;

    @C09CT("landmark_list_filter")
    public List<PoiLandmark> filterLandmarkList;

    @C09CT("log_pb")
    public final LogPb logPb;

    @C09CT("landmark_list_on_map")
    public List<PoiLandmark> mapLandmarkList;

    @C09CT("dynamic_map_window")
    public final MapBounds mapWindow;

    @C09CT("poi_category_list")
    public List<PoiMapModeCategory> poiCategoryList;

    @C09CT("poi_list")
    public List<PoiDiscoveryCard> poiList;
    public C1175060ggS poiModeRequestData;
    public C1174650gfn request;

    public final PoiMapModeResponse copy(String str, Integer num, LogPb logPb, String str2, MapBounds mapBounds, List<PoiDiscoveryCard> list, List<PoiMapModeCategory> list2, List<PoiLandmark> list3, List<PoiLandmark> list4, C1175060ggS c1175060ggS, C1174650gfn c1174650gfn) {
        return new PoiMapModeResponse(str, num, logPb, str2, mapBounds, list, list2, list3, list4, c1175060ggS, c1174650gfn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMapModeResponse)) {
            return false;
        }
        PoiMapModeResponse poiMapModeResponse = (PoiMapModeResponse) obj;
        return Intrinsics.LJFF(this.currentTabCode, poiMapModeResponse.currentTabCode) && Intrinsics.LJFF(this.bizCode, poiMapModeResponse.bizCode) && Intrinsics.LJFF(this.logPb, poiMapModeResponse.logPb) && Intrinsics.LJFF(this.bizMsg, poiMapModeResponse.bizMsg) && Intrinsics.LJFF(this.mapWindow, poiMapModeResponse.mapWindow) && Intrinsics.LJFF(this.poiList, poiMapModeResponse.poiList) && Intrinsics.LJFF(this.poiCategoryList, poiMapModeResponse.poiCategoryList) && Intrinsics.LJFF(this.mapLandmarkList, poiMapModeResponse.mapLandmarkList) && Intrinsics.LJFF(this.filterLandmarkList, poiMapModeResponse.filterLandmarkList) && Intrinsics.LJFF(this.poiModeRequestData, poiMapModeResponse.poiModeRequestData) && Intrinsics.LJFF(this.request, poiMapModeResponse.request);
    }

    @Override // X.C1164160gOs, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.currentTabCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bizCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        LogPb logPb = this.logPb;
        int iHashCode3 = (iHashCode2 + (logPb == null ? 0 : logPb.hashCode())) * 31;
        String str2 = this.bizMsg;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MapBounds mapBounds = this.mapWindow;
        int iHashCode5 = (iHashCode4 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        List<PoiDiscoveryCard> list = this.poiList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<PoiMapModeCategory> list2 = this.poiCategoryList;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PoiLandmark> list3 = this.mapLandmarkList;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PoiLandmark> list4 = this.filterLandmarkList;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        C1175060ggS c1175060ggS = this.poiModeRequestData;
        int iHashCode10 = (iHashCode9 + (c1175060ggS == null ? 0 : c1175060ggS.hashCode())) * 31;
        C1174650gfn c1174650gfn = this.request;
        return iHashCode10 + (c1174650gfn != null ? c1174650gfn.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "PoiMapModeResponse(currentTabCode=" + this.currentTabCode + ", bizCode=" + this.bizCode + ", logPb=" + this.logPb + ", bizMsg=" + this.bizMsg + ", mapWindow=" + this.mapWindow + ", poiList=" + this.poiList + ", poiCategoryList=" + this.poiCategoryList + ", mapLandmarkList=" + this.mapLandmarkList + ", filterLandmarkList=" + this.filterLandmarkList + ", poiModeRequestData=" + this.poiModeRequestData + ", request=" + this.request + ')';
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

    public final List<PoiLandmark> getFilterLandmarkList() {
        return this.filterLandmarkList;
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public final List<PoiLandmark> getMapLandmarkList() {
        return this.mapLandmarkList;
    }

    public final MapBounds getMapWindow() {
        return this.mapWindow;
    }

    public final List<PoiMapModeCategory> getPoiCategoryList() {
        return this.poiCategoryList;
    }

    public final List<PoiDiscoveryCard> getPoiList() {
        return this.poiList;
    }

    public final C1175060ggS getPoiModeRequestData() {
        return this.poiModeRequestData;
    }

    public final C1174650gfn getRequest() {
        return this.request;
    }

    public final void setFilterLandmarkList(List<PoiLandmark> list) {
        this.filterLandmarkList = list;
    }

    public final void setMapLandmarkList(List<PoiLandmark> list) {
        this.mapLandmarkList = list;
    }

    public final void setPoiCategoryList(List<PoiMapModeCategory> list) {
        this.poiCategoryList = list;
    }

    public final void setPoiList(List<PoiDiscoveryCard> list) {
        this.poiList = list;
    }

    public final void setPoiModeRequestData(C1175060ggS c1175060ggS) {
        this.poiModeRequestData = c1175060ggS;
    }

    public final void setRequest(C1174650gfn c1174650gfn) {
        this.request = c1174650gfn;
    }

    public PoiMapModeResponse(String str, Integer num, LogPb logPb, String str2, MapBounds mapBounds, List<PoiDiscoveryCard> list, List<PoiMapModeCategory> list2, List<PoiLandmark> list3, List<PoiLandmark> list4, C1175060ggS c1175060ggS, C1174650gfn c1174650gfn) {
        this.currentTabCode = str;
        this.bizCode = num;
        this.logPb = logPb;
        this.bizMsg = str2;
        this.mapWindow = mapBounds;
        this.poiList = list;
        this.poiCategoryList = list2;
        this.mapLandmarkList = list3;
        this.filterLandmarkList = list4;
        this.poiModeRequestData = c1175060ggS;
        this.request = c1174650gfn;
    }
}
