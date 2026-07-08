package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class AnchorWidgetLoadExpConfig {
    public static final TypeAdapter ADAPTER = new AnchorWidgetLoadExpConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_completion_driven")
    public boolean enableCompletionDriven;

    @C09CT("inter_phase_gap_ms")
    public long interPhaseGapMs;

    @C09CT("widget_priority_overrides")
    public Map<String, String> widgetPriorityOverrides;

    @C09CT("request_settle_ms")
    public long requestSettleMs = 500;

    @C09CT("timeout_after_delay_ms")
    public long timeoutAfterDelayMs = 2000;

    @C09CT("startup_guard_ms")
    public long startupGuardMs = 500;

    public final boolean getEnableCompletionDriven() {
        return this.enableCompletionDriven;
    }

    public final long getInterPhaseGapMs() {
        return this.interPhaseGapMs;
    }

    public final long getRequestSettleMs() {
        return this.requestSettleMs;
    }

    public final long getStartupGuardMs() {
        return this.startupGuardMs;
    }

    public final long getTimeoutAfterDelayMs() {
        return this.timeoutAfterDelayMs;
    }

    public final Map<String, String> getWidgetPriorityOverrides() {
        return this.widgetPriorityOverrides;
    }

    public final void setEnableCompletionDriven(boolean z) {
        this.enableCompletionDriven = z;
    }

    public final void setInterPhaseGapMs(long j) {
        this.interPhaseGapMs = j;
    }

    public final void setRequestSettleMs(long j) {
        this.requestSettleMs = j;
    }

    public final void setStartupGuardMs(long j) {
        this.startupGuardMs = j;
    }

    public final void setTimeoutAfterDelayMs(long j) {
        this.timeoutAfterDelayMs = j;
    }

    public final void setWidgetPriorityOverrides(Map<String, String> map) {
        this.widgetPriorityOverrides = map;
    }
}
