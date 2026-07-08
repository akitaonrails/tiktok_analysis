package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_FrequencyControl_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl> {
    public static int LIZIZ(PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl) {
        return C1142340fpg.LJIILL(1, frequencyControl.frequencyControlKey) + C1142340fpg.LJIIL(2, frequencyControl.windowSize) + C1142340fpg.LJIIL(3, frequencyControl.limitInWindow);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl) {
        PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl2 = frequencyControl;
        C1142340fpg.LJFF(c1142350fph, 1, frequencyControl2.frequencyControlKey);
        long j = frequencyControl2.windowSize;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = frequencyControl2.limitInWindow;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
    }
}
