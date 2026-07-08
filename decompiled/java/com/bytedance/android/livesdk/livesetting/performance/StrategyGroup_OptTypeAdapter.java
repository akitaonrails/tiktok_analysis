package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyGroup_OptTypeAdapter extends TypeAdapter<StrategyGroup> {
    public final Gson LIZ;

    public StrategyGroup_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final StrategyGroup read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        StrategyGroup strategyGroup = new StrategyGroup();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -605682797) {
                    if (iHashCode != -532817218) {
                        if (iHashCode == -198258271 && strLJJJJ.equals("low_device")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                strategyGroup.lowDevice = (StrategyInfo) this.LIZ.LJIIJ(StrategyInfo.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("midDevice")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            strategyGroup.midDevice = (StrategyInfo) this.LIZ.LJIIJ(StrategyInfo.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("high_device")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        strategyGroup.highDevice = (StrategyInfo) this.LIZ.LJIIJ(StrategyInfo.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return strategyGroup;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StrategyGroup strategyGroup) {
        StrategyGroup strategyGroup2 = strategyGroup;
        if (strategyGroup2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("high_device");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(StrategyInfo.class);
        typeAdapterLJIIJ.write(c09dl, strategyGroup2.highDevice);
        c09dl.LJIILLIIL("low_device");
        typeAdapterLJIIJ.write(c09dl, strategyGroup2.lowDevice);
        c09dl.LJIILLIIL("midDevice");
        typeAdapterLJIIJ.write(c09dl, strategyGroup2.midDevice);
        c09dl.LJII();
    }
}
