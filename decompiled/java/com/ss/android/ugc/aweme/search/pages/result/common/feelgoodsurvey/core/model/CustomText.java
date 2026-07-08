package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomText {

    @C09CT("event_tracker_answer")
    public final List<EventTrackerSecondaryAnswer> eventTrackerAnswer;

    @C09CT("event_tracker_question")
    public final String eventTrackerQuestion;

    public CustomText(String str, List<EventTrackerSecondaryAnswer> list) {
        this.eventTrackerQuestion = str;
        this.eventTrackerAnswer = list;
    }
}
