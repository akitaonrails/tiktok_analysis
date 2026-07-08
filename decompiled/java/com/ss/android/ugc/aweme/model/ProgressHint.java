package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class ProgressHint {

    @C09CT("end_millisecond")
    public final int endMillisecond;

    @C09CT("is_fallback")
    public final boolean isFallback;

    @C09CT("long_hint")
    public final String longHint;

    @C09CT("short_hints")
    public final List<String> shortHints;

    @C09CT("start_millisecond")
    public final int startMillisecond;

    @C09CT("title")
    public final String title;

    public ProgressHint() {
        this(0, 0, null, null, null, false);
    }

    public ProgressHint(int i, int i2, List<String> list, String str, String str2, boolean z) {
        this.startMillisecond = i;
        this.endMillisecond = i2;
        this.shortHints = list;
        this.longHint = str;
        this.title = str2;
        this.isFallback = z;
    }
}
