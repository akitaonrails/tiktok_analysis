package com.ss.lyrax.video;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes21.dex */
public class RenderReportSetting {

    @C09CT("debug")
    public boolean debug;

    @C09CT("enable_2s_jank_callback")
    public boolean enable2sJankCallback;

    @C09CT("enable_frame_jank_report")
    public boolean enableFrameJankReport;

    @C09CT("enable_node_cost_calculate")
    public boolean enableNodeCostCalculate;

    @C09CT("fatal_interval")
    public int fatalInterval;

    @C09CT("lower_grade_time_in_timer_interval")
    public int lowerGradeTimeInTimerInterval;

    @C09CT("max_time_in_timer_interval")
    public int maxTimeInTimerInterval;

    @C09CT("normal_jank_threshold")
    public int normalJankThreshold;

    @C09CT("sample_count")
    public int sampleCount;

    @C09CT("serious_jank_threshold")
    public int seriousJankThreshold;

    @C09CT("timer_interval")
    public int timerInterval;

    public RenderReportSetting() {
        this.normalJankThreshold = 85;
        this.seriousJankThreshold = 125;
        this.fatalInterval = 200;
        this.timerInterval = 60;
        this.maxTimeInTimerInterval = LSPassThroughRecordSizeConfig.DEFAULT;
        this.lowerGradeTimeInTimerInterval = 800;
        this.sampleCount = 2;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RenderReportSetting(normalJankThreshold=");
        sbLIZ.append(this.normalJankThreshold);
        sbLIZ.append(", seriousJankThreshold=");
        sbLIZ.append(this.seriousJankThreshold);
        sbLIZ.append(", fatalInterval=");
        sbLIZ.append(this.fatalInterval);
        sbLIZ.append(", timerInterval=");
        sbLIZ.append(this.timerInterval);
        sbLIZ.append(", maxTimeInTimerInterval=");
        sbLIZ.append(this.maxTimeInTimerInterval);
        sbLIZ.append(", sampleCount=");
        sbLIZ.append(this.sampleCount);
        sbLIZ.append(", enableFrameJankReport=");
        sbLIZ.append(this.enableFrameJankReport);
        sbLIZ.append(", debug=");
        sbLIZ.append(this.debug);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RenderReportSetting(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4) {
        this.normalJankThreshold = i;
        this.seriousJankThreshold = i2;
        this.fatalInterval = i3;
        this.timerInterval = i4;
        this.maxTimeInTimerInterval = i5;
        this.lowerGradeTimeInTimerInterval = i6;
        this.sampleCount = i7;
        this.enableFrameJankReport = z;
        this.enableNodeCostCalculate = z2;
        this.debug = z3;
        this.enable2sJankCallback = z4;
    }
}
