package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MixFrameworkConfig_OptTypeAdapter extends TypeAdapter<MixFrameworkConfig> {
    public final Gson LIZ;

    public MixFrameworkConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MixFrameworkConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MixFrameworkConfig mixFrameworkConfig = new MixFrameworkConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "enable_lynx_method_proxy")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    mixFrameworkConfig.enableLynxMethodProxy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return mixFrameworkConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MixFrameworkConfig mixFrameworkConfig) throws IOException {
        MixFrameworkConfig mixFrameworkConfig2 = mixFrameworkConfig;
        if (mixFrameworkConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_lynx_method_proxy");
        c09dl.LJJJJJL(mixFrameworkConfig2.enableLynxMethodProxy);
        c09dl.LJII();
    }
}
