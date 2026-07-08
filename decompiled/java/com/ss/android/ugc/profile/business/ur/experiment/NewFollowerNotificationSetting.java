package com.ss.android.ugc.profile.business.ur.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class NewFollowerNotificationSetting {
    public static final NewFollowerNotificationSettingOnProfileModel LIZ = new NewFollowerNotificationSettingOnProfileModel(90, 1);

    public static final class NewFollowerNotificationSettingOnProfileModel {

        @C09CT("unclick_times_threshold")
        public final int unclickTimesThreshold;

        @C09CT("without_notice_days_threshold")
        public final int withoutNoticeDaysThreshold;

        public NewFollowerNotificationSettingOnProfileModel(int i, int i2) {
            this.withoutNoticeDaysThreshold = i;
            this.unclickTimesThreshold = i2;
        }
    }
}
