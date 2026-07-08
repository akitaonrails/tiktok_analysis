package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ReportConfig_OptTypeAdapter extends TypeAdapter<ReportConfig> {
    @Override // com.google.gson.TypeAdapter
    public final ReportConfig read(C09CU c09cu) {
        ReportConfig reportConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            reportConfig = new ReportConfig(5, 30);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "max_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        reportConfig.maxCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "max_day")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        reportConfig.maxDay = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return reportConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ReportConfig reportConfig) {
        ReportConfig reportConfig2 = reportConfig;
        if (reportConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_count");
        c09dl.LJJJJ(Integer.valueOf(reportConfig2.maxCount));
        c09dl.LJIILLIIL("max_day");
        c09dl.LJJJJ(Integer.valueOf(reportConfig2.maxDay));
        c09dl.LJII();
    }
}
