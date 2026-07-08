package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class DurationConfig {

    @C09CT("config_interval")
    public int configInterval;

    @C09CT("config_label")
    public String configLabel = "";

    @C09CT("config_threshold")
    public float configThreshold = 0.5f;

    public final int getConfigInterval() {
        return this.configInterval;
    }

    public final String getConfigLabel() {
        return this.configLabel;
    }

    public final float getConfigThreshold() {
        return this.configThreshold;
    }

    public final void setConfigInterval(int i) {
        this.configInterval = i;
    }

    public final void setConfigLabel(String str) {
        this.configLabel = str;
    }

    public final void setConfigThreshold(float f) {
        this.configThreshold = f;
    }
}
