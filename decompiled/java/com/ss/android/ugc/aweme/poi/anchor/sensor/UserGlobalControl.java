package com.ss.android.ugc.aweme.poi.anchor.sensor;

import X.C09CT;
import X.C1227904rF;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: loaded from: classes35.dex */
public final class UserGlobalControl {

    @C09CT("cache_last_no_click_time")
    public final Long cacheLastNoClickTime;

    @C09CT("consecutive_no_click_count")
    public final Integer consecutiveNoClickCount;

    @C09CT("exposure_times_in_24_hour")
    public final Integer exposureTimesIn24Hour;

    @C09CT("first_exposure_time_in_24_hour")
    public final Long firstExposureTimeIn24Hour;

    @C09CT("last_no_click_time")
    public final Long lastNoClickTime;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserGlobalControl(consecutiveNoClickCount=");
        sbLIZ.append(this.consecutiveNoClickCount);
        sbLIZ.append(", cacheLastNoClickTime=");
        sbLIZ.append(this.cacheLastNoClickTime);
        sbLIZ.append(", lastNoClickTime=");
        sbLIZ.append(this.lastNoClickTime);
        sbLIZ.append(", exposureTimesIn24Hour=");
        sbLIZ.append(this.exposureTimesIn24Hour);
        sbLIZ.append(", firstExposureTimeIn24Hour=");
        sbLIZ.append(this.firstExposureTimeIn24Hour);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        C1227904rF.LIZ.getClass();
        return GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), this);
    }

    public UserGlobalControl(Integer num, Long l, Long l2, Integer num2, Long l3) {
        this.consecutiveNoClickCount = num;
        this.cacheLastNoClickTime = l;
        this.lastNoClickTime = l2;
        this.exposureTimesIn24Hour = num2;
        this.firstExposureTimeIn24Hour = l3;
    }

    public static UserGlobalControl LIZ(UserGlobalControl userGlobalControl, Integer num, Long l, Long l2, Integer num2, Long l3, int i) {
        Long l4 = l3;
        Integer num3 = num2;
        Long l5 = l2;
        Long l6 = l;
        Integer num4 = num;
        if ((i & 1) != 0) {
            num4 = userGlobalControl.consecutiveNoClickCount;
        }
        if ((i & 2) != 0) {
            l6 = userGlobalControl.cacheLastNoClickTime;
        }
        if ((i & 4) != 0) {
            l5 = userGlobalControl.lastNoClickTime;
        }
        if ((i & 8) != 0) {
            num3 = userGlobalControl.exposureTimesIn24Hour;
        }
        if ((i & 16) != 0) {
            l4 = userGlobalControl.firstExposureTimeIn24Hour;
        }
        return new UserGlobalControl(num4, l6, l5, num3, l4);
    }
}
