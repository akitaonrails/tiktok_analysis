package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class IntentionData implements Serializable {

    @C09CT("solaria_dm_config")
    public IntentionConfig configList;

    public IntentionData() {
        this(null);
    }

    public IntentionData(IntentionConfig intentionConfig) {
        this.configList = intentionConfig;
    }

    public final void setConfigList(IntentionConfig intentionConfig) {
        this.configList = intentionConfig;
    }
}
