package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AFSettings {

    @C09CT("enable_probabilistic")
    public final boolean enableProbabilistic;

    @C09CT("enable_replace_entry_name")
    public final boolean enableReplaceEntryName = true;

    @C09CT("enable_click")
    public final boolean enableClick = true;

    @C09CT("enable_show")
    public final boolean enableShow = true;

    @C09CT("enable_gaid")
    public final boolean enableGaid = true;

    @C09CT("enable_referrer")
    public final boolean enableReferrer = true;

    @C09CT("music_dsp_af_report_num")
    public final int afReportNum = 1;

    @C09CT("report_delay")
    public final long reportDelay = 3;

    public final int getAfReportNum() {
        return this.afReportNum;
    }

    public final boolean getEnableClick() {
        return this.enableClick;
    }

    public final boolean getEnableGaid() {
        return this.enableGaid;
    }

    public final boolean getEnableProbabilistic() {
        return this.enableProbabilistic;
    }

    public final boolean getEnableReferrer() {
        return this.enableReferrer;
    }

    public final boolean getEnableReplaceEntryName() {
        return this.enableReplaceEntryName;
    }

    public final boolean getEnableShow() {
        return this.enableShow;
    }

    public final long getReportDelay() {
        return this.reportDelay;
    }
}
