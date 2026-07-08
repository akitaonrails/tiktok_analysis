package com.ss.android.ugc.aweme.plugin.firstlike;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FirstLikeToastData {

    @C09CT("show_duration_ms")
    public final Long showDurationMs;

    @C09CT("style")
    public final Integer style;

    @C09CT("toast_text")
    public final String text;

    public FirstLikeToastData() {
        this(null, null, null);
    }

    public FirstLikeToastData(String str, Integer num, Long l) {
        this.text = str;
        this.style = num;
        this.showDurationMs = l;
    }
}
