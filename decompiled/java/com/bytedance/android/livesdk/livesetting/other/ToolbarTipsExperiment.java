package com.bytedance.android.livesdk.livesetting.other;

import X.InterfaceC1294060jmO;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_toolbar_tips_opt")
public final class ToolbarTipsExperiment {
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;
    public static final int V4 = 4;
    public static final int V5 = 5;
    public static final ToolbarTipsExperiment INSTANCE = new ToolbarTipsExperiment();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_toolbar_tips_opt", DEFAULT);

    public final boolean hasShareCount() {
        int i = value;
        return i == 4 || i == 5;
    }

    public final boolean hasTips() {
        int i = value;
        return i == 2 || i == 3 || i == 4 || i == 5;
    }

    @InterfaceC1294060jmO
    public final boolean isClickable() {
        return value == 5;
    }

    public final boolean noText() {
        int i = value;
        return i == 1 || i == 3 || i == 4 || i == 5;
    }
}
