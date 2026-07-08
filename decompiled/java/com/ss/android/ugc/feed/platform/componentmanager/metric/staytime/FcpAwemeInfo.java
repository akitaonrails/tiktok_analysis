package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime;

import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpAwemeInfo implements Serializable {
    public static final int $stable = 0;
    public final String authorId;
    public final int awemeType;
    public final String enterFrom;
    public final String enterMethod;
    public final String genreType;
    public final String groupId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpAwemeInfo(groupId=");
        sbLIZ.append(this.groupId);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", genreType=");
        sbLIZ.append(this.genreType);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FcpAwemeInfo(String str, String str2, String str3, String str4, String str5, int i) {
        this.groupId = str;
        this.authorId = str2;
        this.enterFrom = str3;
        this.genreType = str4;
        this.enterMethod = str5;
        this.awemeType = i;
    }
}
