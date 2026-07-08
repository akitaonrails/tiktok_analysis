package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_chargeback_penalty_education_popup_url")
public final class WalletChargebackPenaltyEducationPopupUrlSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?show_mask=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wallet%2Fwallet%2Fpages%2Fcommon%2Fwallet_education_popup.js&gravity=center&width=620rpx&height=574rpx&mask_bg_color=00000080&reason_type=coinDeducted&use_present=1";
    public static final WalletChargebackPenaltyEducationPopupUrlSetting INSTANCE = new WalletChargebackPenaltyEducationPopupUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("wallet_chargeback_penalty_education_popup_url", DEFAULT);
    }
}
