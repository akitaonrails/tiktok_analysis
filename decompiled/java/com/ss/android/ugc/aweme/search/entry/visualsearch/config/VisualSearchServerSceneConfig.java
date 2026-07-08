package com.ss.android.ugc.aweme.search.entry.visualsearch.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class VisualSearchServerSceneConfig implements Serializable {

    @C09CT("enable_tako_tag_show")
    public final boolean enableTakoTagShow;

    @C09CT("max_tag_count")
    public final int maxTagCount;

    public VisualSearchServerSceneConfig() {
        this(0, false);
    }

    public VisualSearchServerSceneConfig(int i, boolean z) {
        this.maxTagCount = i;
        this.enableTakoTagShow = z;
    }
}
