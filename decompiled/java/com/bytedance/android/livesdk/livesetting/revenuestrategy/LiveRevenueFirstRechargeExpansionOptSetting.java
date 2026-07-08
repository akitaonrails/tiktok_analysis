package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_first_recharge_gift_pack_expansion_opt")
public final class LiveRevenueFirstRechargeExpansionOptSetting {
    public static final LiveRevenueFirstRechargeExpansionOptSetting INSTANCE = new LiveRevenueFirstRechargeExpansionOptSetting();
    public static final FirstRechargeExpansionOptParams DEFAULT = new FirstRechargeExpansionOptParams(false, false, false, null);

    public final int getRecordCount() {
        RecordEntryPanelParams recordEntryPanelParams;
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams = (FirstRechargeExpansionOptParams) SettingsManager.INSTANCE.getValueSafely("live_first_recharge_gift_pack_expansion_opt", DEFAULT);
        if (firstRechargeExpansionOptParams == null || (recordEntryPanelParams = firstRechargeExpansionOptParams.recordEntryPanel) == null) {
            return 0;
        }
        return recordEntryPanelParams.count;
    }

    public final boolean isGroupV1() {
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams = (FirstRechargeExpansionOptParams) SettingsManager.INSTANCE.getValueSafely("live_first_recharge_gift_pack_expansion_opt", DEFAULT);
        return firstRechargeExpansionOptParams != null && firstRechargeExpansionOptParams.moveFirstRechargeGift;
    }

    public final boolean isGroupV2() {
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams;
        RecordEntryPanelParams recordEntryPanelParams;
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams2 = DEFAULT;
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams3 = (FirstRechargeExpansionOptParams) settingsManager.getValueSafely("live_first_recharge_gift_pack_expansion_opt", firstRechargeExpansionOptParams2);
        return ((firstRechargeExpansionOptParams3 != null ? firstRechargeExpansionOptParams3.recordEntryPanel : null) == null || (firstRechargeExpansionOptParams = (FirstRechargeExpansionOptParams) settingsManager.getValueSafely("live_first_recharge_gift_pack_expansion_opt", firstRechargeExpansionOptParams2)) == null || (recordEntryPanelParams = firstRechargeExpansionOptParams.recordEntryPanel) == null || !recordEntryPanelParams.shouldRecord) ? false : true;
    }

    public final boolean isGroupV3() {
        FirstRechargeExpansionOptParams firstRechargeExpansionOptParams = (FirstRechargeExpansionOptParams) SettingsManager.INSTANCE.getValueSafely("live_first_recharge_gift_pack_expansion_opt", DEFAULT);
        return firstRechargeExpansionOptParams != null && firstRechargeExpansionOptParams.isFirstRecharge;
    }
}
