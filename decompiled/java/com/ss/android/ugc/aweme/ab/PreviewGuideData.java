package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewGuideData {

    @C09CT("enable_cta")
    public final boolean enableCTA;

    @C09CT("guide_show_time")
    public final long guideShowTime;

    @C09CT("style")
    public final int style;

    public PreviewGuideData() {
        this(0, 0L, false);
    }

    public PreviewGuideData(int i, long j, boolean z) {
        this.style = i;
        this.guideShowTime = j;
        this.enableCTA = z;
    }
}
