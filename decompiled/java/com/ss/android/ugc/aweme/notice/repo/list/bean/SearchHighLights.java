package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SearchHighLights {

    @C09CT("hightlight_content")
    public final String content;

    @C09CT("end_index")
    public final int endIndex;

    @C09CT("start_index")
    public final int startIndex;

    public SearchHighLights() {
        this(0, 0, null);
    }

    public SearchHighLights(int i, int i2, String str) {
        this.endIndex = i;
        this.startIndex = i2;
        this.content = str;
    }
}
