package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkmicPlaybookNonMultiGuestConfig_OptTypeAdapter extends TypeAdapter<LinkmicPlaybookNonMultiGuestConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LinkmicPlaybookNonMultiGuestConfig read(C09CU c09cu) {
        LinkmicPlaybookNonMultiGuestConfig linkmicPlaybookNonMultiGuestConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            linkmicPlaybookNonMultiGuestConfig = new LinkmicPlaybookNonMultiGuestConfig(1);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "code_tech_switch_for_android")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkmicPlaybookNonMultiGuestConfig.codeTechSwitchForAndroid = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return linkmicPlaybookNonMultiGuestConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkmicPlaybookNonMultiGuestConfig linkmicPlaybookNonMultiGuestConfig) {
        LinkmicPlaybookNonMultiGuestConfig linkmicPlaybookNonMultiGuestConfig2 = linkmicPlaybookNonMultiGuestConfig;
        if (linkmicPlaybookNonMultiGuestConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("code_tech_switch_for_android");
        c09dl.LJJJJ(Integer.valueOf(linkmicPlaybookNonMultiGuestConfig2.codeTechSwitchForAndroid));
        c09dl.LJII();
    }
}
