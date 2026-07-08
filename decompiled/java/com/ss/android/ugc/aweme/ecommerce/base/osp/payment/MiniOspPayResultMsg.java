package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniOspPayResultMsg {

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("error_title")
    public final String errorTitle;

    public MiniOspPayResultMsg() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniOspPayResultMsg)) {
            return false;
        }
        MiniOspPayResultMsg miniOspPayResultMsg = (MiniOspPayResultMsg) obj;
        return Intrinsics.LJFF(this.errorTitle, miniOspPayResultMsg.errorTitle) && Intrinsics.LJFF(this.errorMessage, miniOspPayResultMsg.errorMessage);
    }

    public final int hashCode() {
        String str = this.errorTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorMessage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniOspPayResultMsg(errorTitle=");
        sbLIZ.append(this.errorTitle);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.errorMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MiniOspPayResultMsg(String str, String str2) {
        this.errorTitle = str;
        this.errorMessage = str2;
    }
}
