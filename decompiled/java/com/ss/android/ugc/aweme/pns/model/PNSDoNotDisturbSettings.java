package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSDoNotDisturbSettings {

    @C09CT("pause_notification_enabled")
    public final Boolean pauseNotificationEnabled;

    @C09CT("pause_end_hour")
    public final Integer pauseNotificationEndHour;

    @C09CT("pause_end_minute")
    public final Integer pauseNotificationEndMinute;

    @C09CT("pause_start_hour")
    public final Integer pauseNotificationStartHour;

    @C09CT("pause_start_minute")
    public final Integer pauseNotificationStartMinute;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSDoNotDisturbSettings)) {
            return false;
        }
        PNSDoNotDisturbSettings pNSDoNotDisturbSettings = (PNSDoNotDisturbSettings) obj;
        return Intrinsics.LJFF(this.pauseNotificationEnabled, pNSDoNotDisturbSettings.pauseNotificationEnabled) && Intrinsics.LJFF(this.pauseNotificationStartHour, pNSDoNotDisturbSettings.pauseNotificationStartHour) && Intrinsics.LJFF(this.pauseNotificationStartMinute, pNSDoNotDisturbSettings.pauseNotificationStartMinute) && Intrinsics.LJFF(this.pauseNotificationEndHour, pNSDoNotDisturbSettings.pauseNotificationEndHour) && Intrinsics.LJFF(this.pauseNotificationEndMinute, pNSDoNotDisturbSettings.pauseNotificationEndMinute);
    }

    public final int hashCode() {
        Boolean bool = this.pauseNotificationEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.pauseNotificationStartHour;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pauseNotificationStartMinute;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pauseNotificationEndHour;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.pauseNotificationEndMinute;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSDoNotDisturbSettings(pauseNotificationEnabled=");
        sbLIZ.append(this.pauseNotificationEnabled);
        sbLIZ.append(", pauseNotificationStartHour=");
        sbLIZ.append(this.pauseNotificationStartHour);
        sbLIZ.append(", pauseNotificationStartMinute=");
        sbLIZ.append(this.pauseNotificationStartMinute);
        sbLIZ.append(", pauseNotificationEndHour=");
        sbLIZ.append(this.pauseNotificationEndHour);
        sbLIZ.append(", pauseNotificationEndMinute=");
        sbLIZ.append(this.pauseNotificationEndMinute);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSDoNotDisturbSettings() {
        this(Boolean.FALSE, 0, 0, 0, 0);
    }

    public PNSDoNotDisturbSettings(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.pauseNotificationEnabled = bool;
        this.pauseNotificationStartHour = num;
        this.pauseNotificationStartMinute = num2;
        this.pauseNotificationEndHour = num3;
        this.pauseNotificationEndMinute = num4;
    }
}
