package com.bytedance.android.livesdk.livesetting.effect;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ReportFeedbackUrls_OptTypeAdapter extends TypeAdapter<ReportFeedbackUrls> {
    @Override // com.google.gson.TypeAdapter
    public final ReportFeedbackUrls read(C09CU c09cu) {
        ReportFeedbackUrls reportFeedbackUrls = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            reportFeedbackUrls = new ReportFeedbackUrls("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "creator")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        reportFeedbackUrls.reportCreatorUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "official")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        reportFeedbackUrls.reportOfficialUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return reportFeedbackUrls;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ReportFeedbackUrls reportFeedbackUrls) {
        ReportFeedbackUrls reportFeedbackUrls2 = reportFeedbackUrls;
        if (reportFeedbackUrls2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("creator");
        c09dl.LJJJJJ(reportFeedbackUrls2.reportCreatorUrl);
        c09dl.LJIILLIIL("official");
        c09dl.LJJJJJ(reportFeedbackUrls2.reportOfficialUrl);
        c09dl.LJII();
    }
}
