package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class MonitorSampleData_OptTypeAdapter extends TypeAdapter<MonitorSampleData> {
    public final Gson LIZ;

    public MonitorSampleData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MonitorSampleData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MonitorSampleData monitorSampleData = new MonitorSampleData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -879369460) {
                    if (iHashCode != -540743180) {
                        if (iHashCode == 2079641381 && strLJJJJ.equals("live_slardar_dolphin_monitor_sample_experiment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                monitorSampleData.isDolphinExperiment = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_slardar_before_monitor_sample_experiment")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            monitorSampleData.isSlardarBeforeExperiment = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_slardar_sample_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        monitorSampleData.sampleList = C473040Igo.LIZIZ(this.LIZ, c09cu, Double.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return monitorSampleData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MonitorSampleData monitorSampleData) throws IOException {
        MonitorSampleData monitorSampleData2 = monitorSampleData;
        if (monitorSampleData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_slardar_dolphin_monitor_sample_experiment");
        c09dl.LJJJJJL(monitorSampleData2.isDolphinExperiment);
        c09dl.LJIILLIIL("live_slardar_before_monitor_sample_experiment");
        c09dl.LJJJJJL(monitorSampleData2.isSlardarBeforeExperiment);
        c09dl.LJIILLIIL("live_slardar_sample_list");
        C473040Igo.LJ(this.LIZ, c09dl, monitorSampleData2.sampleList, Double.TYPE);
        c09dl.LJII();
    }
}
