package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_flow_hot_refresh")
public final class LiveInnerFlowHotRefreshSetting {
    public static final LiveInnerFlowHotRefreshSetting INSTANCE = new LiveInnerFlowHotRefreshSetting();
    public static final LiveInnerFlowHotRefreshConfig DEFAULT = new LiveInnerFlowHotRefreshConfig(new LinkedHashMap(), false, false, 0, 0, 5, 30, false, false, new LinkedHashMap(), false, false, false, 0, 1, 1);

    public static final class EntryConfig implements Serializable {
        public static final TypeAdapter ADAPTER = new LiveInnerFlowHotRefreshSetting_EntryConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("background_threshold_sec")
        public long backgroundThresholdSec;

        @C09CT("enable")
        public boolean enable;

        @C09CT("expired_time_sec")
        public long expiredTimeSec;

        @C09CT("recent_feed_protect_sec")
        public long recentFeedProtectSec;

        @C09CT("req_from")
        public String reqFrom;

        public EntryConfig() {
            this(false, "", 0L, 0L, 0L);
        }

        public final long getBackgroundThresholdSec() {
            return this.backgroundThresholdSec;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final long getExpiredTimeSec() {
            return this.expiredTimeSec;
        }

        public final long getRecentFeedProtectSec() {
            return this.recentFeedProtectSec;
        }

        public final String getReqFrom() {
            return this.reqFrom;
        }

        public final void setBackgroundThresholdSec(long j) {
            this.backgroundThresholdSec = j;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setExpiredTimeSec(long j) {
            this.expiredTimeSec = j;
        }

        public final void setRecentFeedProtectSec(long j) {
            this.recentFeedProtectSec = j;
        }

        public final void setReqFrom(String str) {
            this.reqFrom = str;
        }

        public EntryConfig(boolean z, String str, long j, long j2, long j3) {
            this.enable = z;
            this.reqFrom = str;
            this.expiredTimeSec = j;
            this.backgroundThresholdSec = j2;
            this.recentFeedProtectSec = j3;
        }
    }

    public static final class LiveInnerFlowHotRefreshConfig implements Serializable {
        public static final TypeAdapter ADAPTER = new LiveInnerFlowHotRefreshSetting_LiveInnerFlowHotRefreshConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("cooldown_sec")
        public long cooldownSec;

        @C09CT("enable_feed_timeout_trigger")
        public boolean enableFeedTimeoutTrigger;

        @C09CT("enable_foreground_trigger")
        public boolean enableForegroundTrigger;

        @C09CT("enable_negative_signal_trigger")
        public boolean enableNegativeSignalTrigger;

        @C09CT("enable_online_drop_trigger")
        public boolean enableOnlineDropTrigger;

        @C09CT("entries")
        public Map<String, EntryConfig> entryConfigs;

        @C09CT("expired_retry_base_backoff_sec")
        public long expiredRetryBaseBackoffSec;

        @C09CT("expired_retry_max_backoff_sec")
        public long expiredRetryMaxBackoffSec;

        @C09CT("expired_retry_max_count")
        public int expiredRetryMaxCount;

        @C09CT("hot_refresh_unread_mode")
        public int hotRefreshUnreadMode;

        @C09CT("hot_refresh_unread_report_key_type")
        public int hotRefreshUnreadReportKeyType;

        @C09CT("is_unread_trigger_opt_enable")
        public boolean isUnreadTriggerOptEnable;

        @C09CT("negative_signal_skip_recent_feed_protect")
        public boolean negativeSignalSkipRecentFeedProtect;

        @C09CT("negative_signal_type_switches")
        public Map<String, Boolean> negativeSignalTypeSwitches;

        @C09CT("fix_remove_current_room_issue")
        public boolean removeCurrentRoomIssueEnable;

        @C09CT("unread_trigger_opt_type")
        public int unreadTriggerOptType;

        public LiveInnerFlowHotRefreshConfig() {
            this(new LinkedHashMap(), false, false, 0, 0, 5L, 30L, false, false, new LinkedHashMap(), false, false, false, 0L, 1, 1);
        }

        public final long getCooldownSec() {
            return this.cooldownSec;
        }

        public final boolean getEnableFeedTimeoutTrigger() {
            return this.enableFeedTimeoutTrigger;
        }

        public final boolean getEnableForegroundTrigger() {
            return this.enableForegroundTrigger;
        }

        public final boolean getEnableNegativeSignalTrigger() {
            return this.enableNegativeSignalTrigger;
        }

        public final boolean getEnableOnlineDropTrigger() {
            return this.enableOnlineDropTrigger;
        }

        public final Map<String, EntryConfig> getEntryConfigs() {
            return this.entryConfigs;
        }

        public final long getExpiredRetryBaseBackoffSec() {
            return this.expiredRetryBaseBackoffSec;
        }

        public final long getExpiredRetryMaxBackoffSec() {
            return this.expiredRetryMaxBackoffSec;
        }

        public final int getExpiredRetryMaxCount() {
            return this.expiredRetryMaxCount;
        }

        public final int getHotRefreshUnreadMode() {
            return this.hotRefreshUnreadMode;
        }

        public final int getHotRefreshUnreadReportKeyType() {
            return this.hotRefreshUnreadReportKeyType;
        }

        public final boolean getNegativeSignalSkipRecentFeedProtect() {
            return this.negativeSignalSkipRecentFeedProtect;
        }

        public final Map<String, Boolean> getNegativeSignalTypeSwitches() {
            return this.negativeSignalTypeSwitches;
        }

        public final boolean getRemoveCurrentRoomIssueEnable() {
            return this.removeCurrentRoomIssueEnable;
        }

        public final int getUnreadTriggerOptType() {
            return this.unreadTriggerOptType;
        }

        public final boolean isUnreadTriggerOptEnable() {
            return this.isUnreadTriggerOptEnable;
        }

        public final void setCooldownSec(long j) {
            this.cooldownSec = j;
        }

        public final void setEnableFeedTimeoutTrigger(boolean z) {
            this.enableFeedTimeoutTrigger = z;
        }

        public final void setEnableForegroundTrigger(boolean z) {
            this.enableForegroundTrigger = z;
        }

        public final void setEnableNegativeSignalTrigger(boolean z) {
            this.enableNegativeSignalTrigger = z;
        }

        public final void setEnableOnlineDropTrigger(boolean z) {
            this.enableOnlineDropTrigger = z;
        }

        public final void setEntryConfigs(Map<String, EntryConfig> map) {
            this.entryConfigs = map;
        }

        public final void setExpiredRetryBaseBackoffSec(long j) {
            this.expiredRetryBaseBackoffSec = j;
        }

        public final void setExpiredRetryMaxBackoffSec(long j) {
            this.expiredRetryMaxBackoffSec = j;
        }

        public final void setExpiredRetryMaxCount(int i) {
            this.expiredRetryMaxCount = i;
        }

        public final void setHotRefreshUnreadMode(int i) {
            this.hotRefreshUnreadMode = i;
        }

        public final void setHotRefreshUnreadReportKeyType(int i) {
            this.hotRefreshUnreadReportKeyType = i;
        }

        public final void setNegativeSignalSkipRecentFeedProtect(boolean z) {
            this.negativeSignalSkipRecentFeedProtect = z;
        }

        public final void setNegativeSignalTypeSwitches(Map<String, Boolean> map) {
            this.negativeSignalTypeSwitches = map;
        }

        public final void setRemoveCurrentRoomIssueEnable(boolean z) {
            this.removeCurrentRoomIssueEnable = z;
        }

        public final void setUnreadTriggerOptEnable(boolean z) {
            this.isUnreadTriggerOptEnable = z;
        }

        public final void setUnreadTriggerOptType(int i) {
            this.unreadTriggerOptType = i;
        }

        public LiveInnerFlowHotRefreshConfig(Map<String, EntryConfig> map, boolean z, boolean z2, int i, int i2, long j, long j2, boolean z3, boolean z4, Map<String, Boolean> map2, boolean z5, boolean z6, boolean z7, long j3, int i3, int i4) {
            this.entryConfigs = map;
            this.removeCurrentRoomIssueEnable = z;
            this.isUnreadTriggerOptEnable = z2;
            this.unreadTriggerOptType = i;
            this.expiredRetryMaxCount = i2;
            this.expiredRetryBaseBackoffSec = j;
            this.expiredRetryMaxBackoffSec = j2;
            this.enableNegativeSignalTrigger = z3;
            this.enableOnlineDropTrigger = z4;
            this.negativeSignalTypeSwitches = map2;
            this.negativeSignalSkipRecentFeedProtect = z5;
            this.enableFeedTimeoutTrigger = z6;
            this.enableForegroundTrigger = z7;
            this.cooldownSec = j3;
            this.hotRefreshUnreadMode = i3;
            this.hotRefreshUnreadReportKeyType = i4;
        }
    }

    public static final long getCooldownMs() {
        return INSTANCE.getValue().getCooldownSec() * 1000;
    }

    public static final long getExpiredRetryBaseBackoffMs() {
        return INSTANCE.getValue().getExpiredRetryBaseBackoffSec() * 1000;
    }

    public static final long getExpiredRetryMaxBackoffMs() {
        return INSTANCE.getValue().getExpiredRetryMaxBackoffSec() * 1000;
    }

    public static final int getExpiredRetryMaxCount() {
        return INSTANCE.getValue().getExpiredRetryMaxCount();
    }

    public static final int getHotRefreshUnreadMode() {
        return INSTANCE.getValue().getHotRefreshUnreadMode();
    }

    public static final int getHotRefreshUnreadReportKeyType() {
        return INSTANCE.getValue().getHotRefreshUnreadReportKeyType();
    }

    public static final int getUnreadTriggerOptType() {
        return INSTANCE.getValue().getUnreadTriggerOptType();
    }

    private final LiveInnerFlowHotRefreshConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveInnerFlowHotRefreshConfig liveInnerFlowHotRefreshConfig = DEFAULT;
        LiveInnerFlowHotRefreshConfig liveInnerFlowHotRefreshConfig2 = (LiveInnerFlowHotRefreshConfig) settingsManager.getValueSafely("live_inner_flow_hot_refresh", liveInnerFlowHotRefreshConfig);
        return liveInnerFlowHotRefreshConfig2 != null ? liveInnerFlowHotRefreshConfig2 : liveInnerFlowHotRefreshConfig;
    }

    public static final boolean isFixRemoveCurIssueEnable() {
        return INSTANCE.getValue().getRemoveCurrentRoomIssueEnable();
    }

    public static final boolean isUnreadTriggerOptEnable() {
        return INSTANCE.getValue().isUnreadTriggerOptEnable();
    }

    public final LiveInnerFlowHotRefreshConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final long getBackgroundThresholdMs(String str) {
        long backgroundThresholdSec;
        EntryConfig configForEntry = getConfigForEntry(str);
        if (configForEntry != null) {
            backgroundThresholdSec = configForEntry.getBackgroundThresholdSec();
        } else {
            backgroundThresholdSec = 0;
        }
        return backgroundThresholdSec * 1000;
    }

    public static final EntryConfig getConfigForEntry(String str) {
        boolean z;
        EntryConfig entryConfig;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (entryConfig = INSTANCE.getValue().getEntryConfigs().get(str)) == null || !entryConfig.getEnable()) {
            return null;
        }
        return entryConfig;
    }

    public static final long getExpiredTimeMs(String str) {
        long expiredTimeSec;
        EntryConfig configForEntry = getConfigForEntry(str);
        if (configForEntry != null) {
            expiredTimeSec = configForEntry.getExpiredTimeSec();
        } else {
            expiredTimeSec = 0;
        }
        return expiredTimeSec * 1000;
    }

    public static final long getRecentFeedProtectMs(String str) {
        long recentFeedProtectSec;
        EntryConfig configForEntry = getConfigForEntry(str);
        if (configForEntry != null) {
            recentFeedProtectSec = configForEntry.getRecentFeedProtectSec();
        } else {
            recentFeedProtectSec = 0;
        }
        return recentFeedProtectSec * 1000;
    }

    public static final String getReqFrom(String str) {
        EntryConfig configForEntry = getConfigForEntry(str);
        if (configForEntry != null) {
            return configForEntry.getReqFrom();
        }
        return null;
    }

    public static final boolean isEnableForEntry(String str) {
        if (getConfigForEntry(str) != null) {
            return true;
        }
        return false;
    }

    public static final boolean isFeedTimeoutTriggerEnable(String str) {
        if (isEnableForEntry(str) && INSTANCE.getValue().getEnableFeedTimeoutTrigger()) {
            return true;
        }
        return false;
    }

    public static final boolean isForegroundTriggerEnable(String str) {
        if (isEnableForEntry(str) && INSTANCE.getValue().getEnableForegroundTrigger()) {
            return true;
        }
        return false;
    }

    public static final boolean isNegativeSignalSkipRecentFeedProtectEnable(String str) {
        if (isEnableForEntry(str) && INSTANCE.getValue().getNegativeSignalSkipRecentFeedProtect()) {
            return true;
        }
        return false;
    }

    public static final boolean isNegativeSignalTriggerEnable(String str) {
        if (isEnableForEntry(str) && INSTANCE.getValue().getEnableNegativeSignalTrigger()) {
            return true;
        }
        return false;
    }

    public static final boolean isOnlineDropTriggerEnable(String str) {
        if (isEnableForEntry(str) && INSTANCE.getValue().getEnableOnlineDropTrigger()) {
            return true;
        }
        return false;
    }

    public static final boolean isNegativeSignalTypeEnable(String str, String str2) {
        if (!isEnableForEntry(str)) {
            return false;
        }
        Boolean bool = INSTANCE.getValue().getNegativeSignalTypeSwitches().get(str2);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
