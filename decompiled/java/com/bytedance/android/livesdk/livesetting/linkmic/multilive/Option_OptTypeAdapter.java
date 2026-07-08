package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Option_OptTypeAdapter extends TypeAdapter<Option> {
    @Override // com.google.gson.TypeAdapter
    public final Option read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Option option = new Option();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "feed_container_resize_ratio")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    option.feedContainerResizeRatio = c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return option;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Option option) throws IOException {
        Option option2 = option;
        if (option2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("feed_container_resize_ratio");
        c09dl.LJJIL(option2.feedContainerResizeRatio);
        c09dl.LJII();
    }
}
