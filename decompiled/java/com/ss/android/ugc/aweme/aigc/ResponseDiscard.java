package com.ss.android.ugc.aweme.aigc;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ResponseDiscard extends AbstractC2126608Uu {

    @C09CT("discard_result")
    public final int discardResult;

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseDiscard)) {
            return false;
        }
        ResponseDiscard responseDiscard = (ResponseDiscard) obj;
        return this.status_code == responseDiscard.status_code && Intrinsics.LJFF(this.status_msg, responseDiscard.status_msg) && this.discardResult == responseDiscard.discardResult;
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.discardResult;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseDiscard(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", discardResult=");
        sbLIZ.append(this.discardResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResponseDiscard(int i, String str, int i2) {
        this.status_code = i;
        this.status_msg = str;
        this.discardResult = i2;
    }
}
