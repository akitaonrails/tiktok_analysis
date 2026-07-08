package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("sub_purchase_feedback_questionaire")
public final class LiveSubscribeQuestionnairePageSchemaSetting {
    public static LiveSubscribeQuestionnaireLynxMap lynxMap;
    public static final LiveSubscribeQuestionnairePageSchemaSetting INSTANCE = new LiveSubscribeQuestionnairePageSchemaSetting();
    public static final String DEFAULT = "";

    public final LiveSubscribeQuestionnaireLynxMap getValue() {
        if (lynxMap == null) {
            lynxMap = new LiveSubscribeQuestionnaireLynxMap(SettingsManager.INSTANCE.getStringValue("sub_purchase_feedback_questionaire", DEFAULT));
        }
        LiveSubscribeQuestionnaireLynxMap liveSubscribeQuestionnaireLynxMap = lynxMap;
        return liveSubscribeQuestionnaireLynxMap == null ? new LiveSubscribeQuestionnaireLynxMap("") : liveSubscribeQuestionnaireLynxMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
