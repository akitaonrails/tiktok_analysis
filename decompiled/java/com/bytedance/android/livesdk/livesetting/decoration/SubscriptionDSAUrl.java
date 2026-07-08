package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_safety_dsa_urls")
public final class SubscriptionDSAUrl {
    public static SubscribeDSAMap dsaMap;
    public static final SubscriptionDSAUrl INSTANCE = new SubscriptionDSAUrl();
    public static final String DEFAULT = "";

    public final SubscribeDSAMap getValue() {
        if (dsaMap == null) {
            dsaMap = new SubscribeDSAMap(SettingsManager.INSTANCE.getStringValue("live_safety_dsa_urls", DEFAULT));
        }
        SubscribeDSAMap subscribeDSAMap = dsaMap;
        return subscribeDSAMap == null ? new SubscribeDSAMap("") : subscribeDSAMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
