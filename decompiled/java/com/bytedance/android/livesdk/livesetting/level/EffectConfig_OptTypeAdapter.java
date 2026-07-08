package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class EffectConfig_OptTypeAdapter extends TypeAdapter<EffectConfig> {
    public final Gson LIZ;

    public EffectConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final EffectConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EffectConfig effectConfig = new EffectConfig(0, 0, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1221029593) {
                    if (iHashCode != -341064690) {
                        if (iHashCode == 113126854 && strLJJJJ.equals("width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectConfig.width = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("resource")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            effectConfig.resourceConfig = (ResourceConfig) this.LIZ.LJIIJ(ResourceConfig.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("height")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        effectConfig.height = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return effectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EffectConfig effectConfig) {
        EffectConfig effectConfig2 = effectConfig;
        if (effectConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(Integer.valueOf(effectConfig2.width));
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(Integer.valueOf(effectConfig2.height));
        c09dl.LJIILLIIL("resource");
        this.LIZ.LJIIJ(ResourceConfig.class).write(c09dl, effectConfig2.resourceConfig);
        c09dl.LJII();
    }
}
