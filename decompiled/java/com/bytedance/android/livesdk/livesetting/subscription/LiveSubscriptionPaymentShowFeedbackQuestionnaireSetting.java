package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_faq_and_payment_feedback")
public final class LiveSubscriptionPaymentShowFeedbackQuestionnaireSetting {
    public static final int DEFAULT = 0;
    public static final LiveSubscriptionPaymentShowFeedbackQuestionnaireSetting INSTANCE = new LiveSubscriptionPaymentShowFeedbackQuestionnaireSetting();

    public static final boolean getEnablePaymentFeedBackQuestionnaire() {
        return INSTANCE.getValue() == 1;
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSubscriptionPaymentShowFeedbackQuestionnaireSetting.class);
    }
}
