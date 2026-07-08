package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class PushSurveyExperiment {
    public static final UgSurveyConfig LIZ = new UgSurveyConfig(0, "click_push_recommend,click_push_newvideo,click_push_acq_video,click_push_frequently_watched,click_push_top_affinity_post,click_push_high_value_counter_post,click_push_freq_interact_video");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(396));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(398));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(397));

    public static int LIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static final class UgSurveyConfig {

        @C09CT("enable_labels_str")
        public final String gdLabels;

        @C09CT("survey_style")
        public final int surveyStyle;

        public UgSurveyConfig() {
            this(0, "click_push_recommend,click_push_newvideo,click_push_acq_video,click_push_frequently_watched,click_push_top_affinity_post,click_push_high_value_counter_post,click_push_freq_interact_video");
        }

        public UgSurveyConfig(int i, String str) {
            this.surveyStyle = i;
            this.gdLabels = str;
        }
    }
}
