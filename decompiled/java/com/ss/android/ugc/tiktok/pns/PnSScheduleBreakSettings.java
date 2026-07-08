package com.ss.android.ugc.tiktok.pns;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class PnSScheduleBreakSettings implements Serializable {
    public final int downTimeStatus;
    public final boolean shouldShowDownTime;
    public final int skipDownTimeStatus;
    public final int type;
    public final List<PnSScheduleBreakWeekSettings> weekSettings;

    public PnSScheduleBreakSettings() {
        this(false, 0, 0, new ArrayList(), 0);
    }

    public PnSScheduleBreakSettings(boolean z, int i, int i2, List<PnSScheduleBreakWeekSettings> list, int i3) {
        this.shouldShowDownTime = z;
        this.downTimeStatus = i;
        this.type = i2;
        this.weekSettings = list;
        this.skipDownTimeStatus = i3;
    }
}
