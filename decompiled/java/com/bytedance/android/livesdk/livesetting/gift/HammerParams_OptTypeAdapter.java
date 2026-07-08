package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class HammerParams_OptTypeAdapter extends TypeAdapter<HammerParams> {
    public final Gson LIZ;

    public HammerParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final HammerParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        HammerParams hammerParams = new HammerParams(false, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1609594047) {
                    if (iHashCode != 999062763) {
                        if (iHashCode == 1478138717 && strLJJJJ.equals("min_hammer_price")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                hammerParams.minHammerPrice = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("min_combo_price")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            hammerParams.minComboPrice = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        hammerParams.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return hammerParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, HammerParams hammerParams) throws IOException {
        HammerParams hammerParams2 = hammerParams;
        if (hammerParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(hammerParams2.enabled);
        c09dl.LJIILLIIL("min_hammer_price");
        c09dl.LJJJJ(Integer.valueOf(hammerParams2.minHammerPrice));
        c09dl.LJIILLIIL("min_combo_price");
        c09dl.LJJJJ(Integer.valueOf(hammerParams2.minComboPrice));
        c09dl.LJII();
    }
}
