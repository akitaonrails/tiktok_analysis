package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _RandomGiftBubble_ProtoEncoder implements InterfaceC1132110fZB<RandomGiftBubble> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, RandomGiftBubble randomGiftBubble) {
        RandomGiftBubble randomGiftBubble2 = randomGiftBubble;
        C1142340fpg.LJFF(c1142350fph, 1, randomGiftBubble2.bubbleDisplayText);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, randomGiftBubble2.image);
    }
}
