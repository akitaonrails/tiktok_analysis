package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.api.SmartCommentConfig;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class ExpandSmartCommentConfig implements Serializable {

    @C09CT("preload_configs")
    public final Map<String, SmartCommentConfig> preloadConfigs;

    public ExpandSmartCommentConfig() {
        this(null);
    }

    public ExpandSmartCommentConfig(Map<String, SmartCommentConfig> map) {
        this.preloadConfigs = map;
    }
}
