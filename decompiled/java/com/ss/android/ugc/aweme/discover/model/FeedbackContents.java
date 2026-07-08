package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedbackContents implements Serializable {

    @C09CT("feedback_type")
    public String feedbackType;

    @C09CT("multiple_choices")
    public List<FeedbackMultipleChoice> multipleChoices;

    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final List<FeedbackMultipleChoice> getMultipleChoices() {
        return this.multipleChoices;
    }

    public final void setFeedbackType(String str) {
        this.feedbackType = str;
    }

    public final void setMultipleChoices(List<FeedbackMultipleChoice> list) {
        this.multipleChoices = list;
    }
}
