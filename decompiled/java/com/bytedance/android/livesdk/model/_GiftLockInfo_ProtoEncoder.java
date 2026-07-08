package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftLockInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftLockInfo> {
    public static int LIZJ(GiftLockInfo giftLockInfo) {
        return C1142340fpg.LJI(1) + C1142340fpg.LJIIIZ(2, giftLockInfo.mLockType) + C1142340fpg.LJIIIZ(3, giftLockInfo.giftLevel) + C1142340fpg.LJI(4) + C1142340fpg.LJIILL(5, giftLockInfo.unlockButtonText) + C1142340fpg.LJIILL(6, giftLockInfo.unlockSchema);
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftLockInfo giftLockInfo) {
        boolean z = giftLockInfo.mLock;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = giftLockInfo.mLockType;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        int i2 = giftLockInfo.giftLevel;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i2);
        boolean z2 = giftLockInfo.highlightEnabled;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 5, giftLockInfo.unlockButtonText);
        C1142340fpg.LJFF(c1142350fph, 6, giftLockInfo.unlockSchema);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftLockInfo giftLockInfo) {
        LIZIZ(c1142350fph, giftLockInfo);
    }
}
