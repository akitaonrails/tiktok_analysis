package com.ss.android.ugc.aweme.portrait.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class InboxActivityPreferenceExperiment {
    public static final Meta LIZ = new Meta(0, 0.0f, 0.0f, 0.0f, 0.0f);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(242));

    public static final class Meta {

        @C09CT("activity_page_preference")
        public final int activityPagePreference;

        @C09CT("notice_preference_notice_low_limit")
        public final float noticePreferNoticeLowLimit;

        @C09CT("notice_preference_recommend_high_limit")
        public final float noticePreferRecommendHighLimit;

        @C09CT("recommend_preference_notice_high_limit")
        public final float recommendPreferNoticeHighLimit;

        @C09CT("recommend_preference_recommend_low_limit")
        public final float recommendPreferRecommendLowLimit;

        public Meta() {
            this(0, 0.0f, 0.0f, 0.0f, 0.0f);
        }

        public Meta(int i, float f, float f2, float f3, float f4) {
            this.activityPagePreference = i;
            this.noticePreferNoticeLowLimit = f;
            this.noticePreferRecommendHighLimit = f2;
            this.recommendPreferRecommendLowLimit = f3;
            this.recommendPreferNoticeHighLimit = f4;
        }
    }
}
