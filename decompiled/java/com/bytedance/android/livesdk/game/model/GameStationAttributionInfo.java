package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameStationAttributionInfo {

    @C09CT("gll_close_reason")
    public int gllCloseReason;

    @C09CT("open_gll")
    public int openGll;

    @C09CT("cpp_url")
    public String cppUrl = "";

    @C09CT("view_through_url")
    public String viewThroughUrl = "";

    @C09CT("domain")
    public String domain = "";

    @C09CT("common_params")
    public String commonParams = "";

    @C09CT("report_threshold_confs")
    public List<ReportThreshold> reportThresholdConfs = new ArrayList();
}
