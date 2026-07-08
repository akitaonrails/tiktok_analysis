package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_sub_space_secure")
public final class TTLiveSubSpaceSecureSetting {
    public static final TTLiveSubSpaceSecureSetting INSTANCE = new TTLiveSubSpaceSecureSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_sub_space_secure", DEFAULT);
    }
}
