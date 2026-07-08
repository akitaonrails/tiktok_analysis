package com.bytedance.android.livesdk.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_UGGiftStructInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.UGGiftStructInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.UGGiftStructInfo uGGiftStructInfo) {
        Gift.UGGiftStructInfo uGGiftStructInfo2 = uGGiftStructInfo;
        boolean z = uGGiftStructInfo2.isUgGift;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        long j = uGGiftStructInfo2.ugPointsCost;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
    }
}
