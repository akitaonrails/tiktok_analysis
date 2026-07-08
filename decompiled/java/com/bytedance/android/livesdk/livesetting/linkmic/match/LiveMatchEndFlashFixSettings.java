package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_end_flash_fix_setting")
public final class LiveMatchEndFlashFixSettings {
    public static final boolean DEFAULT = true;
    public static final LiveMatchEndFlashFixSettings INSTANCE = new LiveMatchEndFlashFixSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_end_flash_fix_setting", DEFAULT);
    }
}
