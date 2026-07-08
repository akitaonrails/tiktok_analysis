package com.ss.android.ugc.effectmanager.effect.model;

import X.C13OE;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class FetchTemplateFavoriteListResponse extends C13OE<ResponseData> implements Serializable {
    public final ResponseData data;
    public final String message;
    public final int status_code;

    public final FetchTemplateFavoriteListResponse copy(String str, int i, ResponseData responseData) {
        return new FetchTemplateFavoriteListResponse(str, i, responseData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchTemplateFavoriteListResponse)) {
            return false;
        }
        FetchTemplateFavoriteListResponse fetchTemplateFavoriteListResponse = (FetchTemplateFavoriteListResponse) obj;
        return Intrinsics.LJFF(this.message, fetchTemplateFavoriteListResponse.message) && this.status_code == fetchTemplateFavoriteListResponse.status_code && Intrinsics.LJFF(this.data, fetchTemplateFavoriteListResponse.data);
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + this.status_code) * 31;
        ResponseData responseData = this.data;
        return iHashCode + (responseData == null ? 0 : responseData.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchTemplateFavoriteListResponse(message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ResponseData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public ResponseData getResponseData() {
        return this.data;
    }

    public FetchTemplateFavoriteListResponse(String str, int i, ResponseData responseData) {
        this.message = str;
        this.status_code = i;
        this.data = responseData;
    }

    public static final class ResponseData implements Serializable {
        public final List<Asset> asset_list;
        public final long cursor;
        public final List<FilteredAsset> filtered_asset_list;
        public final boolean has_more;

        public ResponseData(long j, boolean z, List<Asset> list, List<FilteredAsset> list2) {
            this.cursor = j;
            this.has_more = z;
            this.asset_list = list;
            this.filtered_asset_list = list2;
        }
    }
}
