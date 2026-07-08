package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class NoiseSuppressionConfig_OptTypeAdapter extends TypeAdapter<NoiseSuppressionConfig> {
    public final Gson LIZ;

    public NoiseSuppressionConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NoiseSuppressionConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NoiseSuppressionConfig noiseSuppressionConfig = new NoiseSuppressionConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noiseSuppressionConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1077365023:
                        if (strLJJJJ.equals("detect_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noiseSuppressionConfig.detectInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 655171504:
                        if (strLJJJJ.equals("detect_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noiseSuppressionConfig.detectDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 933618253:
                        if (strLJJJJ.equals("start_delay_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noiseSuppressionConfig.startDelayDuration = c09cu.LJJIZ();
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
        return noiseSuppressionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NoiseSuppressionConfig noiseSuppressionConfig) throws IOException {
        NoiseSuppressionConfig noiseSuppressionConfig2 = noiseSuppressionConfig;
        if (noiseSuppressionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(noiseSuppressionConfig2.enable);
        c09dl.LJIILLIIL("start_delay_duration");
        c09dl.LJJJJ(Integer.valueOf(noiseSuppressionConfig2.startDelayDuration));
        c09dl.LJIILLIIL("detect_duration");
        c09dl.LJJJJ(Integer.valueOf(noiseSuppressionConfig2.detectDuration));
        c09dl.LJIILLIIL("detect_interval");
        c09dl.LJJJJ(Integer.valueOf(noiseSuppressionConfig2.detectInterval));
        c09dl.LJII();
    }
}
