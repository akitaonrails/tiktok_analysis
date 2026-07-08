package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ToolbarReuseConfig_OptTypeAdapter extends TypeAdapter<ToolbarReuseConfig> {
    public final Gson LIZ;

    public ToolbarReuseConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ToolbarReuseConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ToolbarReuseConfig toolbarReuseConfig = new ToolbarReuseConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    toolbarReuseConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "disable_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    toolbarReuseConfig.disableList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return toolbarReuseConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ToolbarReuseConfig toolbarReuseConfig) throws IOException {
        ToolbarReuseConfig toolbarReuseConfig2 = toolbarReuseConfig;
        if (toolbarReuseConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(toolbarReuseConfig2.enable);
        c09dl.LJIILLIIL("disable_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, toolbarReuseConfig2.disableList, String.class);
        c09dl.LJII();
    }
}
