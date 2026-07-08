package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DowngradeSettings_OptTypeAdapter extends TypeAdapter<DowngradeSettings> {
    @Override // com.google.gson.TypeAdapter
    public final DowngradeSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DowngradeSettings downgradeSettings = new DowngradeSettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "min_memory")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    downgradeSettings.minMemory = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return downgradeSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DowngradeSettings downgradeSettings) throws IOException {
        DowngradeSettings downgradeSettings2 = downgradeSettings;
        if (downgradeSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_memory");
        c09dl.LJJIZ(downgradeSettings2.minMemory);
        c09dl.LJII();
    }
}
