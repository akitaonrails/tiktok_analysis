package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAILiveInboxFreqency {
    public static final AILiveInboxConfig LIZ = new AILiveInboxConfig(1, 3, 3, 3, 1.0f);

    public static final class AILiveInboxConfig {

        @C09CT("number_of_promotion_times")
        public final int limitConsecutiveTimes;

        @C09CT("consecutive_rejection_count_limitation")
        public final int limitNoOperationReject;

        @C09CT("display_count_promotion_day")
        public final int limitPerDay;

        @C09CT("display_interval_in_normal_day")
        public final int lowReqlimitDays;

        @C09CT("refresh_time_in_hour")
        public final float refreshInHour;

        public AILiveInboxConfig() {
            this(1, 3, 3, 3, 1.0f);
        }

        public AILiveInboxConfig(int i, int i2, int i3, int i4, float f) {
            this.limitPerDay = i;
            this.limitConsecutiveTimes = i2;
            this.lowReqlimitDays = i3;
            this.limitNoOperationReject = i4;
            this.refreshInHour = f;
        }
    }
}
