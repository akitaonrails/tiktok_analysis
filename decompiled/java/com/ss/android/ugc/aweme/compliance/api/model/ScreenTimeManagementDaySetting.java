package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.EnumC1780780wRQ;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class ScreenTimeManagementDaySetting {

    @C09CT("day")
    public final Integer dayOfWeek;

    @C09CT("screen_time_limit")
    public final Integer screenTimeLimitForWeek;

    @C09CT("screen_time_setting_type")
    public final Integer screenTimeSettingTypeForWeek;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer screenTimeStatusForWeek;

    public ScreenTimeManagementDaySetting() {
        this(0, 0, 0, Integer.valueOf(EnumC1780780wRQ.NON.getValue()));
    }

    public ScreenTimeManagementDaySetting(Integer num, Integer num2, Integer num3, Integer num4) {
        this.screenTimeLimitForWeek = num;
        this.screenTimeSettingTypeForWeek = num2;
        this.screenTimeStatusForWeek = num3;
        this.dayOfWeek = num4;
    }
}
