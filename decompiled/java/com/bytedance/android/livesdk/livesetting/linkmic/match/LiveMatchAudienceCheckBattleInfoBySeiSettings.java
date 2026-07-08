package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enale_sei_fallback_open_message")
public final class LiveMatchAudienceCheckBattleInfoBySeiSettings {
    public static final boolean DEFAULT = false;
    public static final LiveMatchAudienceCheckBattleInfoBySeiSettings INSTANCE = new LiveMatchAudienceCheckBattleInfoBySeiSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("enale_sei_fallback_open_message", DEFAULT);
    }
}
