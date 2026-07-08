package com.ss.android.ugc.aweme.poi.api;

import X.C040I;
import X.C09C2;
import X.C09CT;
import X.C1189060h32;
import X.C1199160hJK;
import X.C11NZ;
import X.C1201190hMb;
import X.C1201200hMc;
import X.C1494600ozq;
import X.C15438062q;
import X.C2188811AlT;
import X.C644190POn;
import X.C786410Ut5;
import X.InterfaceC1196330hEl;
import X.InterfaceC1201180hMa;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import X.InterfaceC2177008fw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAllianceDetail;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDataV2;
import com.ss.android.ugc.aweme.poi.PoiDetails;
import com.ss.android.ugc.aweme.poi.api.data.PoiSearchFilterData;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiSearchApi {
    public static final C1199160hJK LIZ = C1199160hJK.LIZ;

    public static final class PoiSearchResultV2 {

        @C09CT("debug_info")
        public final String debugInfo;

        @C09CT("cache_for_search")
        public final Boolean isCacheForSearch;

        @C09CT("length")
        public final int length;

        @C09CT("logid")
        public final String logId;

        @C09CT("page")
        public final int page;

        @C09CT("filter_data")
        public final List<PoiSearchFilterData> poiFilterDataList;

        @C09CT("poi")
        public final List<PoiDataV2> poiList;

        @C09CT("size")
        public final int size;

        @C09CT("total")
        public final int total;

        public final PoiSearchResult LIZ() {
            ArrayList arrayList;
            String strLJIILL;
            String strLJIILL2;
            String strLJIILL3;
            int i = this.total;
            int i2 = this.length;
            int i3 = this.page;
            int i4 = this.size;
            String str = this.logId;
            List<PoiDataV2> list = this.poiList;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (PoiDataV2 poiDataV2 : list) {
                    PoiDetails poiDetails = poiDataV2.details;
                    if (poiDetails != null) {
                        try {
                            strLJIILL = C09C2.LIZ().LJIILL(poiDetails);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            strLJIILL = null;
                        }
                    } else {
                        strLJIILL = null;
                    }
                    PoiAllianceDetail poiAllianceDetail = poiDataV2.allianceDetail;
                    if (poiAllianceDetail != null) {
                        try {
                            strLJIILL2 = C09C2.LIZ().LJIILL(poiAllianceDetail);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            strLJIILL2 = null;
                        }
                    } else {
                        strLJIILL2 = null;
                    }
                    List<Position> list2 = poiDataV2.hightPositions;
                    if (list2 != null) {
                        try {
                            strLJIILL3 = C09C2.LIZ().LJIILL(list2);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            strLJIILL3 = null;
                        }
                    } else {
                        strLJIILL3 = null;
                    }
                    arrayList.add(new PoiData(poiDataV2.id, poiDataV2.name, poiDataV2.latitude, poiDataV2.longitude, poiDataV2.location, poiDataV2.address, poiDataV2.district, poiDataV2.city, poiDataV2.province, poiDataV2.country, poiDataV2.formattedAddress, poiDataV2.telephone, poiDataV2.distance, poiDataV2.poiId, strLJIILL, strLJIILL2, poiDataV2.mobParam, poiDataV2.logId, poiDataV2.isRTL(), strLJIILL3, poiDataV2.displayCategory, poiDataV2.poiClaimStatus, null, null, poiDataV2.poiTitleImg, null));
                }
            } else {
                arrayList = null;
            }
            return new PoiSearchResult(i, i2, i3, i4, str, arrayList, this.isCacheForSearch, this.poiFilterDataList);
        }

        public PoiSearchResultV2(int i, int i2, int i3, int i4, String str, List<PoiDataV2> list, Boolean bool, String str2, List<PoiSearchFilterData> list2) {
            this.total = i;
            this.length = i2;
            this.page = i3;
            this.size = i4;
            this.logId = str;
            this.poiList = list;
            this.isCacheForSearch = bool;
            this.debugInfo = str2;
            this.poiFilterDataList = list2;
        }
    }

    public static final class PoiSearchResultWrapper extends BaseResponse {
        public final LocationNetTracker.LocationNetRequestInfo LL;
        public final String LLILLJJLI;
        public PoiVideoUnderstandResponse LLILLL;
        public final String LLILZ;
        public boolean LLILZIL;

        @C09CT("code")
        public final int code;

        @C09CT("hint_main_title")
        public final String hintMainTitle;

        @C09CT("hint_subtitle")
        public final String hintSubtitle;

        @C09CT("data")
        public final PoiSearchResult poiSearchResult;

        @C09CT("response_source_type")
        public final int responseSourceType;

        @C09CT("use_session_cache")
        public final int useSessionCache;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiSearchResultWrapper)) {
                return false;
            }
            PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchResultWrapper) obj;
            return this.code == poiSearchResultWrapper.code && Intrinsics.LJFF(this.poiSearchResult, poiSearchResultWrapper.poiSearchResult) && Intrinsics.LJFF(this.hintMainTitle, poiSearchResultWrapper.hintMainTitle) && Intrinsics.LJFF(this.hintSubtitle, poiSearchResultWrapper.hintSubtitle) && this.responseSourceType == poiSearchResultWrapper.responseSourceType && this.useSessionCache == poiSearchResultWrapper.useSessionCache && Intrinsics.LJFF(this.LL, poiSearchResultWrapper.LL) && Intrinsics.LJFF(this.LLILLJJLI, poiSearchResultWrapper.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, poiSearchResultWrapper.LLILLL) && Intrinsics.LJFF(this.LLILZ, poiSearchResultWrapper.LLILZ) && this.LLILZIL == poiSearchResultWrapper.LLILZIL;
        }

        public final int hashCode() {
            int i = this.code * 31;
            PoiSearchResult poiSearchResult = this.poiSearchResult;
            int iHashCode = (i + (poiSearchResult == null ? 0 : poiSearchResult.hashCode())) * 31;
            String str = this.hintMainTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hintSubtitle;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.responseSourceType) * 31) + this.useSessionCache) * 31;
            LocationNetTracker.LocationNetRequestInfo locationNetRequestInfo = this.LL;
            int iHashCode4 = (iHashCode3 + (locationNetRequestInfo == null ? 0 : locationNetRequestInfo.hashCode())) * 31;
            String str3 = this.LLILLJJLI;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PoiVideoUnderstandResponse poiVideoUnderstandResponse = this.LLILLL;
            int iHashCode6 = (iHashCode5 + (poiVideoUnderstandResponse == null ? 0 : poiVideoUnderstandResponse.hashCode())) * 31;
            String str4 = this.LLILZ;
            return ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            return "PoiSearchResultWrapper(code=" + this.code + ", poiSearchResult=" + this.poiSearchResult + ", hintMainTitle=" + this.hintMainTitle + ", hintSubtitle=" + this.hintSubtitle + ", responseSourceType=" + this.responseSourceType + ", useSessionCache=" + this.useSessionCache + ", requestInfo=" + this.LL + ", debugInfo=" + this.LLILLJJLI + ", videoUnderstandResponse=" + this.LLILLL + ", preloadFlag=" + this.LLILZ + ", updateRespCache=" + this.LLILZIL + ')';
        }

        public final boolean LJI() {
            List<PoiData> list;
            PoiSearchResult poiSearchResult = this.poiSearchResult;
            return C1189060h32.LJIILJJIL((poiSearchResult == null || (list = poiSearchResult.poiList) == null) ? null : Boolean.valueOf(!list.isEmpty()));
        }

        public final boolean LJIILIIL() {
            return this.code == 200;
        }

        public static PoiSearchResultWrapper LJ(PoiSearchResultWrapper poiSearchResultWrapper, int i, int i2, int i3) {
            int i4;
            PoiSearchResult poiSearchResult;
            String str;
            String str2;
            LocationNetTracker.LocationNetRequestInfo locationNetRequestInfo;
            String str3;
            PoiVideoUnderstandResponse poiVideoUnderstandResponse;
            int i5 = i2;
            int i6 = i;
            boolean z = false;
            if ((i3 & 1) != 0) {
                i4 = poiSearchResultWrapper.code;
            } else {
                i4 = 0;
            }
            String str4 = null;
            if ((i3 & 2) != 0) {
                poiSearchResult = poiSearchResultWrapper.poiSearchResult;
            } else {
                poiSearchResult = null;
            }
            if ((i3 & 4) != 0) {
                str = poiSearchResultWrapper.hintMainTitle;
            } else {
                str = null;
            }
            if ((i3 & 8) != 0) {
                str2 = poiSearchResultWrapper.hintSubtitle;
            } else {
                str2 = null;
            }
            if ((i3 & 16) != 0) {
                i6 = poiSearchResultWrapper.responseSourceType;
            }
            if ((i3 & 32) != 0) {
                i5 = poiSearchResultWrapper.useSessionCache;
            }
            if ((i3 & 64) != 0) {
                locationNetRequestInfo = poiSearchResultWrapper.LL;
            } else {
                locationNetRequestInfo = null;
            }
            if ((i3 & 128) != 0) {
                str3 = poiSearchResultWrapper.LLILLJJLI;
            } else {
                str3 = null;
            }
            if ((i3 & 256) != 0) {
                poiVideoUnderstandResponse = poiSearchResultWrapper.LLILLL;
            } else {
                poiVideoUnderstandResponse = null;
            }
            if ((i3 & 512) != 0) {
                str4 = poiSearchResultWrapper.LLILZ;
            }
            if ((i3 & 1024) != 0) {
                z = poiSearchResultWrapper.LLILZIL;
            }
            return new PoiSearchResultWrapper(i4, poiSearchResult, str, str2, i6, i5, locationNetRequestInfo, str3, poiVideoUnderstandResponse, str4, z);
        }

        public PoiSearchResultWrapper(int i, PoiSearchResult poiSearchResult, String str, String str2, int i2, int i3, LocationNetTracker.LocationNetRequestInfo locationNetRequestInfo, String str3, PoiVideoUnderstandResponse poiVideoUnderstandResponse, String str4, boolean z) {
            this.code = i;
            this.poiSearchResult = poiSearchResult;
            this.hintMainTitle = str;
            this.hintSubtitle = str2;
            this.responseSourceType = i2;
            this.useSessionCache = i3;
            this.LL = locationNetRequestInfo;
            this.LLILLJJLI = str3;
            this.LLILLL = poiVideoUnderstandResponse;
            this.LLILZ = str4;
            this.LLILZIL = z;
        }
    }

    @InterfaceC1501240pAY("/tiktok/poi/api/place/recommend")
    C11NZ<PoiSearchResultWrapperV2> LIZ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar, @InterfaceC1501120pAM("is_click_resend") int i);

    @InterfaceC1501240pAY("tiktok/poi/api/video_understanding")
    C11NZ<PoiVideoUnderstandResponse> LIZIZ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("biz") String str2, @C040I n nVar);

    @InterfaceC1501240pAY("tiktok/poi/re_tag/v1")
    @InterfaceC1485505rh
    Object LIZJ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("poi_id") String str2, @InterfaceC1501100pAK("anchor_content") String str3, InterfaceC1364105Vn<? super PoiReTagResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/poi/pub/popup/v1")
    Object LIZLLL(InterfaceC1364105Vn<? super PopupEnableResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/poi/api/place/search")
    C11NZ<PoiSearchResultWrapperV2> LJ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar);

    @InterfaceC1501240pAY("/tiktok/poi/api/place/recommend")
    C11NZ<PoiSearchResultWrapperV2> recommendPoi(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar, @InterfaceC2177008fw Object obj);

    public static final class PoiSearchResultWrapperV2 extends BaseResponse implements InterfaceC1201180hMa, InterfaceC1196330hEl {
        public C1494600ozq<?> LL;
        public String LLILLJJLI;

        @C09CT("code")
        public final int code;

        @C09CT("hint_main_title")
        public final String hintMainTitle;

        @C09CT("hint_subtitle")
        public final String hintSubtitle;

        @C09CT("data")
        public final PoiSearchResultV2 poiSearchResult;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiSearchResultWrapperV2)) {
                return false;
            }
            PoiSearchResultWrapperV2 poiSearchResultWrapperV2 = (PoiSearchResultWrapperV2) obj;
            return this.code == poiSearchResultWrapperV2.code && Intrinsics.LJFF(this.poiSearchResult, poiSearchResultWrapperV2.poiSearchResult) && Intrinsics.LJFF(this.hintMainTitle, poiSearchResultWrapperV2.hintMainTitle) && Intrinsics.LJFF(this.hintSubtitle, poiSearchResultWrapperV2.hintSubtitle);
        }

        @Override // X.InterfaceC1201180hMa
        public final /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public final int hashCode() {
            int i = this.code * 31;
            PoiSearchResultV2 poiSearchResultV2 = this.poiSearchResult;
            int iHashCode = (i + (poiSearchResultV2 == null ? 0 : poiSearchResultV2.hashCode())) * 31;
            String str = this.hintMainTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hintSubtitle;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // X.InterfaceC1196330hEl
        public final void setPreloadRealNetDurationMs(long j) {
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiSearchResultWrapperV2(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", poiSearchResult=");
            sbLIZ.append(this.poiSearchResult);
            sbLIZ.append(", hintMainTitle=");
            sbLIZ.append(this.hintMainTitle);
            sbLIZ.append(", hintSubtitle=");
            sbLIZ.append(this.hintSubtitle);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiSearchResultWrapper LJ() {
            RequestLog.Timing timing;
            RequestLog requestLogLIZ = C1201190hMb.LIZ(this);
            if (requestLogLIZ != null && (timing = requestLogLIZ.timing) != null) {
                timing.toString();
            }
            int i = this.code;
            PoiSearchResultV2 poiSearchResultV2 = this.poiSearchResult;
            PoiSearchResult poiSearchResultLIZ = poiSearchResultV2 != null ? poiSearchResultV2.LIZ() : null;
            String str = this.hintMainTitle;
            String str2 = this.hintSubtitle;
            PoiSearchResultV2 poiSearchResultV22 = this.poiSearchResult;
            return new PoiSearchResultWrapper(i, poiSearchResultLIZ, str, str2, 0, 0, C644190POn.LIZ(this), poiSearchResultV22 != null ? poiSearchResultV22.debugInfo : null, null, this.LLILLJJLI, true);
        }

        @Override // X.InterfaceC1196330hEl
        public final String getPreloadFlag() {
            return this.LLILLJJLI;
        }

        @Override // X.InterfaceC1201180hMa
        public final C1494600ozq<?> getRequestInfo() {
            return this.LL;
        }

        @Override // X.InterfaceC1196330hEl
        public final void setPreloadFlag(String str) {
            this.LLILLJJLI = str;
        }

        @Override // X.InterfaceC1201180hMa
        public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
            this.LL = c1494600ozq;
        }

        public PoiSearchResultWrapperV2(int i, PoiSearchResultV2 poiSearchResultV2, String str, String str2) {
            this.code = i;
            this.poiSearchResult = poiSearchResultV2;
            this.hintMainTitle = str;
            this.hintSubtitle = str2;
        }
    }

    public static final class PoiSearchResult implements Serializable {
        public static final C1201200hMc Companion = new Object() { // from class: X.0hMc
        };

        @C09CT("cache_for_search")
        public final Boolean isCacheForSearch;

        @C09CT("length")
        public final int length;

        @C09CT("logid")
        public final String logId;

        @C09CT("page")
        public final int page;

        @C09CT("filter_data")
        public final List<PoiSearchFilterData> poiFilterDataList;

        @C09CT("poi")
        public final List<PoiData> poiList;

        @C09CT("size")
        public final int size;

        @C09CT("total")
        public final int total;

        public final PoiSearchResult copy(int i, int i2, int i3, int i4, String str, List<PoiData> list, Boolean bool, List<PoiSearchFilterData> list2) {
            return new PoiSearchResult(i, i2, i3, i4, str, list, bool, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiSearchResult)) {
                return false;
            }
            PoiSearchResult poiSearchResult = (PoiSearchResult) obj;
            return this.total == poiSearchResult.total && this.length == poiSearchResult.length && this.page == poiSearchResult.page && this.size == poiSearchResult.size && Intrinsics.LJFF(this.logId, poiSearchResult.logId) && Intrinsics.LJFF(this.poiList, poiSearchResult.poiList) && Intrinsics.LJFF(this.isCacheForSearch, poiSearchResult.isCacheForSearch) && Intrinsics.LJFF(this.poiFilterDataList, poiSearchResult.poiFilterDataList);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiSearchResult(total=");
            sbLIZ.append(this.total);
            sbLIZ.append(", length=");
            sbLIZ.append(this.length);
            sbLIZ.append(", page=");
            sbLIZ.append(this.page);
            sbLIZ.append(", size=");
            sbLIZ.append(this.size);
            sbLIZ.append(", logId=");
            sbLIZ.append(this.logId);
            sbLIZ.append(", poiList=");
            sbLIZ.append(this.poiList);
            sbLIZ.append(", isCacheForSearch=");
            sbLIZ.append(this.isCacheForSearch);
            sbLIZ.append(", poiFilterDataList=");
            sbLIZ.append(this.poiFilterDataList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Boolean isCacheForSearch() {
            return this.isCacheForSearch;
        }

        public PoiSearchResult(int i, int i2, int i3, int i4, String str, List<PoiData> list, Boolean bool, List<PoiSearchFilterData> list2) {
            this.total = i;
            this.length = i2;
            this.page = i3;
            this.size = i4;
            this.logId = str;
            this.poiList = list;
            this.isCacheForSearch = bool;
            this.poiFilterDataList = list2;
        }
    }

    public static final class PoiReTagResponse {

        @C09CT("aweme")
        public final Aweme aweme;

        @C09CT("status_code")
        public final int code;

        @C09CT("status_msg")
        public final String msg;

        public PoiReTagResponse(int i, String str, Aweme aweme) {
            this.code = i;
            this.msg = str;
            this.aweme = aweme;
        }
    }

    public static final class PopupEnableResponse {

        @C09CT("status_code")
        public final int code;

        @C09CT("status_msg")
        public final String msg;

        @C09CT("popup_res")
        public final int popupRes;

        public PopupEnableResponse(int i, String str, int i2) {
            this.code = i;
            this.msg = str;
            this.popupRes = i2;
        }
    }
}
