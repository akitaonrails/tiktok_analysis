package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_SchemeInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.SchemeInfo> {
    public static int LIZJ(Gift.SchemeInfo schemeInfo) {
        return C1142340fpg.LJIIIZ(1, schemeInfo.schemeGiftType) + C1142340fpg.LJIILL(2, schemeInfo.schemeUrl) + C1142340fpg.LJIILL(3, schemeInfo.schemeDescribe) + C1142340fpg.LJIILL(4, schemeInfo.schemeDescribeColor);
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.SchemeInfo schemeInfo) {
        int i = schemeInfo.schemeGiftType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, schemeInfo.schemeUrl);
        C1142340fpg.LJFF(c1142350fph, 3, schemeInfo.schemeDescribe);
        C1142340fpg.LJFF(c1142350fph, 4, schemeInfo.schemeDescribeColor);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.SchemeInfo schemeInfo) {
        LIZIZ(c1142350fph, schemeInfo);
    }
}
