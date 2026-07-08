package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_cohost_sei_exit_mode_fix")
public final class LinkMicCoHostSeiExitModeFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicCoHostSeiExitModeFix INSTANCE = new LinkMicCoHostSeiExitModeFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_cohost_sei_exit_mode_fix", DEFAULT);
    }
}
