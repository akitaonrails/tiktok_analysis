package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_fix_livestudio_enable_media_state")
public final class LinkMicFixLiveStudioEnableMediaState {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixLiveStudioEnableMediaState INSTANCE = new LinkMicFixLiveStudioEnableMediaState();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_livestudio_enable_media_state", DEFAULT);
    }
}
