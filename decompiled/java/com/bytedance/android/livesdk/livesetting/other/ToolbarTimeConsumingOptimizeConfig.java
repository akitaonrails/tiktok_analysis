package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ToolbarTimeConsumingOptimizeConfig {
    public static final TypeAdapter ADAPTER = new ToolbarTimeConsumingOptimizeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("optimize_calculate")
    public boolean optimizeCalculate;

    @C09CT("optimize_init")
    public boolean optimizeInit;

    public ToolbarTimeConsumingOptimizeConfig() {
        this(false, false);
    }

    public ToolbarTimeConsumingOptimizeConfig(boolean z, boolean z2) {
        this.optimizeInit = z;
        this.optimizeCalculate = z2;
    }
}
