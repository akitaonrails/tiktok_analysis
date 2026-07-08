package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("first_recharge_param_api_delay_android")
public final class LiveWalletFirstRechargeEventTrackingDelay {
    public static final LiveWalletFirstRechargeEventTrackingDelay INSTANCE = new LiveWalletFirstRechargeEventTrackingDelay();
    public static final int DEFAULT = LSPassThroughRecordSizeConfig.DEFAULT;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("first_recharge_param_api_delay_android", DEFAULT);
    }
}
