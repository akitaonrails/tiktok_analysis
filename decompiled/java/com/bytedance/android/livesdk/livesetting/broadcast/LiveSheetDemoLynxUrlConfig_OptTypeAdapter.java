package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSheetDemoLynxUrlConfig_OptTypeAdapter extends TypeAdapter<LiveSheetDemoLynxUrlConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSheetDemoLynxUrlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig = new LiveSheetDemoLynxUrlConfig("", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1571455633:
                        if (strLJJJJ.equals("spark_offline_navigate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSheetDemoLynxUrlConfig.sparkOfflineNavigate = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1518031725:
                        if (strLJJJJ.equals("spark_navigate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSheetDemoLynxUrlConfig.sparkNavigate = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -239971182:
                        if (strLJJJJ.equals("spark_offline_overlay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSheetDemoLynxUrlConfig.sparkOfflineOverlay = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -99700498:
                        if (strLJJJJ.equals("spark_overlay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSheetDemoLynxUrlConfig.sparkOverlay = c09cu.LJJJZ();
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
        return liveSheetDemoLynxUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig) {
        LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig2 = liveSheetDemoLynxUrlConfig;
        if (liveSheetDemoLynxUrlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("spark_overlay");
        c09dl.LJJJJJ(liveSheetDemoLynxUrlConfig2.sparkOverlay);
        c09dl.LJIILLIIL("spark_navigate");
        c09dl.LJJJJJ(liveSheetDemoLynxUrlConfig2.sparkNavigate);
        c09dl.LJIILLIIL("spark_offline_overlay");
        c09dl.LJJJJJ(liveSheetDemoLynxUrlConfig2.sparkOfflineOverlay);
        c09dl.LJIILLIIL("spark_offline_navigate");
        c09dl.LJJJJJ(liveSheetDemoLynxUrlConfig2.sparkOfflineNavigate);
        c09dl.LJII();
    }
}
