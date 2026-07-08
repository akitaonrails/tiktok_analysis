package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("dns_opt_method")
public final class DnsOptMethodSetting {
    public static final int DEFAULT = 0;
    public static final DnsOptMethodSetting INSTANCE = new DnsOptMethodSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("dns_opt_method", DEFAULT);
    }
}
