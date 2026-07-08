package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkPopupOptimizeConfig_OptTypeAdapter extends TypeAdapter<SparkPopupOptimizeConfig> {
    public final Gson LIZ;

    public SparkPopupOptimizeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SparkPopupOptimizeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SparkPopupOptimizeConfig sparkPopupOptimizeConfig = new SparkPopupOptimizeConfig(false, false, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -100258679) {
                    if (iHashCode != 36421291) {
                        if (iHashCode == 1286305040 && strLJJJJ.equals("block_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkPopupOptimizeConfig.blockList = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("lynx_enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            sparkPopupOptimizeConfig.lynxEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("webview_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        sparkPopupOptimizeConfig.webviewEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return sparkPopupOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SparkPopupOptimizeConfig sparkPopupOptimizeConfig) throws IOException {
        SparkPopupOptimizeConfig sparkPopupOptimizeConfig2 = sparkPopupOptimizeConfig;
        if (sparkPopupOptimizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("lynx_enable");
        c09dl.LJJJJJL(sparkPopupOptimizeConfig2.lynxEnable);
        c09dl.LJIILLIIL("webview_enable");
        c09dl.LJJJJJL(sparkPopupOptimizeConfig2.webviewEnable);
        c09dl.LJIILLIIL("block_list");
        this.LIZ.LJIIJ(String[].class).write(c09dl, sparkPopupOptimizeConfig2.blockList);
        c09dl.LJII();
    }
}
