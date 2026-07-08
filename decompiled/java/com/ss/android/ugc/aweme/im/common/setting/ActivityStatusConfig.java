package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC15512065m;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes36.dex */
public final class ActivityStatusConfig implements InterfaceC15512065m {

    @C09CT("active_threshold")
    public long activeThreshold;

    @C09CT("activity_status_accuracy_analytics_enable")
    public final boolean activityStatusAccuracyAnalyticsEnable;

    @C09CT("activity_status_chatpage_check_sampling_rate")
    public final double activityStatusChatPageCheckSamplingRate;

    @C09CT("enable_fetch_as_report")
    public final boolean enableFetchAsReport;

    @C09CT("group_sent_message_preview_threshold")
    public long groupSentMessagePreviewThreshold;

    @C09CT("inactive_threshold")
    public long inactiveThreshold;

    @C09CT("max_cache_size")
    public final int maxCacheSize;

    @C09CT("muf_local_manage_limit")
    public final int mufLocalManageLimit;

    @C09CT("num_of_inbox_sky_light_status_limit_count")
    public final int numOfInboxSkyLightStatusLimitCount;

    @C09CT("recently_active_threshold")
    public final long recentlyActiveThreshold;

    @C09CT("num_of_friend_to_fetch_status")
    public final int remoteBatchSize;

    @C09CT("status_cache_offline_status_expire_threshold")
    public long statusCacheOfflineStatusExpireThreshold;

    @C09CT("status_cache_online_status_expire_threshold")
    public long statusCacheOnlineStatusExpireThreshold;

    @C09CT("status_cache_request_debounce_interval")
    public final long statusCacheRequestDebounceInterval;

    @C09CT("status_cache_unavailable_status_expire_threshold")
    public long statusCacheUnavailableStatusExpireThreshold;

    @C09CT("status_copy_display_date_threshold")
    public final long statusCopyDisplayDateThreshold;

    @C09CT("status_copy_display_hour_threshold")
    public final long statusCopyDisplayHourThreshold;

    @C09CT("status_copy_display_min_threshold")
    public final long statusCopyDisplayMinThreshold;

    @C09CT("status_copy_display_msg_time_threshold")
    public long statusCopyDisplayMsgTimeThreshold;

    @C09CT("status_report_interval")
    public long statusReportInterval;

    @C09CT("status_report_request_debounce_interval")
    public final long statusReportRequestDebounceInterval;

    @C09CT("ui_high_priority_refresh_status_interval")
    public long uiHighPriorityRefreshStatusInterval;

    @C09CT("ui_refresh_status_interval")
    public long uiRefreshStatusInterval;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStatusConfig)) {
            return false;
        }
        ActivityStatusConfig activityStatusConfig = (ActivityStatusConfig) obj;
        return this.maxCacheSize == activityStatusConfig.maxCacheSize && this.remoteBatchSize == activityStatusConfig.remoteBatchSize && this.numOfInboxSkyLightStatusLimitCount == activityStatusConfig.numOfInboxSkyLightStatusLimitCount && this.uiRefreshStatusInterval == activityStatusConfig.uiRefreshStatusInterval && this.uiHighPriorityRefreshStatusInterval == activityStatusConfig.uiHighPriorityRefreshStatusInterval && this.activeThreshold == activityStatusConfig.activeThreshold && this.statusCopyDisplayDateThreshold == activityStatusConfig.statusCopyDisplayDateThreshold && this.statusCopyDisplayHourThreshold == activityStatusConfig.statusCopyDisplayHourThreshold && this.statusCopyDisplayMinThreshold == activityStatusConfig.statusCopyDisplayMinThreshold && this.statusCopyDisplayMsgTimeThreshold == activityStatusConfig.statusCopyDisplayMsgTimeThreshold && this.statusReportInterval == activityStatusConfig.statusReportInterval && this.statusReportRequestDebounceInterval == activityStatusConfig.statusReportRequestDebounceInterval && this.statusCacheOfflineStatusExpireThreshold == activityStatusConfig.statusCacheOfflineStatusExpireThreshold && this.statusCacheOnlineStatusExpireThreshold == activityStatusConfig.statusCacheOnlineStatusExpireThreshold && this.statusCacheUnavailableStatusExpireThreshold == activityStatusConfig.statusCacheUnavailableStatusExpireThreshold && this.statusCacheRequestDebounceInterval == activityStatusConfig.statusCacheRequestDebounceInterval && this.inactiveThreshold == activityStatusConfig.inactiveThreshold && Double.compare(this.activityStatusChatPageCheckSamplingRate, activityStatusConfig.activityStatusChatPageCheckSamplingRate) == 0 && this.activityStatusAccuracyAnalyticsEnable == activityStatusConfig.activityStatusAccuracyAnalyticsEnable && this.mufLocalManageLimit == activityStatusConfig.mufLocalManageLimit && this.groupSentMessagePreviewThreshold == activityStatusConfig.groupSentMessagePreviewThreshold && this.recentlyActiveThreshold == activityStatusConfig.recentlyActiveThreshold && this.enableFetchAsReport == activityStatusConfig.enableFetchAsReport;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((this.maxCacheSize * 31) + this.remoteBatchSize) * 31) + this.numOfInboxSkyLightStatusLimitCount) * 31) + C786410Ut5.Y2(this.uiRefreshStatusInterval)) * 31) + C786410Ut5.Y2(this.uiHighPriorityRefreshStatusInterval)) * 31) + C786410Ut5.Y2(this.activeThreshold)) * 31) + C786410Ut5.Y2(this.statusCopyDisplayDateThreshold)) * 31) + C786410Ut5.Y2(this.statusCopyDisplayHourThreshold)) * 31) + C786410Ut5.Y2(this.statusCopyDisplayMinThreshold)) * 31) + C786410Ut5.Y2(this.statusCopyDisplayMsgTimeThreshold)) * 31) + C786410Ut5.Y2(this.statusReportInterval)) * 31) + C786410Ut5.Y2(this.statusReportRequestDebounceInterval)) * 31) + C786410Ut5.Y2(this.statusCacheOfflineStatusExpireThreshold)) * 31) + C786410Ut5.Y2(this.statusCacheOnlineStatusExpireThreshold)) * 31) + C786410Ut5.Y2(this.statusCacheUnavailableStatusExpireThreshold)) * 31) + C786410Ut5.Y2(this.statusCacheRequestDebounceInterval)) * 31) + C786410Ut5.Y2(this.inactiveThreshold)) * 31) + C786410Ut5.X2(this.activityStatusChatPageCheckSamplingRate)) * 31) + C786410Ut5.Z2(this.activityStatusAccuracyAnalyticsEnable)) * 31) + this.mufLocalManageLimit) * 31) + C786410Ut5.Y2(this.groupSentMessagePreviewThreshold)) * 31) + C786410Ut5.Y2(this.recentlyActiveThreshold)) * 31) + C786410Ut5.Z2(this.enableFetchAsReport);
    }

    public final String toString() {
        return "ActivityStatusConfig(maxCacheSize=" + this.maxCacheSize + ", remoteBatchSize=" + this.remoteBatchSize + ", numOfInboxSkyLightStatusLimitCount=" + this.numOfInboxSkyLightStatusLimitCount + ", uiRefreshStatusInterval=" + this.uiRefreshStatusInterval + ", uiHighPriorityRefreshStatusInterval=" + this.uiHighPriorityRefreshStatusInterval + ", activeThreshold=" + this.activeThreshold + ", statusCopyDisplayDateThreshold=" + this.statusCopyDisplayDateThreshold + ", statusCopyDisplayHourThreshold=" + this.statusCopyDisplayHourThreshold + ", statusCopyDisplayMinThreshold=" + this.statusCopyDisplayMinThreshold + ", statusCopyDisplayMsgTimeThreshold=" + this.statusCopyDisplayMsgTimeThreshold + ", statusReportInterval=" + this.statusReportInterval + ", statusReportRequestDebounceInterval=" + this.statusReportRequestDebounceInterval + ", statusCacheOfflineStatusExpireThreshold=" + this.statusCacheOfflineStatusExpireThreshold + ", statusCacheOnlineStatusExpireThreshold=" + this.statusCacheOnlineStatusExpireThreshold + ", statusCacheUnavailableStatusExpireThreshold=" + this.statusCacheUnavailableStatusExpireThreshold + ", statusCacheRequestDebounceInterval=" + this.statusCacheRequestDebounceInterval + ", inactiveThreshold=" + this.inactiveThreshold + ", activityStatusChatPageCheckSamplingRate=" + this.activityStatusChatPageCheckSamplingRate + ", activityStatusAccuracyAnalyticsEnable=" + this.activityStatusAccuracyAnalyticsEnable + ", mufLocalManageLimit=" + this.mufLocalManageLimit + ", groupSentMessagePreviewThreshold=" + this.groupSentMessagePreviewThreshold + ", recentlyActiveThreshold=" + this.recentlyActiveThreshold + ", enableFetchAsReport=" + this.enableFetchAsReport + ')';
    }

    public ActivityStatusConfig() {
        this(250, 100, 40, 300000L, 180000L, 600000L, 172800000L, 25200000L, 3600000L, 1800000L, 270000L, 500L, Mp4ScreenVideoLoadTimeout.CONTROL, 180000L, 10000L, 500L, 180000L, 0.1d, false, 100, 43200000L, 3600000L, false);
    }

    @Override // X.InterfaceC15512065m
    public final long LIZ() {
        return this.statusCopyDisplayDateThreshold;
    }

    public ActivityStatusConfig(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, double d, boolean z, int i4, long j15, long j16, boolean z2) {
        this.maxCacheSize = i;
        this.remoteBatchSize = i2;
        this.numOfInboxSkyLightStatusLimitCount = i3;
        this.uiRefreshStatusInterval = j;
        this.uiHighPriorityRefreshStatusInterval = j2;
        this.activeThreshold = j3;
        this.statusCopyDisplayDateThreshold = j4;
        this.statusCopyDisplayHourThreshold = j5;
        this.statusCopyDisplayMinThreshold = j6;
        this.statusCopyDisplayMsgTimeThreshold = j7;
        this.statusReportInterval = j8;
        this.statusReportRequestDebounceInterval = j9;
        this.statusCacheOfflineStatusExpireThreshold = j10;
        this.statusCacheOnlineStatusExpireThreshold = j11;
        this.statusCacheUnavailableStatusExpireThreshold = j12;
        this.statusCacheRequestDebounceInterval = j13;
        this.inactiveThreshold = j14;
        this.activityStatusChatPageCheckSamplingRate = d;
        this.activityStatusAccuracyAnalyticsEnable = z;
        this.mufLocalManageLimit = i4;
        this.groupSentMessagePreviewThreshold = j15;
        this.recentlyActiveThreshold = j16;
        this.enableFetchAsReport = z2;
    }
}
