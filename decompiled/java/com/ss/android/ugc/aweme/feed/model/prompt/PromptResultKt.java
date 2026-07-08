package com.ss.android.ugc.aweme.feed.model.prompt;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes2.dex */
public final class PromptResultKt {
    public static final PromptRecTagType toRecTagType(long j) {
        PromptRecTagType promptRecTagType = PromptRecTagType.INTERACTIVE_REC_TAG_TYPE_TRIGGER;
        if (j != promptRecTagType.getValue()) {
            PromptRecTagType promptRecTagType2 = PromptRecTagType.INTERACTIVE_REC_TAG_TYPE_RANDOM;
            if (j != promptRecTagType2.getValue()) {
                return null;
            }
            return promptRecTagType2;
        }
        return promptRecTagType;
    }

    public static final PromptDetail getCurAwemePromptDetails(Aweme aweme, boolean z) {
        PromptDetail promptDetail;
        PromptResult promptResult = aweme.getPromptResult();
        if (promptResult == null || (promptDetail = promptResult.positivePromptDetails) == null) {
            PromptResult promptResult2 = aweme.getPromptResult();
            if (promptResult2 != null) {
                return promptResult2.negativePromptDetails;
            }
            return null;
        }
        return promptDetail;
    }
}
