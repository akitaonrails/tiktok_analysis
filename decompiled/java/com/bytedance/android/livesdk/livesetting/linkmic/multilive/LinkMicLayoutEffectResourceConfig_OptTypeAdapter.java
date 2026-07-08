package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicLayoutEffectResourceConfig_OptTypeAdapter extends TypeAdapter<LinkMicLayoutEffectResourceConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LinkMicLayoutEffectResourceConfig read(C09CU c09cu) {
        LinkMicLayoutEffectResourceConfig linkMicLayoutEffectResourceConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            linkMicLayoutEffectResourceConfig = new LinkMicLayoutEffectResourceConfig("live_dance", "7592891457921356305");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "linkmic_layout_effect_panel")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkMicLayoutEffectResourceConfig.panel = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "linkmic_layout_effect_resource_id")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkMicLayoutEffectResourceConfig.resourceId = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return linkMicLayoutEffectResourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicLayoutEffectResourceConfig linkMicLayoutEffectResourceConfig) {
        LinkMicLayoutEffectResourceConfig linkMicLayoutEffectResourceConfig2 = linkMicLayoutEffectResourceConfig;
        if (linkMicLayoutEffectResourceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("linkmic_layout_effect_panel");
        c09dl.LJJJJJ(linkMicLayoutEffectResourceConfig2.panel);
        c09dl.LJIILLIIL("linkmic_layout_effect_resource_id");
        c09dl.LJJJJJ(linkMicLayoutEffectResourceConfig2.resourceId);
        c09dl.LJII();
    }
}
