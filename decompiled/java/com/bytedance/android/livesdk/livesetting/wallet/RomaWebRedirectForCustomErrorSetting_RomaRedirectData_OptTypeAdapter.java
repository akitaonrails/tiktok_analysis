package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.wallet.RomaWebRedirectForCustomErrorSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RomaWebRedirectForCustomErrorSetting_RomaRedirectData_OptTypeAdapter extends TypeAdapter<RomaWebRedirectForCustomErrorSetting.RomaRedirectData> {
    public final Gson LIZ;

    public RomaWebRedirectForCustomErrorSetting_RomaRedirectData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RomaWebRedirectForCustomErrorSetting.RomaRedirectData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RomaWebRedirectForCustomErrorSetting.RomaRedirectData romaRedirectData = new RomaWebRedirectForCustomErrorSetting.RomaRedirectData(null, 0, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "error_codes_to_redirect")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    romaRedirectData.setErrorList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "redirect_type")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    romaRedirectData.setRedirectType(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return romaRedirectData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RomaWebRedirectForCustomErrorSetting.RomaRedirectData romaRedirectData) {
        RomaWebRedirectForCustomErrorSetting.RomaRedirectData romaRedirectData2 = romaRedirectData;
        if (romaRedirectData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("error_codes_to_redirect");
        C473040Igo.LIZLLL(this.LIZ, c09dl, romaRedirectData2.getErrorList(), String.class);
        c09dl.LJIILLIIL("redirect_type");
        c09dl.LJJJJ(Integer.valueOf(romaRedirectData2.getRedirectType()));
        c09dl.LJII();
    }
}
