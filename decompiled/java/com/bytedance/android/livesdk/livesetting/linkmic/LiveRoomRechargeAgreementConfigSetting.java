package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_room_recharge_agreement_config")
public final class LiveRoomRechargeAgreementConfigSetting {
    public static final LiveRoomRechargeAgreementConfigSetting INSTANCE = new LiveRoomRechargeAgreementConfigSetting();
    public static final LiveRechargeAgreementConfig DEFAULT = new LiveRechargeAgreementConfig();

    public final LiveRechargeAgreementConfig getValue() {
        return (LiveRechargeAgreementConfig) SettingsManager.INSTANCE.getValueSafely("live_room_recharge_agreement_config", DEFAULT);
    }

    public final LiveRechargeAgreementConfig getDEFAULT() {
        return DEFAULT;
    }
}
