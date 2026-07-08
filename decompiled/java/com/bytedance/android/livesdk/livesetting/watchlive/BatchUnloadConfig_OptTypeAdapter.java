package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class BatchUnloadConfig_OptTypeAdapter extends TypeAdapter<BatchUnloadConfig> {
    public final Gson LIZ;

    public BatchUnloadConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BatchUnloadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BatchUnloadConfig batchUnloadConfig = new BatchUnloadConfig(false, 0L, 0L, null, false, 0, 0, 0L, 0, 511, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1570682747:
                        if (strLJJJJ.equals("maxDelayMs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.delayMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -726209979:
                        if (strLJJJJ.equals("loop_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.loopInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -631669200:
                        if (strLJJJJ.equals("enableOpt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.enableBatchOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -331744640:
                        if (strLJJJJ.equals("batchMs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.batchMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 274026891:
                        if (strLJJJJ.equals("firstBatchSize")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.firstBatchSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 292551191:
                        if (strLJJJJ.equals("quickScrollVelocity")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.quickScrollVelocity = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1538342635:
                        if (strLJJJJ.equals("ignore_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.whiteListWidgets = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1642191711:
                        if (strLJJJJ.equals("enableV2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.enableV2 = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2099918450:
                        if (strLJJJJ.equals("loadDelayInt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                batchUnloadConfig.loadDelayInt = c09cu.LJJIZ();
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
        return batchUnloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BatchUnloadConfig batchUnloadConfig) throws IOException {
        BatchUnloadConfig batchUnloadConfig2 = batchUnloadConfig;
        if (batchUnloadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enableOpt");
        c09dl.LJJJJJL(batchUnloadConfig2.enableBatchOpt);
        c09dl.LJIILLIIL("batchMs");
        c09dl.LJJIZ(batchUnloadConfig2.batchMs);
        c09dl.LJIILLIIL("maxDelayMs");
        c09dl.LJJIZ(batchUnloadConfig2.delayMs);
        c09dl.LJIILLIIL("ignore_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, batchUnloadConfig2.whiteListWidgets, String.class);
        c09dl.LJIILLIIL("enableV2");
        c09dl.LJJJJJL(batchUnloadConfig2.enableV2);
        c09dl.LJIILLIIL("loadDelayInt");
        c09dl.LJJJJ(Integer.valueOf(batchUnloadConfig2.loadDelayInt));
        c09dl.LJIILLIIL("quickScrollVelocity");
        c09dl.LJJJJ(Integer.valueOf(batchUnloadConfig2.quickScrollVelocity));
        c09dl.LJIILLIIL("loop_interval_ms");
        c09dl.LJJIZ(batchUnloadConfig2.loopInterval);
        c09dl.LJIILLIIL("firstBatchSize");
        c09dl.LJJJJ(Integer.valueOf(batchUnloadConfig2.firstBatchSize));
        c09dl.LJII();
    }
}
