package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberShipDisplayInfo {

    @C09CT("time_out_cancel_text")
    public final String cancelText;

    @C09CT("time_out_popup_desc")
    public final String desc;

    @C09CT("time_out_retry_text")
    public final String retryText;

    @C09CT("time_out_popup_title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberShipDisplayInfo)) {
            return false;
        }
        MemberShipDisplayInfo memberShipDisplayInfo = (MemberShipDisplayInfo) obj;
        return Intrinsics.LJFF(this.title, memberShipDisplayInfo.title) && Intrinsics.LJFF(this.desc, memberShipDisplayInfo.desc) && Intrinsics.LJFF(this.cancelText, memberShipDisplayInfo.cancelText) && Intrinsics.LJFF(this.retryText, memberShipDisplayInfo.retryText);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cancelText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.retryText;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemberShipDisplayInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", cancelText=");
        sbLIZ.append(this.cancelText);
        sbLIZ.append(", retryText=");
        sbLIZ.append(this.retryText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MemberShipDisplayInfo(String str, String str2, String str3, String str4) {
        this.title = str;
        this.desc = str2;
        this.cancelText = str3;
        this.retryText = str4;
    }
}
