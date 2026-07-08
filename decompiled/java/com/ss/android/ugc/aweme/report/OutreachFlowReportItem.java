package com.ss.android.ugc.aweme.report;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class OutreachFlowReportItem implements Serializable {

    @C09CT("click_report_info")
    public List<ClickReportInfo> clickReportInfo;

    @C09CT("outreach_info")
    public OutreachInfo outreachInfo;

    @C09CT("show_report_info")
    public ShowReportInfo showReportInfo;

    @C09CT("trigger_scene")
    public String triggerScene;

    @C09CT("trigger_session")
    public String triggerSession;

    @C09CT("trigger_timing")
    public String triggerTiming;

    public OutreachFlowReportItem() {
        this(null, null, null, null, null, new ArrayList());
    }

    public final OutreachFlowReportItem copy(OutreachInfo outreachInfo, String str, String str2, String str3, ShowReportInfo showReportInfo, List<ClickReportInfo> list) {
        return new OutreachFlowReportItem(outreachInfo, str, str2, str3, showReportInfo, list);
    }

    public final boolean available() {
        OutreachInfo outreachInfo;
        String str;
        String str2;
        String str3;
        String str4 = this.triggerScene;
        return (str4 == null || str4.length() == 0 || (outreachInfo = this.outreachInfo) == null || (str = outreachInfo.outreachType) == null || str.length() == 0 || (str2 = outreachInfo.outreachKey) == null || str2.length() == 0 || (str3 = this.triggerSession) == null || str3.length() == 0) ? false : true;
    }

    public final void setClickReportInfo(List<ClickReportInfo> list) {
        this.clickReportInfo = list;
    }

    public final void setOutreachInfo(OutreachInfo outreachInfo) {
        this.outreachInfo = outreachInfo;
    }

    public final void setShowReportInfo(ShowReportInfo showReportInfo) {
        this.showReportInfo = showReportInfo;
    }

    public final void setTriggerScene(String str) {
        this.triggerScene = str;
    }

    public final void setTriggerSession(String str) {
        this.triggerSession = str;
    }

    public final void setTriggerTiming(String str) {
        this.triggerTiming = str;
    }

    public OutreachFlowReportItem(OutreachInfo outreachInfo, String str, String str2, String str3, ShowReportInfo showReportInfo, List<ClickReportInfo> list) {
        this.outreachInfo = outreachInfo;
        this.triggerTiming = str;
        this.triggerScene = str2;
        this.triggerSession = str3;
        this.showReportInfo = showReportInfo;
        this.clickReportInfo = list;
    }
}
