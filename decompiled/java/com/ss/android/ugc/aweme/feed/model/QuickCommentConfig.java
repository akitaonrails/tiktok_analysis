package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class QuickCommentConfig implements Serializable {

    @C09CT("enabled")
    public Boolean enabled;

    @C09CT("rec_level")
    public Integer recLevel;

    public QuickCommentConfig() {
    }

    public QuickCommentConfig(Boolean bool, Integer num) {
        this.enabled = bool;
        this.recLevel = num;
    }
}
