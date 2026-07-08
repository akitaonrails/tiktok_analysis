package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("fake_regions")
public final class FakeRegionsSetting {
    public static final int DEFAULT = 0;
    public static final FakeRegionsSetting INSTANCE = new FakeRegionsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("fake_regions", DEFAULT);
    }
}
