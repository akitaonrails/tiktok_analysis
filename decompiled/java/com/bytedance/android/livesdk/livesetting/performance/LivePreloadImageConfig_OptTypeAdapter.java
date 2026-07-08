package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreloadImageConfig_OptTypeAdapter extends TypeAdapter<LivePreloadImageConfig> {
    public final Gson LIZ;

    public LivePreloadImageConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePreloadImageConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePreloadImageConfig livePreloadImageConfig = new LivePreloadImageConfig(false, false, -1L, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1646867447:
                        if (strLJJJJ.equals("delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreloadImageConfig.delayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1522925770:
                        if (strLJJJJ.equals("pre_load_avatar")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreloadImageConfig.preloadAvatar = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 853313083:
                        if (strLJJJJ.equals("pre_load_live_bg")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreloadImageConfig.preloadLiveBG = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1598684079:
                        if (strLJJJJ.equals("default_image_state")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreloadImageConfig.defaultImageState = c09cu.LJJIZ();
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
        return livePreloadImageConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePreloadImageConfig livePreloadImageConfig) throws IOException {
        LivePreloadImageConfig livePreloadImageConfig2 = livePreloadImageConfig;
        if (livePreloadImageConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pre_load_live_bg");
        c09dl.LJJJJJL(livePreloadImageConfig2.preloadLiveBG);
        c09dl.LJIILLIIL("pre_load_avatar");
        c09dl.LJJJJJL(livePreloadImageConfig2.preloadAvatar);
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(livePreloadImageConfig2.delayTime);
        c09dl.LJIILLIIL("default_image_state");
        c09dl.LJJJJ(Integer.valueOf(livePreloadImageConfig2.defaultImageState));
        c09dl.LJII();
    }
}
