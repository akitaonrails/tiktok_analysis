package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCServerTaskOutput {

    @C09CT("original_url")
    public final String originalUrl;

    @C09CT("thumbnail_url")
    public final String thumbnailUrl;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCServerTaskOutput(originalUrl=");
        sbLIZ.append(this.originalUrl);
        sbLIZ.append(", thumbnailUrl=");
        sbLIZ.append(this.thumbnailUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCServerTaskOutput() {
        this("", "");
    }

    public AIGCServerTaskOutput(String str, String str2) {
        this.originalUrl = str;
        this.thumbnailUrl = str2;
    }
}
