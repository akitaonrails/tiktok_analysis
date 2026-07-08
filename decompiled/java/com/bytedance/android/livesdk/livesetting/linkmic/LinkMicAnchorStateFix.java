package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_anchor_state_fix")
public final class LinkMicAnchorStateFix {
    public static final boolean DEFAULT = false;
    public static final LinkMicAnchorStateFix INSTANCE = new LinkMicAnchorStateFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_anchor_state_fix", DEFAULT);
    }
}
