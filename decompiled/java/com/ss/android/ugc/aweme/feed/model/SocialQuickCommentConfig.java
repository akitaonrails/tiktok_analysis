package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class SocialQuickCommentConfig implements Serializable {

    @C09CT("enabled")
    public Boolean enabled;

    @C09CT("rec_metrics")
    public Map<String, String> recMetrics;

    public SocialQuickCommentConfig() {
        this(Boolean.FALSE, null);
    }

    public SocialQuickCommentConfig(Boolean bool, Map<String, String> map) {
        this.enabled = bool;
        this.recMetrics = map;
    }
}
