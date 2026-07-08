package com.ss.android.ugc.aweme.poi.creator;

import X.C040I;
import X.C09CT;
import X.C1197570hGl;
import X.C1199030hJ7;
import X.C11NZ;
import X.C1201190hMb;
import X.C1494600ozq;
import X.C2188811AlT;
import X.InterfaceC1201180hMa;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiCreatorApi {
    public static final C1199030hJ7 LIZ = C1199030hJ7.LIZ;

    @InterfaceC1501240pAY("/tiktok/poi/api/place/influencer-search")
    C11NZ<PoiSearchApi.PoiSearchResultWrapperV2> LIZ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar);

    @InterfaceC1501240pAY("/tiktok/ls/add/location/extension")
    C11NZ<PoiCreatorBaseConfigResponse> LIZIZ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar);

    @InterfaceC1501200pAU("/tiktok/local/alliance/get_creator_enroll_data")
    C11NZ<PoiCreatorEnrollDataResponse> LIZJ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3);

    @InterfaceC1501240pAY("/tiktok/ls/influencer/poi/recommend")
    C11NZ<PoiCreatorPromoteStoresResponse> LIZLLL(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar);

    @InterfaceC1501240pAY("/tiktok/ls/influencer/register_influencer")
    C11NZ<BaseResponse> LJ();

    public static final class PoiCreatorBaseConfigResponse extends BaseResponse implements InterfaceC1201180hMa {
        public C1494600ozq<?> LL;

        @C09CT("code")
        public final Integer code;

        @C09CT("data")
        public final PoiCreatorBaseConfigResponseData data;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiCreatorBaseConfigResponse)) {
                return false;
            }
            PoiCreatorBaseConfigResponse poiCreatorBaseConfigResponse = (PoiCreatorBaseConfigResponse) obj;
            return Intrinsics.LJFF(this.code, poiCreatorBaseConfigResponse.code) && Intrinsics.LJFF(this.data, poiCreatorBaseConfigResponse.data);
        }

        @Override // X.InterfaceC1201180hMa
        public final /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public final int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            PoiCreatorBaseConfigResponseData poiCreatorBaseConfigResponseData = this.data;
            return iHashCode + (poiCreatorBaseConfigResponseData != null ? poiCreatorBaseConfigResponseData.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiCreatorBaseConfigResponse(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.InterfaceC1201180hMa
        public final C1494600ozq<?> getRequestInfo() {
            return this.LL;
        }

        public final C1197570hGl LJ(String str) {
            List<BannerData> list;
            BannerData next;
            String str2;
            PoiCreatorBaseConfigResponseData poiCreatorBaseConfigResponseData = this.data;
            if (poiCreatorBaseConfigResponseData == null || (list = poiCreatorBaseConfigResponseData.bannersList) == null) {
                return null;
            }
            Iterator<BannerData> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    BannerData bannerData = next;
                    if (bannerData != null) {
                        str2 = bannerData.type;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BannerData bannerData2 = next;
            if (bannerData2 == null) {
                return null;
            }
            return new C1197570hGl(bannerData2.title, bannerData2.subtitle);
        }

        @Override // X.InterfaceC1201180hMa
        public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
            this.LL = c1494600ozq;
        }

        public PoiCreatorBaseConfigResponse(Integer num, PoiCreatorBaseConfigResponseData poiCreatorBaseConfigResponseData) {
            this.code = num;
            this.data = poiCreatorBaseConfigResponseData;
        }
    }

    public static final class PoiCreatorPromoteStoresResponse extends BaseResponse implements InterfaceC1201180hMa {
        public C1494600ozq<?> LL;

        @C09CT("code")
        public final Integer code;

        @C09CT("log_id")
        public final String logId;

        @C09CT("data")
        public final PoiSearchApi.PoiSearchResultV2 poiSearchResultV2;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiCreatorPromoteStoresResponse)) {
                return false;
            }
            PoiCreatorPromoteStoresResponse poiCreatorPromoteStoresResponse = (PoiCreatorPromoteStoresResponse) obj;
            return Intrinsics.LJFF(this.code, poiCreatorPromoteStoresResponse.code) && Intrinsics.LJFF(this.poiSearchResultV2, poiCreatorPromoteStoresResponse.poiSearchResultV2) && Intrinsics.LJFF(this.logId, poiCreatorPromoteStoresResponse.logId);
        }

        @Override // X.InterfaceC1201180hMa
        public final /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public final int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            PoiSearchApi.PoiSearchResultV2 poiSearchResultV2 = this.poiSearchResultV2;
            int iHashCode2 = (iHashCode + (poiSearchResultV2 == null ? 0 : poiSearchResultV2.hashCode())) * 31;
            String str = this.logId;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiCreatorPromoteStoresResponse(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", poiSearchResultV2=");
            sbLIZ.append(this.poiSearchResultV2);
            sbLIZ.append(", logId=");
            sbLIZ.append(this.logId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.InterfaceC1201180hMa
        public final C1494600ozq<?> getRequestInfo() {
            return this.LL;
        }

        @Override // X.InterfaceC1201180hMa
        public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
            this.LL = c1494600ozq;
        }

        public PoiCreatorPromoteStoresResponse(Integer num, PoiSearchApi.PoiSearchResultV2 poiSearchResultV2, String str) {
            this.code = num;
            this.poiSearchResultV2 = poiSearchResultV2;
            this.logId = str;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class PoiCreatorEnrollData implements Serializable {

        @C09CT("creator_enroll_status_enum")
        public final Integer creatorEnrollStatusEnum;

        public PoiCreatorEnrollData() {
            this(null);
        }

        public PoiCreatorEnrollData(Integer num) {
            this.creatorEnrollStatusEnum = num;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class PoiCreatorEnrollDataResponse extends BaseResponse {

        @C09CT("data")
        public final PoiCreatorEnrollData poiEnrollData;

        public PoiCreatorEnrollDataResponse() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiCreatorEnrollDataResponse) && Intrinsics.LJFF(this.poiEnrollData, ((PoiCreatorEnrollDataResponse) obj).poiEnrollData);
        }

        public final int hashCode() {
            PoiCreatorEnrollData poiCreatorEnrollData = this.poiEnrollData;
            if (poiCreatorEnrollData == null) {
                return 0;
            }
            return poiCreatorEnrollData.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiCreatorEnrollDataResponse(poiEnrollData=");
            sbLIZ.append(this.poiEnrollData);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiCreatorEnrollDataResponse(PoiCreatorEnrollData poiCreatorEnrollData) {
            this.poiEnrollData = poiCreatorEnrollData;
        }
    }

    public static final class InfluencerInfo {

        @C09CT("enable_influencer_promote_stores_tab")
        public final Boolean enablePromoteStoresTab;

        @C09CT("influencer_task_count")
        public final Integer taskCount;

        public InfluencerInfo(Boolean bool, Integer num) {
            this.enablePromoteStoresTab = bool;
            this.taskCount = num;
        }
    }

    public static final class PoiCreatorBaseConfigResponseData {

        @C09CT("banners")
        public final List<BannerData> bannersList;

        @C09CT("influencer_info")
        public final InfluencerInfo influencerInfo;

        public PoiCreatorBaseConfigResponseData(InfluencerInfo influencerInfo, List<BannerData> list) {
            this.influencerInfo = influencerInfo;
            this.bannersList = list;
        }
    }

    public static final class BannerData {

        @C09CT("activity_id")
        public final String activityId;

        @C09CT("click_url")
        public final String clickUrl;

        @C09CT("pic_url")
        public final String picUrl;

        @C09CT("subtitle")
        public final String subtitle;

        @C09CT("title")
        public final String title;

        @C09CT("type")
        public final String type;

        public BannerData(String str, String str2, String str3, String str4, String str5, String str6) {
            this.type = str;
            this.title = str2;
            this.subtitle = str3;
            this.picUrl = str4;
            this.clickUrl = str5;
            this.activityId = str6;
        }
    }
}
