package com.ss.android.ugc.aweme.pns.businessmodel;

import X.C2188811AlT;
import X.EnumC1780770wRP;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PnSScreenTimeManagementDaySetting {
    public final Integer dayOfWeek;
    public final Integer screenTimeLimitForWeek;
    public final Integer screenTimeSettingTypeForWeek;
    public final Integer screenTimeStatusForWeek;

    public PnSScreenTimeManagementDaySetting() {
        this(0, 0, 0, Integer.valueOf(EnumC1780770wRP.NON.getValue()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnSScreenTimeManagementDaySetting)) {
            return false;
        }
        PnSScreenTimeManagementDaySetting pnSScreenTimeManagementDaySetting = (PnSScreenTimeManagementDaySetting) obj;
        return Intrinsics.LJFF(this.screenTimeLimitForWeek, pnSScreenTimeManagementDaySetting.screenTimeLimitForWeek) && Intrinsics.LJFF(this.screenTimeSettingTypeForWeek, pnSScreenTimeManagementDaySetting.screenTimeSettingTypeForWeek) && Intrinsics.LJFF(this.screenTimeStatusForWeek, pnSScreenTimeManagementDaySetting.screenTimeStatusForWeek) && Intrinsics.LJFF(this.dayOfWeek, pnSScreenTimeManagementDaySetting.dayOfWeek);
    }

    public int hashCode() {
        Integer num = this.screenTimeLimitForWeek;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.screenTimeSettingTypeForWeek;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.screenTimeStatusForWeek;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.dayOfWeek;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnSScreenTimeManagementDaySetting(screenTimeLimitForWeek=");
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

    public PnSScreenTimeManagementDaySetting(Integer num, Integer num2, Integer num3, Integer num4) {
        this.screenTimeLimitForWeek = num;
        this.screenTimeSettingTypeForWeek = num2;
        this.screenTimeStatusForWeek = num3;
        this.dayOfWeek = num4;
    }
}
