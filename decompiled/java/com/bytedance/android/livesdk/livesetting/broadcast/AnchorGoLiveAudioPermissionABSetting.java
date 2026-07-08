package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_go_live_audio_permission")
public final class AnchorGoLiveAudioPermissionABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorGoLiveAudioPermissionABSetting INSTANCE = new AnchorGoLiveAudioPermissionABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_go_live_audio_permission", DEFAULT) == 1;
    }
}
