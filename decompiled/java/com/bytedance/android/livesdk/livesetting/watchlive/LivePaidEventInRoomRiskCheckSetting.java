package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_paid_event_inroom_risk_check_enable")
public final class LivePaidEventInRoomRiskCheckSetting {
    public static final LivePaidEventInRoomRiskCheckSetting INSTANCE = new LivePaidEventInRoomRiskCheckSetting();
    public static final RiskCheckConfig DEFAULT = new RiskCheckConfig();

    public static final class RiskCheckConfig {
        public static final TypeAdapter ADAPTER = new LivePaidEventInRoomRiskCheckSetting_RiskCheckConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable = true;

        @C09CT("check_count")
        public int checkCount = 2;
    }

    public final RiskCheckConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RiskCheckConfig riskCheckConfig = DEFAULT;
        RiskCheckConfig riskCheckConfig2 = (RiskCheckConfig) settingsManager.getValueSafely("live_paid_event_inroom_risk_check_enable", riskCheckConfig);
        return riskCheckConfig2 != null ? riskCheckConfig2 : riskCheckConfig;
    }

    public final int checkCount() {
        return getValue().checkCount;
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public final RiskCheckConfig getDEFAULT() {
        return DEFAULT;
    }
}
