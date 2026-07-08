package com.ss.android.ugc.aweme.music.model.report;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes10.dex */
public final class ReportMusic {

    @C09CT("music")
    public final Music music;

    @C09CT("review_status")
    public final ReportReviewStatus reviewStatus;

    public ReportMusic() {
        this(new Music(), ReportReviewStatus.REPORT_REVIEW_STATUS_NOT_STARTED);
    }

    public ReportMusic(Music music, ReportReviewStatus reportReviewStatus) {
        this.music = music;
        this.reviewStatus = reportReviewStatus;
    }
}
