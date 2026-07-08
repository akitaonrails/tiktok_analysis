package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostGoLiveSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class VBoostGoLiveSetting_VBoostSettings_OptTypeAdapter extends TypeAdapter<VBoostGoLiveSetting.VBoostSettings> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final VBoostGoLiveSetting.VBoostSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        VBoostGoLiveSetting.VBoostSettings vBoostSettings = new VBoostGoLiveSetting.VBoostSettings(0, 0L, 0L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1328534260:
                        if (strLJJJJ.equals("webcast_broadcast_go_live_vboost_gpu_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vBoostSettings.gpuTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 290158992:
                        if (strLJJJJ.equals("webcast_broadcast_go_live_vboost_cpu_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vBoostSettings.cpuTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 442360458:
                        if (strLJJJJ.equals("webcast_broadcast_go_live_vboost_cpu_core_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vBoostSettings.cpuCoreTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1223156399:
                        if (strLJJJJ.equals("webcast_broadcast_go_live_vboost_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                vBoostSettings.settings = c09cu.LJJIZ();
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
        return vBoostSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, VBoostGoLiveSetting.VBoostSettings vBoostSettings) throws IOException {
        VBoostGoLiveSetting.VBoostSettings vBoostSettings2 = vBoostSettings;
        if (vBoostSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("webcast_broadcast_go_live_vboost_settings");
        c09dl.LJJJJ(Integer.valueOf(vBoostSettings2.settings));
        c09dl.LJIILLIIL("webcast_broadcast_go_live_vboost_cpu_time");
        c09dl.LJJIZ(vBoostSettings2.cpuTime);
        c09dl.LJIILLIIL("webcast_broadcast_go_live_vboost_cpu_core_time");
        c09dl.LJJIZ(vBoostSettings2.cpuCoreTime);
        c09dl.LJIILLIIL("webcast_broadcast_go_live_vboost_gpu_time");
        c09dl.LJJIZ(vBoostSettings2.gpuTime);
        c09dl.LJII();
    }
}
