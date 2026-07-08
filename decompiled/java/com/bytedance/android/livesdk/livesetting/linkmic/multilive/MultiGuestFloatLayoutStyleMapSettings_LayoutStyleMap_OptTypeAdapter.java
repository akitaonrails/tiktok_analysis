package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFloatLayoutStyleMapSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFloatLayoutStyleMapSettings_LayoutStyleMap_OptTypeAdapter extends TypeAdapter<MultiGuestFloatLayoutStyleMapSettings.LayoutStyleMap> {
    public final Gson LIZ;

    public MultiGuestFloatLayoutStyleMapSettings_LayoutStyleMap_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFloatLayoutStyleMapSettings.LayoutStyleMap read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestFloatLayoutStyleMapSettings.LayoutStyleMap layoutStyleMap = new MultiGuestFloatLayoutStyleMapSettings.LayoutStyleMap();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -804482555) {
                    if (iHashCode != 1027408931) {
                        if (iHashCode == 1580072033 && strLJJJJ.equals("panel_float")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                layoutStyleMap.panelFloat = (MultiGuestFloatLayoutStyleMapSettings.LayoutArray) this.LIZ.LJIIJ(MultiGuestFloatLayoutStyleMapSettings.LayoutArray.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("grid_float")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            layoutStyleMap.gridFloat = (MultiGuestFloatLayoutStyleMapSettings.LayoutArray) this.LIZ.LJIIJ(MultiGuestFloatLayoutStyleMapSettings.LayoutArray.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("ratio_suffix")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        layoutStyleMap.ratioSuffix = (MultiGuestFloatLayoutStyleMapSettings.RatioSuffix) this.LIZ.LJIIJ(MultiGuestFloatLayoutStyleMapSettings.RatioSuffix.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return layoutStyleMap;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestFloatLayoutStyleMapSettings.LayoutStyleMap layoutStyleMap) {
        MultiGuestFloatLayoutStyleMapSettings.LayoutStyleMap layoutStyleMap2 = layoutStyleMap;
        if (layoutStyleMap2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("panel_float");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(MultiGuestFloatLayoutStyleMapSettings.LayoutArray.class);
        typeAdapterLJIIJ.write(c09dl, layoutStyleMap2.panelFloat);
        c09dl.LJIILLIIL("grid_float");
        typeAdapterLJIIJ.write(c09dl, layoutStyleMap2.gridFloat);
        c09dl.LJIILLIIL("ratio_suffix");
        this.LIZ.LJIIJ(MultiGuestFloatLayoutStyleMapSettings.RatioSuffix.class).write(c09dl, layoutStyleMap2.ratioSuffix);
        c09dl.LJII();
    }
}
