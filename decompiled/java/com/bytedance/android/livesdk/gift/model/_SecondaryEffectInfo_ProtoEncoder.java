package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _SecondaryEffectInfo_ProtoEncoder implements InterfaceC1132110fZB<SecondaryEffectInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, SecondaryEffectInfo secondaryEffectInfo) {
        List<Long> list = secondaryEffectInfo.effectIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < secondaryEffectInfo.effectIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 1, (Long) ListProtector.get(secondaryEffectInfo.effectIds, i));
            }
        }
        List<String> list2 = secondaryEffectInfo.builtinStrings;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < secondaryEffectInfo.builtinStrings.size(); i2++) {
                C1142340fpg.LJFF(c1142350fph, 2, (String) ListProtector.get(secondaryEffectInfo.builtinStrings, i2));
            }
        }
        long j = secondaryEffectInfo.minuteGameGameplayId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SecondaryEffectInfo secondaryEffectInfo) {
        LIZIZ(c1142350fph, secondaryEffectInfo);
    }
}
