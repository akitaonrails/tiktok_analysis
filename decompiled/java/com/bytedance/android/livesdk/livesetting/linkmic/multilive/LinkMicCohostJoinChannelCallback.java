package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_cohost_join_channel_callback")
public final class LinkMicCohostJoinChannelCallback {
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostJoinChannelCallback INSTANCE = new LinkMicCohostJoinChannelCallback();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_cohost_join_channel_callback", DEFAULT);
    }
}
