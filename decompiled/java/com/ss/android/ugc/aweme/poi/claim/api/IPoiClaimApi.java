package com.ss.android.ugc.aweme.poi.claim.api;

import X.C040I;
import X.C09CT;
import X.C1164160gOs;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import X.InterfaceC2177008fw;
import com.google.gson.n;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface IPoiClaimApi {
    @InterfaceC1501240pAY("/tiktok/ls/merchant/claim/poi/check/")
    Object LIZ(@C040I PoiClaimCheckRequestBody poiClaimCheckRequestBody, InterfaceC1364105Vn<? super PoiClaimCheckResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/poi/api/place/search")
    Object LIZIZ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapperV2> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/poi/api/place/recommend")
    Object recommendPoi(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapperV2> interfaceC1364105Vn);

    public static final class PoiClaimCheckRequestBody implements Serializable {

        @C09CT("poi_id")
        public final String poiId;

        public PoiClaimCheckRequestBody() {
            this(null);
        }

        public PoiClaimCheckRequestBody(String str) {
            this.poiId = str;
        }
    }

    public static final class PoiClaimCheckResponse extends C1164160gOs {

        @C09CT("check_poi_result")
        public final Integer checkPoiResult;

        @C09CT("dialog")
        public final PoiClaimCheckDataDialog dialog;

        @C09CT("error_type")
        public final String errorType;

        public PoiClaimCheckResponse() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiClaimCheckResponse)) {
                return false;
            }
            PoiClaimCheckResponse poiClaimCheckResponse = (PoiClaimCheckResponse) obj;
            return Intrinsics.LJFF(this.checkPoiResult, poiClaimCheckResponse.checkPoiResult) && Intrinsics.LJFF(this.errorType, poiClaimCheckResponse.errorType) && Intrinsics.LJFF(this.dialog, poiClaimCheckResponse.dialog);
        }

        public final int hashCode() {
            Integer num = this.checkPoiResult;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.errorType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PoiClaimCheckDataDialog poiClaimCheckDataDialog = this.dialog;
            return iHashCode2 + (poiClaimCheckDataDialog != null ? poiClaimCheckDataDialog.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiClaimCheckResponse(checkPoiResult=");
            sbLIZ.append(this.checkPoiResult);
            sbLIZ.append(", errorType=");
            sbLIZ.append(this.errorType);
            sbLIZ.append(", dialog=");
            sbLIZ.append(this.dialog);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiClaimCheckResponse(Integer num, String str, PoiClaimCheckDataDialog poiClaimCheckDataDialog) {
            this.checkPoiResult = num;
            this.errorType = str;
            this.dialog = poiClaimCheckDataDialog;
        }
    }

    public static final class PoiClaimCheckDataDialog implements Serializable {

        @C09CT("button_text")
        public final String buttonText;

        @C09CT("highlight_message")
        public final String highlightMessage;

        @C09CT("message")
        public final String message;

        @C09CT("title")
        public final String title;

        public PoiClaimCheckDataDialog() {
            this(null, null, null, null);
        }

        public PoiClaimCheckDataDialog(String str, String str2, String str3, String str4) {
            this.title = str;
            this.message = str2;
            this.highlightMessage = str3;
            this.buttonText = str4;
        }
    }
}
