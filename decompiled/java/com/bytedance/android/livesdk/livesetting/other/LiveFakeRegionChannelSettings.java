package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fake_region_channel")
public final class LiveFakeRegionChannelSettings {
    public static final LiveFakeRegionChannelSettings INSTANCE = new LiveFakeRegionChannelSettings();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_fake_region_channel", DEFAULT);
    }
}
