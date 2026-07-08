package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "enable_cohost_layout_extra_pb")
public final class CoHostLayoutExtraPBSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostLayoutExtraPBSetting INSTANCE = new CoHostLayoutExtraPBSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_cohost_layout_extra_pb", DEFAULT);
    }
}
