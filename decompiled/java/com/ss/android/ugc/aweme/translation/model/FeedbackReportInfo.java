package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedbackReportInfo implements Serializable {

    @C09CT("extra")
    public TranslationFeedbackExtraInfo extraInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String itemId;

    @C09CT("positive_feedback")
    public boolean positiveFeedback;

    @C09CT("target_language")
    public String targetLanguage;

    @C09CT("translated_element")
    public final List<Integer> translatedElement = new ArrayList();

    public FeedbackReportInfo(String str) {
        this.itemId = str;
    }

    public final void setExtraInfo(TranslationFeedbackExtraInfo translationFeedbackExtraInfo) {
        this.extraInfo = translationFeedbackExtraInfo;
    }

    public final void setPositiveFeedback(boolean z) {
        this.positiveFeedback = z;
    }

    public final void setTargetLanguage(String str) {
        this.targetLanguage = str;
    }
}
