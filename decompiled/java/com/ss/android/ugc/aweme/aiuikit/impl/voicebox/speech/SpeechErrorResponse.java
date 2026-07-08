package com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechErrorResponse {

    @C09CT("err_code")
    public final Integer errorCode;

    @C09CT("err_msg")
    public final String errorMsg;

    public SpeechErrorResponse() {
        this(null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechErrorResponse)) {
            return false;
        }
        SpeechErrorResponse speechErrorResponse = (SpeechErrorResponse) obj;
        return Intrinsics.LJFF(this.errorCode, speechErrorResponse.errorCode) && Intrinsics.LJFF(this.errorMsg, speechErrorResponse.errorMsg);
    }

    public final int hashCode() {
        Integer num = this.errorCode;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.errorMsg.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechErrorResponse(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpeechErrorResponse(Integer num, String str) {
        this.errorCode = num;
        this.errorMsg = str;
    }
}
