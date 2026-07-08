package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class BatchConfig_OptTypeAdapter extends TypeAdapter<BatchConfig> {
    public final Gson LIZ;

    public BatchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BatchConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BatchConfig batchConfig = new BatchConfig(false, false, 50L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1081145675:
                        if (strLJJJJ.equals("enableReleaseLinkOpt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchConfig.enableReleaseLinkOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -331744640:
                        if (strLJJJJ.equals("batchMs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchConfig.batchMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 893316907:
                        if (strLJJJJ.equals("enablePullOpt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchConfig.enablePullOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return batchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BatchConfig batchConfig) throws IOException {
        BatchConfig batchConfig2 = batchConfig;
        if (batchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(batchConfig2.enable);
        c09dl.LJIILLIIL("enableReleaseLinkOpt");
        c09dl.LJJJJJL(batchConfig2.enableReleaseLinkOpt);
        c09dl.LJIILLIIL("batchMs");
        c09dl.LJJIZ(batchConfig2.batchMs);
        c09dl.LJIILLIIL("enablePullOpt");
        c09dl.LJJJJJL(batchConfig2.enablePullOpt);
        c09dl.LJII();
    }
}
