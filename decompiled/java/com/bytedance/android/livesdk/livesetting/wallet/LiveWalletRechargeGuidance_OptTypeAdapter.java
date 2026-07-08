package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveWalletRechargeGuidance_OptTypeAdapter extends TypeAdapter<LiveWalletRechargeGuidance> {
    @Override // com.google.gson.TypeAdapter
    public final LiveWalletRechargeGuidance read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveWalletRechargeGuidance liveWalletRechargeGuidance = new LiveWalletRechargeGuidance();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            c09cu.LJJJJ();
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveWalletRechargeGuidance;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveWalletRechargeGuidance liveWalletRechargeGuidance) {
        if (liveWalletRechargeGuidance == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            c09dl.LJII();
        }
    }
}
