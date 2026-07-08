package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_view_tree_opt_v2")
public final class LiveViewTreeOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveViewTreeOptSetting INSTANCE = new LiveViewTreeOptSetting();
    public static int value = -1;

    public static final boolean enableFluencyMonitorOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_view_tree_opt_v2", DEFAULT);
        }
        return (value & 4) == 4;
    }

    public static final boolean enableViewBackgroundOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_view_tree_opt_v2", DEFAULT);
        }
        return (value & 2) == 2;
    }

    public static final boolean enableViewTreeNewPerfOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_view_tree_opt_v2", DEFAULT);
        }
        return (value & 8) == 8;
    }

    public static final boolean enableViewTreeOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_view_tree_opt_v2", DEFAULT);
        }
        return (value & 1) == 1;
    }
}
