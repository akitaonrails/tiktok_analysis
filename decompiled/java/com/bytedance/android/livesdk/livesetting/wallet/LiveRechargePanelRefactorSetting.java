package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_recharge_panel_refactor_enabled")
public final class LiveRechargePanelRefactorSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRechargePanelRefactorSetting INSTANCE = new LiveRechargePanelRefactorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_recharge_panel_refactor_enabled", DEFAULT);
    }
}
