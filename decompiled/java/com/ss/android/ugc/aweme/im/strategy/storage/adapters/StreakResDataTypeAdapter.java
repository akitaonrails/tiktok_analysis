package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData;

/* JADX INFO: loaded from: classes4.dex */
public final class StreakResDataTypeAdapter extends TypeAdapter<StreakResData> {
    @Override // com.google.gson.TypeAdapter
    public final StreakResData read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        String strLJJJZ3 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 3433509) {
                    if (iHashCode != 3575610) {
                        if (iHashCode == 738950403 && strLJJJJ.equals("channel")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                    } else if (strLJJJJ.equals("type")) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            strLJJJZ = c09cu.LJJJZ();
                        }
                    }
                } else if (strLJJJJ.equals("path")) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                    } else {
                        strLJJJZ3 = c09cu.LJJJZ();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new StreakResData(strLJJJZ, strLJJJZ2, strLJJJZ3);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StreakResData streakResData) {
        StreakResData streakResData2 = streakResData;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJJ(streakResData2.type);
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(streakResData2.channel);
        c09dl.LJIILLIIL("path");
        c09dl.LJJJJJ(streakResData2.bundle);
        c09dl.LJII();
    }
}
