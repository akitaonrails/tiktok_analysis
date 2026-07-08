package com.ss.android.ugc.aweme.im.strategy.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class StrategyConfigurationConfig {

    @C09CT("debug_log")
    public final boolean debugLog;

    @C09CT("long_press_panel")
    public final boolean longPressPanel;

    @C09CT("message_local_time")
    public final boolean messageLocalTime;

    @C09CT("sample_rate_decision_node")
    public final int sampleRateOfDecisionNode;

    @C09CT("sample_rate_decision_process")
    public final int sampleRateOfDecisionProcess;

    @C09CT("use_local_time")
    public final boolean useLocalTime;

    public StrategyConfigurationConfig() {
        this(false, false, false, 1, 1, false);
    }

    public StrategyConfigurationConfig(boolean z, boolean z2, boolean z3, int i, int i2, boolean z4) {
        this.debugLog = z;
        this.useLocalTime = z2;
        this.longPressPanel = z3;
        this.sampleRateOfDecisionNode = i;
        this.sampleRateOfDecisionProcess = i2;
        this.messageLocalTime = z4;
    }
}
