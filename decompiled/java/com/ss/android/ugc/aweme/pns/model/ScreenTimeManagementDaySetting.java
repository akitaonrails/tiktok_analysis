package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1780790wRR;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

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
        this(0, 0, 0, Integer.valueOf(EnumC1780790wRR.NON.getValue()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenTimeManagementDaySetting)) {
            return false;
        }
        ScreenTimeManagementDaySetting screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) obj;
        return Intrinsics.LJFF(this.screenTimeLimitForWeek, screenTimeManagementDaySetting.screenTimeLimitForWeek) && Intrinsics.LJFF(this.screenTimeSettingTypeForWeek, screenTimeManagementDaySetting.screenTimeSettingTypeForWeek) && Intrinsics.LJFF(this.screenTimeStatusForWeek, screenTimeManagementDaySetting.screenTimeStatusForWeek) && Intrinsics.LJFF(this.dayOfWeek, screenTimeManagementDaySetting.dayOfWeek);
    }

    public final int hashCode() {
        Integer num = this.screenTimeLimitForWeek;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.screenTimeSettingTypeForWeek;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.screenTimeStatusForWeek;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.dayOfWeek;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenTimeManagementDaySetting(screenTimeLimitForWeek=");
        sbLIZ.append(this.screenTimeLimitForWeek);
        sbLIZ.append(", screenTimeSettingTypeForWeek=");
        sbLIZ.append(this.screenTimeSettingTypeForWeek);
        sbLIZ.append(", screenTimeStatusForWeek=");
        sbLIZ.append(this.screenTimeStatusForWeek);
        sbLIZ.append(", dayOfWeek=");
        sbLIZ.append(this.dayOfWeek);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ScreenTimeManagementDaySetting(Integer num, Integer num2, Integer num3, Integer num4) {
        this.screenTimeLimitForWeek = num;
        this.screenTimeSettingTypeForWeek = num2;
        this.screenTimeStatusForWeek = num3;
        this.dayOfWeek = num4;
    }
}
