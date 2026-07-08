package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMemory {

    @C09CT("content")
    public final String content;

    @C09CT("title")
    public final String title;

    @C09CT("update_time")
    public final Long updateTime;

    public TakoMemory() {
        this(null, null, null);
    }

    public TakoMemory(String str, String str2, Long l) {
        this.title = str;
        this.content = str2;
        this.updateTime = l;
    }
}
