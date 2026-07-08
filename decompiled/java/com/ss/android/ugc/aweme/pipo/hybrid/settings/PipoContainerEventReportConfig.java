package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerEventReportConfig {

    @C09CT("enable_add_manual_decision")
    public final boolean enableAddManualDecision;

    @C09CT("enable_add_manual_redirect")
    public final boolean enableAddManualRedirect;

    @C09CT("enable_close_event")
    public final boolean enableCloseEvent;

    @C09CT("enable_load_url_event")
    public final boolean enableLoadUrlEvent;

    @C09CT("enable_open_event")
    public final boolean enableOpenEvent;

    @C09CT("enable_resource_error_debug")
    public final boolean enableResourceErrorDebug;

    @C09CT("enable_resource_error_event")
    public final boolean enableResourceErrorEvent;

    @C09CT("enable_event_terminate")
    public final boolean enableTerminateEvent;

    @C09CT("web_router_info_keys")
    public final List<String> keysOfWebRouterInfo;

    public PipoContainerEventReportConfig() {
        this(true, true, true, true, true, false, true, true, C1697810uHb.LJIILJJIL("url_path", "step", "load_latency", "stay_duration"));
    }

    public PipoContainerEventReportConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, List<String> list) {
        this.enableTerminateEvent = z;
        this.enableLoadUrlEvent = z2;
        this.enableOpenEvent = z3;
        this.enableCloseEvent = z4;
        this.enableResourceErrorEvent = z5;
        this.enableResourceErrorDebug = z6;
        this.enableAddManualRedirect = z7;
        this.enableAddManualDecision = z8;
        this.keysOfWebRouterInfo = list;
    }
}
