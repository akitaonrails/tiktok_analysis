package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class PerformanceSetting_OptTypeAdapter extends TypeAdapter<PerformanceSetting> {
    public final Gson LIZ;

    public PerformanceSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PerformanceSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PerformanceSetting performanceSetting = new PerformanceSetting();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2144539042:
                        if (strLJJJJ.equals("monitor_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSetting.monitorDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2139264982:
                        if (strLJJJJ.equals("fps_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSetting.fpsDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSetting.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -219168044:
                        if (strLJJJJ.equals("resident_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSetting.residentInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1049471063:
                        if (strLJJJJ.equals("min_monitor_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceSetting.minMonitorInterval = c09cu.LJJJ();
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
        return performanceSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PerformanceSetting performanceSetting) throws IOException {
        PerformanceSetting performanceSetting2 = performanceSetting;
        if (performanceSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(performanceSetting2.enable);
        c09dl.LJIILLIIL("resident_interval");
        c09dl.LJJIZ(performanceSetting2.residentInterval);
        c09dl.LJIILLIIL("min_monitor_interval");
        c09dl.LJJIZ(performanceSetting2.minMonitorInterval);
        c09dl.LJIILLIIL("monitor_delay");
        c09dl.LJJIZ(performanceSetting2.monitorDelay);
        c09dl.LJIILLIIL("fps_duration");
        c09dl.LJJIZ(performanceSetting2.fpsDuration);
        c09dl.LJII();
    }
}
