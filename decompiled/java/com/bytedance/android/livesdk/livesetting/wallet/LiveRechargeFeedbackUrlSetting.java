package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_recharge_feedback_url")
public final class LiveRechargeFeedbackUrlSetting {
    public static final String DEFAULT = "aweme://webview/?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffalcon%2Ftiktok%2Ffeedback%2Fmain%2Findex.html%3Fhide_nav_bar%3D1%26entrance%3Dabnor_live_purch%26is_from_home%3D1%26enter_from%3Dabnor_live_purch%23%2F";
    public static final LiveRechargeFeedbackUrlSetting INSTANCE = new LiveRechargeFeedbackUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_recharge_feedback_url", DEFAULT);
    }
}
