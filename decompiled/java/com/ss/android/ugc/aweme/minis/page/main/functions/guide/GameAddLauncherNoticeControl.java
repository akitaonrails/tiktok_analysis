package com.ss.android.ugc.aweme.minis.page.main.functions.guide;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class GameAddLauncherNoticeControl {

    @C09CT("entry_b_list")
    public final List<String> entryBlist;

    @C09CT("notice_display_duration")
    public final long floatingNoticeDuration;

    @C09CT("interval")
    public final int interval;

    @C09CT("max_times")
    public final int maxTimes;

    @C09CT("period")
    public final int period;

    @C09CT("times")
    public final int times;

    public GameAddLauncherNoticeControl() {
        this(0, 0, 0, 0, 0L, null, 63, null);
    }

    public GameAddLauncherNoticeControl(int i, int i2, int i3, int i4, long j, List<String> list) {
        this.maxTimes = i;
        this.period = i2;
        this.times = i3;
        this.interval = i4;
        this.floatingNoticeDuration = j;
        this.entryBlist = list;
    }

    public GameAddLauncherNoticeControl(int i, int i2, int i3, int i4, long j, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? 345600 : i2, (i5 & 4) != 0 ? 4 : i3, (i5 & 8) != 0 ? 86400 : i4, (i5 & 16) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j, (i5 & 32) != 0 ? Collections.singletonList("ads_slide") : list);
    }
}
