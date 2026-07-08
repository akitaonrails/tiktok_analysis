package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveLogDensityMonitorSetting_LiveLogDensityMonitorModelItem_OptTypeAdapter extends TypeAdapter<LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem liveLogDensityMonitorModelItem = new LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem(1000L, 100, 0.001d, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1147441424:
                        if (strLJJJJ.equals("monitor_sample_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLogDensityMonitorModelItem.setMonitorSampleRate(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -718111746:
                        if (strLJJJJ.equals("monitor_report_top_n")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLogDensityMonitorModelItem.setMonitorReportTopN(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1142587387:
                        if (strLJJJJ.equals("monitor_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLogDensityMonitorModelItem.setMonitorIntervalMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1571244354:
                        if (strLJJJJ.equals("monitor_queue_len")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLogDensityMonitorModelItem.setMonitorQueueLen(c09cu.LJJIZ());
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
        return liveLogDensityMonitorModelItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem liveLogDensityMonitorModelItem) throws IOException {
        LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem liveLogDensityMonitorModelItem2 = liveLogDensityMonitorModelItem;
        if (liveLogDensityMonitorModelItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("monitor_interval_ms");
        c09dl.LJJIZ(liveLogDensityMonitorModelItem2.getMonitorIntervalMs());
        c09dl.LJIILLIIL("monitor_queue_len");
        c09dl.LJJJJ(Integer.valueOf(liveLogDensityMonitorModelItem2.getMonitorQueueLen()));
        c09dl.LJIILLIIL("monitor_sample_rate");
        c09dl.LJJIL(liveLogDensityMonitorModelItem2.getMonitorSampleRate());
        c09dl.LJIILLIIL("monitor_report_top_n");
        c09dl.LJJJJ(Integer.valueOf(liveLogDensityMonitorModelItem2.getMonitorReportTopN()));
        c09dl.LJII();
    }
}
