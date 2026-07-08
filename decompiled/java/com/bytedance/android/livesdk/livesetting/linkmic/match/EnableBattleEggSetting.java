package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("enable_match_egg")
public final class EnableBattleEggSetting {
    public static final boolean DEFAULT = false;
    public static final EnableBattleEggSetting INSTANCE = new EnableBattleEggSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_match_egg", DEFAULT);
    }
}
