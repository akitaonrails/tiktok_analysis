package com.ss.android.ugc.effectmanager.common.monitor;

/* JADX INFO: loaded from: classes4.dex */
public final class EPMonitor {
    public static final EPMonitor INSTANCE = new EPMonitor();

    public static final void traceBegin(MonitorTrace monitorTrace) {
        if (monitorTrace != null) {
            monitorTrace.begin();
        }
    }

    public static final void traceEnd(MonitorTrace monitorTrace) {
        if (monitorTrace != null) {
            monitorTrace.end();
        }
    }

    public static final void traceStep(MonitorTrace monitorTrace, String str) {
        if (str != null && monitorTrace != null) {
            monitorTrace.addStep(str);
        }
    }
}
