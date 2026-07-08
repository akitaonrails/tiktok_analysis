package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_webapp_recharge_user_prompt_pip")
public final class LiveShowWebChargePipGuideDialogSetting {
    public static final LiveShowWebChargePipGuideDialogSetting INSTANCE = new LiveShowWebChargePipGuideDialogSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_webapp_recharge_user_prompt_pip", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return value;
    }
}
