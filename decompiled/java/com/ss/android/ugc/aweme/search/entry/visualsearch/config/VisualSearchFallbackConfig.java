package com.ss.android.ugc.aweme.search.entry.visualsearch.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class VisualSearchFallbackConfig implements Serializable {

    @C09CT("tako_high_priority")
    public final boolean isTakoTagHighPriority;

    @C09CT("max_tag_count")
    public final int maxTagCount;

    public VisualSearchFallbackConfig() {
        this(false, 0);
    }

    public final boolean isTakoTagHighPriority() {
        return this.isTakoTagHighPriority;
    }

    public VisualSearchFallbackConfig(boolean z, int i) {
        this.isTakoTagHighPriority = z;
        this.maxTagCount = i;
    }
}
