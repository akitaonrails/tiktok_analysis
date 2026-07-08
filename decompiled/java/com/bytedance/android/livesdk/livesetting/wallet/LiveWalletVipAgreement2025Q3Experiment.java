package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_vip_agreement_update_2025q3")
public final class LiveWalletVipAgreement2025Q3Experiment {
    public static final LiveWalletVipAgreement2025Q3Experiment INSTANCE = new LiveWalletVipAgreement2025Q3Experiment();
    public static final VipAgreementUpdateConfig DEFAULT = new VipAgreementUpdateConfig();

    public final VipAgreementUpdateConfig getValue() {
        VipAgreementUpdateConfig vipAgreementUpdateConfig = (VipAgreementUpdateConfig) SettingsManager.INSTANCE.getValueSafely(LiveWalletVipAgreement2025Q3Experiment.class);
        return vipAgreementUpdateConfig == null ? DEFAULT : vipAgreementUpdateConfig;
    }

    public final VipAgreementUpdateConfig getDEFAULT() {
        return DEFAULT;
    }
}
