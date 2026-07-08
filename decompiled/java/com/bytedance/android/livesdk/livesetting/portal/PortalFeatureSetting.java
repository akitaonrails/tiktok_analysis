package com.bytedance.android.livesdk.livesetting.portal;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_envelope_portal")
public final class PortalFeatureSetting {
    public static final boolean DEFAULT = false;
    public static final PortalFeatureSetting INSTANCE = new PortalFeatureSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_envelope_portal", DEFAULT);
    }
}
