package com.ss.android.ugc.tiktok.pns;

import X.EnumC1780800wRS;

/* JADX INFO: loaded from: classes28.dex */
public final class PnSScreenTimeManagementDaySetting {
    public final Integer dayOfWeek;
    public final Integer screenTimeLimitForWeek;
    public final Integer screenTimeSettingTypeForWeek;
    public final Integer screenTimeStatusForWeek;

    public PnSScreenTimeManagementDaySetting() {
        this(0, 0, 0, Integer.valueOf(EnumC1780800wRS.NON.getValue()));
    }

    public PnSScreenTimeManagementDaySetting(Integer num, Integer num2, Integer num3, Integer num4) {
        this.screenTimeLimitForWeek = num;
        this.screenTimeSettingTypeForWeek = num2;
        this.screenTimeStatusForWeek = num3;
        this.dayOfWeek = num4;
    }
}
