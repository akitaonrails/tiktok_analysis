package com.ss.android.ugc.aweme.aigc;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ResponseAIGCStyles extends AbstractC2126608Uu {

    @C09CT("aigc_styles")
    public final List<ResponseAIGCStyle> aigcStyles;

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAIGCStyles)) {
            return false;
        }
        ResponseAIGCStyles responseAIGCStyles = (ResponseAIGCStyles) obj;
        return this.status_code == responseAIGCStyles.status_code && Intrinsics.LJFF(this.status_msg, responseAIGCStyles.status_msg) && Intrinsics.LJFF(this.aigcStyles, responseAIGCStyles.aigcStyles);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.aigcStyles.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseAIGCStyles(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", aigcStyles=");
        sbLIZ.append(this.aigcStyles);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResponseAIGCStyles(int i, String str, List<ResponseAIGCStyle> list) {
        this.status_code = i;
        this.status_msg = str;
        this.aigcStyles = list;
    }
}
