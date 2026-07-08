package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyAnimConflictPair_OptTypeAdapter extends TypeAdapter<NotifyAnimConflictPair> {
    @Override // com.google.gson.TypeAdapter
    public final NotifyAnimConflictPair read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NotifyAnimConflictPair notifyAnimConflictPair = new NotifyAnimConflictPair();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "after_anim_type")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    notifyAnimConflictPair.afterAnimType = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "before_anim_type")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    notifyAnimConflictPair.beforeAnimType = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return notifyAnimConflictPair;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NotifyAnimConflictPair notifyAnimConflictPair) {
        NotifyAnimConflictPair notifyAnimConflictPair2 = notifyAnimConflictPair;
        if (notifyAnimConflictPair2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("after_anim_type");
        c09dl.LJJJJ(Integer.valueOf(notifyAnimConflictPair2.afterAnimType));
        c09dl.LJIILLIIL("before_anim_type");
        c09dl.LJJJJ(Integer.valueOf(notifyAnimConflictPair2.beforeAnimType));
        c09dl.LJII();
    }
}
