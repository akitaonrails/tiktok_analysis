package com.ss.android.ugc.aweme.ml.feature.flash;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class SequenceFilterConfig {
    public final Map<String, Map<String, List<String>>> configMap;

    public SequenceFilterConfig() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SequenceFilterConfig(Map<String, ? extends Map<String, ? extends List<String>>> map) {
        this.configMap = map;
    }
}
