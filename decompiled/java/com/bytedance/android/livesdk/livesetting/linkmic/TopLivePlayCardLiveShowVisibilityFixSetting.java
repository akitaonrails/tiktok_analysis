package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_play_card_live_show_visibility_fix")
public final class TopLivePlayCardLiveShowVisibilityFixSetting {
    public static final boolean DEFAULT = false;
    public static final TopLivePlayCardLiveShowVisibilityFixSetting INSTANCE = new TopLivePlayCardLiveShowVisibilityFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_play_card_live_show_visibility_fix", DEFAULT);
    }
}
