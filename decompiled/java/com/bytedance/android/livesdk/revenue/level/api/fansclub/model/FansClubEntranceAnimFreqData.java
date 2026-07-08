package com.bytedance.android.livesdk.revenue.level.api.fansclub.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubEntranceAnimFreqData {

    @C09CT("freq_control_key")
    public String freqControlKey;

    @C09CT("last_show_time")
    public long lastShowTimeTs;

    @C09CT("show_times")
    public long showTimes;

    public FansClubEntranceAnimFreqData(long j, String str, long j2) {
        this.lastShowTimeTs = j;
        this.freqControlKey = str;
        this.showTimes = j2;
    }
}
