package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LinkmicPlaybookConfig_OptTypeAdapter extends TypeAdapter<LinkmicPlaybookConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LinkmicPlaybookConfig read(C09CU c09cu) {
        LinkmicPlaybookConfig linkmicPlaybookConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            linkmicPlaybookConfig = new LinkmicPlaybookConfig(3);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "retry_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkmicPlaybookConfig.retryInterval = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return linkmicPlaybookConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkmicPlaybookConfig linkmicPlaybookConfig) {
        LinkmicPlaybookConfig linkmicPlaybookConfig2 = linkmicPlaybookConfig;
        if (linkmicPlaybookConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("retry_interval");
        c09dl.LJJJJ(Integer.valueOf(linkmicPlaybookConfig2.retryInterval));
        c09dl.LJII();
    }
}
