package com.ss.android.ugc.aweme.ml.feature.flash;

import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class FlashFeedPbFeatureConfig {
    public final List<String> featureSetList;
    public final boolean isFlat;
    public final String paramsKey;
    public final String pbKey;

    public final boolean isFlat() {
        return this.isFlat;
    }

    public FlashFeedPbFeatureConfig(String str, List<String> list, boolean z, String str2) {
        this.paramsKey = str;
        this.featureSetList = list;
        this.isFlat = z;
        this.pbKey = str2;
    }
}
