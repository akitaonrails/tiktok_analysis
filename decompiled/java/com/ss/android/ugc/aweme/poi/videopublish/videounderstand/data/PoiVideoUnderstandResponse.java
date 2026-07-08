package com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PoiVideoUnderstandResponse extends BaseResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final PoiVideoUnderstandData data;

    public PoiVideoUnderstandResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiVideoUnderstandResponse)) {
            return false;
        }
        PoiVideoUnderstandResponse poiVideoUnderstandResponse = (PoiVideoUnderstandResponse) obj;
        return Intrinsics.LJFF(this.code, poiVideoUnderstandResponse.code) && Intrinsics.LJFF(this.data, poiVideoUnderstandResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PoiVideoUnderstandData poiVideoUnderstandData = this.data;
        return iHashCode + (poiVideoUnderstandData != null ? poiVideoUnderstandData.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiVideoUnderstandResponse(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuccess() {
        Integer num;
        return (this.data == null || (num = this.code) == null || num.intValue() != 0) ? false : true;
    }

    public PoiVideoUnderstandResponse(Integer num, PoiVideoUnderstandData poiVideoUnderstandData) {
        this.code = num;
        this.data = poiVideoUnderstandData;
    }
}
