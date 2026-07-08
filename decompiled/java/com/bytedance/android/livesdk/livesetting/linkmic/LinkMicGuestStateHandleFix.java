package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_guest_state_handle_fix")
public final class LinkMicGuestStateHandleFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicGuestStateHandleFix INSTANCE = new LinkMicGuestStateHandleFix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_guest_state_handle_fix", DEFAULT);
    }
}
