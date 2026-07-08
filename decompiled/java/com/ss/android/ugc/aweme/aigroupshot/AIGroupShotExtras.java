package com.ss.android.ugc.aweme.aigroupshot;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class AIGroupShotExtras implements Serializable {
    public static final int $stable = 0;

    @C09CT("count")
    public final int count;

    @C09CT("cover_img")
    public final String coverImg;

    @C09CT("cover_url")
    public final String coverUrl;

    public AIGroupShotExtras() {
        this(0, "", "");
    }

    public AIGroupShotExtras(int i, String str, String str2) {
        this.count = i;
        this.coverUrl = str;
        this.coverImg = str2;
    }
}
