package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class PreferenceSettings implements Serializable {
    public static final int $stable = 0;

    @C09CT("stem_feed")
    public final int stemFeedStatus;

    public PreferenceSettings() {
        this(0);
    }

    public final PreferenceSettings copy(int i) {
        return new PreferenceSettings(i);
    }

    public PreferenceSettings(int i) {
        this.stemFeedStatus = i;
    }
}
