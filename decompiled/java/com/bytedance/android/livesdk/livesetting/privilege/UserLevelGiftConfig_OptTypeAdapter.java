package com.bytedance.android.livesdk.livesetting.privilege;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelGiftConfig_OptTypeAdapter extends TypeAdapter<UserLevelGiftConfig> {
    public final Gson LIZ;

    public UserLevelGiftConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final UserLevelGiftConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        UserLevelGiftConfig userLevelGiftConfig = new UserLevelGiftConfig(null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "grade_gift_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    userLevelGiftConfig.gradeGiftConfigList = C473040Igo.LIZ(this.LIZ, c09cu, UserLevelGift.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return userLevelGiftConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UserLevelGiftConfig userLevelGiftConfig) {
        UserLevelGiftConfig userLevelGiftConfig2 = userLevelGiftConfig;
        if (userLevelGiftConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("grade_gift_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, userLevelGiftConfig2.gradeGiftConfigList, UserLevelGift.class);
        c09dl.LJII();
    }
}
