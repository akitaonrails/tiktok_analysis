package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class MixLayoutUseSparkLiteOptConfig_OptTypeAdapter extends TypeAdapter<MixLayoutUseSparkLiteOptConfig> {
    public final Gson LIZ;

    public MixLayoutUseSparkLiteOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MixLayoutUseSparkLiteOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfig = new MixLayoutUseSparkLiteOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -772263222) {
                    if (iHashCode != 1414770644) {
                        if (iHashCode == 1551490792 && strLJJJJ.equals("enableSparkLite")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mixLayoutUseSparkLiteOptConfig.enableSparkLite = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("useCachedScreenParameter")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            mixLayoutUseSparkLiteOptConfig.useCachedScreenParameter = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("preloadAndDecodeResource")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        mixLayoutUseSparkLiteOptConfig.preloadAndDecodeResource = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return mixLayoutUseSparkLiteOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfig) throws IOException {
        MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfig2 = mixLayoutUseSparkLiteOptConfig;
        if (mixLayoutUseSparkLiteOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enableSparkLite");
        c09dl.LJJJJJL(mixLayoutUseSparkLiteOptConfig2.enableSparkLite);
        c09dl.LJIILLIIL("useCachedScreenParameter");
        c09dl.LJJJJJL(mixLayoutUseSparkLiteOptConfig2.useCachedScreenParameter);
        c09dl.LJIILLIIL("preloadAndDecodeResource");
        c09dl.LJJJJJL(mixLayoutUseSparkLiteOptConfig2.preloadAndDecodeResource);
        c09dl.LJII();
    }
}
