package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_fix_update_live_stream_error_ab_setting")
public final class AnchorFixUpdateLiveStreamErrorABSetting {
    public static final int DEFAULT = 1;
    public static final AnchorFixUpdateLiveStreamErrorABSetting INSTANCE = new AnchorFixUpdateLiveStreamErrorABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_fix_update_live_stream_error_ab_setting", DEFAULT) == 1;
    }
}
