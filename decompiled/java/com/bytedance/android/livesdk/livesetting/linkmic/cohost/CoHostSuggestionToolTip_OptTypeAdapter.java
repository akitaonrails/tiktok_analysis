package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CoHostSuggestionToolTip_OptTypeAdapter extends TypeAdapter<CoHostSuggestionToolTip> {
    @Override // com.google.gson.TypeAdapter
    public final CoHostSuggestionToolTip read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CoHostSuggestionToolTip coHostSuggestionToolTip = new CoHostSuggestionToolTip();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "tooltip_delay")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    coHostSuggestionToolTip.tooltipDelay = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return coHostSuggestionToolTip;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CoHostSuggestionToolTip coHostSuggestionToolTip) {
        CoHostSuggestionToolTip coHostSuggestionToolTip2 = coHostSuggestionToolTip;
        if (coHostSuggestionToolTip2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("tooltip_delay");
        c09dl.LJJJJ(Integer.valueOf(coHostSuggestionToolTip2.tooltipDelay));
        c09dl.LJII();
    }
}
