package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskAttributionInfo {

    @C09CT("view_report_scene")
    public int viewReportScene;

    @C09CT("view_through_url")
    public String viewThroughUrl = "";

    @C09CT("cpp_url")
    public String cppUrl = "";

    @C09CT("click_through_url")
    public String clickThroughUrl = "";

    @C09CT("domain")
    public String domain = "";

    @C09CT("common_params")
    public String commonParams = "";

    @C09CT("report_threshold_conf")
    public List<GameAttrReportThreshold> reportThresholdConf = new ArrayList();
}
