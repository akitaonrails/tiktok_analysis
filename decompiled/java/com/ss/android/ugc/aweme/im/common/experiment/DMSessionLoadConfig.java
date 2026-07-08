package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class DMSessionLoadConfig {

    @C09CT("batch_convert_size")
    public final int batchConvertSize;

    @C09CT("cache_strategy")
    public final int cacheStrategy;

    @C09CT("dm_view_holder_cache_size")
    public final int dmViewHolderCacheSize;

    @C09CT("empty_inbox_monitor_sample")
    public final int emptyInboxMonitorSampleRate;

    @C09CT("inbox_debounce_time_ms")
    public final long inboxMediatorDebounceTimeMs;

    @C09CT("init_new_page_with_memory_session")
    public final boolean initNewPageWithMemorySession;

    @C09CT("min_size_to_display")
    public final int minSizeToDisplay;

    @C09CT("min_size_to_stop_load")
    public final int minSizeToStopLoad;

    @C09CT("preload_secondary")
    public final boolean preloadSecondary;

    @C09CT("refactor_data_flow_debug_log")
    public final boolean refactorDataFlowDebugLog;

    @C09CT("refactor_data_flow_perf_log")
    public final boolean refactorDataFlowPerfLog;

    @C09CT("session_data_mediator_debounce_time_ms")
    public final long sessionDataMediatorDebounceTimeMs;

    @C09CT("large_page_size_for_load_more")
    public final boolean useLargerPageSize;

    @C09CT("use_old_activity_status_logic")
    public final boolean useOldActivityStatusLogic;

    @C09CT("use_recycler_view_pool")
    public final boolean useRecyclerViewPool;

    @C09CT("use_unread_collector")
    public final boolean useUnreadCollector;

    public DMSessionLoadConfig() {
        this(1, false, 1, 20, true, 2, true, 100, 500L, 500L, false, false, true, true, 20, false);
    }

    public DMSessionLoadConfig(int i, boolean z, int i2, int i3, boolean z2, int i4, boolean z3, int i5, long j, long j2, boolean z4, boolean z5, boolean z6, boolean z7, int i6, boolean z8) {
        this.emptyInboxMonitorSampleRate = i;
        this.preloadSecondary = z;
        this.minSizeToDisplay = i2;
        this.minSizeToStopLoad = i3;
        this.initNewPageWithMemorySession = z2;
        this.cacheStrategy = i4;
        this.useLargerPageSize = z3;
        this.batchConvertSize = i5;
        this.inboxMediatorDebounceTimeMs = j;
        this.sessionDataMediatorDebounceTimeMs = j2;
        this.refactorDataFlowPerfLog = z4;
        this.refactorDataFlowDebugLog = z5;
        this.useOldActivityStatusLogic = z6;
        this.useRecyclerViewPool = z7;
        this.dmViewHolderCacheSize = i6;
        this.useUnreadCollector = z8;
    }
}
