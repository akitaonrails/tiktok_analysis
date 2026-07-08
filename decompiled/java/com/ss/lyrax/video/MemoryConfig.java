package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class MemoryConfig {

    @C09CT("disable_frame_listener_opt")
    public boolean disableFrameListenerOpt;

    @C09CT("enable_interact_log_thread_opt")
    public boolean enableInteractLogThreadOpt;

    @C09CT("enable_memory_leak_opt")
    public boolean enableMemoryLeakOpt;

    @C09CT("enable_memory_opt")
    public boolean enableMemoryOpt;

    @C09CT("enable_rtc_log_report_opt")
    public boolean enableRtcLogReportOpt;

    @C09CT("enable_scope_monitor_thread_opt")
    public boolean enableScopeMonitorThreadOpt;

    @C09CT("not_set_context_null")
    public boolean notSetContextNull;

    public MemoryConfig() {
        this.disableFrameListenerOpt = true;
        this.notSetContextNull = true;
    }

    public boolean getDisableFrameListenerOpt() {
        return this.disableFrameListenerOpt;
    }

    public boolean getEnableInteractLogThreadOpt() {
        return this.enableInteractLogThreadOpt;
    }

    public boolean getEnableMemoryLeakOpt() {
        return this.enableMemoryLeakOpt;
    }

    public boolean getEnableMemoryOpt() {
        return this.enableMemoryOpt;
    }

    public boolean getEnableRtcLogReportOpt() {
        return this.enableRtcLogReportOpt;
    }

    public boolean getEnableScopeMonitorThreadOpt() {
        return this.enableScopeMonitorThreadOpt;
    }

    public boolean getNotSetContextNull() {
        return this.notSetContextNull;
    }

    public MemoryConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.enableMemoryLeakOpt = z;
        this.enableMemoryOpt = z2;
        this.disableFrameListenerOpt = z3;
        this.enableInteractLogThreadOpt = z4;
        this.notSetContextNull = z5;
        this.enableScopeMonitorThreadOpt = z6;
        this.enableRtcLogReportOpt = z7;
    }
}
