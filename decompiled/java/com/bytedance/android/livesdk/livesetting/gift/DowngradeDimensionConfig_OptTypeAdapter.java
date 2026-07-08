package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DowngradeDimensionConfig_OptTypeAdapter extends TypeAdapter<DowngradeDimensionConfig> {
    public final Gson LIZ;

    public DowngradeDimensionConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final DowngradeDimensionConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DowngradeDimensionConfig downgradeDimensionConfig = new DowngradeDimensionConfig(0, 0, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1106127505) {
                    if (iHashCode != 384579816) {
                        if (iHashCode == 478125742 && strLJJJJ.equals("exit_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                downgradeDimensionConfig.exitCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enter_count")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            downgradeDimensionConfig.enterCount = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("levels")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        downgradeDimensionConfig.levels = C473040Igo.LIZ(this.LIZ, c09cu, DowngradeLevel.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return downgradeDimensionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DowngradeDimensionConfig downgradeDimensionConfig) {
        DowngradeDimensionConfig downgradeDimensionConfig2 = downgradeDimensionConfig;
        if (downgradeDimensionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enter_count");
        c09dl.LJJJJ(Integer.valueOf(downgradeDimensionConfig2.enterCount));
        c09dl.LJIILLIIL("exit_count");
        c09dl.LJJJJ(Integer.valueOf(downgradeDimensionConfig2.exitCount));
        c09dl.LJIILLIIL("levels");
        C473040Igo.LIZLLL(this.LIZ, c09dl, downgradeDimensionConfig2.levels, DowngradeLevel.class);
        c09dl.LJII();
    }
}
