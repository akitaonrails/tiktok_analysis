package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class ImageMessageSamplingConfig implements Serializable {

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("sampling_rates")
    public final Map<String, Float> sceneToSamplingRate;

    public ImageMessageSamplingConfig() {
        this(C2097608Jq.LJ(), false);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public ImageMessageSamplingConfig(Map<String, Float> map, boolean z) {
        this.sceneToSamplingRate = map;
        this.isEnabled = z;
    }
}
