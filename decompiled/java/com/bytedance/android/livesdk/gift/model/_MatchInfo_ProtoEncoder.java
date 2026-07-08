package com.bytedance.android.livesdk.gift.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _MatchInfo_ProtoEncoder implements InterfaceC1132110fZB<MatchInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, MatchInfo matchInfo) {
        long j = matchInfo.critical;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        boolean z = matchInfo.effectCardInUse;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = matchInfo.multiplierType;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i);
        long j2 = matchInfo.multiplierValue;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MatchInfo matchInfo) {
        LIZIZ(c1142350fph, matchInfo);
    }
}
