package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_ui_config")
public final class LiveToolbarUIConfig {
    public static final int EXPAND_CONTAINER = 4;
    public static final int NO_TEXT = 1;
    public static final int OPTIMIZE_BACKGROUND = 3;
    public static final int SHARE_WITH_TEXT = 2;
    public static final LiveToolbarUIConfig INSTANCE = new LiveToolbarUIConfig();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_toolbar_ui_config", DEFAULT);

    public static final boolean expandContainer() {
        return value >= 4;
    }

    public static final boolean noText() {
        return LiveToolbarUIConfigOpt.INSTANCE.noText();
    }

    public static final boolean optimizeBackground() {
        return value >= 3;
    }

    public static final boolean shareWithText() {
        return value >= 2;
    }

    public static final int getValue() {
        return value;
    }
}
