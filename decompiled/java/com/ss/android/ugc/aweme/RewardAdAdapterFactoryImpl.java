package com.ss.android.ugc.aweme;

import X.C0BKQ;
import X.C0C64;
import X.C1031260cwW;
import X.C1031270cwX;
import X.C1031810cxP;
import X.C844470XAv;
import X.InterfaceC1031500cwu;
import X.InterfaceC1032410cyN;
import X.InterfaceC1032940czE;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardAdAdapterFactoryImpl implements IRewardAdAdapterFactory {
    @Override // com.ss.android.ugc.aweme.IRewardAdAdapterFactory
    public final InterfaceC1031500cwu LIZ(C1031810cxP c1031810cxP, InterfaceC1032940czE interfaceC1032940czE, String str, InterfaceC1032410cyN interfaceC1032410cyN) {
        C844470XAv.LIZ.getClass();
        c1031810cxP.LJ = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
        c1031810cxP.LJI = C0C64.LJIILLIIL().LJIIIZ(31744, "reward_ad_fullscreen_tap_enable", true, false);
        if (((Boolean) C0BKQ.LIZ.getValue()).booleanValue()) {
            return new C1031270cwX(c1031810cxP, interfaceC1032940czE, str, interfaceC1032410cyN);
        }
        return new C1031260cwW(c1031810cxP, interfaceC1032940czE, str);
    }
}
