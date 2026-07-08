package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ProgressiveDowngradeConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("downgradeScoreThreshold")
    public float downgradeScoreThreshold;

    @C09CT("upgradeScoreThreshold")
    public float upgradeScoreThreshold;

    static {
        NormalGson.singleton();
        ADAPTER = new ProgressiveDowngradeConfig_OptTypeAdapter();
    }

    public ProgressiveDowngradeConfig() {
        this(40.0f, 60.0f);
    }

    public final float getDowngradeScoreThreshold() {
        return this.downgradeScoreThreshold;
    }

    public final float getUpgradeScoreThreshold() {
        return this.upgradeScoreThreshold;
    }

    public final void setDowngradeScoreThreshold(float f) {
        this.downgradeScoreThreshold = f;
    }

    public final void setUpgradeScoreThreshold(float f) {
        this.upgradeScoreThreshold = f;
    }

    public ProgressiveDowngradeConfig(float f, float f2) {
        this.downgradeScoreThreshold = f;
        this.upgradeScoreThreshold = f2;
    }
}
