package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class OpeningTime implements Serializable {

    @C09CT("day")
    public final int day;

    @C09CT("is_today")
    public final Boolean isTody;

    @C09CT("opening_end_time")
    public final String openingEndTime;

    @C09CT("opening_start_time")
    public final String openingStartTime;

    @C09CT("opening_status")
    public final boolean openingStatus;

    @C09CT("time_for_show")
    public final List<String> timeForShow;

    @C09CT("time_range")
    public final List<ListStruct> timeRange;

    @C09CT("week_days")
    public final String weekDays;

    public OpeningTime() {
        this(null, null, null, false, null, null, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpeningTime)) {
            return false;
        }
        OpeningTime openingTime = (OpeningTime) obj;
        return Intrinsics.LJFF(this.weekDays, openingTime.weekDays) && Intrinsics.LJFF(this.openingStartTime, openingTime.openingStartTime) && Intrinsics.LJFF(this.openingEndTime, openingTime.openingEndTime) && this.openingStatus == openingTime.openingStatus && Intrinsics.LJFF(this.timeForShow, openingTime.timeForShow) && Intrinsics.LJFF(this.timeRange, openingTime.timeRange) && this.day == openingTime.day && Intrinsics.LJFF(this.isTody, openingTime.isTody);
    }

    public int hashCode() {
        String str = this.weekDays;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.openingStartTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.openingEndTime;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.openingStatus)) * 31;
        List<String> list = this.timeForShow;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ListStruct> list2 = this.timeRange;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.day) * 31;
        Boolean bool = this.isTody;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpeningTime(weekDays=");
        sbLIZ.append(this.weekDays);
        sbLIZ.append(", openingStartTime=");
        sbLIZ.append(this.openingStartTime);
        sbLIZ.append(", openingEndTime=");
        sbLIZ.append(this.openingEndTime);
        sbLIZ.append(", openingStatus=");
        sbLIZ.append(this.openingStatus);
        sbLIZ.append(", timeForShow=");
        sbLIZ.append(this.timeForShow);
        sbLIZ.append(", timeRange=");
        sbLIZ.append(this.timeRange);
        sbLIZ.append(", day=");
        sbLIZ.append(this.day);
        sbLIZ.append(", isTody=");
        sbLIZ.append(this.isTody);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isTody() {
        return this.isTody;
    }

    public OpeningTime(String str, String str2, String str3, boolean z, List<String> list, List<ListStruct> list2, int i, Boolean bool) {
        this.weekDays = str;
        this.openingStartTime = str2;
        this.openingEndTime = str3;
        this.openingStatus = z;
        this.timeForShow = list;
        this.timeRange = list2;
        this.day = i;
        this.isTody = bool;
    }
}
