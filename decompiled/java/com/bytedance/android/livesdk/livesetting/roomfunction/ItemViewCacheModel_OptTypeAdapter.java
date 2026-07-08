package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ItemViewCacheModel_OptTypeAdapter extends TypeAdapter<ItemViewCacheModel> {
    @Override // com.google.gson.TypeAdapter
    public final ItemViewCacheModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ItemViewCacheModel itemViewCacheModel = new ItemViewCacheModel(1, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "cache_count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    itemViewCacheModel.cacheCount = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "cache_clean_delay")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    itemViewCacheModel.cacheCleanDelay = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return itemViewCacheModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ItemViewCacheModel itemViewCacheModel) throws IOException {
        ItemViewCacheModel itemViewCacheModel2 = itemViewCacheModel;
        if (itemViewCacheModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cache_count");
        c09dl.LJJJJ(Integer.valueOf(itemViewCacheModel2.cacheCount));
        c09dl.LJIILLIIL("cache_clean_delay");
        c09dl.LJJIZ(itemViewCacheModel2.cacheCleanDelay);
        c09dl.LJII();
    }
}
