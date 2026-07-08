package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_hangout_remove_play_label")
public final class MultiHangoutRemovePlayLabelSetting {
    public static final boolean DEFAULT = false;
    public static final MultiHangoutRemovePlayLabelSetting INSTANCE = new MultiHangoutRemovePlayLabelSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_hangout_remove_play_label", DEFAULT) && LiveSdkMultiTopLivePhase3Setting.INSTANCE.isEnable();
    }
}
