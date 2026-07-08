package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class StreakLevelDataTypeAdapter extends TypeAdapter<StreakLevelData> {
    public final Gson LIZ;

    public StreakLevelDataTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final StreakLevelData read(C09CU c09cu) {
        c09cu.LIZIZ();
        Integer numValueOf = null;
        StreakLevelResConfig streakLevelResConfig = null;
        StreakLevelResConfig streakLevelResConfig2 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1039745817) {
                    if (iHashCode != 3075958) {
                        if (iHashCode == 102865796 && strLJJJJ.equals("level")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                    } else if (strLJJJJ.equals("dark")) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            streakLevelResConfig2 = (StreakLevelResConfig) this.LIZ.LJIIJ(StreakLevelResConfig.class).read(c09cu);
                        }
                    }
                } else if (strLJJJJ.equals("normal")) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                    } else {
                        streakLevelResConfig = (StreakLevelResConfig) this.LIZ.LJIIJ(StreakLevelResConfig.class).read(c09cu);
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new StreakLevelData(numValueOf, streakLevelResConfig, streakLevelResConfig2);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StreakLevelData streakLevelData) {
        StreakLevelData streakLevelData2 = streakLevelData;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("level");
        c09dl.LJJJJ(streakLevelData2.level);
        c09dl.LJIILLIIL("normal");
        if (streakLevelData2.normalResource == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakLevelResConfig.class).write(c09dl, streakLevelData2.normalResource);
        }
        c09dl.LJIILLIIL("dark");
        if (streakLevelData2.darkResource == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakLevelResConfig.class).write(c09dl, streakLevelData2.darkResource);
        }
        c09dl.LJII();
    }
}
