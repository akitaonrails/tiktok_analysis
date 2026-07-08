package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CoHostInviteListPerformanceConfigs_OptTypeAdapter extends TypeAdapter<CoHostInviteListPerformanceConfigs> {
    public final Gson LIZ;

    public CoHostInviteListPerformanceConfigs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CoHostInviteListPerformanceConfigs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CoHostInviteListPerformanceConfigs coHostInviteListPerformanceConfigs = new CoHostInviteListPerformanceConfigs();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    coHostInviteListPerformanceConfigs.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return coHostInviteListPerformanceConfigs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CoHostInviteListPerformanceConfigs coHostInviteListPerformanceConfigs) throws IOException {
        CoHostInviteListPerformanceConfigs coHostInviteListPerformanceConfigs2 = coHostInviteListPerformanceConfigs;
        if (coHostInviteListPerformanceConfigs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(coHostInviteListPerformanceConfigs2.enable);
        c09dl.LJII();
    }
}
