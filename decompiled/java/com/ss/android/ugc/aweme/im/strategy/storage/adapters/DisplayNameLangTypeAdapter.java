package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.DisplayNameLang;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DisplayNameLangTypeAdapter extends TypeAdapter<DisplayNameLang> {
    @Override // com.google.gson.TypeAdapter
    public final DisplayNameLang read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "en")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    strLJJJZ = c09cu.LJJJZ();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "local")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    strLJJJZ2 = c09cu.LJJJZ();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return new DisplayNameLang(strLJJJZ, strLJJJZ2);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DisplayNameLang displayNameLang) {
        DisplayNameLang displayNameLang2 = displayNameLang;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("en");
        c09dl.LJJJJJ(displayNameLang2.en);
        c09dl.LJIILLIIL("local");
        c09dl.LJJJJJ(displayNameLang2.local);
        c09dl.LJII();
    }
}
