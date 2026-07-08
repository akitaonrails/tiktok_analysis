package com.ss.android.ugc.aweme.comment.survey;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.experiment.FeedSurvey;

/* JADX INFO: loaded from: classes36.dex */
public final class SurveyData {

    @C09CT("author_id")
    public String authorId;

    @C09CT("comment_author_uid")
    public String commentAuthorUid;

    @C09CT("comment_id")
    public String commentId;

    @C09CT("comment_position")
    public String commentPosition;

    @C09CT("content_scope")
    public String contentScope;

    @C09CT("data_source")
    public int dataSource;

    @C09CT("fixed_survey")
    public FeedSurvey fixedSurvey;

    @C09CT("group_id")
    public String groupId;

    @C09CT("isCreator")
    public String isCreator;

    @C09CT("request_id")
    public String requestId;

    @C09CT("survey_biz_type")
    public int surveyBizType;

    @C09CT("survey_style")
    public int surveyStyle;

    public SurveyData() {
        this(null, 0, 0, "", "", 0, "", "", "", "", "", "");
    }

    public SurveyData(FeedSurvey feedSurvey, int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.fixedSurvey = feedSurvey;
        this.dataSource = i;
        this.surveyStyle = i2;
        this.groupId = str;
        this.authorId = str2;
        this.surveyBizType = i3;
        this.requestId = str3;
        this.commentId = str4;
        this.commentAuthorUid = str5;
        this.commentPosition = str6;
        this.contentScope = str7;
        this.isCreator = str8;
    }
}
