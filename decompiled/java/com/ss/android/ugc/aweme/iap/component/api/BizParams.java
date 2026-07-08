package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BizParams {

    @C09CT("default_purchase_channel")
    public final Integer defaultPurchaseChannel;

    @C09CT("sec_uid")
    public final String secUid;

    public BizParams() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizParams)) {
            return false;
        }
        BizParams bizParams = (BizParams) obj;
        return Intrinsics.LJFF(this.secUid, bizParams.secUid) && Intrinsics.LJFF(this.defaultPurchaseChannel, bizParams.defaultPurchaseChannel);
    }

    public final int hashCode() {
        String str = this.secUid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.defaultPurchaseChannel;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizParams(secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", defaultPurchaseChannel=");
        sbLIZ.append(this.defaultPurchaseChannel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizParams(String str, Integer num) {
        this.secUid = str;
        this.defaultPurchaseChannel = num;
    }
}
