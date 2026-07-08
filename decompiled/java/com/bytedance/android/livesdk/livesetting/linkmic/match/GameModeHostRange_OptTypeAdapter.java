package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class GameModeHostRange_OptTypeAdapter extends TypeAdapter<GameModeHostRange> {
    @Override // com.google.gson.TypeAdapter
    public final GameModeHostRange read(C09CU c09cu) {
        GameModeHostRange gameModeHostRange = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gameModeHostRange = new GameModeHostRange(0, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "lower_limit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameModeHostRange.lowerLimit = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "upper_limit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameModeHostRange.upperLimit = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gameModeHostRange;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameModeHostRange gameModeHostRange) {
        GameModeHostRange gameModeHostRange2 = gameModeHostRange;
        if (gameModeHostRange2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("lower_limit");
        c09dl.LJJJJ(Integer.valueOf(gameModeHostRange2.lowerLimit));
        c09dl.LJIILLIIL("upper_limit");
        c09dl.LJJJJ(Integer.valueOf(gameModeHostRange2.upperLimit));
        c09dl.LJII();
    }
}
