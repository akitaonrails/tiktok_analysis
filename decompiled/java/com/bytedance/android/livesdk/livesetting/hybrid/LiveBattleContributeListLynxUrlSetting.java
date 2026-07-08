package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_battle_contribute_list_lynx_url")
public final class LiveBattleContributeListLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveBattleContributeListLynxUrlSetting INSTANCE = new LiveBattleContributeListLynxUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_battle_contribute_list_lynx_url", DEFAULT);
    }
}
