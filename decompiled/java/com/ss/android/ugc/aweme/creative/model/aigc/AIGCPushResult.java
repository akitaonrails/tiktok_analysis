package com.ss.android.ugc.aweme.creative.model.aigc;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCPushResult {

    @C09CT("type")
    public final AIGCResultType type;

    @C09CT("url")
    public final String url;

    public AIGCPushResult() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCPushResult(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCPushResult(AIGCResultType aIGCResultType, String str) {
        this.type = aIGCResultType;
        this.url = str;
    }
}
