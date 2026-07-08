package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_display_new_opt_pair_card")
public final class LiveCohostBattlePairLynxCardSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCohostBattlePairLynxCardSetting INSTANCE = new LiveCohostBattlePairLynxCardSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_display_new_opt_pair_card", DEFAULT);
    }
}
