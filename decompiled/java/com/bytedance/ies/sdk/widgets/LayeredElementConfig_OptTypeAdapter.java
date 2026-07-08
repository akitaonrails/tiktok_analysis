package com.bytedance.ies.sdk.widgets;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LayeredElementConfig_OptTypeAdapter extends TypeAdapter<LayeredElementConfig> {
    public final Gson gson;

    public LayeredElementConfig_OptTypeAdapter(Gson gson) {
        this.gson = gson;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public LayeredElementConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LayeredElementConfig layeredElementConfig = new LayeredElementConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "guideline_indicator_enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    layeredElementConfig.guidelineIndicatorEnabled = ((Boolean) this.gson.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "animation_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    layeredElementConfig.animationDuration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return layeredElementConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C09DL c09dl, LayeredElementConfig layeredElementConfig) throws IOException {
        if (layeredElementConfig == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("guideline_indicator_enabled");
        c09dl.LJJJJJL(layeredElementConfig.guidelineIndicatorEnabled);
        c09dl.LJIILLIIL("animation_duration");
        c09dl.LJJIZ(layeredElementConfig.animationDuration);
        c09dl.LJII();
    }
}
