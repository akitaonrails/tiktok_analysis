package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveHostWidgetLoadConfig_OptTypeAdapter extends TypeAdapter<LiveHostWidgetLoadConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveHostWidgetLoadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostWidgetLoadConfig liveHostWidgetLoadConfig = new LiveHostWidgetLoadConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 92002884:
                        if (strLJJJJ.equals("p0_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostWidgetLoadConfig.p0Delay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 979506565:
                        if (strLJJJJ.equals("p1_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostWidgetLoadConfig.p1Delay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1745518511:
                        if (strLJJJJ.equals("local_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostWidgetLoadConfig.localDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1867010246:
                        if (strLJJJJ.equals("p2_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostWidgetLoadConfig.p2Delay = c09cu.LJJJ();
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
        return liveHostWidgetLoadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostWidgetLoadConfig liveHostWidgetLoadConfig) throws IOException {
        LiveHostWidgetLoadConfig liveHostWidgetLoadConfig2 = liveHostWidgetLoadConfig;
        if (liveHostWidgetLoadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("p0_delay");
        c09dl.LJJIZ(liveHostWidgetLoadConfig2.p0Delay);
        c09dl.LJIILLIIL("p1_delay");
        c09dl.LJJIZ(liveHostWidgetLoadConfig2.p1Delay);
        c09dl.LJIILLIIL("p2_delay");
        c09dl.LJJIZ(liveHostWidgetLoadConfig2.p2Delay);
        c09dl.LJIILLIIL("local_delay");
        c09dl.LJJIZ(liveHostWidgetLoadConfig2.localDelay);
        c09dl.LJII();
    }
}
