package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinCashRechargeAnimTimeParams_OptTypeAdapter extends TypeAdapter<CoinCashRechargeAnimTimeParams> {
    @Override // com.google.gson.TypeAdapter
    public final CoinCashRechargeAnimTimeParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CoinCashRechargeAnimTimeParams coinCashRechargeAnimTimeParams = new CoinCashRechargeAnimTimeParams(172800L, 86400L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "exit_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    coinCashRechargeAnimTimeParams.exitDuration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "reset_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    coinCashRechargeAnimTimeParams.resetDuration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return coinCashRechargeAnimTimeParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CoinCashRechargeAnimTimeParams coinCashRechargeAnimTimeParams) throws IOException {
        CoinCashRechargeAnimTimeParams coinCashRechargeAnimTimeParams2 = coinCashRechargeAnimTimeParams;
        if (coinCashRechargeAnimTimeParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("exit_duration");
        c09dl.LJJIZ(coinCashRechargeAnimTimeParams2.exitDuration);
        c09dl.LJIILLIIL("reset_duration");
        c09dl.LJJIZ(coinCashRechargeAnimTimeParams2.resetDuration);
        c09dl.LJII();
    }
}
