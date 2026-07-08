package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C323920Cms;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes5.dex */
@SettingsKey(preciseExperiment = false, value = "enable_skylight_fyp_only")
public final class LiveSkylightComprehensionSetting {
    public static final LiveSkylightComprehensionSetting INSTANCE = new LiveSkylightComprehensionSetting();
    public static final C01GW onlyFyp$delegate = C452501pT.LIZIZ(new C323920Cms());
    public static final boolean DEFAULT = false;
    public static volatile boolean dynamicValue = DEFAULT;

    private final boolean getOnlyFyp() {
        return ((Boolean) onlyFyp$delegate.getValue()).booleanValue();
    }

    public final boolean onlyFyp() {
        return getOnlyFyp();
    }

    public final boolean getDynamicValue() {
        return dynamicValue;
    }

    public final void setDynamicValue(boolean z) {
        dynamicValue = z;
    }
}
