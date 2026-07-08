package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_fix_capsule_expose")
public final class LinkMicFixCapsuleExposeSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixCapsuleExposeSetting INSTANCE = new LinkMicFixCapsuleExposeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_fix_capsule_expose", DEFAULT);
    }
}
