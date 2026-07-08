package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "player_dialog_fragment_leak_fix")
public final class PlayerDialogFragmentLeakFixSetting {
    public static final PlayerDialogFragmentLeakFixSetting INSTANCE = new PlayerDialogFragmentLeakFixSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("player_dialog_fragment_leak_fix", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
