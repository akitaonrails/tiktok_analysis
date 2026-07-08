package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_rust_cohost_prepare_state_fix")
public final class LinkMicRustCohostPrepareStateFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustCohostPrepareStateFix INSTANCE = new LinkMicRustCohostPrepareStateFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_cohost_prepare_state_fix", DEFAULT);
    }
}
