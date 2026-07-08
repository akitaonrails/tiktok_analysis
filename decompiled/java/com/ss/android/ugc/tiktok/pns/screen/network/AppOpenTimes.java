package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AppOpenTimes implements Serializable {

    @C09CT("day_open_times")
    public final int dayOpenTimes;

    @C09CT("night_open_times")
    public final int nightOpenTimes;

    @C09CT("upload_date")
    public final int uploadDate;

    public AppOpenTimes() {
        this(0, 0, 0);
    }

    public AppOpenTimes(int i, int i2, int i3) {
        this.uploadDate = i;
        this.dayOpenTimes = i2;
        this.nightOpenTimes = i3;
    }
}
