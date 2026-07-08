package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TradeQueryActionInfo {

    @C09CT("action")
    public final String action;

    @C09CT("action_url")
    public final String actionUrl;

    @C09CT("material_content")
    public final String materialContent;

    public TradeQueryActionInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeQueryActionInfo)) {
            return false;
        }
        TradeQueryActionInfo tradeQueryActionInfo = (TradeQueryActionInfo) obj;
        return Intrinsics.LJFF(this.action, tradeQueryActionInfo.action) && Intrinsics.LJFF(this.actionUrl, tradeQueryActionInfo.actionUrl) && Intrinsics.LJFF(this.materialContent, tradeQueryActionInfo.materialContent);
    }

    public final int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.materialContent;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TradeQueryActionInfo(action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", actionUrl=");
        sbLIZ.append(this.actionUrl);
        sbLIZ.append(", materialContent=");
        sbLIZ.append(this.materialContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TradeQueryActionInfo(String str, String str2, String str3) {
        this.action = str;
        this.actionUrl = str2;
        this.materialContent = str3;
    }
}
