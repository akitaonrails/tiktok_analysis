package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class TnsSignalReport_OptTypeAdapter extends TypeAdapter<TnsSignalReport> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TnsSignalReport read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TnsSignalReport tnsSignalReport = new TnsSignalReport(0, 0, 60L, 300L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tnsSignalReport.setEnable(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -588617297:
                        if (strLJJJJ.equals("report_new_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tnsSignalReport.setReportNewInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -166503568:
                        if (strLJJJJ.equals("report_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tnsSignalReport.setReportInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 251169111:
                        if (strLJJJJ.equals("force_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tnsSignalReport.setForceEnable(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return tnsSignalReport;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TnsSignalReport tnsSignalReport) throws IOException {
        TnsSignalReport tnsSignalReport2 = tnsSignalReport;
        if (tnsSignalReport2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("force_enable");
        c09dl.LJJJJ(Integer.valueOf(tnsSignalReport2.getForceEnable()));
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(tnsSignalReport2.getEnable()));
        c09dl.LJIILLIIL("report_interval");
        c09dl.LJJIZ(tnsSignalReport2.getReportInterval());
        c09dl.LJIILLIIL("report_new_interval");
        c09dl.LJJIZ(tnsSignalReport2.getReportNewInterval());
        c09dl.LJII();
    }
}
