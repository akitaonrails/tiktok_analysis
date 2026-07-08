package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ThirdPartyTenorExtInfo implements Serializable {

    @C09CT("tenor_id")
    public final String tenorId;

    @C09CT("tenor_url")
    public final String tenorUrl;

    public ThirdPartyTenorExtInfo() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyTenorExtInfo)) {
            return false;
        }
        ThirdPartyTenorExtInfo thirdPartyTenorExtInfo = (ThirdPartyTenorExtInfo) obj;
        return Intrinsics.LJFF(this.tenorId, thirdPartyTenorExtInfo.tenorId) && Intrinsics.LJFF(this.tenorUrl, thirdPartyTenorExtInfo.tenorUrl);
    }

    public int hashCode() {
        String str = this.tenorId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tenorUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdPartyTenorExtInfo(tenorId=");
        sbLIZ.append(this.tenorId);
        sbLIZ.append(", tenorUrl=");
        sbLIZ.append(this.tenorUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThirdPartyTenorExtInfo(String str, String str2) {
        this.tenorId = str;
        this.tenorUrl = str2;
    }
}
