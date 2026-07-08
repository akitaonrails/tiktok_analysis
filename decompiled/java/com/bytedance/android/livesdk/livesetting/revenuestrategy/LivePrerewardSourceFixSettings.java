package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_prereward_source_fix_setting")
public final class LivePrerewardSourceFixSettings {
    public static final boolean DEFAULT = false;
    public static final LivePrerewardSourceFixSettings INSTANCE = new LivePrerewardSourceFixSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_prereward_source_fix_setting", DEFAULT);
    }
}
