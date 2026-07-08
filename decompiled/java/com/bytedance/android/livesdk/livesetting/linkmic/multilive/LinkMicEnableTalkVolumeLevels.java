package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_enable_talk_volume_levels")
public final class LinkMicEnableTalkVolumeLevels {
    public static final boolean DEFAULT = false;
    public static final LinkMicEnableTalkVolumeLevels INSTANCE = new LinkMicEnableTalkVolumeLevels();

    public final boolean enableTalkVolumeLevels() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_enable_talk_volume_levels", DEFAULT);
    }
}
