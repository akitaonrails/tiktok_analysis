package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_fetch_info_when_match_end")
public final class BattleIdentifyTimeOutCheckBattleInfo {
    public static final boolean DEFAULT = false;
    public static final BattleIdentifyTimeOutCheckBattleInfo INSTANCE = new BattleIdentifyTimeOutCheckBattleInfo();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_fetch_info_when_match_end", DEFAULT);
    }
}
