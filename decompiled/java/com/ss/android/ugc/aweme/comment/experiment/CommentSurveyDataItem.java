package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public final class CommentSurveyDataItem {

    @C09CT("display_delay_time")
    public long delayTime;

    @C09CT("display_position_begin")
    public int displayPositionBegin;

    @C09CT("display_position_end")
    public int displayPositionEnd;

    @C09CT("display_position_visible_index")
    public int displayPositionVisibleIndex;

    @C09CT("display_ratio")
    public float displayRatio;

    @C09CT("fixed_survey")
    public FeedSurvey fixedSurvey;

    @C09CT("frequency_filter_day")
    public int frequencyDay;

    @C09CT("frequency_filter_times")
    public int frequencyTimes;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("survey_style")
    public int surveyStyle;

    public CommentSurveyDataItem() {
        this("", 0, -1, 3000L, 7, 2, 0, 0, 0.7f, null);
    }

    public CommentSurveyDataItem(String str, int i, int i2, long j, int i3, int i4, int i5, int i6, float f, FeedSurvey feedSurvey) {
        this.id = str;
        this.surveyStyle = i;
        this.displayPositionVisibleIndex = i2;
        this.delayTime = j;
        this.frequencyDay = i3;
        this.frequencyTimes = i4;
        this.displayPositionBegin = i5;
        this.displayPositionEnd = i6;
        this.displayRatio = f;
        this.fixedSurvey = feedSurvey;
    }
}
