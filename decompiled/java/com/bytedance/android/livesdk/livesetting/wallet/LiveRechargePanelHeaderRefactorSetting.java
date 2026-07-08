package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_recharge_panel_header_refactor_enabled")
public final class LiveRechargePanelHeaderRefactorSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRechargePanelHeaderRefactorSetting INSTANCE = new LiveRechargePanelHeaderRefactorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_recharge_panel_header_refactor_enabled", DEFAULT);
    }
}
