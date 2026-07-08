package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ToolbarTimeConsumingOptimizeConfig_OptTypeAdapter extends TypeAdapter<ToolbarTimeConsumingOptimizeConfig> {
    public final Gson LIZ;

    public ToolbarTimeConsumingOptimizeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ToolbarTimeConsumingOptimizeConfig read(C09CU c09cu) {
        ToolbarTimeConsumingOptimizeConfig toolbarTimeConsumingOptimizeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            toolbarTimeConsumingOptimizeConfig = new ToolbarTimeConsumingOptimizeConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "optimize_init")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        toolbarTimeConsumingOptimizeConfig.optimizeInit = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "optimize_calculate")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        toolbarTimeConsumingOptimizeConfig.optimizeCalculate = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return toolbarTimeConsumingOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ToolbarTimeConsumingOptimizeConfig toolbarTimeConsumingOptimizeConfig) throws IOException {
        ToolbarTimeConsumingOptimizeConfig toolbarTimeConsumingOptimizeConfig2 = toolbarTimeConsumingOptimizeConfig;
        if (toolbarTimeConsumingOptimizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("optimize_init");
        c09dl.LJJJJJL(toolbarTimeConsumingOptimizeConfig2.optimizeInit);
        c09dl.LJIILLIIL("optimize_calculate");
        c09dl.LJJJJJL(toolbarTimeConsumingOptimizeConfig2.optimizeCalculate);
        c09dl.LJII();
    }
}
