package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveConfig_OptTypeAdapter extends TypeAdapter<LiveConfig> {
    public final Gson LIZ;

    public LiveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveConfig liveConfig = new LiveConfig(false, 3, 4, 80);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2059340042:
                        if (strLJJJJ.equals("window_percent")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveConfig.windowPercent = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1131203703:
                        if (strLJJJJ.equals("enable_normal_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveConfig.enableNormalRoom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1565118372:
                        if (strLJJJJ.equals("max_accumulate_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveConfig.maxAccumulateTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1883609740:
                        if (strLJJJJ.equals("stall_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveConfig.stallThreshold = c09cu.LJJIZ();
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
        return liveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveConfig liveConfig) throws IOException {
        LiveConfig liveConfig2 = liveConfig;
        if (liveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_normal_room");
        c09dl.LJJJJJL(liveConfig2.enableNormalRoom);
        c09dl.LJIILLIIL("max_accumulate_times");
        c09dl.LJJJJ(Integer.valueOf(liveConfig2.maxAccumulateTimes));
        c09dl.LJIILLIIL("stall_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveConfig2.stallThreshold));
        c09dl.LJIILLIIL("window_percent");
        c09dl.LJJJJ(Integer.valueOf(liveConfig2.windowPercent));
        c09dl.LJII();
    }
}
