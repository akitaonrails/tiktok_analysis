package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_swap_multi_stream_data")
public final class TtliveSwapMultiStreamDataSetting {
    public static final boolean DEFAULT = false;
    public static final TtliveSwapMultiStreamDataSetting INSTANCE = new TtliveSwapMultiStreamDataSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_swap_multi_stream_data", DEFAULT);
    }
}
