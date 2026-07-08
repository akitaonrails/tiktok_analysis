package com.ss.android.ugc.aweme.offlinepush.experiment;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes25.dex */
public final class OfflinePushSettingsValue {

    @C09CT("local_active_min_days")
    public final int localActiveMinDays;

    @C09CT("local_active_recompute_interval_days")
    public final int localActiveRecomputeIntervalDays;

    @C09CT("local_active_top_n")
    public final int localActiveTopN;

    @C09CT("pre_schedule_unwatched_threshold")
    public final int preScheduleUnwatchedThreshold;

    @C09CT("push_delay_ms")
    public final long pushDelayMs;

    @C09CT("strategy1_bad_signal_duration_sec")
    public final int strategy1BadSignalDurationSec;

    @C09CT("strategy1_bad_signal_window_sec")
    public final int strategy1BadSignalWindowSec;

    @C09CT("strategy2_signal_window_sec")
    public final int strategy2SignalWindowSec;

    @C09CT("strategy3_heartbeat_interval_ms")
    public final long strategy3HeartbeatIntervalMs;

    @C09CT("strategy3_inactive_minutes")
    public final int strategy3InactiveMinutes;

    @C09CT("strategy3_min_check_interval_min")
    public final int strategy3MinCheckIntervalMin;

    @C09CT("timeout_no_click_hours")
    public final int timeoutNoClickHours;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflinePushSettingsValue)) {
            return false;
        }
        OfflinePushSettingsValue offlinePushSettingsValue = (OfflinePushSettingsValue) obj;
        return this.strategy1BadSignalWindowSec == offlinePushSettingsValue.strategy1BadSignalWindowSec && this.strategy1BadSignalDurationSec == offlinePushSettingsValue.strategy1BadSignalDurationSec && this.strategy2SignalWindowSec == offlinePushSettingsValue.strategy2SignalWindowSec && this.pushDelayMs == offlinePushSettingsValue.pushDelayMs && this.strategy3InactiveMinutes == offlinePushSettingsValue.strategy3InactiveMinutes && this.preScheduleUnwatchedThreshold == offlinePushSettingsValue.preScheduleUnwatchedThreshold && this.timeoutNoClickHours == offlinePushSettingsValue.timeoutNoClickHours && this.strategy3HeartbeatIntervalMs == offlinePushSettingsValue.strategy3HeartbeatIntervalMs && this.localActiveRecomputeIntervalDays == offlinePushSettingsValue.localActiveRecomputeIntervalDays && this.localActiveMinDays == offlinePushSettingsValue.localActiveMinDays && this.localActiveTopN == offlinePushSettingsValue.localActiveTopN && this.strategy3MinCheckIntervalMin == offlinePushSettingsValue.strategy3MinCheckIntervalMin;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.strategy1BadSignalWindowSec * 31) + this.strategy1BadSignalDurationSec) * 31) + this.strategy2SignalWindowSec) * 31) + C786410Ut5.Y2(this.pushDelayMs)) * 31) + this.strategy3InactiveMinutes) * 31) + this.preScheduleUnwatchedThreshold) * 31) + this.timeoutNoClickHours) * 31) + C786410Ut5.Y2(this.strategy3HeartbeatIntervalMs)) * 31) + this.localActiveRecomputeIntervalDays) * 31) + this.localActiveMinDays) * 31) + this.localActiveTopN) * 31) + this.strategy3MinCheckIntervalMin;
    }

    public String toString() {
        return "OfflinePushSettingsValue(strategy1BadSignalWindowSec=" + this.strategy1BadSignalWindowSec + ", strategy1BadSignalDurationSec=" + this.strategy1BadSignalDurationSec + ", strategy2SignalWindowSec=" + this.strategy2SignalWindowSec + ", pushDelayMs=" + this.pushDelayMs + ", strategy3InactiveMinutes=" + this.strategy3InactiveMinutes + ", preScheduleUnwatchedThreshold=" + this.preScheduleUnwatchedThreshold + ", timeoutNoClickHours=" + this.timeoutNoClickHours + ", strategy3HeartbeatIntervalMs=" + this.strategy3HeartbeatIntervalMs + ", localActiveRecomputeIntervalDays=" + this.localActiveRecomputeIntervalDays + ", localActiveMinDays=" + this.localActiveMinDays + ", localActiveTopN=" + this.localActiveTopN + ", strategy3MinCheckIntervalMin=" + this.strategy3MinCheckIntervalMin + ')';
    }

    public OfflinePushSettingsValue() {
        this(180, 3, (int) TimeUnit.MINUTES.toSeconds(5L), Mp4ScreenVideoLoadTimeout.CONTROL, (int) TimeUnit.HOURS.toMinutes(24L), 20, 24, TimeUnit.MINUTES.toMillis(5L), 7, 5, 3, 5);
    }

    public OfflinePushSettingsValue(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7, int i8, int i9, int i10) {
        this.strategy1BadSignalWindowSec = i;
        this.strategy1BadSignalDurationSec = i2;
        this.strategy2SignalWindowSec = i3;
        this.pushDelayMs = j;
        this.strategy3InactiveMinutes = i4;
        this.preScheduleUnwatchedThreshold = i5;
        this.timeoutNoClickHours = i6;
        this.strategy3HeartbeatIntervalMs = j2;
        this.localActiveRecomputeIntervalDays = i7;
        this.localActiveMinDays = i8;
        this.localActiveTopN = i9;
        this.strategy3MinCheckIntervalMin = i10;
    }
}
