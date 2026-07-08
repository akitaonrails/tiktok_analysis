package com.ss.android.ugc.aweme.ml.feature.flash;

import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class FlashFeatureSetConfig {
    public final String sequenceName;
    public final List<FeatureGroup> tt_features;

    public FlashFeatureSetConfig(String str, List<FeatureGroup> list) {
        this.sequenceName = str;
        this.tt_features = list;
    }
}
