package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_mix_stream_online_state")
public final class LinkMicMixStreamOnlineUserState {
    public static final boolean DEFAULT = false;
    public static final LinkMicMixStreamOnlineUserState INSTANCE = new LinkMicMixStreamOnlineUserState();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_mix_stream_online_state", DEFAULT);
    }
}
