package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogNetworkLaunchOptExperimentModel {

    @C09CT("allow_specified_event_in_launch_stage")
    public final boolean allowSpecifiedEventInLaunchStage;

    @C09CT("allow_specified_events")
    public final List<String> allowSpecifiedEvents;

    @C09CT("avoid_report_in_launch_stage")
    public final boolean avoidReportInLaunchStage;

    @C09CT("enable_report_after_cold_start")
    public final boolean enableReportAfterColdStart;

    public AppLogNetworkLaunchOptExperimentModel() {
        this(false, false, null, false, 15, null);
    }

    public AppLogNetworkLaunchOptExperimentModel(boolean z, boolean z2, List<String> list, boolean z3) {
        this.avoidReportInLaunchStage = z;
        this.allowSpecifiedEventInLaunchStage = z2;
        this.allowSpecifiedEvents = list;
        this.enableReportAfterColdStart = z3;
    }

    public AppLogNetworkLaunchOptExperimentModel(boolean z, boolean z2, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? false : z3);
    }
}
