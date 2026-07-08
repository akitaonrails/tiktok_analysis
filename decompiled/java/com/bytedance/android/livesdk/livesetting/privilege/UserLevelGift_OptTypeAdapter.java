package com.bytedance.android.livesdk.livesetting.privilege;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelGift_OptTypeAdapter extends TypeAdapter<UserLevelGift> {
    @Override // com.google.gson.TypeAdapter
    public final UserLevelGift read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        UserLevelGift userLevelGift = new UserLevelGift(0, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "grade")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    userLevelGift.level = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "gift_id")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    userLevelGift.giftId = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return userLevelGift;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UserLevelGift userLevelGift) throws IOException {
        UserLevelGift userLevelGift2 = userLevelGift;
        if (userLevelGift2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("grade");
        c09dl.LJJJJ(Integer.valueOf(userLevelGift2.level));
        c09dl.LJIILLIIL("gift_id");
        c09dl.LJJIZ(userLevelGift2.giftId);
        c09dl.LJII();
    }
}
