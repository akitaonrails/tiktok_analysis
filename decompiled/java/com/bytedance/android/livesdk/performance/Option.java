package com.bytedance.android.livesdk.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class Option {
    public static final TypeAdapter ADAPTER = new Option_OptTypeAdapter(NormalGson.singleton());

    @C09CT("auto_adaptive_overall_score")
    public boolean autoAdaptiveOverallScore;

    @C09CT("auto_adaptive_thermal_score")
    public boolean autoAdaptiveThermalScore;

    @C09CT("effect_adaptive_overall_score")
    public boolean effectAdaptiveOverallScore;

    @C09CT("speed_test_overall_score")
    public boolean speedTestOverallScore;

    @C09CT("speed_test_thermal_score")
    public boolean speedTestThermalScore;

    public Option() {
        this(false, false, false, false, false);
    }

    public Option(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.autoAdaptiveOverallScore = z;
        this.autoAdaptiveThermalScore = z2;
        this.speedTestOverallScore = z3;
        this.speedTestThermalScore = z4;
        this.effectAdaptiveOverallScore = z5;
    }
}
