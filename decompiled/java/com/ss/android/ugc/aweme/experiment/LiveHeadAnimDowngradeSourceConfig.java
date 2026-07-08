package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveHeadAnimDowngradeSourceConfig {

    @C09CT("criticalThreshold")
    public final float criticalThreshold;

    @C09CT("highThreshold")
    public final float highThreshold;

    @C09CT("mediumThreshold")
    public final float mediumThreshold;

    public LiveHeadAnimDowngradeSourceConfig() {
        this(0.5f, 0.7f, 0.9f);
    }

    public final String toString() {
        return GsonProtectorUtils.toJson(NormalGson.singleton(), this);
    }

    public LiveHeadAnimDowngradeSourceConfig(float f, float f2, float f3) {
        this.mediumThreshold = f;
        this.highThreshold = f2;
        this.criticalThreshold = f3;
    }
}
