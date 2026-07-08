package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multi_host_expand_video_area_enable")
public final class MultiCohostAreaExpandSetting {
    public static final boolean DEFAULT = true;
    public static final MultiCohostAreaExpandSetting INSTANCE = new MultiCohostAreaExpandSetting();
    public static String lastCohostLayoutId = "";

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_multi_host_expand_video_area_enable", DEFAULT);
    }

    public final String getLastCohostLayoutId() {
        return lastCohostLayoutId;
    }

    public final String getCohostLayoutId(boolean z) {
        return LiveCoHostLayoutIdConfigSetting.INSTANCE.getNormalExpand(z);
    }

    public final void setLastCohostLayoutId(String str) {
        lastCohostLayoutId = str;
    }
}
