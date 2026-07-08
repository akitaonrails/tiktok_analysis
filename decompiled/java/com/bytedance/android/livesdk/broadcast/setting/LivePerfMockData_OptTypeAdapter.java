package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePerfMockData_OptTypeAdapter extends TypeAdapter<LivePerfMockData> {
    public final Gson LIZ;

    public LivePerfMockData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePerfMockData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePerfMockData livePerfMockData = new LivePerfMockData(false, 20, 6.5d, 30.0d);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePerfMockData.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -492175552:
                        if (strLJJJJ.equals("encode_fps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePerfMockData.encodeFps = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1573028284:
                        if (strLJJJJ.equals("perf_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePerfMockData.perfScore = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2018414624:
                        if (strLJJJJ.equals("overall_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePerfMockData.overallScore = c09cu.LJJIL();
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
        return livePerfMockData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePerfMockData livePerfMockData) throws IOException {
        LivePerfMockData livePerfMockData2 = livePerfMockData;
        if (livePerfMockData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(livePerfMockData2.enable);
        c09dl.LJIILLIIL("perf_score");
        c09dl.LJJJJ(Integer.valueOf(livePerfMockData2.perfScore));
        c09dl.LJIILLIIL("overall_score");
        c09dl.LJJIL(livePerfMockData2.overallScore);
        c09dl.LJIILLIIL("encode_fps");
        c09dl.LJJIL(livePerfMockData2.encodeFps);
        c09dl.LJII();
    }
}
