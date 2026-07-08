package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_UserInteractionInfo_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.UserInteractionInfo> {
    public static int LIZJ(PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo) {
        return C1142340fpg.LJIIL(1, userInteractionInfo.likeCnt) + C1142340fpg.LJIIL(2, userInteractionInfo.commentCnt) + C1142340fpg.LJIIL(3, userInteractionInfo.shareCnt);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo) {
        long j = userInteractionInfo.likeCnt;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = userInteractionInfo.commentCnt;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = userInteractionInfo.shareCnt;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo) {
        LIZIZ(c1142350fph, userInteractionInfo);
    }
}
