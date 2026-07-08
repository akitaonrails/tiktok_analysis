package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cohost_unpolished_tip_times")
public final class MultiCoHostUnpolishedTipTimesSetting {
    public static final MultiCoHostUnpolishedTipTimesSetting INSTANCE = new MultiCoHostUnpolishedTipTimesSetting();
    public static final int DEFAULT = 5;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_unpolished_tip_times", DEFAULT);
    }
}
