package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DowngradeLevel_OptTypeAdapter extends TypeAdapter<DowngradeLevel> {
    @Override // com.google.gson.TypeAdapter
    public final DowngradeLevel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DowngradeLevel downgradeLevel = new DowngradeLevel(0, 0.0f, 0.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -729003382) {
                    if (iHashCode != 102865796) {
                        if (iHashCode == 911030212 && strLJJJJ.equals("enter_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                downgradeLevel.enterThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("level")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            downgradeLevel.level = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("exit_threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        downgradeLevel.exitThreshold = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return downgradeLevel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DowngradeLevel downgradeLevel) {
        DowngradeLevel downgradeLevel2 = downgradeLevel;
        if (downgradeLevel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("level");
        c09dl.LJJJJ(Integer.valueOf(downgradeLevel2.level));
        c09dl.LJIILLIIL("enter_threshold");
        c09dl.LJJJJ(Float.valueOf(downgradeLevel2.enterThreshold));
        c09dl.LJIILLIIL("exit_threshold");
        c09dl.LJJJJ(Float.valueOf(downgradeLevel2.exitThreshold));
        c09dl.LJII();
    }
}
