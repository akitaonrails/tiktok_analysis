package com.ss.android.ugc.aweme.minidrama.common.component.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedbackIntegrationURLSetting {
    public static final FeedbackIntegrationInfoStructJsonModel LIZ() {
        return (FeedbackIntegrationInfoStructJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("feedback_integration_info_struct_json", FeedbackIntegrationInfoStructJsonModel.class, null);
    }

    public static final class FeedbackIntegrationInfoStructJsonModel {

        @C09CT("feedback_icon_entrance_url")
        public final String feedbackUrl;

        public FeedbackIntegrationInfoStructJsonModel(String str) {
            this.feedbackUrl = str;
        }
    }
}
