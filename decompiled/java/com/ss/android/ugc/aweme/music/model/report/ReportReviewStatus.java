package com.ss.android.ugc.aweme.music.model.report;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ReportReviewStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ReportReviewStatus[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final ReportReviewStatus REPORT_REVIEW_STATUS_NOT_STARTED = new ReportReviewStatus("REPORT_REVIEW_STATUS_NOT_STARTED", 0);

    @C09CT("1")
    public static final ReportReviewStatus REPORT_REVIEW_STATUS_UNDER_REVIEW = new ReportReviewStatus("REPORT_REVIEW_STATUS_UNDER_REVIEW", 1);

    @C09CT("2")
    public static final ReportReviewStatus REPORT_REVIEW_STATUS_DONE = new ReportReviewStatus("REPORT_REVIEW_STATUS_DONE", 2);

    @C09CT("3")
    public static final ReportReviewStatus REPORT_REVIEW_STATUS_NO_ACTION = new ReportReviewStatus("REPORT_REVIEW_STATUS_NO_ACTION", 3);

    public static final /* synthetic */ ReportReviewStatus[] $values() {
        return new ReportReviewStatus[]{REPORT_REVIEW_STATUS_NOT_STARTED, REPORT_REVIEW_STATUS_UNDER_REVIEW, REPORT_REVIEW_STATUS_DONE, REPORT_REVIEW_STATUS_NO_ACTION};
    }

    public static InterfaceC2044707zh<ReportReviewStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        ReportReviewStatus[] reportReviewStatusArr$values = $values();
        $VALUES = reportReviewStatusArr$values;
        $ENTRIES = new C2254308sP(reportReviewStatusArr$values);
    }

    public static ReportReviewStatus[] values() {
        return (ReportReviewStatus[]) $VALUES.clone();
    }

    public static ReportReviewStatus valueOf(String str) {
        return (ReportReviewStatus) C08FF.LIZ(ReportReviewStatus.class, str);
    }

    public ReportReviewStatus(String str, int i) {
    }
}
