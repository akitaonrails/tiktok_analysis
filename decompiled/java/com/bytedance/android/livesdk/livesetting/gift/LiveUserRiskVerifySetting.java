package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_risk_verify_setting")
public final class LiveUserRiskVerifySetting {
    public static final LiveUserRiskVerifySetting INSTANCE = new LiveUserRiskVerifySetting();
    public static final LiveUserRiskVerify DEFAULT = new LiveUserRiskVerify("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fcode_verification.js&loading_bg_color=ffffff&gravity=bottom&height=40%25&radius=4&show_mask=1&mask_bg_color=00000055&disable_mask_click_close=1&transition_animation=bottom&source=0&verification_type=0", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fcode_verification.js&loading_bg_color=ffffff&gravity=bottom&height=40%25&radius=4&show_mask=1&mask_bg_color=00000055&disable_mask_click_close=1&transition_animation=bottom&source=0&verification_type=1");

    public final LiveUserRiskVerify getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveUserRiskVerify liveUserRiskVerify = DEFAULT;
        LiveUserRiskVerify liveUserRiskVerify2 = (LiveUserRiskVerify) settingsManager.getValueSafely("live_user_risk_verify_setting", liveUserRiskVerify);
        return liveUserRiskVerify2 != null ? liveUserRiskVerify2 : liveUserRiskVerify;
    }
}
