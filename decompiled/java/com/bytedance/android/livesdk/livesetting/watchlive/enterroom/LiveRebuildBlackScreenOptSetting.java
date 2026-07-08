package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_rebuild_black_screen_opt")
public final class LiveRebuildBlackScreenOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRebuildBlackScreenOptSetting INSTANCE = new LiveRebuildBlackScreenOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rebuild_black_screen_opt", DEFAULT);
    }
}
