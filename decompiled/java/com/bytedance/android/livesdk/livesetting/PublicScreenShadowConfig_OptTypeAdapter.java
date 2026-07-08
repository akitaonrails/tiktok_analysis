package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class PublicScreenShadowConfig_OptTypeAdapter extends TypeAdapter<PublicScreenShadowConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PublicScreenShadowConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PublicScreenShadowConfig publicScreenShadowConfig = new PublicScreenShadowConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1246710908:
                        if (strLJJJJ.equals("shadow_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                publicScreenShadowConfig.shadowColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -756368103:
                        if (strLJJJJ.equals("shadow_x")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                publicScreenShadowConfig.shadowX = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -756368102:
                        if (strLJJJJ.equals("shadow_y")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                publicScreenShadowConfig.shadowY = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 140480806:
                        if (strLJJJJ.equals("shadow_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                publicScreenShadowConfig.shadowHeight = (float) c09cu.LJJIL();
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
        return publicScreenShadowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PublicScreenShadowConfig publicScreenShadowConfig) {
        PublicScreenShadowConfig publicScreenShadowConfig2 = publicScreenShadowConfig;
        if (publicScreenShadowConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("shadow_color");
        c09dl.LJJJJJ(publicScreenShadowConfig2.shadowColor);
        c09dl.LJIILLIIL("shadow_x");
        c09dl.LJJJJ(Float.valueOf(publicScreenShadowConfig2.shadowX));
        c09dl.LJIILLIIL("shadow_y");
        c09dl.LJJJJ(Float.valueOf(publicScreenShadowConfig2.shadowY));
        c09dl.LJIILLIIL("shadow_height");
        c09dl.LJJJJ(Float.valueOf(publicScreenShadowConfig2.shadowHeight));
        c09dl.LJII();
    }
}
