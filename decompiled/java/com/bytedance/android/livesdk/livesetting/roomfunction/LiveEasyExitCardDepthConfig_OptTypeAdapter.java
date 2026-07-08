package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEasyExitCardDepthConfig_OptTypeAdapter extends TypeAdapter<LiveEasyExitCardDepthConfig> {
    public final Gson LIZ;

    public LiveEasyExitCardDepthConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveEasyExitCardDepthConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEasyExitCardDepthConfig liveEasyExitCardDepthConfig = new LiveEasyExitCardDepthConfig(false, 0, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardDepthConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -977264157:
                        if (strLJJJJ.equals("watch_duration_single")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardDepthConfig.watchDurationSingle = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -464693618:
                        if (strLJJJJ.equals("watch_n_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardDepthConfig.watchNCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 646778355:
                        if (strLJJJJ.equals("watch_duration_n")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardDepthConfig.watchDurationN = c09cu.LJJIZ();
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
        return liveEasyExitCardDepthConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEasyExitCardDepthConfig liveEasyExitCardDepthConfig) throws IOException {
        LiveEasyExitCardDepthConfig liveEasyExitCardDepthConfig2 = liveEasyExitCardDepthConfig;
        if (liveEasyExitCardDepthConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveEasyExitCardDepthConfig2.enable);
        c09dl.LJIILLIIL("watch_duration_single");
        c09dl.LJJJJ(Integer.valueOf(liveEasyExitCardDepthConfig2.watchDurationSingle));
        c09dl.LJIILLIIL("watch_duration_n");
        c09dl.LJJJJ(Integer.valueOf(liveEasyExitCardDepthConfig2.watchDurationN));
        c09dl.LJIILLIIL("watch_n_count");
        c09dl.LJJJJ(Integer.valueOf(liveEasyExitCardDepthConfig2.watchNCount));
        c09dl.LJII();
    }
}
