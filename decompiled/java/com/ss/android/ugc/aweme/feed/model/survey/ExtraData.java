package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ExtraData {

    @C09CT("data")
    public Map<String, ? extends Object> data;

    @C09CT("survey_type")
    public Integer surveyBizType;

    public ExtraData() {
        this(0, null);
    }

    public final void setData(Map<String, ? extends Object> map) {
        this.data = map;
    }

    public final void setSurveyBizType(Integer num) {
        this.surveyBizType = num;
    }

    public ExtraData(Integer num, Map<String, ? extends Object> map) {
        this.surveyBizType = num;
        this.data = map;
    }
}
