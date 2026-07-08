package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_show_payment_feedback_dialog_maximal_show_times")
public final class LiveSubscriptionQuestionnaireMaxShowTimesSetting {
    public static final int DEFAULT = 3;
    public static final LiveSubscriptionQuestionnaireMaxShowTimesSetting INSTANCE = new LiveSubscriptionQuestionnaireMaxShowTimesSetting();

    public static final int getSubPaymentDialogMaximalShowTimes() {
        return INSTANCE.getValue();
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSubscriptionQuestionnaireMaxShowTimesSetting.class);
    }
}
