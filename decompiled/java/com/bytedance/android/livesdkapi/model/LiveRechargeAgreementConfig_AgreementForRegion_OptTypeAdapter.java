package com.bytedance.android.livesdkapi.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRechargeAgreementConfig_AgreementForRegion_OptTypeAdapter extends TypeAdapter<LiveRechargeAgreementConfig.AgreementForRegion> {
    @Override // com.google.gson.TypeAdapter
    public final LiveRechargeAgreementConfig.AgreementForRegion read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRechargeAgreementConfig.AgreementForRegion agreementForRegion = new LiveRechargeAgreementConfig.AgreementForRegion();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "title")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    agreementForRegion.lawName = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "url")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    agreementForRegion.lawUrl = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return agreementForRegion;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRechargeAgreementConfig.AgreementForRegion agreementForRegion) {
        LiveRechargeAgreementConfig.AgreementForRegion agreementForRegion2 = agreementForRegion;
        if (agreementForRegion2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("title");
        c09dl.LJJJJJ(agreementForRegion2.lawName);
        c09dl.LJIILLIIL("url");
        c09dl.LJJJJJ(agreementForRegion2.lawUrl);
        c09dl.LJII();
    }
}
