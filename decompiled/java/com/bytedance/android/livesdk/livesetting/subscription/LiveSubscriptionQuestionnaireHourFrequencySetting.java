package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_show_payment_feedback_dialog_hours_frequency")
public final class LiveSubscriptionQuestionnaireHourFrequencySetting {
    public static final int DEFAULT = 24;
    public static final LiveSubscriptionQuestionnaireHourFrequencySetting INSTANCE = new LiveSubscriptionQuestionnaireHourFrequencySetting();

    public static final int getSubPaymentDialogHourFrequency() {
        return INSTANCE.getValue();
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSubscriptionQuestionnaireHourFrequencySetting.class);
    }
}
