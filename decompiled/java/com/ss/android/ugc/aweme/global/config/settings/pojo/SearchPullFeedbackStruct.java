package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes5.dex */
public class SearchPullFeedbackStruct {

    @C09CT("feedback_options")
    public SearchPullFeedbackOptions feedbackOptions;

    @C09CT("is_open_feedback")
    public Boolean isOpenFeedback = Boolean.FALSE;

    @C09CT("freq_per_query")
    public Integer freqPerQuery = 2;

    @C09CT("freq_per_day")
    public Integer freqPerDay = Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT);

    public SearchPullFeedbackOptions getFeedbackOptions() throws C316660CbA {
        SearchPullFeedbackOptions searchPullFeedbackOptions = this.feedbackOptions;
        if (searchPullFeedbackOptions != null) {
            return searchPullFeedbackOptions;
        }
        throw new C316660CbA();
    }

    public Integer getFreqPerDay() throws C316660CbA {
        Integer num = this.freqPerDay;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getFreqPerQuery() throws C316660CbA {
        Integer num = this.freqPerQuery;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getIsOpenFeedback() throws C316660CbA {
        Boolean bool = this.isOpenFeedback;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }
}
