package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicOptionConfig {

    @C09CT("dynamic_option_keys")
    public final List<DynamicOptionModel> dynamicOptionModelList;

    public DynamicOptionConfig() {
        this(null);
    }

    public DynamicOptionConfig(List<DynamicOptionModel> list) {
        this.dynamicOptionModelList = list;
    }
}
