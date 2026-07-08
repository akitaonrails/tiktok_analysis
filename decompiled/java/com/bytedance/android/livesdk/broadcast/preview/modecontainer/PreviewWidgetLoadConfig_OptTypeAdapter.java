package com.bytedance.android.livesdk.broadcast.preview.modecontainer;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class PreviewWidgetLoadConfig_OptTypeAdapter extends TypeAdapter<PreviewWidgetLoadConfig> {
    @Override // com.google.gson.TypeAdapter
    public final PreviewWidgetLoadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PreviewWidgetLoadConfig previewWidgetLoadConfig = new PreviewWidgetLoadConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 92002884) {
                    if (iHashCode != 979506565) {
                        if (iHashCode == 1867010246 && strLJJJJ.equals("p2_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                previewWidgetLoadConfig.p2Delay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("p1_delay")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            previewWidgetLoadConfig.p1Delay = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("p0_delay")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        previewWidgetLoadConfig.p0Delay = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return previewWidgetLoadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreviewWidgetLoadConfig previewWidgetLoadConfig) throws IOException {
        PreviewWidgetLoadConfig previewWidgetLoadConfig2 = previewWidgetLoadConfig;
        if (previewWidgetLoadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("p0_delay");
        c09dl.LJJIZ(previewWidgetLoadConfig2.p0Delay);
        c09dl.LJIILLIIL("p1_delay");
        c09dl.LJJIZ(previewWidgetLoadConfig2.p1Delay);
        c09dl.LJIILLIIL("p2_delay");
        c09dl.LJJIZ(previewWidgetLoadConfig2.p2Delay);
        c09dl.LJII();
    }
}
