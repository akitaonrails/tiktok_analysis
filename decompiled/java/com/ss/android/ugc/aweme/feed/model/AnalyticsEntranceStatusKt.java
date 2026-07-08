package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes20.dex */
public final class AnalyticsEntranceStatusKt {
    public static final boolean canShowAnalytics(AnalyticsEntranceStatus analyticsEntranceStatus) {
        if (analyticsEntranceStatus.compareTo(AnalyticsEntranceStatus.DEFAULT_FALLBACK) > 0) {
            return true;
        }
        return false;
    }

    public static final boolean isAnalyticsEnable(AnalyticsEntranceStatus analyticsEntranceStatus) {
        if (analyticsEntranceStatus != AnalyticsEntranceStatus.SHOW_ENTRANCE_WITH_PRIVACY_SETTINGS && analyticsEntranceStatus != AnalyticsEntranceStatus.SHOW_ENTRANCE_WITHOUT_PRIVACY_SETTINGS) {
            return false;
        }
        return true;
    }

    public static final boolean isAnalyticsGray365(AnalyticsEntranceStatus analyticsEntranceStatus) {
        if (analyticsEntranceStatus != AnalyticsEntranceStatus.DISABLED_ENTRANCE_WITH_PRIVACY_SETTINGS && analyticsEntranceStatus != AnalyticsEntranceStatus.DISABLED_ENTRANCE_WITHOUT_PRIVACY_SETTINGS) {
            return false;
        }
        return true;
    }

    public static final boolean isFallback(AnalyticsEntranceStatus analyticsEntranceStatus) {
        if (analyticsEntranceStatus == AnalyticsEntranceStatus.DEFAULT_FALLBACK) {
            return true;
        }
        return false;
    }
}
