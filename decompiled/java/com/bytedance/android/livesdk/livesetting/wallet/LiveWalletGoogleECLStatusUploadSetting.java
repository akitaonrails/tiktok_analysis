package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_gp_ecl_status_upload")
public final class LiveWalletGoogleECLStatusUploadSetting {
    public static final boolean DEFAULT = true;
    public static final LiveWalletGoogleECLStatusUploadSetting INSTANCE = new LiveWalletGoogleECLStatusUploadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_gp_ecl_status_upload", DEFAULT);
    }
}
