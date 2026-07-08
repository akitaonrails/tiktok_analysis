package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SecondLine implements Serializable {

    @C09CT("content")
    public final String content;

    @C09CT("show_time")
    public final Long showTime;

    public SecondLine() {
        this(null, null);
    }

    public SecondLine(String str, Long l) {
        this.content = str;
        this.showTime = l;
    }
}
