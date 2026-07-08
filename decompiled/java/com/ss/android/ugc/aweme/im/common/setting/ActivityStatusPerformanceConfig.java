package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class ActivityStatusPerformanceConfig {

    @C09CT("status_cache_offline_status_expire_threshold")
    public Long statusCacheOfflineStatusExpireThreshold;

    @C09CT("status_cache_online_status_expire_threshold")
    public Long statusCacheOnlineStatusExpireThreshold;

    @C09CT("status_cache_request_debounce_interval")
    public final Long statusCacheRequestDebounceInterval;

    @C09CT("status_cache_unavailable_status_expire_threshold")
    public Long statusCacheUnavailableStatusExpireThreshold;

    @C09CT("status_report_interval")
    public Long statusReportInterval;

    @C09CT("status_report_request_debounce_interval")
    public final Long statusReportRequestDebounceInterval;

    @C09CT("ui_high_priority_refresh_status_interval")
    public Long uiHighPriorityRefreshStatusInterval;

    @C09CT("ui_refresh_status_interval")
    public Long uiRefreshStatusInterval;

    public ActivityStatusPerformanceConfig() {
        this(null, null, null, null, null, null, null, null);
    }

    public ActivityStatusPerformanceConfig(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
        this.uiRefreshStatusInterval = l;
        this.uiHighPriorityRefreshStatusInterval = l2;
        this.statusReportInterval = l3;
        this.statusReportRequestDebounceInterval = l4;
        this.statusCacheOfflineStatusExpireThreshold = l5;
        this.statusCacheOnlineStatusExpireThreshold = l6;
        this.statusCacheUnavailableStatusExpireThreshold = l7;
        this.statusCacheRequestDebounceInterval = l8;
    }
}
