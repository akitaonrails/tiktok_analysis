package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class InfeedSkylightConfig_OptTypeAdapter extends TypeAdapter<InfeedSkylightConfig> {
    public final Gson LIZ;

    public InfeedSkylightConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final InfeedSkylightConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InfeedSkylightConfig infeedSkylightConfig = new InfeedSkylightConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "refresh_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    infeedSkylightConfig.refreshInterval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "disable_anim")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    infeedSkylightConfig.disableAnim = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return infeedSkylightConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InfeedSkylightConfig infeedSkylightConfig) throws IOException {
        InfeedSkylightConfig infeedSkylightConfig2 = infeedSkylightConfig;
        if (infeedSkylightConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("refresh_interval");
        c09dl.LJJIZ(infeedSkylightConfig2.refreshInterval);
        c09dl.LJIILLIIL("disable_anim");
        c09dl.LJJJJJL(infeedSkylightConfig2.disableAnim);
        c09dl.LJII();
    }
}
