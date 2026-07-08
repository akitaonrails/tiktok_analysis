package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_visibility_performance")
public final class LivePublicScreenVisibilityPerformanceSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenVisibilityPerformanceSetting INSTANCE = new LivePublicScreenVisibilityPerformanceSetting();
    public static final C01GW value$delegate = C292401Bi.LIZ(AFwS206S0000000_18.get$arr$(51));

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
