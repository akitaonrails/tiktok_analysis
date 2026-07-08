package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallBridgeCenterModel {

    @C09CT("enable_track_call_method_error")
    public final Integer enableTrackCallMethodError;

    @C09CT("enable_track_call_method_monitor")
    public final Integer enableTrackCallMethodMonitor;

    @C09CT("enable_track_send_event_perf")
    public final Integer enableTrackSendEventPerf;

    @C09CT("track_call_method_error_allow_list")
    public final List<String> trackCallMethodErrorAllowList;

    @C09CT("track_call_method_monitor_allow_list")
    public final List<String> trackCallMethodMonitorAllowList;

    @C09CT("track_send_event_perf_allow_list")
    public final List<String> trackSendEventPerfAllowList;

    public EcMixMallBridgeCenterModel() {
        this(0, null, 0, null, 0, null);
    }

    public EcMixMallBridgeCenterModel(Integer num, List<String> list, Integer num2, List<String> list2, Integer num3, List<String> list3) {
        this.enableTrackCallMethodError = num;
        this.trackCallMethodErrorAllowList = list;
        this.enableTrackCallMethodMonitor = num2;
        this.trackCallMethodMonitorAllowList = list2;
        this.enableTrackSendEventPerf = num3;
        this.trackSendEventPerfAllowList = list3;
    }
}
