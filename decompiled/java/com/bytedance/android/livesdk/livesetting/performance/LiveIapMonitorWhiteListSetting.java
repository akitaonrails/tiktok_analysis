package com.bytedance.android.livesdk.livesetting.performance;

import X.C13LP;
import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_iap_monitor_slardar_white_list")
public final class LiveIapMonitorWhiteListSetting {
    public static final LiveIapMonitorWhiteListSetting INSTANCE = new LiveIapMonitorWhiteListSetting();
    public static final String[] DEFAULT = {"ttlive_livesdk_subscription_create_iap_order_fail", "ttlive_livesdk_subscription_create_iap_order_start", "ttlive_livesdk_subscription_create_order_fail", "ttlive_livesdk_subscription_create_order_start", "ttlive_livesdk_subscription_create_order_success", "ttlive_livesdk_subscription_query_status_fail", "ttlive_livesdk_subscription_query_status_start", "ttlive_livesdk_subscription_query_status_success"};

    private final Set<String> getAllowListSet() {
        return C13LQ.LJLIIL(SettingsManager.INSTANCE.getStringArrayValue("live_iap_monitor_slardar_white_list", DEFAULT));
    }

    public final boolean isEnable(String str) {
        return C13LP.LJJJJ(str, getAllowListSet());
    }
}
