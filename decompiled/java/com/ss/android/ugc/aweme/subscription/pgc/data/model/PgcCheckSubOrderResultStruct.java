package com.ss.android.ugc.aweme.subscription.pgc.data.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PgcCheckSubOrderResultStruct {
    public static final int $stable = 8;
    public String orderID;
    public int retryCount;

    @C09CT(alternate = {"LIZ"}, value = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT(alternate = {"LJ"}, value = "sub_charge_info")
    public final PgcSubChargeInfo subChargeInfo;

    @C09CT(alternate = {"LIZLLL"}, value = "toast")
    public final String toast;

    public PgcCheckSubOrderResultStruct() {
        this(0, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PgcCheckSubOrderResultStruct)) {
            return false;
        }
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = (PgcCheckSubOrderResultStruct) obj;
        return this.status == pgcCheckSubOrderResultStruct.status && Intrinsics.LJFF(this.toast, pgcCheckSubOrderResultStruct.toast) && Intrinsics.LJFF(this.subChargeInfo, pgcCheckSubOrderResultStruct.subChargeInfo);
    }

    public int hashCode() {
        int i = this.status * 31;
        String str = this.toast;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        PgcSubChargeInfo pgcSubChargeInfo = this.subChargeInfo;
        return iHashCode + (pgcSubChargeInfo != null ? pgcSubChargeInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcCheckSubOrderResultStruct(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.toast);
        sbLIZ.append(", subChargeInfo=");
        sbLIZ.append(this.subChargeInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setOrderID(String str) {
        this.orderID = str;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public PgcCheckSubOrderResultStruct(int i, String str, PgcSubChargeInfo pgcSubChargeInfo) {
        this.status = i;
        this.toast = str;
        this.subChargeInfo = pgcSubChargeInfo;
        this.orderID = "";
    }
}
