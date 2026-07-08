package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class TimeWindow {

    @C09CT("size")
    public final Long size;

    @C09CT("type")
    public final String type;

    public TimeWindow() {
        this(null, null);
    }

    public TimeWindow(String str, Long l) {
        this.type = str;
        this.size = l;
    }
}
