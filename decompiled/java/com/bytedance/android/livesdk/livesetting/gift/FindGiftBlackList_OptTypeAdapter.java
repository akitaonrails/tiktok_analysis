package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FindGiftBlackList_OptTypeAdapter extends TypeAdapter<FindGiftBlackList> {
    public final Gson LIZ;

    public FindGiftBlackList_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FindGiftBlackList read(C09CU c09cu) {
        FindGiftBlackList findGiftBlackList = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            findGiftBlackList = new FindGiftBlackList(C1697810uHb.LJIIJJI(8275L, 7775L, 7099L));
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "black_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        findGiftBlackList.blackList = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return findGiftBlackList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FindGiftBlackList findGiftBlackList) {
        FindGiftBlackList findGiftBlackList2 = findGiftBlackList;
        if (findGiftBlackList2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("black_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, findGiftBlackList2.blackList, Long.TYPE);
        c09dl.LJII();
    }
}
