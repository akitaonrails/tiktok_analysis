package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SuggestedVideoError {

    @C09CT("code")
    public final String code;

    @C09CT("message")
    public final String message;

    public SuggestedVideoError() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedVideoError)) {
            return false;
        }
        SuggestedVideoError suggestedVideoError = (SuggestedVideoError) obj;
        return Intrinsics.LJFF(this.code, suggestedVideoError.code) && Intrinsics.LJFF(this.message, suggestedVideoError.message);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoError(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoError(String str, String str2) {
        this.code = str;
        this.message = str2;
    }
}
