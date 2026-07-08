package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MainOrderAvailableInfo {

    @C09CT("available_status")
    public Integer availableStatus;

    @C09CT("tips_text")
    public String tipsText;

    public MainOrderAvailableInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainOrderAvailableInfo)) {
            return false;
        }
        MainOrderAvailableInfo mainOrderAvailableInfo = (MainOrderAvailableInfo) obj;
        return Intrinsics.LJFF(this.availableStatus, mainOrderAvailableInfo.availableStatus) && Intrinsics.LJFF(this.tipsText, mainOrderAvailableInfo.tipsText);
    }

    public final int hashCode() {
        Integer num = this.availableStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tipsText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainOrderAvailableInfo(availableStatus=");
        sbLIZ.append(this.availableStatus);
        sbLIZ.append(", tipsText=");
        sbLIZ.append(this.tipsText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MainOrderAvailableInfo(Integer num, String str) {
        this.availableStatus = num;
        this.tipsText = str;
    }
}
