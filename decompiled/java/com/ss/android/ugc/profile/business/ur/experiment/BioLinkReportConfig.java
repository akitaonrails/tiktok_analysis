package com.ss.android.ugc.profile.business.ur.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class BioLinkReportConfig {
    public static final int $stable = 8;

    @C09CT("is_bio_link_report_show")
    public boolean isBioLinkReportShow = true;

    @C09CT("show_report_jump_time")
    public int showReportJumpTime;

    public final int getShowReportJumpTime() {
        return this.showReportJumpTime;
    }

    public final boolean isBioLinkReportShow() {
        return this.isBioLinkReportShow;
    }

    public final void setBioLinkReportShow(boolean z) {
        this.isBioLinkReportShow = z;
    }

    public final void setShowReportJumpTime(int i) {
        this.showReportJumpTime = i;
    }
}
