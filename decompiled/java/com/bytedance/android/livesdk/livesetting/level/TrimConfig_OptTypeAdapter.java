package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TrimConfig_OptTypeAdapter extends TypeAdapter<TrimConfig> {
    @Override // com.google.gson.TypeAdapter
    public final TrimConfig read(C09CU c09cu) {
        TrimConfig trimConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            trimConfig = new TrimConfig(100, 20);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        trimConfig.threshold = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "keep_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        trimConfig.keepCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return trimConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TrimConfig trimConfig) {
        TrimConfig trimConfig2 = trimConfig;
        if (trimConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("threshold");
        c09dl.LJJJJ(Integer.valueOf(trimConfig2.threshold));
        c09dl.LJIILLIIL("keep_count");
        c09dl.LJJJJ(Integer.valueOf(trimConfig2.keepCount));
        c09dl.LJII();
    }
}
