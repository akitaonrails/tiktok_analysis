package com.ss.android.ugc.aweme.poi.activity;

import X.C040I;
import X.C09CT;
import X.C1194800hCI;
import X.C11NZ;
import X.C2188811AlT;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiActivityApi {
    public static final C1194800hCI LIZ = C1194800hCI.LIZ;

    @InterfaceC1501240pAY("/tiktok/ls/add/location/extension")
    C11NZ<PoiActivityBaseResponse> LIZ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar);

    public static final class PoiActivityResponse implements Serializable {

        @C09CT("banners")
        public final List<PoiBannerInfo> bannersList;

        public PoiActivityResponse(List<PoiBannerInfo> list) {
            this.bannersList = list;
        }
    }

    public static final class PoiActivityBaseResponse extends BaseResponse {

        @C09CT("code")
        public final Integer code;

        @C09CT("data")
        public final PoiActivityResponse data;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiActivityBaseResponse)) {
                return false;
            }
            PoiActivityBaseResponse poiActivityBaseResponse = (PoiActivityBaseResponse) obj;
            return Intrinsics.LJFF(this.code, poiActivityBaseResponse.code) && Intrinsics.LJFF(this.data, poiActivityBaseResponse.data);
        }

        public final int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            PoiActivityResponse poiActivityResponse = this.data;
            return iHashCode + (poiActivityResponse != null ? poiActivityResponse.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiActivityBaseResponse(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiActivityBaseResponse(Integer num, PoiActivityResponse poiActivityResponse) {
            this.code = num;
            this.data = poiActivityResponse;
        }
    }

    public static final class PoiBannerInfo implements Serializable {

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

        public PoiBannerInfo() {
            this(null, null, null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiBannerInfo)) {
                return false;
            }
            PoiBannerInfo poiBannerInfo = (PoiBannerInfo) obj;
            return Intrinsics.LJFF(this.type, poiBannerInfo.type) && Intrinsics.LJFF(this.title, poiBannerInfo.title) && Intrinsics.LJFF(this.subtitle, poiBannerInfo.subtitle) && Intrinsics.LJFF(this.picUrl, poiBannerInfo.picUrl) && Intrinsics.LJFF(this.clickUrl, poiBannerInfo.clickUrl) && Intrinsics.LJFF(this.activityId, poiBannerInfo.activityId);
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.picUrl;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clickUrl;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.activityId;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiBannerInfo(type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", subtitle=");
            sbLIZ.append(this.subtitle);
            sbLIZ.append(", picUrl=");
            sbLIZ.append(this.picUrl);
            sbLIZ.append(", clickUrl=");
            sbLIZ.append(this.clickUrl);
            sbLIZ.append(", activityId=");
            sbLIZ.append(this.activityId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiBannerInfo(String str, String str2, String str3, String str4, String str5, String str6) {
            this.type = str;
            this.title = str2;
            this.subtitle = str3;
            this.picUrl = str4;
            this.clickUrl = str5;
            this.activityId = str6;
        }
    }
}
