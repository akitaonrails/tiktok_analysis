package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_reuse_optimize")
public final class LiveToolbarReuseOptimizeSetting {
    public static final ToolbarReuseConfig DEFAULT;
    public static final LiveToolbarReuseOptimizeSetting INSTANCE = new LiveToolbarReuseOptimizeSetting();
    public static final ToolbarReuseConfig value;

    static {
        ToolbarReuseConfig toolbarReuseConfig = new ToolbarReuseConfig();
        DEFAULT = toolbarReuseConfig;
        ToolbarReuseConfig toolbarReuseConfig2 = (ToolbarReuseConfig) SettingsManager.INSTANCE.getValueSafely(LiveToolbarReuseOptimizeSetting.class);
        if (toolbarReuseConfig2 != null) {
            toolbarReuseConfig = toolbarReuseConfig2;
        }
        value = toolbarReuseConfig;
    }

    public final boolean enable() {
        return value.enable;
    }

    public final boolean enableStrategy(String str) {
        ToolbarReuseConfig toolbarReuseConfig = value;
        if (toolbarReuseConfig.enable && !toolbarReuseConfig.disableList.contains(str.toLowerCase(Locale.ROOT))) {
            return true;
        }
        return false;
    }
}
