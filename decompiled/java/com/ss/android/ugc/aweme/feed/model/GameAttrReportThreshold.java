package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class GameAttrReportThreshold implements Serializable {

    @C09CT("attr_touch_point")
    public Integer attrTouchPoint;

    @C09CT("click_threshold_duration")
    public Integer clickThresholdDuration;

    @C09CT("enable_click_report")
    public boolean enableClickReport;

    @C09CT("enable_view_report")
    public boolean enableViewReport;

    @C09CT("view_threshold_duration")
    public Integer viewThresholdDuration;

    public GameAttrReportThreshold() {
        this(null, null, null, false, false);
    }

    public GameAttrReportThreshold(Integer num, Integer num2, Integer num3, boolean z, boolean z2) {
        this.attrTouchPoint = num;
        this.clickThresholdDuration = num2;
        this.viewThresholdDuration = num3;
        this.enableViewReport = z;
        this.enableClickReport = z2;
    }
}
