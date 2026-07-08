package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_PortraitInfo_PortraitTag_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.PortraitInfo.PortraitTag> {
    public static int LIZJ(PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag) {
        return C1142340fpg.LJIILL(1, portraitTag.tagId) + C1142340fpg.LJIIL(2, portraitTag.priority) + C1142340fpg.LJIILL(3, portraitTag.showValue) + C1142340fpg.LJIILL(4, portraitTag.showArgs);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag) {
        C1142340fpg.LJFF(c1142350fph, 1, portraitTag.tagId);
        long j = portraitTag.priority;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 3, portraitTag.showValue);
        C1142340fpg.LJFF(c1142350fph, 4, portraitTag.showArgs);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag) {
        LIZIZ(c1142350fph, portraitTag);
    }
}
