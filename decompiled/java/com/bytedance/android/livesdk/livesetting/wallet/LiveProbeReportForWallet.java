package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("probe_setup_enabled")
public final class LiveProbeReportForWallet {
    public static final boolean DEFAULT = false;
    public static final LiveProbeReportForWallet INSTANCE = new LiveProbeReportForWallet();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("probe_setup_enabled", DEFAULT);
    }
}
