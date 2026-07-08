package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EventTrackerSecondaryAnswer {

    @C09CT("mainOption")
    public final String mainOption;

    @C09CT("sub_event_tracker_answer")
    public final List<String> subTrackerAnswer;

    @C09CT("sub_event_tracker_question")
    public final String subTrackerQuestion;

    public EventTrackerSecondaryAnswer(String str, String str2, List<String> list) {
        this.mainOption = str;
        this.subTrackerQuestion = str2;
        this.subTrackerAnswer = list;
    }
}
