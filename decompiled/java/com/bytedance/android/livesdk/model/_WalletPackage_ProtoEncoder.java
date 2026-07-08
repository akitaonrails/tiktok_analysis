package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _WalletPackage_ProtoEncoder implements InterfaceC1132110fZB<WalletPackage> {
    public static int LIZIZ(int i, WalletPackage walletPackage) {
        if (walletPackage == null) {
            return 0;
        }
        int iLJIILL = C1142340fpg.LJIILL(1, walletPackage.iapId) + C1142340fpg.LJIILL(2, walletPackage.usdPriceShow);
        return iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, WalletPackage walletPackage) {
        WalletPackage walletPackage2 = walletPackage;
        C1142340fpg.LJFF(c1142350fph, 1, walletPackage2.iapId);
        C1142340fpg.LJFF(c1142350fph, 2, walletPackage2.usdPriceShow);
    }
}
