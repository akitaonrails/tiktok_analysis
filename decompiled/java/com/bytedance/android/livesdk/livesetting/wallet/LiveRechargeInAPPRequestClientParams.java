package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_recharge_iap_request_client_params")
public final class LiveRechargeInAPPRequestClientParams {
    public static final LiveRechargeInAPPRequestClientParams INSTANCE = new LiveRechargeInAPPRequestClientParams();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_recharge_iap_request_client_params", DEFAULT);
    }
}
