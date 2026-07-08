package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ScreenTimeDailyUsage implements Serializable {

    @C09CT("day_usage")
    public final int dayUsage;

    @C09CT("night_usage")
    public final int nightUsage;

    @C09CT("upload_date")
    public final int uploadDate;

    public ScreenTimeDailyUsage() {
        this(0, 0, 0);
    }

    public ScreenTimeDailyUsage(int i, int i2, int i3) {
        this.uploadDate = i;
        this.dayUsage = i2;
        this.nightUsage = i3;
    }
}
