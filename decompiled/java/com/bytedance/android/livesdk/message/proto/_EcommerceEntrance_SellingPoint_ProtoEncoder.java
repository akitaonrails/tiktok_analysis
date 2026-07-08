package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* JADX INFO: loaded from: classes18.dex */
public final class _EcommerceEntrance_SellingPoint_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance.SellingPoint> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance.SellingPoint sellingPoint) {
        EcommerceEntrance.SellingPoint sellingPoint2 = sellingPoint;
        C1142340fpg.LJFF(c1142350fph, 1, sellingPoint2.showText);
        int i = sellingPoint2.sellingPointType;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
    }
}
