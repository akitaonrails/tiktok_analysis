package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CloseFrequentLimit {

    @C09CT("days_no_show")
    public int daysNoShow;

    @C09CT("days_window")
    public int daysWindow;

    @C09CT("hours_no_show")
    public Integer hoursNoShow;

    @C09CT("max_close")
    public int maxClose;

    public CloseFrequentLimit(int i, int i2, int i3, Integer num) {
        this.daysWindow = i;
        this.maxClose = i2;
        this.daysNoShow = i3;
        this.hoursNoShow = num;
    }
}
