package com.bytedance.im.core.client.configs;

import X.C09CT;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class IMSDKReceiveMsgPerfConfig {

    @C09CT("simple_burst_tracking_event_name")
    public final String burstTrackingEventName;

    @C09CT("perf_check_interval_ms")
    public final long generalCheckIntervalMs;

    @C09CT("general_timeout_ms")
    public final long generalTimeoutMs;

    @C09CT("enable")
    public final boolean isEnabled;

    @C09CT("simple_burst_tracking_sample_rate")
    public final float simpleBurstTrackingSampleRate;

    @C09CT("supported_inbox_types")
    public final List<Integer> supportedInboxTypes;

    @C09CT("supported_receive_types")
    public final List<String> supportedReceiveTypes;

    @C09CT("ws_burst_threshold")
    public final int wsBurstThreshold;

    @C09CT("ws_burst_timeout_ms")
    public final long wsBurstTimeoutMs;

    @C09CT("ws_burst_window_ms")
    public final long wsBurstWindowMs;

    @C09CT("ws_check_interval_ms")
    public final long wsCheckIntervalMs;

    public IMSDKReceiveMsgPerfConfig() {
        this(false, null, null, 0L, 0L, 0L, 0, 0L, 0L, null, 0.0f, 2047, null);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public IMSDKReceiveMsgPerfConfig(boolean z, List<String> list, List<Integer> list2, long j, long j2, long j3, int i, long j4, long j5, String str, float f) {
        this.isEnabled = z;
        this.supportedReceiveTypes = list;
        this.supportedInboxTypes = list2;
        this.generalTimeoutMs = j;
        this.generalCheckIntervalMs = j2;
        this.wsBurstWindowMs = j3;
        this.wsBurstThreshold = i;
        this.wsBurstTimeoutMs = j4;
        this.wsCheckIntervalMs = j5;
        this.burstTrackingEventName = str;
        this.simpleBurstTrackingSampleRate = f;
    }

    public IMSDKReceiveMsgPerfConfig(boolean z, List list, List list2, long j, long j2, long j3, int i, long j4, long j5, String str, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? C1697810uHb.LJIIJJI("pull", "ws") : list, (i2 & 4) != 0 ? Collections.singletonList(3) : list2, (i2 & 8) != 0 ? 20000L : j, (i2 & 16) != 0 ? 43200000L : j2, (i2 & 32) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j3, (i2 & 64) != 0 ? 100 : i, (i2 & 128) != 0 ? 10000L : j4, (i2 & 256) != 0 ? 600000L : j5, (i2 & 512) != 0 ? "im_receive_msg_perf" : str, (i2 & 1024) != 0 ? 0.0f : f);
    }
}
