package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RankAnimationType_OptTypeAdapter extends TypeAdapter<RankAnimationType> {
    @Override // com.google.gson.TypeAdapter
    public final RankAnimationType read(C09CU c09cu) {
        RankAnimationType rankAnimationType = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            rankAnimationType = new RankAnimationType(0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "rank_animation_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankAnimationType.type = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return rankAnimationType;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RankAnimationType rankAnimationType) {
        RankAnimationType rankAnimationType2 = rankAnimationType;
        if (rankAnimationType2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_animation_type");
        c09dl.LJJJJ(Integer.valueOf(rankAnimationType2.type));
        c09dl.LJII();
    }
}
