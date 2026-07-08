package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_enable_mute_local_video")
public final class LinkMicSdkEnableMuteLocalVideoImpl {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkEnableMuteLocalVideoImpl INSTANCE = new LinkMicSdkEnableMuteLocalVideoImpl();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_enable_mute_local_video", DEFAULT);
    }
}
