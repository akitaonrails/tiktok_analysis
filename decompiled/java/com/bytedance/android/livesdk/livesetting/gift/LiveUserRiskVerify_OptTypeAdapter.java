package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveUserRiskVerify_OptTypeAdapter extends TypeAdapter<LiveUserRiskVerify> {
    @Override // com.google.gson.TypeAdapter
    public final LiveUserRiskVerify read(C09CU c09cu) {
        LiveUserRiskVerify liveUserRiskVerify = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveUserRiskVerify = new LiveUserRiskVerify("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "email_verify_url")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveUserRiskVerify.emailVerifyUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "phone_verify_url")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveUserRiskVerify.phoneVerifyUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveUserRiskVerify;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveUserRiskVerify liveUserRiskVerify) {
        LiveUserRiskVerify liveUserRiskVerify2 = liveUserRiskVerify;
        if (liveUserRiskVerify2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("email_verify_url");
        c09dl.LJJJJJ(liveUserRiskVerify2.emailVerifyUrl);
        c09dl.LJIILLIIL("phone_verify_url");
        c09dl.LJJJJJ(liveUserRiskVerify2.phoneVerifyUrl);
        c09dl.LJII();
    }
}
