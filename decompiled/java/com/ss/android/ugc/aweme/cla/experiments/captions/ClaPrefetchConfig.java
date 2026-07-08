package com.ss.android.ugc.aweme.cla.experiments.captions;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class ClaPrefetchConfig {

    @C09CT("cold_start_delay_ms")
    public final long coldStartDelayMs;

    @C09CT("enable_atomic_dedup")
    public final boolean enableAtomicDedup;

    @C09CT("enable_cold_start_scan")
    public final boolean enableColdStartScan;

    @C09CT("enable_drop_pending_before")
    public final boolean enableDropPendingBefore;

    @C09CT("enable_et_prefetch_status")
    public final boolean enableEtPrefetchStatus;

    @C09CT("enable_prefetch_join_retry")
    public final boolean enablePrefetchJoinRetry;

    @C09CT("list_return_prefetch_count")
    public final int listReturnPrefetchCount;

    @C09CT("low_end_prefetch_count")
    public final int lowEndPrefetchCount;

    @C09CT("max_concurrent_prefetch")
    public final int maxConcurrentPrefetch;

    @C09CT("max_prefetch_number")
    public final int maxPrefetchNumber;

    @C09CT("prefetch_scan_window")
    public final int prefetchScanWindow;

    @C09CT("support_scenarios")
    public final List<String> supportScenarios;

    @C09CT("swipe_delay_ms")
    public final long swipeDelayMs;

    public ClaPrefetchConfig() {
        this(null, 0, 0, 0, 0, 0L, 0L, 0, false, false, false, false, false, 8191, null);
    }

    public ClaPrefetchConfig(List<String> list, int i, int i2, int i3, int i4, long j, long j2, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.supportScenarios = list;
        this.maxPrefetchNumber = i;
        this.listReturnPrefetchCount = i2;
        this.prefetchScanWindow = i3;
        this.maxConcurrentPrefetch = i4;
        this.coldStartDelayMs = j;
        this.swipeDelayMs = j2;
        this.lowEndPrefetchCount = i5;
        this.enableDropPendingBefore = z;
        this.enablePrefetchJoinRetry = z2;
        this.enableAtomicDedup = z3;
        this.enableColdStartScan = z4;
        this.enableEtPrefetchStatus = z5;
    }

    public ClaPrefetchConfig(List list, int i, int i2, int i3, int i4, long j, long j2, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? Collections.singletonList("homepage_hot") : list, (i6 & 2) != 0 ? 3 : i, (i6 & 4) == 0 ? i2 : 3, (i6 & 8) != 0 ? 10 : i3, (i6 & 16) != 0 ? 2 : i4, (i6 & 32) != 0 ? 0L : j, (i6 & 64) != 0 ? 300L : j2, (i6 & 128) != 0 ? 1 : i5, (i6 & 256) != 0 ? true : z, (i6 & 512) != 0 ? false : z2, (i6 & 1024) != 0 ? true : z3, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z4, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z5 : true);
    }
}
