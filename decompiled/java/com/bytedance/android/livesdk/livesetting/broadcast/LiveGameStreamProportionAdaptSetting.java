package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_game_stream_proportion_adapt")
public final class LiveGameStreamProportionAdaptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGameStreamProportionAdaptSetting INSTANCE = new LiveGameStreamProportionAdaptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_game_stream_proportion_adapt", DEFAULT);
    }
}
