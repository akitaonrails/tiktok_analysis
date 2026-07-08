package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class NewAttributionConfig_OptTypeAdapter extends TypeAdapter<NewAttributionConfig> {
    @Override // com.google.gson.TypeAdapter
    public final NewAttributionConfig read(C09CU c09cu) {
        NewAttributionConfig newAttributionConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            newAttributionConfig = new NewAttributionConfig(0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "attr_frequency_limit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        newAttributionConfig.attrFrequencyLimit = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return newAttributionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NewAttributionConfig newAttributionConfig) {
        NewAttributionConfig newAttributionConfig2 = newAttributionConfig;
        if (newAttributionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("attr_frequency_limit");
        c09dl.LJJJJ(Integer.valueOf(newAttributionConfig2.attrFrequencyLimit));
        c09dl.LJII();
    }
}
