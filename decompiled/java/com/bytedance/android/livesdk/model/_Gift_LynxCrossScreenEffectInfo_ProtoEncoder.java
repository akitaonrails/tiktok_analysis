package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_LynxCrossScreenEffectInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.LynxCrossScreenEffectInfo> {
    public static int LIZJ(Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo) {
        List<Long> list = lynxCrossScreenEffectInfo.effectIds;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int iLJIILIIL = 0;
        for (int i = 0; i < lynxCrossScreenEffectInfo.effectIds.size(); i++) {
            iLJIILIIL += C1142340fpg.LJIILIIL(4, (Long) ListProtector.get(lynxCrossScreenEffectInfo.effectIds, i));
        }
        return iLJIILIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo) {
        List<Long> list = lynxCrossScreenEffectInfo.effectIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < lynxCrossScreenEffectInfo.effectIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 4, (Long) ListProtector.get(lynxCrossScreenEffectInfo.effectIds, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo) {
        LIZIZ(c1142350fph, lynxCrossScreenEffectInfo);
    }
}
