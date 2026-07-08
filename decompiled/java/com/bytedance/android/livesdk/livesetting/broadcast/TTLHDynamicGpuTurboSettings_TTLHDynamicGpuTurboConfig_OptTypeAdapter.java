package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHDynamicGpuTurboSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class TTLHDynamicGpuTurboSettings_TTLHDynamicGpuTurboConfig_OptTypeAdapter extends TypeAdapter<TTLHDynamicGpuTurboSettings.TTLHDynamicGpuTurboConfig> {
    public final Gson LIZ;

    public TTLHDynamicGpuTurboSettings_TTLHDynamicGpuTurboConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TTLHDynamicGpuTurboSettings.TTLHDynamicGpuTurboConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHDynamicGpuTurboSettings.TTLHDynamicGpuTurboConfig tTLHDynamicGpuTurboConfig = new TTLHDynamicGpuTurboSettings.TTLHDynamicGpuTurboConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1282148017) {
                    if (iHashCode != 309242127) {
                        if (iHashCode == 951117169 && strLJJJJ.equals("configs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHDynamicGpuTurboConfig.setConfigs(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_gpu_turbo")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            tTLHDynamicGpuTurboConfig.setEnable(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("factor")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tTLHDynamicGpuTurboConfig.setFactor((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return tTLHDynamicGpuTurboConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHDynamicGpuTurboSettings.TTLHDynamicGpuTurboConfig tTLHDynamicGpuTurboConfig) {
        TTLHDynamicGpuTurboSettings.TTLHDynamicGpuTurboConfig tTLHDynamicGpuTurboConfig2 = tTLHDynamicGpuTurboConfig;
        if (tTLHDynamicGpuTurboConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_gpu_turbo");
        c09dl.LJJJJ(Integer.valueOf(tTLHDynamicGpuTurboConfig2.getEnable()));
        c09dl.LJIILLIIL("factor");
        c09dl.LJJJJ(Float.valueOf(tTLHDynamicGpuTurboConfig2.getFactor()));
        c09dl.LJIILLIIL("configs");
        C473040Igo.LIZLLL(this.LIZ, c09dl, tTLHDynamicGpuTurboConfig2.getConfigs(), String.class);
        c09dl.LJII();
    }
}
