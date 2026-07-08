package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CurrencyCodeTimeoutConfig_OptTypeAdapter extends TypeAdapter<CurrencyCodeTimeoutConfig> {
    @Override // com.google.gson.TypeAdapter
    public final CurrencyCodeTimeoutConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CurrencyCodeTimeoutConfig currencyCodeTimeoutConfig = new CurrencyCodeTimeoutConfig(0, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "group")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    currencyCodeTimeoutConfig.group = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "timeout_ms")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    currencyCodeTimeoutConfig.timeoutMs = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return currencyCodeTimeoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CurrencyCodeTimeoutConfig currencyCodeTimeoutConfig) throws IOException {
        CurrencyCodeTimeoutConfig currencyCodeTimeoutConfig2 = currencyCodeTimeoutConfig;
        if (currencyCodeTimeoutConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("group");
        c09dl.LJJJJ(Integer.valueOf(currencyCodeTimeoutConfig2.group));
        c09dl.LJIILLIIL("timeout_ms");
        c09dl.LJJIZ(currencyCodeTimeoutConfig2.timeoutMs);
        c09dl.LJII();
    }
}
