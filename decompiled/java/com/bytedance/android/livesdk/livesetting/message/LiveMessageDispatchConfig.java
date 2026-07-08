package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMessageDispatchConfig {
    public static final TypeAdapter ADAPTER = new LiveMessageDispatchConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("by_pass_dispatch_allow_method_list")
    public List<String> byPassDispatchAllowList;

    @C09CT("direct_dispatch_allow_method_list")
    public List<String> directDispatchAllowList;

    @C09CT("direct_dispatch_p2p_block_method_list")
    public List<String> directDispatchP2pBlockList;

    @C09CT("direct_dispatch_p2p_msg")
    public boolean directDispatchP2pMsg;

    @C09CT("dispatch_dynamic_duration")
    public int dispatchDynamicDuration;

    @C09CT("dispatch_limit_duration")
    public int dispatchLimitDuration;

    @C09CT("dispatch_message_timeout")
    public long dispatchMessageTimeout;

    @C09CT("dispatch_strategy")
    public int dispatchStrategy;

    @C09CT("enable_async_dispatch")
    public boolean enableAsyncDispatch;

    @C09CT("enable_dispatch_list_optimize")
    public boolean enableDispatchListOptimize;

    @C09CT("enable_inactive_opt")
    public boolean enableInactiveOpt;

    @C09CT("fixfreq_strategy_dispatch_interval")
    public long fixfreqDispatchInterval;

    @C09CT("fixfreq_strategy_dispatch_size")
    public int fixfreqDispatchSize;

    @C09CT("fixfreq_strategy_max_queue_size")
    public int fixfreqMaxQueueSize;

    @C09CT("optwindow_strategy_min_dispatch_size")
    public int optwindowMinDispatchSize;

    @C09CT("optwindow_strategy_window_time")
    public long optwindowWindowTime;

    @C09CT("smooth_dispatch_optimize")
    public boolean smoothDispatchOptimize;

    public LiveMessageDispatchConfig() {
        this(false, false, new ArrayList(), new ArrayList(), new ArrayList(), 10L, 1, 50L, 3, 50L, 8, -1, -1, 8, false, false, false);
    }

    public LiveMessageDispatchConfig(boolean z, boolean z2, List<String> list, List<String> list2, List<String> list3, long j, int i, long j2, int i2, long j3, int i3, int i4, int i5, int i6, boolean z3, boolean z4, boolean z5) {
        this.directDispatchP2pMsg = z;
        this.smoothDispatchOptimize = z2;
        this.directDispatchAllowList = list;
        this.byPassDispatchAllowList = list2;
        this.directDispatchP2pBlockList = list3;
        this.dispatchMessageTimeout = j;
        this.dispatchStrategy = i;
        this.optwindowWindowTime = j2;
        this.optwindowMinDispatchSize = i2;
        this.fixfreqDispatchInterval = j3;
        this.fixfreqDispatchSize = i3;
        this.fixfreqMaxQueueSize = i4;
        this.dispatchLimitDuration = i5;
        this.dispatchDynamicDuration = i6;
        this.enableDispatchListOptimize = z3;
        this.enableAsyncDispatch = z4;
        this.enableInactiveOpt = z5;
    }
}
