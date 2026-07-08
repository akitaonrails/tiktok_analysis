package com.ss.android.ugc.aweme.friendstab.api;

import X.C09CT;
import X.C1587730rQ3;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes25.dex */
public final class InsertResultCode {
    public static final C1587730rQ3 Companion = new Object() { // from class: X.0rQ3
    };

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String awemeId;

    @C09CT("result_code")
    public int code;

    public InsertResultCode() {
        this(0, "");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertResultCode(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public InsertResultCode(int i, String str) {
        this.code = i;
        this.awemeId = str;
    }
}
