package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorInfo {

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        return Intrinsics.LJFF(this.code, errorInfo.code) && Intrinsics.LJFF(this.message, errorInfo.message);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorInfo(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ErrorInfo(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}
