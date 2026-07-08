package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class MiddleSnapShotConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("list")
    public final List<Integer> list;

    @C09CT("time_out_load_image")
    public final long timeOutLoadImage;

    @C09CT("time_out_show_image")
    public final long timeOutShowImage;

    @C09CT("time_start_load")
    public final long timeStartLoad;

    public MiddleSnapShotConfig() {
        this(false, null, 0L, 0L, 0L, 31, null);
    }

    public MiddleSnapShotConfig(boolean z, List<Integer> list, long j, long j2, long j3) {
        this.enable = z;
        this.list = list;
        this.timeStartLoad = j;
        this.timeOutLoadImage = j2;
        this.timeOutShowImage = j3;
    }

    public MiddleSnapShotConfig(boolean z, List list, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) == 0 ? j3 : 0L);
    }
}
