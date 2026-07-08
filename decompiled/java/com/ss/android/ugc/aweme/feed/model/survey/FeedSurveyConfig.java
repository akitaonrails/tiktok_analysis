package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class FeedSurveyConfig implements Serializable {

    @C09CT("survey_style")
    public int bgdVideo;

    @C09CT("content_scope")
    public String contentScope;

    @C09CT("content_scopes")
    public List<String> contentScopes;

    @C09CT("feed_survey_new_style_group")
    public int feedSurveyStyle;

    @C09CT("fixed_survey")
    public FeedSurvey fixedSurvey;

    @C09CT("survey_group_frequency")
    public List<FrequencyGroup> frequencyGroup;

    @C09CT("max_submit_times")
    public Integer maxSubmitTime;

    @C09CT("max_unsubmitted_display_times")
    public Integer maxUnsubmittedDisplayTimes;

    @C09CT("multi_survey_types")
    public List<Integer> multiSurveyTypes;

    @C09CT("show_interval_time")
    public long showIntervalTime;

    @C09CT("survey_appear_end")
    public int surveyAppearEnd;

    @C09CT("survey_appear_start")
    public int surveyAppearStart;

    @C09CT("survey_signal_rule")
    public List<SignalRule> surveySignalRule;

    @C09CT("turns_group_count")
    public int turnsGroupCount;

    @C09CT("turns_group_id")
    public int turnsGroupId;

    public FeedSurveyConfig() {
        this(604800L, null, 0, 0, 0, 0, null, 0, 0, "", null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSurveyConfig)) {
            return false;
        }
        FeedSurveyConfig feedSurveyConfig = (FeedSurveyConfig) obj;
        return this.showIntervalTime == feedSurveyConfig.showIntervalTime && Intrinsics.LJFF(this.fixedSurvey, feedSurveyConfig.fixedSurvey) && this.turnsGroupId == feedSurveyConfig.turnsGroupId && this.turnsGroupCount == feedSurveyConfig.turnsGroupCount && this.surveyAppearStart == feedSurveyConfig.surveyAppearStart && this.surveyAppearEnd == feedSurveyConfig.surveyAppearEnd && Intrinsics.LJFF(this.multiSurveyTypes, feedSurveyConfig.multiSurveyTypes) && this.feedSurveyStyle == feedSurveyConfig.feedSurveyStyle && this.bgdVideo == feedSurveyConfig.bgdVideo && Intrinsics.LJFF(this.contentScope, feedSurveyConfig.contentScope) && Intrinsics.LJFF(this.contentScopes, feedSurveyConfig.contentScopes) && Intrinsics.LJFF(this.frequencyGroup, feedSurveyConfig.frequencyGroup) && Intrinsics.LJFF(this.maxUnsubmittedDisplayTimes, feedSurveyConfig.maxUnsubmittedDisplayTimes) && Intrinsics.LJFF(this.maxSubmitTime, feedSurveyConfig.maxSubmitTime) && Intrinsics.LJFF(this.surveySignalRule, feedSurveyConfig.surveySignalRule);
    }

    public final void setBgdVideo(int i) {
        this.bgdVideo = i;
    }

    public final void setContentScope(String str) {
        this.contentScope = str;
    }

    public final void setContentScopes(List<String> list) {
        this.contentScopes = list;
    }

    public final void setFeedSurveyStyle(int i) {
        this.feedSurveyStyle = i;
    }

    public final void setFixedSurvey(FeedSurvey feedSurvey) {
        this.fixedSurvey = feedSurvey;
    }

    public final void setFrequencyGroup(List<FrequencyGroup> list) {
        this.frequencyGroup = list;
    }

    public final void setMaxSubmitTime(Integer num) {
        this.maxSubmitTime = num;
    }

    public final void setMaxUnsubmittedDisplayTimes(Integer num) {
        this.maxUnsubmittedDisplayTimes = num;
    }

    public final void setMultiSurveyTypes(List<Integer> list) {
        this.multiSurveyTypes = list;
    }

    public final void setShowIntervalTime(long j) {
        this.showIntervalTime = j;
    }

    public final void setSurveyAppearEnd(int i) {
        this.surveyAppearEnd = i;
    }

    public final void setSurveyAppearStart(int i) {
        this.surveyAppearStart = i;
    }

    public final void setSurveySignalRule(List<SignalRule> list) {
        this.surveySignalRule = list;
    }

    public final void setTurnsGroupCount(int i) {
        this.turnsGroupCount = i;
    }

    public final void setTurnsGroupId(int i) {
        this.turnsGroupId = i;
    }

    public FeedSurveyConfig(long j, FeedSurvey feedSurvey, int i, int i2, int i3, int i4, List<Integer> list, int i5, int i6, String str, List<String> list2, List<FrequencyGroup> list3, Integer num, Integer num2, List<SignalRule> list4) {
        this.showIntervalTime = j;
        this.fixedSurvey = feedSurvey;
        this.turnsGroupId = i;
        this.turnsGroupCount = i2;
        this.surveyAppearStart = i3;
        this.surveyAppearEnd = i4;
        this.multiSurveyTypes = list;
        this.feedSurveyStyle = i5;
        this.bgdVideo = i6;
        this.contentScope = str;
        this.contentScopes = list2;
        this.frequencyGroup = list3;
        this.maxUnsubmittedDisplayTimes = num;
        this.maxSubmitTime = num2;
        this.surveySignalRule = list4;
    }
}
