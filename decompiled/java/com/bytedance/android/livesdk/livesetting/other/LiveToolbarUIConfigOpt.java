package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_ui_config_opt")
public final class LiveToolbarUIConfigOpt {
    public static final int OVERLAY_TEXT_ON_THE_SHARE = 3;
    public static final int SHARE_WITH_TEXT = 1;
    public static final int SHARE_WITH_TEXT_OPT = 2;
    public static final LiveToolbarUIConfigOpt INSTANCE = new LiveToolbarUIConfigOpt();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_toolbar_ui_config_opt", DEFAULT);

    public final boolean noText() {
        return ToolbarTipsExperiment.INSTANCE.noText() || LiveToolbarIconStyleSetting.INSTANCE.noText();
    }

    public final boolean shareWithTextOpt() {
        return ToolbarTipsExperiment.INSTANCE.hasShareCount() || LiveToolbarIconStyleSetting.INSTANCE.noText();
    }

    public final boolean overlayTextOnTheShare() {
        return getValue() == 3;
    }

    public final boolean shareWithText() {
        return getValue() == 1;
    }

    public static final int getValue() {
        return value;
    }
}
