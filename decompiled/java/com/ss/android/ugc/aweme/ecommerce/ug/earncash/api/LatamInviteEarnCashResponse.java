package com.ss.android.ugc.aweme.ecommerce.ug.earncash.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.ug.earncash.DirectMessagePbData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LatamInviteEarnCashResponse {

    @C09CT("data_list")
    public final List<DirectMessagePbData> dataList;

    public LatamInviteEarnCashResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LatamInviteEarnCashResponse) && Intrinsics.LJFF(this.dataList, ((LatamInviteEarnCashResponse) obj).dataList);
    }

    public final int hashCode() {
        List<DirectMessagePbData> list = this.dataList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LatamInviteEarnCashResponse(dataList=");
        sbLIZ.append(this.dataList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LatamInviteEarnCashResponse(List<DirectMessagePbData> list) {
        this.dataList = list;
    }
}
