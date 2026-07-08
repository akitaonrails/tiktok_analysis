package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_viewpager_can_scroll_fix")
public final class LiveViewpagerCanScrollFixSetting {
    public static final boolean DEFAULT = false;
    public static final LiveViewpagerCanScrollFixSetting INSTANCE = new LiveViewpagerCanScrollFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_viewpager_can_scroll_fix", DEFAULT);
    }
}
