package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class BubbleConfig_OptTypeAdapter extends TypeAdapter<BubbleConfig> {
    public final Gson LIZ;

    public BubbleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BubbleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BubbleConfig bubbleConfig = new BubbleConfig(false, 0, 604800000L, 10000L, 3, 2, 5000);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1143786622:
                        if (strLJJJJ.equals("max_gap_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleConfig.maxGapTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -233737045:
                        if (strLJJJJ.equals("max_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleConfig.maxTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 95467907:
                        if (strLJJJJ.equals("delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleConfig.delay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 351608024:
                        if (strLJJJJ.equals("version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleConfig.version = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 570418373:
                        if (strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleConfig.interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1554603420:
                        if (strLJJJJ.equals("bubble_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleConfig.bubbleDelayTime = c09cu.LJJIZ();
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
        return bubbleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BubbleConfig bubbleConfig) throws IOException {
        BubbleConfig bubbleConfig2 = bubbleConfig;
        if (bubbleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(bubbleConfig2.enable);
        c09dl.LJIILLIIL("version");
        c09dl.LJJJJ(Integer.valueOf(bubbleConfig2.version));
        c09dl.LJIILLIIL("interval");
        c09dl.LJJIZ(bubbleConfig2.interval);
        c09dl.LJIILLIIL("delay");
        c09dl.LJJIZ(bubbleConfig2.delay);
        c09dl.LJIILLIIL("max_times");
        c09dl.LJJJJ(Integer.valueOf(bubbleConfig2.maxTimes));
        c09dl.LJIILLIIL("max_gap_times");
        c09dl.LJJJJ(Integer.valueOf(bubbleConfig2.maxGapTimes));
        c09dl.LJIILLIIL("bubble_delay_time");
        c09dl.LJJJJ(Integer.valueOf(bubbleConfig2.bubbleDelayTime));
        c09dl.LJII();
    }
}
