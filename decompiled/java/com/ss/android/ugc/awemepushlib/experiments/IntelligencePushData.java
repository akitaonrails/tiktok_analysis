package com.ss.android.ugc.awemepushlib.experiments;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class IntelligencePushData {

    @C09CT("cold_launch_max_push_show_count")
    public final int coldLaunchMaxPushShowCount;

    @C09CT("cold_launch_show_time_interval")
    public final int coldLaunchShowTimeInterval;

    @C09CT("cold_launch_waiting_time")
    public final int coldLaunchWaitingTime;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("item_type_list")
    public final List<String> itemTypeList;

    @C09CT("max_retry_times")
    public final int maxRetryTimes;

    @C09CT("max_timeout_duration")
    public final int maxTimeoutDuration;

    @C09CT("retry_init_pitaya_interval")
    public final int retryInitPitayaInterval;

    @C09CT("retry_time_interval")
    public final int retryTimeInterval;

    @C09CT("try_init_pitaya_on_receive")
    public final boolean tryInitPitayaOnReceive;

    public IntelligencePushData() {
        this(false, 0, 0, 0, 0, 0, 0, null, false, 0, 1023, null);
    }

    public IntelligencePushData(boolean z, int i, int i2, int i3, int i4, int i5, int i6, List<String> list, boolean z2, int i7) {
        this.enable = z;
        this.maxRetryTimes = i;
        this.retryTimeInterval = i2;
        this.maxTimeoutDuration = i3;
        this.coldLaunchMaxPushShowCount = i4;
        this.coldLaunchShowTimeInterval = i5;
        this.coldLaunchWaitingTime = i6;
        this.itemTypeList = list;
        this.tryInitPitayaOnReceive = z2;
        this.retryInitPitayaInterval = i7;
    }

    public IntelligencePushData(boolean z, int i, int i2, int i3, int i4, int i5, int i6, List list, boolean z2, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? false : z, (i8 & 2) != 0 ? 20 : i, (i8 & 4) != 0 ? 60 : i2, (i8 & 8) != 0 ? Integer.MAX_VALUE : i3, (i8 & 16) != 0 ? 1 : i4, (i8 & 32) != 0 ? 60 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) != 0 ? C13BV.INSTANCE : list, (i8 & 256) == 0 ? z2 : false, (i8 & 512) == 0 ? i7 : 60);
    }
}
