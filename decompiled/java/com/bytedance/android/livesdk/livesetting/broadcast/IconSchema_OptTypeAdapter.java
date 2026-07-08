package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class IconSchema_OptTypeAdapter extends TypeAdapter<IconSchema> {
    @Override // com.google.gson.TypeAdapter
    public final IconSchema read(C09CU c09cu) {
        IconSchema iconSchema = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            iconSchema = new IconSchema("https://sf16-va.tiktokcdn.com/obj/eden-va2/logpbybvo/shop.png");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "preload_schema")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        iconSchema.setPreloadSchema(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return iconSchema;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, IconSchema iconSchema) {
        IconSchema iconSchema2 = iconSchema;
        if (iconSchema2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("preload_schema");
        c09dl.LJJJJJ(iconSchema2.getPreloadSchema());
        c09dl.LJII();
    }
}
