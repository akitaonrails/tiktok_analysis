package com.ss.android.ugc.aweme.im.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ShortLinkConversionResponse extends BaseResponse {

    @C09CT("belong")
    public final String belong;

    @C09CT("source_url")
    public final String sourceUrl;

    public ShortLinkConversionResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortLinkConversionResponse)) {
            return false;
        }
        ShortLinkConversionResponse shortLinkConversionResponse = (ShortLinkConversionResponse) obj;
        return Intrinsics.LJFF(this.sourceUrl, shortLinkConversionResponse.sourceUrl) && Intrinsics.LJFF(this.belong, shortLinkConversionResponse.belong);
    }

    public final int hashCode() {
        String str = this.sourceUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.belong;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShortLinkConversionResponse(sourceUrl=");
        sbLIZ.append(this.sourceUrl);
        sbLIZ.append(", belong=");
        sbLIZ.append(this.belong);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShortLinkConversionResponse(String str, String str2) {
        this.sourceUrl = str;
        this.belong = str2;
    }
}
