package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "support_billboard_overlay")
public final class SupportBillboardOverlaySetting {
    public static final boolean DEFAULT = false;
    public static final SupportBillboardOverlaySetting INSTANCE = new SupportBillboardOverlaySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("support_billboard_overlay", DEFAULT);
    }
}
