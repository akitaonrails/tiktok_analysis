package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentPreloadInfo implements Serializable {

    @C09CT("preds")
    public String predictConfig;

    @C09CT("type")
    public int type;

    public CommentPreloadInfo() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPreloadInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", predictConfig=");
        sbLIZ.append(this.predictConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentPreloadInfo(int i, String str) {
        this.type = i;
        this.predictConfig = str;
    }
}
