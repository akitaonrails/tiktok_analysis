package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_icon_style_optimize")
public final class LiveToolbarIconStyleOptimize {
    public static final boolean DEFAULT = true;
    public static final LiveToolbarIconStyleOptimize INSTANCE = new LiveToolbarIconStyleOptimize();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_toolbar_icon_style_optimize", DEFAULT) && LiveToolbarIconStyleSetting.INSTANCE.getValue() != 0;
    }
}
