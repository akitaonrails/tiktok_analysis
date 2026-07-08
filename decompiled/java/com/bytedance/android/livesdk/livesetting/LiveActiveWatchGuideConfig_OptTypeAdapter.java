package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveActiveWatchGuideConfig_OptTypeAdapter extends TypeAdapter<LiveActiveWatchGuideConfig> {
    public final Gson LIZ;

    public LiveActiveWatchGuideConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveActiveWatchGuideConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveActiveWatchGuideConfig liveActiveWatchGuideConfig = new LiveActiveWatchGuideConfig(false, "toplive", 1, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1442720426:
                        if (strLJJJJ.equals("skip_freq_control")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveActiveWatchGuideConfig.skipFreqControl = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveActiveWatchGuideConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -968742132:
                        if (strLJJJJ.equals("guide_position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveActiveWatchGuideConfig.guidePosition = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2031652526:
                        if (strLJJJJ.equals("guide_style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveActiveWatchGuideConfig.guideStyle = c09cu.LJJIZ();
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
        return liveActiveWatchGuideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveActiveWatchGuideConfig liveActiveWatchGuideConfig) throws IOException {
        LiveActiveWatchGuideConfig liveActiveWatchGuideConfig2 = liveActiveWatchGuideConfig;
        if (liveActiveWatchGuideConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveActiveWatchGuideConfig2.enable);
        c09dl.LJIILLIIL("guide_position");
        c09dl.LJJJJJ(liveActiveWatchGuideConfig2.guidePosition);
        c09dl.LJIILLIIL("guide_style");
        c09dl.LJJJJ(Integer.valueOf(liveActiveWatchGuideConfig2.guideStyle));
        c09dl.LJIILLIIL("skip_freq_control");
        c09dl.LJJJJJL(liveActiveWatchGuideConfig2.skipFreqControl);
        c09dl.LJII();
    }
}
