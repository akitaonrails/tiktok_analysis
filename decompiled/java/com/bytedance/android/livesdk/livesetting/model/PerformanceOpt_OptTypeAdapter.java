package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PerformanceOpt_OptTypeAdapter extends TypeAdapter<PerformanceOpt> {
    @Override // com.google.gson.TypeAdapter
    public final PerformanceOpt read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PerformanceOpt performanceOpt = new PerformanceOpt();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "live_audience_performance_collect_report_gap_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    performanceOpt.audienceGapTime = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "live_host_performance_collect_report_gap_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    performanceOpt.hostGapTime = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return performanceOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PerformanceOpt performanceOpt) {
        PerformanceOpt performanceOpt2 = performanceOpt;
        if (performanceOpt2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_audience_performance_collect_report_gap_time");
        c09dl.LJJJJ(Integer.valueOf(performanceOpt2.audienceGapTime));
        c09dl.LJIILLIIL("live_host_performance_collect_report_gap_time");
        c09dl.LJJJJ(Integer.valueOf(performanceOpt2.hostGapTime));
        c09dl.LJII();
    }
}
