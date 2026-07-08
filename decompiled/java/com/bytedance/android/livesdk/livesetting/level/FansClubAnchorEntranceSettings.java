package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_level_anchor_entrance_switch")
public final class FansClubAnchorEntranceSettings {
    public static final boolean DEFAULT = true;
    public static final FansClubAnchorEntranceSettings INSTANCE = new FansClubAnchorEntranceSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_level_anchor_entrance_switch", DEFAULT);
    }
}
